package com.varian.ccip;

<<<<<<< HEAD
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.varian.ccip.dao")
@EnableFeignClients
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
>>>>>>> branch 'master' of https://github.com/bjli2018/ccip-encounter.git
public class CcipEncounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcipEncounterApplication.class, args);
	}

}
