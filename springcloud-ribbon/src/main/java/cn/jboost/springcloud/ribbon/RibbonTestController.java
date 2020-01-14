package cn.jboost.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonTestController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("ribbon")
    public String testRibbon(){
        ServiceInstance instance = loadBalancer.choose("hello-service");
        return String.format("http://%s:%s", instance.getHost(),
                instance.getPort());
    }
}
