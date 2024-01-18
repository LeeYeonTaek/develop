var index = {
    init: function () {
        $("#btn-update").on("click", () => {
            this.update();
        });
    },
    update : function () {
        $("#mypage-form").submit();
    }
}

index.init();