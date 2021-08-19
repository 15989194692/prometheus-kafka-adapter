package com.prometheus.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectReader;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @ClassName JsonUtils
 * @Description Json序列化类
 * @Author lishuzeng
 * @Date 2021/8/19 下午7:23
 * @Version 1.0.0
 **/
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final String EMPTY_STR = "";

    static {
        OBJECT_MAPPER.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    }

    private JsonUtils() {}

    public static ObjectReader reader() {
        return OBJECT_MAPPER.reader();
    }

    public static ObjectReader reader(Class<?> classType) {
        return OBJECT_MAPPER.reader(classType);
    }

    public static ObjectWriter writer() {
        return OBJECT_MAPPER.writer();
    }

    public static ObjectWriter writer(Class<?> classType) {
        return OBJECT_MAPPER.writerWithType(classType);
    }


    /**
     * 类型转换，将 Json 格式的文本转成对应的类型
     * @param classType 期望转换成的类型
     * @param content 文本内容
     * @param <T> 类型令牌的泛型
     * @return Json 格式的文本转换为你所期望的类型对象
     */
    public static <T> T readValue(Class<T> classType, String content) {
        try {
            return reader(classType).readValue(content);
        } catch (Exception exception) {
            AnyThrow.throwUnchecked(exception);
        }
        return null;
    }


    /**
     * 将对象转换成 Json 格式文本
     * @param object 对象
     * @return 对象转换成 Json 格式文本
     */
    public static String writeValueAsString(Object object) {
        try {
            return writer().writeValueAsString(object);
        } catch (Exception exception) {
            AnyThrow.throwUnchecked(exception);
        }
        return EMPTY_STR;
    }


}
