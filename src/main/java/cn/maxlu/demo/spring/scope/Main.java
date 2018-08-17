package cn.maxlu.demo.spring.scope;

import cn.maxlu.demo.spring.scope.service.DefaultService;
import cn.maxlu.demo.spring.scope.service.PrototypeService;
import cn.maxlu.demo.spring.scope.service.SingletonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        //default
        DefaultService demoService = ctx.getBean(DefaultService.class);
        DefaultService demoService2 = ctx.getBean(DefaultService.class);
        System.out.println(demoService == demoService2);

        //singleton
        SingletonService singletonService = ctx.getBean(SingletonService.class);
        SingletonService singletonService2 = ctx.getBean(SingletonService.class);
        System.out.println(singletonService == singletonService2);

        //prototype
        PrototypeService prototypeService = ctx.getBean(PrototypeService.class);
        PrototypeService prototypeService2 = ctx.getBean(PrototypeService.class);
        System.out.println(prototypeService == prototypeService2);
    }
}
