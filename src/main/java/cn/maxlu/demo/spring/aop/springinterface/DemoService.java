package cn.maxlu.demo.spring.aop.springinterface;

import org.springframework.stereotype.Component;

@Component
public class DemoService {

    public void echo(){
        System.out.println("hello world");
    }
}
