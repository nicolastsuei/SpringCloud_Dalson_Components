package lizzy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@RestController
public class ServiceAController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/service-a1")
    public String serviceA1() {
        String services = "ServiceA1: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/service-a2")
    public String serviceA2() {
        String services = "ServiceA2: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/service-a3")
    public String serviceA3() {
        String services = "ServiceA3: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

    @GetMapping("/service-a4")
    public String serviceA4() {
        String services = "ServiceA4: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
