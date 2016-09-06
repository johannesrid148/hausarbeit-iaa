<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h2>Lectures</h2>
<s:iterator value="lectures">
  <li><s:property value="id"/> - <s:property value="room.roomNumber"/></li>
</s:iterator>
</body>
</html>
