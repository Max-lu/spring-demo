package cn.maxlu.demo.spring.beanfactory;

import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
//@Lazy
public class DemoService2 {
    public DemoService2() {
        System.out.println("初始化bean2");
    }
}
