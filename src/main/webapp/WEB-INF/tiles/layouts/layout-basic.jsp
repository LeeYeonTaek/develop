<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="title" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
    <tiles:insertAttribute name="include"/>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link href="/css/common.css" rel="stylesheet" type="text/css">
</head>
<body>
<tiles:insertAttribute name="header"/>
<tiles:insertAttribute name="side"/>
<tiles:insertAttribute name="body"/>
</body>
</html>