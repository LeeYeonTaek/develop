<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br/>
<form>
    <div class="form-group">
        <label for="memberName">이름 :</label> <input type="text" class="form-control" placeholder="이름을 입력해주세요." id="memberName">
    </div>

    <div class="form-group">
        <label for=memberPw>비밀번호 </label> <input type="password"
                                                 class="form-control" placeholder="비밀번호를 입력해주세요." id="memberPw">
    </div>

    <div class="form-group">
        <label for="memberEmail">이메일 :</label> <input type="email"
                                                class="form-control" placeholder="이메일을 입력해주세요." id="memberEmail">
    </div>
    <button id="btn-save" class="btn btn-dark">회원가입</button>
</form>
<br/>
<script src="/js/member/join.js"></script>