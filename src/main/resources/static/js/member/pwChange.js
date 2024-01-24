var index = {
    init: function () {
        $("#btn-change").on("click", () => {
            if ($('#currentPw').val() === '') {
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

    change: function () {
        var data = {
            'currentPw': $("#currentPw").val(),
            'newPw': $("#newPw").val()
        };
        // console.log(data);
        $.ajax({
            type: "post",
            url: "/member/pwChange",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (response,status, xhr) {
                if(xhr.status == 200 && response.result == 'success') {
                    alert("비밀번호 변경 완료");
                    location.href = "/";
                }
            },
            error: function (xhr, status, error) {
                if (JSON.parse(xhr.responseText).result == 'fail') {
                   alert("비밀번호 변경 실패");
                }
            }
        });

    }
}
index.init();