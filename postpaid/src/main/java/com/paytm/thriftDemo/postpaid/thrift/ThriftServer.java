package com.paytm.thriftDemo.postpaid.thrift;

import com.paytm.thriftDemo.postpaid.service.PostpaidAccountThriftService;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.THsHaServer.Args;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ThriftServer implements ApplicationListener<ApplicationReadyEvent> {

  @Autowired
  private PostpaidAccountThriftService.Iface accountService;

  @Override
  public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
    try {
      TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(7911);

      PostpaidAccountThriftService.Processor processor =
          new PostpaidAccountThriftService.Processor(accountService);

      THsHaServer server = new THsHaServer(new Args(serverTransport).processor(processor));
      log.info("Thrift server started on port 7911 ...");
      server.serve();
    } catch (TTransportException e) {
      e.printStackTrace();
    }
  }
}
