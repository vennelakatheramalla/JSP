<%@page import="com.iq.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#emps {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#emps td, #emps th {
  border: 1px solid #ddd;
  padding: 8px;
}

#emps tr:nth-child(even){background-color: #f2f2f2;}

#emps tr:hover {background-color: #ddd;}

#emps th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
<h1>findAll jsp</h1>
<%
List<Employee> employees=(List<Employee>)request.getAttribute("employees");
%>

<table id="emps">
<tr>
<th>Eid</th>
<th>Ename</th>
<th>Esal</th>
</tr>

<%
for (Employee employee:employees){
%>
<tr>
<td><%=employee.getEid() %></td>
<td><%=employee.getEname() %></td>
<td><%=employee.getEsal() %></td>
</tr>
<%
}
%>
</table>

<%-- commenting
<h1>findAll</h1>
<%!int sum(int a, int b){
	return a + b;
}
	%>




<%
  int result=sum(10, 20);
%>

<h1>Result:

<%=result %></h1>
commenting--%>
</body>
</html>