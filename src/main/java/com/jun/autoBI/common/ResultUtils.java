package com.jun.autoBI.common;

/**
 * 返回工具类
 */

public class ResultUtils {

    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> succesee(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param code
     * @param messeage
     * @param description
     * @return
     */
    public static BaseResponse error(int code, String messeage, String description) {
        return new BaseResponse(code, null, messeage, description);
    }

    /**
     * 失败
     * @param errorCode
     * @param meeseage
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String meeseage, String description) {
        return new BaseResponse(errorCode.getCode(), null, meeseage, description);
    }

    /**
     * 失败
     * @param errorCode
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode, String description){
        return new BaseResponse(errorCode.getCode(), errorCode.getMessage(), description);
    }

}
