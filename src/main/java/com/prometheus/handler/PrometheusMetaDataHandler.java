package com.prometheus.handler;

import prometheus.Remote;

/**
 * @ClassName Sender
 * @Description 处理 prometheus 元数据
 * @Author lishuzeng
 * @Date 2021/8/19 下午4:56
 * @Version 1.0.0
 **/
public interface PrometheusMetaDataHandler {

    /**
     * 处理 prometheus 元数据
     * @param writeRequest prometheus 元数据
     * @return 是否处理成功
     */
    boolean handle(Remote.WriteRequest writeRequest);
}
