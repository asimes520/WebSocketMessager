package com.asimes.websocket.pojo;

/**
 * Created by Asimes on 2016/10/18.
 */
public class CommonResponse {

    private int code;
    private Object data;
    private String message;

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

}
