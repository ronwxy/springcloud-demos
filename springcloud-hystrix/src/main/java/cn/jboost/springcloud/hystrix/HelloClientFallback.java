package cn.jboost.springcloud.hystrix;

import org.springframework.stereotype.Component;

@Component
public class HelloClientFallback implements HelloClient1 {

    @Override
    public String hello() {
        return "this is returned by fallback";
    }
}
