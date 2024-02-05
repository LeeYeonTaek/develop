var index = {
    init: function () {
        $("#btn-create").on("click", () => {
            if ($('#title').val() === '') {
                $('#title').focus();
                alert('게시글 제목을 입력 해주세요.');
                return false;
            }

            if ($('#content').val() === '') {
                alert('게시글 내용을 입력 해주세요.');
                $('#content').focus();
                return false;
            }

            this.create();
        });
    },

    create: function () {
        var data = {
            'title': $("#title").val(),
            'content': $("#content").val()
        };

        $.ajax({
            type: "post",
            url: "/board/create",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function (response,status, xhr) {
                if(xhr.status == 200 && response.result == 'success') {
                    location.href = "/board";
                }
            },
            error: function (xhr, status, error) {
                if (JSON.parse(xhr.responseText).result == 'fail') {
                   alert("게시글 등록 실패");
                }
            }
        });

    }
}

index.init();