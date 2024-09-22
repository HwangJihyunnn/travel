package com.demo.travel.global.dto;

import lombok.Getter;

@Getter
public class Result<T> {

    private String message;
    private T data;

    private Result(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(message, data);
    }

    public static <T> Result<T> success(String message) {
        return success(message, null);
    }

    public static <T> Result<T> fail(String message, T data) {
        return new Result<>(message, data);
    }

    public static <T> Result<T> fail(String message) {
        return fail(message, null);
    }

}
