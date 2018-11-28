package com.paytm.thriftDemo.postpaid.service;

import com.paytm.thriftDemo.bo.PostpaidAccountBO;
import com.paytm.thriftDemo.dto.PostpaidAccountRequestDTO;
import com.paytm.thriftDemo.postpaid.exception.AccountDoesNotExistException;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AccountServiceImpl implements PostpaidAccountThriftService.Iface{

  @Override
  public PostpaidAccountBO getAccount(PostpaidAccountRequestDTO account)
      throws AccountDoesNotExistException, TException {
    log.info("Received request to fetch account, request:{}",account);
    if(account.getAccountNumber().equals("123")){
      PostpaidAccountBO postpaidAccount = new PostpaidAccountBO();
      postpaidAccount.setAccountNumber("123");
      postpaidAccount.setFirstName("Pulkit");
      postpaidAccount.setCustomerId(100200);
      return postpaidAccount;
    }
    else if(account.getAccountNumber().equals("456")){
      PostpaidAccountBO postpaidAccount = new PostpaidAccountBO();
      postpaidAccount.setAccountNumber("456");
      postpaidAccount.setFirstName("Pulkit Sharva");
      postpaidAccount.setCustomerId(100300);
      postpaidAccount.setDueAmount(100.00);
      return postpaidAccount;
    }
    else{
      log.error("Throwing dummy exception");
      throw new AccountDoesNotExistException(400, "Account number is invaild");
    }
  }
}
