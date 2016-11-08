<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="helloWorld">
  <p>Please enter your name:</p>
  <s:textfield name="name" label="Name"/>
  <s:submit value="Send"/>
</s:form>