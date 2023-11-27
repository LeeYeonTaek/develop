var index = {
    init: function () {
        $("#btn-login").on("click", () => {
            this.login();
        });
    },

    login : function () {
        var data = {
            memberName:$("#memberName").val(),
            memberPw:$("#memberPw").val(),
        };
        // console.log(data);
        $.ajax({
            type:"POST",
            url:"/member/login",
            data:JSON.stringify(data),
            contentType:"application/json; charset=utf-8",
            dataType:"json"
        }).done(function (resp){
            alert("로그인 완료");
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    }
}

index.init();