<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<h1><s:text name="Bibliotheksverwaltung 1.0"/></h1>
<table>
    <tr>
        <th>
            <s:form action="header.jsp">
            <s:submit value="Startseite"/>
        </s:form>
        </th>
        <th>
            <s:form action="response.sendRedirect('header.jsp');">
            <s:submit value="Neue Ausleihe"/>
        </s:form>
        </th>
        <th>
            <s:form action="savePublikation">
            <s:submit value="Verlängerung"/>
        </s:form>
        </th>
        <th>
            <s:form action="savePublikation">
            <s:submit value="Neue Art"/>
        </s:form>
        </th>
        <th>
            <s:form action="savePublikation">
            <s:submit value="Neues Schlagwort"/>
        </s:form>
        </th>
        <th>
            <s:form action="publikationEdit">
            <s:submit value="Neue Publikation"/>
        </s:form>
        </th>
    </tr>
</table>
