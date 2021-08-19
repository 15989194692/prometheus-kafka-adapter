package com.prometheus.handler.kafka;

import com.prometheus.handler.PrometheusMetaDataHandler;
import prometheus.Remote;

/**
 * @ClassName KafkaHandler
 * @Description 将 prometheus 元数据发送到 kafka
 * @Author lishuzeng
 * @Date 2021/8/19 下午5:19
 * @Version 1.0.0
 **/
public class KafkaHandler implements PrometheusMetaDataHandler {


    @Override
    public boolean handle(Remote.WriteRequest writeRequest) {
        return false;
    }
}
