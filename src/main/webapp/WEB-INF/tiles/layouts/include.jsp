<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br/>
<c:if test="${empty currentUserDetails}">
    <div>
        <a href="/member/login">로그인</a> <a href="/member/join">회원가입</a></p>
    </div>
</c:if>
<c:if test="${not empty currentUserDetails}">
    <div>
        <span>${currentUserDetails.member.memberName}님</span> <a href="/member/logout"> 로그아웃</a>
    </div>
</c:if>
<br/>