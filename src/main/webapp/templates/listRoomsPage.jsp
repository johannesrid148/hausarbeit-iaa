<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<table class="table table-hover">
  <tr>
    <th>#</th>
    <th>Building</th>
    <th>RoomNumber</th>
    <th>Seats</th>
    <th>PresenterAvailable</th>
  </tr>
  <s:iterator value="rooms">
    <tr>
      <th><s:property value="id"/></th>
      <td><s:property value="building"/></td>
      <td><s:property value="roomNumber"/></td>
      <td><s:property value="seats"/></td>
      <td><s:property value="presenterAvailable"/></td>
    </tr>
  </s:iterator>
</table>