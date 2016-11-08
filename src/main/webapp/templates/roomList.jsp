<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<table>

  <tr>
    <th>Building</th>
    <th>RoomNumber</th>
  </tr>

  <s:iterator value="rooms">
    <tr>
      <td><s:property value="building"/></td>
      <td><s:property value="roomNumber"/></td>
    </tr>
  </s:iterator>

</table>