package com.paytm.thriftDemo.lms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.paytm.thriftDemo.lms.*"})
public class LMSApplication {

  public static void main(String[] args) {
    SpringApplication.run(LMSApplication.class, args);

  }

}
