<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<br/>
<form>
    <div class="form-container">
        <div class="inner-container">
            <div class="form-group">
                <label for="memberName">아이디:</label>
                <input type="text" placeholder="아이디을 입력해주세요." id="memberName" value="${member.memberName}">
            </div>
            <div class="form-group">
                <label for="memberPw">비밀번호:</label>
                <input type="password" placeholder="비밀번호를 입력해주세요." id="memberPw" value="${member.memberPw}">
            </div>
            <div class="form-group">
                <label for="memberEmail">이메일:</label>
                <input type="email" placeholder="이메일을 입력해주세요." id="memberEmail" value="${member.memberEmail}">
            </div>
            <button id="btn-update">수정</button>
        </div>
    </div>
</form>
<br/>
<script src="/js/member/mypage.js"></script>