package com.noxymon.maria.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.noxymon.maria.v1.OrderImpl;
import com.noxymon.maria.v1.OrderRest;

@Configuration
public class WebServiceConfig {	
	
	@Autowired
	private Bus bus;
		
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpointImpl = new EndpointImpl(bus, new OrderImpl());
		endpointImpl.publish("/order");
		return endpointImpl;
	}
	
	@Bean
	public Server endpointRest() {
		JAXRSServerFactoryBean restEndpoint = new JAXRSServerFactoryBean();		
		restEndpoint.setBus(bus);
		restEndpoint.setAddress("/rest");
		
		List<Object> providers = new ArrayList<>();
		JacksonJsonProvider jsonProvider = new JacksonJsonProvider();
		providers.add(jsonProvider);
		restEndpoint.setProviders(providers);
		
		/*
		 * List All Rest Endpoint here
		 */
		List<Object> restClasses = new ArrayList<>();
		restClasses.add(new OrderRest());
		restEndpoint.setServiceBeanObjects(restClasses);
		
		return restEndpoint.create();
	}	
}
