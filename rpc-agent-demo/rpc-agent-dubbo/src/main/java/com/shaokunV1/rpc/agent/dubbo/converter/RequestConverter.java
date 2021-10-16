package com.shaokunV1.rpc.agent.dubbo.converter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public abstract class RequestConverter {

    public static String[] paramTypeStrConvert(String paramTypes) {
        try {
            List<String> paramTypesList = JSON.parseArray(paramTypes, String.class);
            String[] paramTypesArray = new String[paramTypesList.size()];
            return paramTypesList.toArray(paramTypesArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object[] convert(String params) {
        try {
            JSONArray objects = JSON.parseArray(params);
            return objects.toArray();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
