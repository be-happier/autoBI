package com.jun.autoBI.common;

import lombok.Data;
import java.io.Serializable;


/**
 * 通用返回类
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {

    /**
     * 状态码
     */
    private int code;

    /**
     * 数据
     */
    private T data;

    /**
     * 消息
     */
    private String messeage;

    /**
     * 描述
     */
    private String description;

    public BaseResponse(int code, T data, String messeage, String description) {
        this.code = code;
        this.data = data;
        this.messeage = messeage;
        this.description = description;
    }

    public BaseResponse(int code, T data, String messeage) {
        this(code, data, messeage, "");
    }

    public BaseResponse(int code, T data) {
        this(code, data, "", "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }
}
