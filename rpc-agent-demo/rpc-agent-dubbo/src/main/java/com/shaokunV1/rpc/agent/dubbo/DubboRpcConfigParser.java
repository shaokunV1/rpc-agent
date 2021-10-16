package com.shaokunV1.rpc.agent.dubbo;

import com.alibaba.fastjson.JSONArray;
import com.gorden5566.rpc.agent.core.internal.RpcRequestConfig;
import com.gorden5566.rpc.agent.core.internal.config.AbstractRpcConfigParser;

/**
 * @author mengshaokun
 * @describe:
 * @date 2021/10/16
 */
public class DubboRpcConfigParser  extends AbstractRpcConfigParser {

    @Override
    public RpcRequestConfig getConfigSample() {
        RpcRequestConfig config = new RpcRequestConfig();
        config.setPort(1234);
        config.setHost("127.0.0.1");
        config.setService("com.gorden5566.demo.service.SimpleService");
        config.setMethod("helloDubbo");
        config.setTag("");
        config.setParams(new JSONArray());
        return config;
    }

}
