package com.shaokunV1.rpc.agent.dubbo.factory;

import com.gorden5566.rpc.agent.core.internal.RpcRequest;
import com.gorden5566.rpc.agent.core.internal.config.InvokerConfig;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.rpc.service.GenericService;

import java.util.Collections;

/**
 * @author mengshaokun
 * @date 2021/10/16
 */
public abstract class ReferenceConfigFactory {

    public static ReferenceConfig<GenericService> create(RpcRequest request, InvokerConfig config) {
        ApplicationConfig applicationConfig = ApplicationConfigFactory.create();

        ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
        reference.setGeneric(true);
        reference.setApplication(applicationConfig);
        reference.setInterface(request.getServiceName());
        reference.setProtocol("dubbo");
        String host = config.getHost();
        Integer port = config.getPort();
        String url = String.format("dubbo://%s:%s", host, port);
        reference.setUrl(url);
        // reference.setVersion(version);
        // reference.setGroup();

        //Keep it consistent with the ConfigManager cache
        reference.setSticky(false);
        return reference;
    }

}
