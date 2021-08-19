### 关于此项目
用于接收Prometheus remote write请求，把监控数据发送到kafka（目前的计划）。
如果有其他的需求，例如：把Prometheus的监控指标上送到influx，可以简单的通过实现
`com.prometheus.handler.PrometheusMetaDataHandler`接口，
并在META-INF/services/com.prometheus.handler.PrometheusMetaDataHandler
中配置对应的实现类全限定类名即可。

### 编译&打包

```java
# 编译
mvn clean compile
```

```
# 打包，目标jar包为：target/${project.name}-${project.version}-uber.jar，类似于SpringBoot的Fat jar，可以直接执行jar包
mvn clean package
```

### 计划

- 完成Prometheus上送kafka

