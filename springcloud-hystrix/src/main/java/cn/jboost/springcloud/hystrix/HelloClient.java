package cn.jboost.springcloud.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-service")
public interface HelloClient {

    @RequestMapping("/hello")
    String hello();
}
