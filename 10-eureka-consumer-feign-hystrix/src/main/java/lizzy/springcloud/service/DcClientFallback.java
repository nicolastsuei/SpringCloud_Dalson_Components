package lizzy.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class DcClientFallback implements DcClient {

    @Override
    public String consumer() {
        return "熔断Feign";
    }
}