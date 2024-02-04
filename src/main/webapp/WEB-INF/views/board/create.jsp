<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/layouts/header.jsp"/>
<body class="bg-gradient-primary">

<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">게시글 등록</h1>
                                </div>
                                <form id="board-form" class="board" action="/create" method="POST" >
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-user"
                                               id="title" name="title"
                                               placeholder="게시글 제목">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-user"
                                               id="content" name="content" placeholder="게시글 내용" style="height: 500px;">
                                    </div>
                                    <a href="#" id="btn-login" class="btn btn-primary btn-user btn-block">
                                        게시글 등록
                                    </a>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>

</div>
<jsp:include page="/WEB-INF/layouts/footer.jsp"/>
<script src="/js/member/login.js"></script>
</boady>

</html>