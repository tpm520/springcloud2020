package com.tpblog.cloudapi.response;

public class ResultCreate {

    public static Result success(Integer code,String message){
        return new Result(code,message);
    }

    public static Result success(Integer code,String message,Object data){
        return new Result(code,message,data);
    }
}
