package com.rmendes.swgohbot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for routing the messages from and to the Telegram chat.
 */
@Component
public class CamelRouter extends RouteBuilder {

//    @Autowired
//    private Bot bot;

    @Override
    public void configure() throws Exception {
    	
        from("timer://foo?fixedRate=true&period=6000")
        .to("http://swgoh-service-swgoh-ms.apps-crc.testing/event")
        .process(new EventProcessor())
        .log("responded with body:\n${body}")
        .to("telegram:bots");
        
       
    	
    }
}
