<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<table>
  <tr>
    <th>Id</th>
    <th>Title</th>
    <th>RoomBuilding</th>
    <th>RoomNumber</th>
  </tr>
  <s:iterator value="lectures">
    <tr>
      <td><s:property value="id"/></td>
      <td><s:property value="title"/></td>
      <td><s:property value="room.building"/></td>
      <td><s:property value="room.number"/></td>
    </tr>
  </s:iterator>
</table>
