package cn.jboost.springcloud.ribbon.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RibbonClientTest {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Test
    public void testLB() {
        ServiceInstance instance = loadBalancer.choose("hello-service");
        System.out.println(String.format("http://%s:%s", instance.getHost(),
                instance.getPort()));
    }

}
