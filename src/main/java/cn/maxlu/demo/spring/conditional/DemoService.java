package cn.maxlu.demo.spring.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(CustomCondition.class)
public class DemoService {

}
