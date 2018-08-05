<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New AOE order</title>
</head>
<body>


<form:form method="POST" action="/cops/auth/aoe-created" modelAttribute="auth">
             <table>
                <tr>
                    <td><form:label path="acctId">acctId</form:label></td>
                    <td><form:input path="acctId"/></td>
                </tr>
                <tr>
                    <td><form:label path="mgrId">mgrId</form:label></td>
                    <td><form:input path="mgrId"/></td>
                </tr>
                <tr>
                    <td><form:label path="assetId">assetId</form:label></td>
                    <td><form:input path="assetId"/></td>
                </tr>
                <tr>
                    <td><form:label path="authQty">authQty</form:label></td>
                    <td><form:input path="authQty"/></td>
                </tr>
                <tr>
                    <td><form:label path="tradeCode">tradeCode</form:label></td>
                    <td><form:input path="tradeCode"/></td>
                </tr>
                <tr>
                    <td><form:label path="approverInit">approverInit</form:label></td>
                    <td><form:input path="approverInit"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    
    
</body>
</html>