package com.gorden5566.rpc.agent.core.internal;

/**
 * @author gorden5566
 * @date 2020/08/20
 */
public class RpcRequestBuilder {
    /**
     * 接口
     */
    private String serviceName;

    /**
     * 方法
     */
    private String methodName;

    /**
     * 请求参数
     */
    private String requestJson;

    /**
     * 请求id
     */
    private String reqId;

    /**
     * rpc id
     */
    private String rpcId;

    /**
     * tag
     */
    private String tag;

    public static RpcRequestBuilder builder() {
        return new RpcRequestBuilder();
    }

    public RpcRequestBuilder serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public RpcRequestBuilder methodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public RpcRequestBuilder requestJson(String requestJson) {
        this.requestJson = requestJson;
        return this;
    }

    public RpcRequestBuilder reqId(String reqId) {
        this.reqId = reqId;
        return this;
    }

    public RpcRequestBuilder rpcId(String rpcId) {
        this.rpcId = rpcId;
        return this;
    }

    public RpcRequestBuilder tag(String tag) {
        this.tag = tag;
        return this;
    }

    public RpcRequest build() {
        RpcRequest request = new RpcRequest();
        request.setServiceName(serviceName);
        request.setMethodName(methodName);
        request.setRequestJson(requestJson);
        request.setReqId(reqId);
        request.setRpcId(rpcId);
        request.setTag(tag);
        return request;
    }
}
