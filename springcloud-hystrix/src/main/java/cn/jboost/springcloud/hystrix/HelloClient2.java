package cn.jboost.springcloud.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-service", contextId = "hello-with-fallbackFactory", fallbackFactory = HelloClientFallbackFactory.class)
public interface HelloClient2 {

    @RequestMapping("/hello")
    String hello();
}
