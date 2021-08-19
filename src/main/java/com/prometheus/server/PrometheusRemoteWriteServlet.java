package com.prometheus.server;

import com.prometheus.handler.PrometheusMetaDataHandler;
import com.prometheus.handler.kafka.KafkaHandler;
import com.prometheus.util.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xerial.snappy.SnappyInputStream;
import prometheus.Remote;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName PrometheusRemoteWriteServlet
 * @Description prometheus remote write 请求处理类
 * @Author lishuzeng
 * @Date 2021/8/19 下午4:49
 * @Version 1.0.0
 **/
public class PrometheusRemoteWriteServlet extends HttpServlet {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrometheusRemoteWriteServlet.class);

    private PrometheusMetaDataHandler prometheusMetaDataHandler;

    public PrometheusRemoteWriteServlet() {
        this(new KafkaHandler());
    }

    public PrometheusRemoteWriteServlet(PrometheusMetaDataHandler prometheusMetaDataHandler) {
        this.prometheusMetaDataHandler = prometheusMetaDataHandler;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (SnappyInputStream snappyInputStream = new SnappyInputStream(req.getInputStream())) {
            if (snappyInputStream == null) {
                LOGGER.warn("Snappy input stream is null.");
            } else {
                Remote.WriteRequest writeRequest = Remote.WriteRequest.parseFrom(snappyInputStream);
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug(JsonUtils.writeValueAsString(writeRequest));
                }
                prometheusMetaDataHandler.handle(writeRequest);
            }
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (IOException ioException) {
            resp.setStatus(HttpServletResponse.SC_EXPECTATION_FAILED);
            LOGGER.error("Unexpected exception occur when transport with prometheus.", ioException);
        } catch (Exception exception) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } finally {
            resp.getOutputStream().flush();
        }
    }
}
