import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableConfigServer
public class sServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(sServerApplication.class, args);
    }
}
