    $(function () {
        $('.menu li').hover(function(){
            $(this).find('.submenu').stop().slideDown();
        }, function(){
            $(this).find('.submenu').stop().slideUp();
        });
    });
    $(function() {
        const menu = $("#responsive-menu");
        const menuItems = menu.find("li");
        function adjustMenu() {
            const windowWidth = $(window).width();

            if (windowWidth < 600) {
                menuItems.css({
                    "display": "block",
                    "margin-right": "0"
                });
            } else {
                menuItems.css({
                    "display": "inline-block",
                    "margin-right": "40px"
                });
            }
        }
        adjustMenu();
        $(window).on("resize", adjustMenu);
    });