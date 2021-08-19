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

### protobuf

Prometheus使用protobuf序列化监控指标，对应的数据格式描述文件在resources/prometheus/protobuf目录下。

#### 生成Java文件

```go
# -I为源目录，--java_out指定输出为Java文件，*.proto为对应的proto文件名称
protoc -I=./ --java_out=./ *.proto
```

### Prometheus remote write

Prometheus是通过Pull的方式拉取监控指标的，数据存储在本地磁盘，使用的TSDB时序数据库。官方为有持久存储监控指标需求的提供了remote write功能，简单理解就是，配置了remote write后，Prometheus拉取的数据不仅会保存在本地磁盘，还会通过protobuf序列化，并通过Snappy压缩监控指标，把数据发送到prometheus.yml中配置的remote write url。具体可参考官网：https://prometheus.io/docs/prometheus/latest/storage/

```yaml
remote_write:
- url: "http://localhost:9527/receive"
```

### 计划

- 结合Maven完成自动化构建protobuf代码依赖

- 完成Prometheus上送kafka

