<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="saveRoom">
  <s:textfield name="room.building" label="Building"/>
  <s:textfield name="room.number" label="RoomNumber"/>
  <s:submit value="Send"/>
</s:form>