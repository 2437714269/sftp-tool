package com.windaka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author acer
 */
@SpringBootApplication
@MapperScan(value = "com.windaka.mapper")
public class SftpToolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SftpToolApplication.class, args);
	}

}
