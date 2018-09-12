package cfclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */ 

@SpringBootApplication
@RestController
@RefreshScope
public class cfclientApp 
{
	public static void main(String[] args) {
        SpringApplication.run(cfclientApp.class, args);
    }
	
	
	 @Value("${testspringcloud}")
	    String str;
	    @RequestMapping(value = "/hi")
	    public String hi(){
	        return str;
	    }
}
