package cn.jboost.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


public interface BaseHelloClient {

    @RequestMapping("/hello")
    String hello();
}
