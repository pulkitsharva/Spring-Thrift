package com.paytm.thriftDemo.postpaid.app;

import com.paytm.thriftDemo.postpaid.service.AccountServiceImpl;
import com.paytm.thriftDemo.postpaid.service.PostpaidAccountThriftService;
import javax.servlet.Servlet;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan({"com.paytm.thriftDemo.postpaid.*"})
public class PostpaidApplication {

  public static void main(String[] args) {
    SpringApplication.run(PostpaidApplication.class, args);
  }

  @Bean
  public TProtocolFactory tProtocolFactory(){
    return new TBinaryProtocol.Factory();
  }

  @Bean
  public ServletRegistrationBean postpaidAccount(TProtocolFactory protocolFactory, AccountServiceImpl handler) {
    TServlet tServlet = new TServlet(new PostpaidAccountThriftService.Processor<AccountServiceImpl>(handler), protocolFactory);
    return new ServletRegistrationBean(tServlet, "/postpaid/account");
  }
}
