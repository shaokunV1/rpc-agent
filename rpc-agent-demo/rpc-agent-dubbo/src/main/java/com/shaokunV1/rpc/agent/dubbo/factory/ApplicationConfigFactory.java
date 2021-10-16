package com.shaokunV1.rpc.agent.dubbo.factory;

import org.apache.dubbo.config.ApplicationConfig;

/**
 * @author mengshaokun
 * @date 2021/10/16
 */
public abstract class ApplicationConfigFactory {

    public static ApplicationConfig create() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-agent");
        return applicationConfig;
    }
}
