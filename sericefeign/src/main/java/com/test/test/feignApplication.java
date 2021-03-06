package com.test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

//@EnableHystrixDashboard
//@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class feignApplication {

	public static void main(String[] args) {
		SpringApplication.run(feignApplication.class, args);
	}
	  @Bean
	    @LoadBalanced
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

	 /*@Bean  
	    public ServletRegistrationBean getServlet() {  
	        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();  
	        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);  
	        registrationBean.setLoadOnStartup(1);  
	        registrationBean.addUrlMappings("/hystrix.stream");  
	        registrationBean.setName("HystrixMetricsStreamServlet");  
	        return registrationBean;  
	    }  */
}
