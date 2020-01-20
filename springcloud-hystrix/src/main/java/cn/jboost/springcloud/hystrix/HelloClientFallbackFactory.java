package cn.jboost.springcloud.hystrix;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloClientFallbackFactory implements FallbackFactory<HelloClient2>  {
    @Override
    public HelloClient2 create(Throwable cause) {
        return new HelloClient2() {
            @Override
            public String hello() {
                return "this is returned from fallbackFactory, cause: " + cause.toString() ;
            }
        };
    }
}
