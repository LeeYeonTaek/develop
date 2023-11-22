    $(function () {
        $('.menu li').hover(function(){
            $(this).find('.submenu').stop().slideDown();
        }, function(){
            $(this).find('.submenu').stop().slideUp();
        });
    });
        $(function() {
            const menuWrap = $(".menu-wrap");
            const menu = $("#responsive-menu");
            const menuItems = menu.find("> li"); // 수정: 바로 아래의 li만 선택
            const toggleBtn = menu.find("toogle-btn");

            function adjustMenu() {
                const windowWidth = $(window).width();

                if (windowWidth < 200) {
                    $(window).width(200);
                }

                if (windowWidth < 600) {
                    menuWrap.css({
                        "position": "relative"
                    });

                    menuItems.not(":first-child, :last-child").css({ // 수정: 첫 번째와 마지막 요소를 제외하고 숨기기
                        "display": "none",
                    });

                    menuItems.first().css({
                        "float": "left", // 오른쪽 정렬
                    });

                    menuItems.last().css({
                        "float": "right", // 오른쪽 정렬
                    });

                    toggleBtn.css({
                        "display": "inline-block",
                        "float": "right",
                    });

                    menu.find(".submenu").css({ // 수정: 서브메뉴도 숨기기
                        "display": "none",
                    });
                } else {
                    menuWrap.css({
                        "position": "static"
                    });

                    menuItems.css({
                        "display": "inline-block",
                        "margin-right": "40px",
                        "float": "none",
                    });

                    toggleBtn.css({
                        "display": "none",
                    });
                }
            }

            adjustMenu();
            $(window).on("resize", adjustMenu);
        });

    $(function () {
        $('#toogle-btn').click(function () {
            $('.sidebar').toggleClass('active');
            $('body').toggleClass('overlay-active');

        });

        $('.side-menu li:has(ul)').click(function (e) {
            e.stopPropagation();
            $(this).find('.side-submenu').slideToggle(300);
        });

        $('#close-btn').click(function () {
            $('.sidebar').removeClass('active');
            $('body').removeClass('overlay-active');
        });
    });