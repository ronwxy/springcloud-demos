package cn.jboost.springcloud.hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloClient extends BaseHelloClient{

    @RequestMapping("hello/param")
    String hello(@SpringQueryMap QueryParam param);
}
