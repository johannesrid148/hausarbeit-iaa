<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>Struts Hello World</title>
</head>
<body>
<h1>Struts Hello World</h1>
<s:form action="helloWorld">
  <p>Please enter your name:</p>
  <s:textfield name="name" label="Name"/>
  <s:submit value="Send"/>
</s:form>
</body>
</html>
