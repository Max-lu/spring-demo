package cn.maxlu.demo.spring.aop.aspectj;

import org.springframework.stereotype.Component;

@Component
public class DemoService {

    public void echo(){
        System.out.println("hello world");
    }
}
