<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br/>
<form action="/loginProc" method="POST" id="login-form">
    <div class="form-group">
        <label for="memberName">이름 :</label> <input type="text" class="form-control" placeholder="이름을 입력해주세요." name="memberName" id="memberName">
    </div>

    <div class="form-group">
        <label for=memberPw>비밀번호 </label> <input type="password"
                                                 class="form-control" placeholder="비밀번호를 입력해주세요." name="memberPw" id="memberPw">
    </div>

    <button id="btn-login" class="btn btn-dark">로그인</button>
</form>
<br/>
<script src="/js/member/login.js"></script>