<%@page import="com.cos.blog.model.Post"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ include file="../layout/header.jsp" %>

<%
	 Post post = (Post) request.getAttribute("post");
%>
<%=post.getId() %><br/>
<%=post.getTitle() %><br/>
<%=post.getContent() %><br/>
<h1>/post/list.jsp</h1>
<%@ include file="../layout/footer.jsp" %>