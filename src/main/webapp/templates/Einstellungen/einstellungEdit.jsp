<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="saveEinstellung">
  <s:textfield name="einstellung.verleihperiode" label="Verleihperiode in Tagen"/>
  <s:submit value="Send"/>
</s:form>

<table>
  <tr>
    <th>Verleihperiode</th>
  </tr>
  <s:iterator value="einstellungen">
    <tr>
      <td><s:property value="verleihperiode"/></td>
    </tr>
  </s:iterator>
</table>
