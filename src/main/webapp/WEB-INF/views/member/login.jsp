<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br/>
<form>
    <div class="form-group">
        <label for="member_name">이름 :</label> <input type="text" class="form-control" placeholder="이름을 입력해주세요." id="member_name">
    </div>

    <div class="form-group">
        <label for=member_pw>비밀번호 </label> <input type="password"
                                                 class="form-control" placeholder="비밀번호를 입력해주세요." id="member_pw">
    </div>

    <div class="form-group">
        <label for="member_email">이메일 :</label> <input type="email"
                                                class="form-control" placeholder="이메일을 입력해주세요." id="member_email">
    </div>
    <button id="btn-save" class="btn btn-dark">회원가입</button>
</form>
<br/>
<script src="/js/member/join.js"></script>