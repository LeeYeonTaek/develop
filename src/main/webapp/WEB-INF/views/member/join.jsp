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
                            <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                        </div>
                        <form class="user">
                            <div class="form-group">
                                <input type="text" class="form-control form-control-user" id="memberName"
                                       placeholder="memberName">
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control form-control-user" id="memberEmail"
                                       placeholder="Email Address">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control form-control-user"
                                           id="memberPw" placeholder="Password">
                            </div>
                            <a href="#" id="btn-save" class="btn btn-primary btn-user btn-block">
                                Register Account
                            </a>
                            <hr>
                            <a href="index.html" class="btn btn-google btn-user btn-block">
                                <i class="fab fa-google fa-fw"></i> Register with Google
                            </a>
                            <a href="index.html" class="btn btn-facebook btn-user btn-block">
                                <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                            </a>
                        </form>
                        <hr>
                        <div class="text-center">
                            <a class="small" href="forgot-password.html">Forgot Password?</a>
                        </div>
                        <div class="text-center">
                            <a class="small" href="login.html">Already have an account? Login!</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<jsp:include page="/WEB-INF/layouts/footer.jsp"/>
<script src="/js/member/join.js" charset="utf-8"></script>
</body>

</html>
<%--<div class="container-fluid">--%>
<%--<form>--%>
<%--    <div class="form-container">--%>
<%--        <div class="inner-container">--%>
<%--            <div class="form-group">--%>
<%--                <label for="memberName">아이디:</label>--%>
<%--                <input type="text" placeholder="아이디을 입력해주세요." id="memberName">--%>
<%--            </div>--%>
<%--            <div class="form-group">--%>
<%--                <label for="memberPw">비밀번호:</label>--%>
<%--                <input type="password" placeholder="비밀번호를 입력해주세요." id="memberPw">--%>
<%--            </div>--%>
<%--            <div class="form-group">--%>
<%--                <label for="memberEmail">이메일:</label>--%>
<%--                <input type="email" placeholder="이메일을 입력해주세요." id="memberEmail">--%>
<%--            </div>--%>
<%--            <button id="btn-save">회원가입</button>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</form>--%>
<%--</div>--%>