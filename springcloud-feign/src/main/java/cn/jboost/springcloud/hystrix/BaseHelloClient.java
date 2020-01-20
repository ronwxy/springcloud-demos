package cn.jboost.springcloud.hystrix;

import org.springframework.web.bind.annotation.RequestMapping;


public interface BaseHelloClient {

    @RequestMapping("/hello")
    String hello();
}
