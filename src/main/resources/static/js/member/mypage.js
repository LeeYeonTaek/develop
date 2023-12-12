var index = {
    init: function () {
        $("#btn-update").on("click", () => {
            this.update();
        });
    },
    update : function () {
        var csrfToken = $("meta[name='_csrf']").attr("content");
        var csrfHeader = $("meta[name='_csrf_header']").attr("content");
        var data = {
            memberId:$("#memberId").val(),
            memberName:$("#memberName").val(),
            memberEmail:$("#memberEmail").val()
        };
        // console.log(data);
        $.ajax({
            type:"POST",
            url:"/member/mypage",
            data:JSON.stringify(data),
            contentType:"application/json; charset=utf-8",
            dataType:"json",
            beforeSend: function (xhr) {
                xhr.setRequestHeader(csrfHeader, csrfToken);
            }
        }).done(function (resp){
            if(resp.status === 200) {
                alert("돼");
            } else {
                alert("왜안돼");
            }
            alert("수정 완료");
            console.log("수정 완료");
        }).fail(function (error){
            alert("수정 실패");
            console.log("수정 실패");
        });
    }
}

index.init();