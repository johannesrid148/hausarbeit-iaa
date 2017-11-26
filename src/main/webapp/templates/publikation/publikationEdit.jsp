<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="savePublikation">
  <s:textfield name="publikation.title" label="Title"/>
  <s:textfield name="publikation.bestand" label="Bestand"/>
  <s:submit value="Send"/>
</s:form>
