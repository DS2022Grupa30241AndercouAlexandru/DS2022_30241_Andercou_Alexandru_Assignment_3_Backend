package ro.tuc.ds2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartInfo {
    @Autowired
    private  ServerProperties serverProperties;
    @Bean
    public void startInfo()
    {
        System.out.println("started on port:"+serverProperties.getPort());
    }
}
