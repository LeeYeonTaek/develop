<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="container-fluid">
<form>
    <div class="form-container">
        <div class="inner-container">
            <div class="form-group">
                <label for="memberName">아이디:</label>
                <input type="text" placeholder="아이디을 입력해주세요." id="memberName">
            </div>
            <div class="form-group">
                <label for="memberPw">비밀번호:</label>
                <input type="password" placeholder="비밀번호를 입력해주세요." id="memberPw">
            </div>
            <div class="form-group">
                <label for="memberEmail">이메일:</label>
                <input type="email" placeholder="이메일을 입력해주세요." id="memberEmail">
            </div>
            <button id="btn-save">회원가입</button>
        </div>
    </div>
</form>
</div>
<script src="/js/member/join.js"></script>
<link href="/css/member/join.css" rel="stylesheet" type="text/css">