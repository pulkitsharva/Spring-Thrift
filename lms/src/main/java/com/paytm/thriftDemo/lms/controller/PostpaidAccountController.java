package com.paytm.thriftDemo.lms.controller;

import com.paytm.thriftDemo.dto.PostpaidAccountDTO;
import com.paytm.thriftDemo.dto.PostpaidAccountRequestDTO;
import com.paytm.thriftDemo.lms.exception.AccountDoesNotExistException;
import com.paytm.thriftDemo.lms.service.PostpaidAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lms/postpaid/v1/account")
public class PostpaidAccountController {

  @Autowired private PostpaidAccountService postpaidAccountService;

  @RequestMapping(value = "/{accountNumber}", method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<PostpaidAccountDTO> getAccountByAccountNumber(
      @PathVariable(value = "accountNumber") final String accountNumber) {
    PostpaidAccountRequestDTO postpaidAccountRequestDTO = new PostpaidAccountRequestDTO();
    postpaidAccountRequestDTO.setAccountNumber(accountNumber);
    PostpaidAccountDTO postpaidAccount = null;
    try {
      postpaidAccount = postpaidAccountService.getAccountByAccountNumber(postpaidAccountRequestDTO);

      return new ResponseEntity(postpaidAccount,HttpStatus.OK);
    } catch (AccountDoesNotExistException e) {
      return new ResponseEntity(null,HttpStatus.INTERNAL_SERVER_ERROR);

    }
  }
}
