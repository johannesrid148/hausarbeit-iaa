<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h2>Save a Room</h2>
<s:form>
  <s:textfield name="room.roomNumber" requiredLabel="true"/>
  <s:submit action="saveLecture"/>
</s:form>
</body>
</html>
