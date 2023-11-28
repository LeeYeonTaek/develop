var index = {
    init: function () {
        $("#btn-login").on("click", () => {
            this.login();
        });
    },

    login : function () {
        $("#login-form").submit();
    }
}

index.init();