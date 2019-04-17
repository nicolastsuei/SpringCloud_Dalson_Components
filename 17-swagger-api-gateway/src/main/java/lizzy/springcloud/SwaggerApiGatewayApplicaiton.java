package lizzy.springcloud;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableSwagger2Doc
@EnableZuulProxy
@SpringCloudApplication
public class SwaggerApiGatewayApplicaiton {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerApiGatewayApplicaiton.class).web(true).run(args);
    }
}
