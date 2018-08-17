package cn.maxlu.demo.spring.aop.pojo;

import org.springframework.stereotype.Component;

@Component
public class DemoService {

    public void echo(){
        System.out.println("hello world");
    }

}
