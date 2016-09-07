<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>All lectures in our database</h1>
<s:form>
  <s:textfield name="roomNumber" />
  <s:submit action="allLectures" />
</s:form>
<ul>
  <s:iterator value="lectures">
    <li><s:property value="id"/> - <s:property value="course.number"/> - <s:property value="room.roomNumber"/></li>
  </s:iterator>
</ul>
</body>
</html>
