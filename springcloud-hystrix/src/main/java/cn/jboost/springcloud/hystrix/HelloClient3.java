package cn.jboost.springcloud.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-service", contextId = "hello-without-circuitBreaker", configuration = DisableCircuitBreakerConfiguration.class)
public interface HelloClient3 {

    @RequestMapping("/hello")
    String hello();
}
