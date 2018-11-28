package com.paytm.thriftDemo.lms.service;

import com.paytm.thriftDemo.bo.PostpaidAccountBO;
import com.paytm.thriftDemo.dto.PostpaidAccountDTO;
import com.paytm.thriftDemo.dto.PostpaidAccountRequestDTO;
import com.paytm.thriftDemo.lms.exception.AccountDoesNotExistException;
import com.paytm.thriftDemo.lms.service.thrift.PostpaidAccountThriftService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class PostpaidAccountServiceImpl implements PostpaidAccountService {

  @Override
  public PostpaidAccountDTO getAccountByAccountNumber(PostpaidAccountRequestDTO account)
      throws AccountDoesNotExistException {

    TTransport transport;
    try {
      String url ="http://localhost:9090/postpaid/account";
      transport = new THttpClient(url);

      TProtocol protocol = new TBinaryProtocol(transport);

      PostpaidAccountThriftService.Client client = new PostpaidAccountThriftService.Client(protocol);
      PostpaidAccountBO postpaidAccount = client.getAccount(account);
      log.error("Got account data from Postpaid: {}", postpaidAccount);
      PostpaidAccountDTO postpaidAccountDTO = new PostpaidAccountDTO();
      postpaidAccountDTO.setCustomerId(postpaidAccount.getCustomerId());
      postpaidAccountDTO.setFirstName(postpaidAccount.getFirstName());
      postpaidAccountDTO.setDueAmount(postpaidAccount.getDueAmount());
      return  postpaidAccountDTO;
    } catch (AccountDoesNotExistException e) {
      log.error("Got exception from thrift server, error:{}",e);
      throw e;
    } catch (TTransportException e) {
      log.error("Got transport exception from thrift server, error:{}",e);
      return null;
    } catch (TException e) {
      log.error("Got thrift exception from thrift server, error:{}",e);
      return null;
    }
  }
}
