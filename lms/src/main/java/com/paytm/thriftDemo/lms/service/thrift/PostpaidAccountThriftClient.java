package com.paytm.thriftDemo.lms.service.thrift;

import com.paytm.thriftDemo.lms.service.thrift.PostpaidAccountThriftService.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class PostpaidAccountThriftClient {

  @Bean
  public Client getThriftClient(){
    return null;
  }
}
