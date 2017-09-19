<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="saveLecture">
  <s:textfield name="lecture.title" label="Title"/>
  <s:textfield name="lecture.room.id" label="RoomId"/>
  <s:submit value="Send"/>
</s:form>