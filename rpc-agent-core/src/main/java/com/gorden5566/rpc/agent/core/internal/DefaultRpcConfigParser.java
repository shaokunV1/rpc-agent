package com.gorden5566.rpc.agent.core.internal;

import java.util.UUID;

import com.gorden5566.rpc.agent.core.spi.RpcConfigParser;

/**
 * @author gorden5566
 * @date 2020/08/18
 */
public class DefaultRpcConfigParser implements RpcConfigParser {
    @Override
    public RpcRequest parseRpcRequest(RpcRequestConfig config) {
        RpcRequest request = RpcRequestBuilder.builder()
            .serviceName(config.getService())
            .methodName(config.getMethod())
            .tag(config.getTag())
            .requestJson(config.getParams().toJSONString())
            .reqId(UUID.randomUUID().toString().replaceAll("-", ""))
            .rpcId("1")
            .build();
        return request;
    }
}
