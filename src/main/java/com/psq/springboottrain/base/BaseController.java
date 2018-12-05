package com.psq.springboottrain.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    Logger logger=LoggerFactory.getLogger(this.getClass());

    //成功
    public static final int RESPONSE_SUCCESS=0;

    //失败
    public static int RESPONSE_FAIL=-1;


    public Map<String, Object> responseResult(Integer code, String msg, Object data){
        Map<String,Object>resultMap=new HashMap<>();
        resultMap.put("code",code);
        resultMap.put("msg",msg);
        if(data!=null){
            resultMap.put("data",data);
        }
        return resultMap;
    }



}
