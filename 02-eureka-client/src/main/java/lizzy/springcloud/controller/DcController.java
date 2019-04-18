package lizzy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${server.port}")
    String port;

    @GetMapping("/dc")
    public String dc() throws InterruptedException {
        //为了触发服务降级逻辑，加一些延迟
        //Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices() + "---端口号：" + port;
        System.out.println(services);
        return services;
    }

}