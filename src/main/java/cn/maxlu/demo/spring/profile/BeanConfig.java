package cn.maxlu.demo.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BeanConfig {

    @Bean
    @Profile("profile1")
    public DemoService demoService() {
        return new DemoService();
    }

    @Bean
    @Profile("profile2")
    public DemoService2 demoService2() {
        return new DemoService2();
    }
}
