package ge.tsu;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;

@Configuration
public class WSConfig {
    @Autowired
    private Bus bus;
    @Bean
    public Endpoint calculatorEndpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus, new calculatorService());
        endpoint.publish("/Calculator");

        return endpoint;

    }
}
