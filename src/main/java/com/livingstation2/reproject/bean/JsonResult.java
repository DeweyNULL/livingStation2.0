package com.livingstation2.reproject.bean;

/**
 *  @author XLZ
 *  @function : springboot和mybatis的整合练习，此处为通用的json返回类
 */
public class JsonResult {
    private String status = null;
    private Object result = null;

    public  JsonResult status(String status){
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
