<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/layouts/header.jsp"/>
<body class="bg-gradient-primary">

<div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Update info!</h1>
                        </div>
                        <form class="user" action="/member/mypage" method="POST" id="mypage-form">
                            <input hidden="text" id="memberId" name="memberId" value="${member.memberId}">
                            <div class="form-group">
                                <input type="text" class="form-control form-control-user" id="memberName" name="memberName" value="${member.memberName}" readonly>
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control form-control-user" id="memberEmail" name="memberEmail" value="${member.memberEmail}" placeholder="Email Address">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control form-control-user"
                                       id="memberPw" name="memberPw" placeholder="Password">
                            </div>
                            <a href="#" id="btn-update" class="btn btn-primary btn-user btn-block">
                                Update info
                            </a>
                        </form>
                        <div class="text-center">
                            <a class="small" href="/member/pwChange">change Password</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<jsp:include page="/WEB-INF/layouts/footer.jsp"/>
<script src="/js/member/mypage.js" charset="utf-8"></script>
</body>

</html>
