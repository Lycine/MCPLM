package org.jozif.mcplm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.jozif.mcplm.dao")
public class McplmApplication {

	public static void main(String[] args) {
		SpringApplication.run(McplmApplication.class, args);
	}
}
