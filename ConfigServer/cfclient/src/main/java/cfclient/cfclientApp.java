package cfclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
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
