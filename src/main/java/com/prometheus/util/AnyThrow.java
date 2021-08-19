package com.prometheus.util;

/**
 * @ClassName AnyThrow
 * @Description 将受检异常当成非受检异常抛出
 * @Author lishuzeng
 * @Date 2021/8/19 下午7:29
 * @Version 1.0.0
 **/
public class AnyThrow {

    private AnyThrow() {}

    public static void throwUnchecked(Throwable throwable) {
        throwAny(throwable);
    }

    @SuppressWarnings(("unchecked"))
    private static <E extends Throwable> void throwAny(Throwable throwable) throws E {
        throw (E) throwable;
    }



}
