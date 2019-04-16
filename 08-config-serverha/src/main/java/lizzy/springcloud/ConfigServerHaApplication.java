package lizzy.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerHaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerHaApplication.class).web(true).run(args);
    }
}
