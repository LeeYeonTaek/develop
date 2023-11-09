var index = {
    init: function () {
        $("#btn-save").on("click", () => {
            this.save();
        });
    },

    save : function () {
        var data = {
            member_name:$("#member_name").val(),
            member_pw:$("#member_pw").val(),
            member_email:$("#member_email").val()
        };
        // console.log(data);
        $.ajax({
            type:"POST",
            url:"/member/join",
            data:JSON.stringify(data),
            contentType:"application/json; charset=utf-8",
            dataType:"json"
        }).done(function (resp){
            alert("회원가입 완료");
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    }
}

index.init();