<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="savePublikation">
  <s:textfield name="publikation.title" label="Titel"/>
  <s:textfield name="publikation.autor" label="Autoren"/>
  <s:textfield name="publikation.verdatum" label="Veröffentlichungsdatum"/>
  <s:textfield name="publikation.verlag" label="Verlag"/>

  <s:textfield name="publikation.isbn" label="ISBN"/>

  <s:textfield name="publikation.bestand" label="Bestand"/>
  <s:submit value="Send"/>
</s:form>
