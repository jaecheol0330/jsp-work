<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//JSessionld를 날리는 것
	session.invalidate();
	response.sendRedirect("main.jsp");
%>