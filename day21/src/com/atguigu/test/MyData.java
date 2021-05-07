package com.atguigu.test;

import java.io.Serializable;

public class MyData<T> implements Serializable {

    private T currType;

    private Result result;

    private OrderEnum order;

    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }
// private String order;// 客户端请求服务器的命令

    public T getCurrType() {
        return currType;
    }

    public void setCurrType(T currType) {
        this.currType = currType;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

//    public String getOrder() {
//        return order;
//    }
//
//    public void setOrder(String order) {
//        this.order = order;
//    }
}
