<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br/>
<c:if test="${not empty currentUserDetails}">
    ${currentUserDetails}asad
</c:if>
<c:if test="${empty currentUserDetails}">
    asdadsfasdfasdffds
</c:if>
<br/>