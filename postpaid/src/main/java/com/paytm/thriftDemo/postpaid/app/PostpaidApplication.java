package com.paytm.thriftDemo.postpaid.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.paytm.thriftDemo.postpaid.*"})
public class PostpaidApplication {

  public static void main(String[] args) {
    SpringApplication.run(PostpaidApplication.class, args);
  }
}
