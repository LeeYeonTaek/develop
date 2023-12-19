var index = {
    init: function () {
        $("#btn-update").on("click", () => {
            this.update();
        });
    },
    update : function () {
        $("#mypage-form").submit();
        // var data = {
        //     memberId:$("#memberId").val(),
        //     memberName:$("#memberName").val(),
        //     memberEmail:$("#memberEmail").val()
        // };
        // // console.log(data);
        // $.ajax({
        //     type:"POST",
        //     url:"/member/mypage",
        //     data:JSON.stringify(data),
        //     contentType:"application/json; charset=utf-8",
        //     dataType:"json"
        // }).done(function (resp){
        //     console.log("수정 완료");
        // }).fail(function (error){
        //     console.log("수정 실패");
        // });
    }
}

index.init();