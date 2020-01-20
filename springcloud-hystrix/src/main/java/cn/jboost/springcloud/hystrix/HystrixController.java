package cn.jboost.springcloud.hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @Autowired
    private HelloClient helloClient;

    @Autowired
    private HelloClient1 helloClient1;

    @Autowired
    private HelloClient2 helloClient2;

    @Autowired
    private HelloClient3 helloClient3;

    /**
     * 有断路器，但无fallback
     * @return
     */
    @RequestMapping("hystrix0")
    public String hystrixTest() {
        return "调用hello-service返回：" + helloClient.hello();
    }


    /**
     * 使用fallback
     * @return
     */
    @RequestMapping("hystrix1")
    public String hystrixTest1() {
        return "调用hello-service返回：" + helloClient1.hello();
    }

    /**
     * 使用fallbackFactory
     * @return
     */
    @RequestMapping("hystrix2")
    public String hystrixTest2() {
        return "调用hello-service返回：" + helloClient2.hello();
    }

    /**
     * 禁用断路器
     * @return
     */
    @RequestMapping("hystrix3")
    public String hystrixTest3() {
        return "调用hello-service返回：" + helloClient3.hello();
    }
}
