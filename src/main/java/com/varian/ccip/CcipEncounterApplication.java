package com.varian.ccip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.varian.ccip.dao")
@EnableFeignClients
public class CcipEncounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcipEncounterApplication.class, args);
	}

}
