<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<table>
  <tr>
    <th>Mahnstufe</th>
    <th>Matrikelnummer</th>
    <th>Vorname</th>
    <th>Nachname</th>
    <th>Publikation</th>
  </tr>
  <s:iterator value="erinnerungs">
    <tr>
      <td><s:property value="id"/></td>
      <td><s:property value="title"/></td>
      <td><s:property value="room.building"/></td>
      <td><s:property value="room.number"/></td>
    </tr>
  </s:iterator>
</table>
