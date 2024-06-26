package com.lcx.common.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private static final Integer OK = 200;
    private static final Integer ERROR = 401;

    private Integer code; //编码：200成功，401和其它数字为失败
    private String msg; //错误信息
    private T data; //数据

    public static <T> Result<T> success() {
        Result<T> result = new Result<T>();
        result.code = OK;
        return result;
    }

    public static <T> Result success(String msg) {
        Result<T> result = new Result<T>();
        result.msg = msg;
        result.code = OK;
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.data = data;
        result.code = OK;
        return result;
    }

    public static <T> Result success(T data, String msg) {
        Result result = success(data);
        result.msg = msg;
        return result;
    }

    public static <T> Result error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = ERROR;
        return result;
    }

    public static <T> Result error(T data, String msg) {
        Result result = error(msg);
        result.data=data;
        return result;
    }
}
