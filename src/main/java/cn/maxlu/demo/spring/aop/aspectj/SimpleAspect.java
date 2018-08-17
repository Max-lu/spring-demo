package cn.maxlu.demo.spring.aop.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {

    @Pointcut("execution(* cn.maxlu.demo.spring.aop.aspectj.DemoService.*(..))")
    public void pointcut(){
    }

    @Before("pointcut()")
    public void method1(){
        System.out.println("method1");
    }

    @AfterReturning(pointcut = "pointcut()")
    public void method2(){
        System.out.println("method2");
    }

    @AfterThrowing(pointcut = "pointcut()")
    public void method3(){
        System.out.println("method3");
    }
}
