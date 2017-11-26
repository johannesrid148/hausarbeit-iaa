<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<h1><s:text name="Bibliotheksverwaltung 1.0"/></h1>
<table>
    <tr>
        <th>
            <s:form action="savePublikation">
            <s:submit value="Startseite"/>
        </s:form>
        </th>
        <th>
            <s:form action="savePublikation">
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
            <s:form action="savePublikation">
            <s:submit value="Neuer Student"/>
        </s:form>
        </th>
    </tr>
    <tr>
        <th>Mahnstufe</th>
        <th>Matrikelnummer</th>
        <th>Vorname</th>
        <th>Nachname</th>
        <th>Publikation</th>
        <th>Verlust</th>
    </tr>
    <s:iterator value="mahnung">
        <tr>
            <td><s:property value="nkey"/></td>
            <td><s:property value="titel"/></td>
            <td><s:property value="autor"/></td>
            <td><s:property value="verDatum"/></td>
            <td><s:property value="verlag"/></td>
            <td><s:property value="art.name"/></td>
        </tr>
    </s:iterator>
</table>
