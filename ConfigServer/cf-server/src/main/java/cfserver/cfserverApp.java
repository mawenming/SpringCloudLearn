package cfserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;



/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class cfserverApp 
{
	 public static void main(String[] args) {
	        SpringApplication.run(cfserverApp.class, args);
	    }
}
