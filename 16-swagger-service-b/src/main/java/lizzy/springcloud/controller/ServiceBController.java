package lizzy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/service-b1")
    public String serviceB1() {
        String services = "ServiceB1: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/service-b2")
    public String serviceB2() {
        String services = "ServiceB2: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/service-b3")
    public String serviceB3() {
        String services = "ServiceB3: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/service-b4")
    public String serviceB4() {
        String services = "ServiceB4: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
