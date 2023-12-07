var index = {
    init: function () {
        $("#btn-change").on("click", () => {
            if($('#currentPw').val() === '') {
                $('#currentPw').focus();
                alert('현재 비밀번호를 입력해주세요.');
                return false;
            }

            if ($('#newPw').val() === '') {
                alert('새로운 비밀번호를 입력해주세요.');
                $('#newPw').focus();
                return false;
            }

            if ($('#checkPw').val() === '') {
                alert('확인 비밀번호를 입력해주세요.');
                $('#checkPw').focus();
                return false;
            }

            if ($('#newPw').val() != $('#checkPw').val()) {
                alert('비밀번호를 확인해주세요.');
                $('#newPw').val();
                $('#checkPw').val();
                $('#newPw').focus();
                return false;
            }

            this.change();
        });
    },

    change : function () {
        $("#pwChange-form").submit();
    }

}

index.init();