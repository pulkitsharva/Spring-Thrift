package com.paytm.thriftDemo.lms.service;

import com.paytm.thriftDemo.bo.PostpaidAccountBO;
import com.paytm.thriftDemo.dto.PostpaidAccountDTO;
import com.paytm.thriftDemo.dto.PostpaidAccountRequestDTO;
import com.paytm.thriftDemo.lms.exception.AccountDoesNotExistException;

public interface PostpaidAccountService {

  PostpaidAccountDTO getAccountByAccountNumber(final PostpaidAccountRequestDTO account) throws AccountDoesNotExistException;

}
