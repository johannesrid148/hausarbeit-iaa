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
            <s:submit value="Vorgänge"/>
        </s:form>
        </th>
        <th>
            <s:form action="savePublikation">
            <s:submit value="Stammdaten pflegen"/>
        </s:form>
        </th>
        <th>
            <s:form action="publikationList">
            <s:submit value="Publikation suchen"/>
        </s:form>
        </th>
        <th>
            <s:form action="publikationEdit">
            <s:submit value="Neue Publikation anlegen"/>
        </s:form>
        </th>
    </tr>
</table>
