package com.nju.dto;

/**
 * Created by xmc1993 on 2016/12/30.
 */
public class Response {
    private boolean success = true;
    private String errMsg;
    private Object data;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
