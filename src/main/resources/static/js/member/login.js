var index = {
    init: function () {
        $("#btn-login").on("click", () => {
            this.login();
        });
    },

    login : function () {
        // console.log(data);
        $.ajax({
            type:"POST",
            url:"/member/login",
            data: {
                memberName: $("#memberName").val(),
                memberPw: $("#memberPw").val()
            },
        }).success(function (resp){
            alert("로그인 완료");
        }).error(function (error){
            alert(JSON.stringify(error));
        });
    }
}

index.init();