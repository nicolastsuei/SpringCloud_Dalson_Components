package lizzy.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ConfigClientHaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientHaApplication.class).web(true).run(args);
    }

    //解决 Could not resolve placeholder 'lizzy' in value "${lizzy}" 问题
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//        c.setIgnoreUnresolvablePlaceholders(true);
//        return c;
//    }

    @Value("${lizzy}")
    String lizzy;

    @Value("${spring.cloud.config.address}")
    String address;

    @RequestMapping(value = "/hi")
    public String hi(){
        return "HA status----" + lizzy + "_" + address;
    }

}
