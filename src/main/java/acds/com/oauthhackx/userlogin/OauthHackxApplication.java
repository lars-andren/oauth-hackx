package acds.com.oauthhackx.userlogin;

import acds.com.oauthhackx.YamlLoaderInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OauthHackxApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(OauthHackxApplication.class);
        ApplicationContextInitializer<ConfigurableApplicationContext> yamlInitializer = new YamlLoaderInitializer("application-properties.yml");
        application.addInitializers(yamlInitializer);
        application.run(args);
    }

}
