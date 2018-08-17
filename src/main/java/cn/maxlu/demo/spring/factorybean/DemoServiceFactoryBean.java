package cn.maxlu.demo.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component("demoService")
public class DemoServiceFactoryBean implements FactoryBean<DemoService> {
    @Nullable
    @Override
    public DemoService getObject() throws Exception {
        return new DemoService("max");
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return DemoService.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
