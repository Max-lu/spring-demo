package cn.maxlu.demo.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        DemoService demoService = (DemoService) ctx.getBean("demoService");
        demoService.sayHello();

        DemoServiceFactoryBean demoServiceFactoryBean = (DemoServiceFactoryBean) ctx.getBean("&demoService");
        DemoService demoService1 = demoServiceFactoryBean.getObject();
        assert demoService1 != null;
        demoService1.sayHello();

        DemoService demoService2 = (DemoService) ctx.getBean("demoService");
        System.out.println(demoService == demoService2);

    }
}
