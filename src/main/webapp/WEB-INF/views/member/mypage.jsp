<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br/>
<div class="menu-container">
    <div class="right-container">
        <a href="/member/pwChange">비밀번호 수정</a>
    </div>
</div>
<form action="/member/mypage" method="POST" id="mypage-form">
    <input hidden="text" id="memberId" name="memberId" value="${member.memberId}">
    <div class="form-container">
        <div class="inner-container">
            <div class="form-group">
                <label for="memberName">아이디:</label>
                <input type="text" placeholder="아이디을 입력해주세요." id="memberName" name="memberName" value="${member.memberName}" readonly>
            </div>
            <div class="form-group">
                <label for="memberEmail">이메일:</label>
                <input type="email" placeholder="이메일을 입력해주세요." id="memberEmail" name="memberEmail" value="${member.memberEmail}">
            </div>
            <button id="btn-update">수정</button>
        </div>
    </div>
</form>
<br/>
<script src="/js/member/mypage.js"></script>
