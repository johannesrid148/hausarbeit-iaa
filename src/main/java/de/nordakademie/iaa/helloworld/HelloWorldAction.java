package de.nordakademie.iaa.helloworld;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {
  private String name;
  private String greeting;

  @Override
  public String execute() throws Exception {
    greeting = "Hello " + name;
    return SUCCESS;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getGreeting() {
    return greeting;
  }
}
