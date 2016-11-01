package de.nordakademie.iaa.helloworld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HelloWorldInterceptor implements Interceptor {

  private final Logger log = LogManager.getLogger(HelloWorldInterceptor.class);

  @Override
  public void destroy() {
  }

  @Override
  public void init() {
  }

  @Override
  public String intercept(final ActionInvocation actionInvocation) throws Exception {

    log.info("got a request");

    final String result = actionInvocation.invoke();

    log.info("send a response");

    return result;
  }
}
