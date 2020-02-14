package cn.jboost.springcloud.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @Value("${app}")
    private String app;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, welcome to spring cloud 2. env: " + env.getProperty("app") + ", value: " + app;
    }


    @RequestMapping("hello/param")
    public String hello(QueryParam param) {
        return "Hello " + param.getName() + "，你的年龄是 " + param.getAge();
    }
}
