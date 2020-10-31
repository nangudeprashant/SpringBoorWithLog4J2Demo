package com.javaLive;

//import org.apache.log4j.BasicConfigurator;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBootWithLog4J2DemoApplication {

	//private static final Logger LOGGER = LoggerFactory.getLogger(SpringBoorWithLog4J2DemoApplication.class);
	private static Logger LOGGER = LogManager.getLogger(SpringBootWithLog4J2DemoApplication.class);
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		SpringApplication.run(SpringBootWithLog4J2DemoApplication.class, args);
		LOGGER.info("=============================Starting Spring Boot application....................");
	    LOGGER.info("*******************Info level log message***********************");
        LOGGER.debug("******************Debug level log message**********************");
        LOGGER.error("******************Error level log message**********************");
        
	}

}
