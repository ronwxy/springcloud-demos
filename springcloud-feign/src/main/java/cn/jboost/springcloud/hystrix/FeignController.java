package cn.jboost.springcloud.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private HelloClient helloClient;

    @RequestMapping("feign")
    public String feignTest(){
        return "调用Hello-service返回： " + helloClient.hello();
    }

    @RequestMapping("feign/param")
    public String feignTestParam(QueryParam param) {
        return "调用Hello-service返回： " + helloClient.hello(param);
    }
}
