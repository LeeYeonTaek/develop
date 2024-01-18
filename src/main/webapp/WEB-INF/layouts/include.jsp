<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br/>
<div class="top">
        <div>
        <c:if test="${empty member}">
                <a class="top-a" href="/member/login">로그인</a> <a class="top-a" href="/member/join">회원가입</a>
        </c:if>
        <c:if test="${not empty member}">
                <a class="top-a-none">${member.memberName}님</a> <a class="top-a" href="/member/logout"> 로그아웃</a>
        </c:if>
        </div>
</div>
<br/>