package cn.jboost.springcloud.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-service", contextId = "hello-with-fallback", fallback = HelloClientFallback.class)
public interface HelloClient1 {

    @RequestMapping("/hello")
    String hello();
}
