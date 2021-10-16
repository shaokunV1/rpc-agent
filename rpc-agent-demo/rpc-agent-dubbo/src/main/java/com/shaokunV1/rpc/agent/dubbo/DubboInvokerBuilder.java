package com.shaokunV1.rpc.agent.dubbo;

import com.gorden5566.rpc.agent.core.internal.Invoker;
import com.gorden5566.rpc.agent.core.internal.config.InvokerConfig;
import com.gorden5566.rpc.agent.core.spi.InvokerBuilder;

/**
 * @author mengshaokun
 * @date 2021/10/16
 */
public class DubboInvokerBuilder implements InvokerBuilder {
    @Override
    public Invoker buildInvoker(InvokerConfig config) throws Exception {
        return new DubboInvoker(config);
    }
}
