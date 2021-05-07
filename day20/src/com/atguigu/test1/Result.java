package com.atguigu.test1;

import java.io.Serializable;

public class Result implements Serializable {
    private String resultInfo;
    private boolean resultFlag;

    public Result() {
    }

    public Result(String resultInfo, boolean resultFlag) {
        this.resultInfo = resultInfo;
        this.resultFlag = resultFlag;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public boolean isResultFlag() {
        return resultFlag;
    }

    public void setResultFlag(boolean resultFlag) {
        this.resultFlag = resultFlag;
    }
}
