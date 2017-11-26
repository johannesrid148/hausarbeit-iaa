<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<table>
  <tr>
    <th>Nak-Schlüssel</th>
    <th>Title</th>
    <th>Autor/en</th>
    <th>Veröffentlichung</th>
    <th>Verlag</th>
    <th>Art</th>
    <th>ISBN</th>
    <th>Schlagwort</th>
    <th>Bestand</th>
  </tr>
  <s:iterator value="publikations">
    <tr>
      <td><s:property value="nkey"/></td>
      <td><s:property value="titel"/></td>
      <td><s:property value="autor"/></td>
      <td><s:property value="verDatum"/></td>
      <td><s:property value="verlag"/></td>
      <td><s:property value="art.name"/></td>
      <td><s:property value="ISBN"/></td>
      <td><s:property value="schlagwort.name"/></td>
      <td><s:property value="bestand"/></td>
    </tr>
  </s:iterator>
</table>
