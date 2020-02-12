package com.rmendes.swgohbot;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class EventProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		String s = exchange.getIn().getBody(String.class);
		System.out.println(s);
		exchange.getIn().setBody("cascaesBOT for Telegram working");
		
	}

}
