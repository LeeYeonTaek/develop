<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br/>
<form action="/member/pwChange" method="POST" id="pwChange-form">
    <div class="form-container">
        <div class="inner-container">
            <div class="form-group">
                <label for="currentPw">현재 비밀번호:</label>
                <input type="password" placeholder="현재 비밀번호를 입력해주세요." id="currentPw" name="currentPw">
            </div>
            <div class="form-group">
                <label for="newPw">새로운 비밀번호:</label>
                <input type="password" placeholder="새로운 비밀번호를 입력해주세요." id="newPw" name="newPw">
            </div>
            <div class="form-group">
                <label for="checkPw">비밀번호 확인:</label>
                <input type="password" placeholder="입력한 비밀번호를 입력해주세요." id="checkPw" name="checkPw">
            </div>
            <button id="btn-change">수정</button>
        </div>
    </div>
</form>
<br/>
<script src="/js/member/pwChange.js"></script>

