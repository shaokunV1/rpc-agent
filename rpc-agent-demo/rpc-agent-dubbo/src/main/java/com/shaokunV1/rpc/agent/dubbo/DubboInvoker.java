package com.shaokunV1.rpc.agent.dubbo;

import com.gorden5566.rpc.agent.core.internal.AbstractInvoker;
import com.gorden5566.rpc.agent.core.internal.RpcRequest;
import com.gorden5566.rpc.agent.core.internal.RpcResponse;
import com.gorden5566.rpc.agent.core.internal.config.InvokerConfig;
import com.shaokunV1.rpc.agent.dubbo.converter.RequestConverter;
import com.shaokunV1.rpc.agent.dubbo.factory.ReferenceConfigFactory;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.rpc.service.GenericService;

/**
 * @author mengshaokun
 * @date 2021/10/16
 */
public class DubboInvoker extends AbstractInvoker {

    private InvokerConfig config;

    public DubboInvoker(InvokerConfig config) {
        this.config = config;
    }

    @Override
    protected void doStart() throws Exception {
        // ignore
    }

    @Override
    protected void doStop() throws Exception {
        // ignore
    }

    @Override
    public RpcResponse invoke(RpcRequest request) {

        ReferenceConfig<GenericService> reference = ReferenceConfigFactory.create(request, config);

        String[] paramTypesArray = RequestConverter.paramTypeStrConvert(request.getParamTypes());
        Object[] params = RequestConverter.convert(request.getParams());

        GenericService genericService = reference.get();
        Object res = genericService.$invoke(request.getMethodName(), paramTypesArray, params);
        return RpcResponse.newSuccess(res);
    }
}
