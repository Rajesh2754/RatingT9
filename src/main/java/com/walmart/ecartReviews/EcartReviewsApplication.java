package com.walmart.ecartReviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EcartReviewsApplication {
	private static final Logger logger = LoggerFactory.getLogger(EcartReviewsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EcartReviewsApplication.class, args);
		logger.info("====Application has started====");
	}

}
