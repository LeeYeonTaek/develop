var index = {
    init: function () {
        $("#btn-save").on("click", () => {
            this.save();
        });
    },

    save : function () {
        var data = {
            memberName:$("#memberName").val(),
            memberPw:$("#memberPw").val(),
            memberEmail:$("#memberEmail").val()
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