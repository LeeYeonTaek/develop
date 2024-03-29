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
                            <h1 class="h4 text-gray-900 mb-4">change password!</h1>
                        </div>
                        <form class="user" action="/member/pwChange" method="POST" id="pwChange-form">
                            <div class="form-group">
                                <input type="password" class="form-control form-control-user" id="currentPw" name="currentPw">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control form-control-user" id="newPw" name="newPw" placeholder="new Password">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control form-control-user"
                                       id="checkPw" name="checkPw" placeholder="change Password">
                            </div>
                            <a href="#" id="btn-change" class="btn btn-primary btn-user btn-block">
                                change Password
                            </a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<jsp:include page="/WEB-INF/layouts/footer.jsp"/>
<script src="/js/member/pwChange.js"></script>
</body>
</html>
