package cn.jboost.springcloud.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, welcome to spring cloud.";
    }


    @RequestMapping("hello/param")
    public String hello(QueryParam param) {
        return "Hello " + param.getName() + "，你的年龄是 " + param.getAge();
    }
}
