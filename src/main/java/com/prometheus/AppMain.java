package com.prometheus;

import com.prometheus.handler.PrometheusMetaDataHandler;
import com.prometheus.server.PrometheusRemoteWriteServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.http.HttpServlet;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceLoader;

/**
 * @ClassName AppMain
 * @Description 启动类
 * @Author lishuzeng
 * @Date 2021/8/19 下午4:29
 * @Version 1.0.0
 **/
public class AppMain {

    private static String contextPath = "";
    private static String servletPath = "/receive";
    private static int port = 9527;
    private static final String CONFIG_FILE_PATH = "app.yml";

    public static void main(String[] args) throws Exception {
        if (args.length >= 1) {
            port = Integer.parseInt(args[0]);
        }

        if (args.length >= 2) {
            checkPath(args[1] = args[1].trim());
            servletPath = args[1];
        }

        if (args.length >= 3) {
            checkPath(args[2] = args[2].trim());
            servletPath = args[2];
        }

        System.out.println(String.format("Server will listen on {port:'%s', 'context path':'%s', servlet path':'%s'}",
                port, contextPath, servletPath));
        System.out.println("Prometheus remote write url is: " + pieceServerUrl(port, contextPath, servletPath));

        loadConfig(CONFIG_FILE_PATH);

        Server server = createServer(port);
        server.start();
        server.join();
    }

    private static void checkPath(String path) {
        Objects.requireNonNull(path, "Expected path can not be null.");
        if (!path.startsWith("/")) {
            throw new IllegalArgumentException("Path should be start with '/'.");
        }
    }

    private static String pieceServerUrl(int port, String contextPath, String servletPath) throws UnknownHostException {
        StringBuilder serverUrlBuilder = new StringBuilder(40);

        return serverUrlBuilder
                .append("http://")
                .append(InetAddress.getLocalHost().getHostName())
                .append(":")
                .append(port)
                .append(contextPath)
                .append(servletPath)
                .toString();
    }

    private static void loadConfig(String path) {

    }

    private static Server createServer(int port) {
        return createServer(port, contextPath);
    }

    private static Server createServer(int port, String contextPath) {
        Server server = new Server(port);

        ServletContextHandler servletContextHandler = new ServletContextHandler();
        servletContextHandler.setContextPath(contextPath);
        servletContextHandler.addServlet(new ServletHolder(createHttpServlet()), servletPath);

        server.setHandler(servletContextHandler);

        return server;
    }

    private static HttpServlet createHttpServlet() {
        return new PrometheusRemoteWriteServlet(selectPrometheusMetaDataHandler());
    }

    private static PrometheusMetaDataHandler selectPrometheusMetaDataHandler() {
        Iterator<PrometheusMetaDataHandler> iterator = ServiceLoader.load(PrometheusMetaDataHandler.class).iterator();
        if (!iterator.hasNext()) {
            throw new IllegalArgumentException("Can not get prometheusMetaDataHandler by service loader.");
        }
        return iterator.next();
    }

}
