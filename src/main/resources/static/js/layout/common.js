    $(function () {
        $('.menu li').hover(function(){
            $(this).find('.submenu').stop().slideDown();
        }, function(){
            $(this).find('.submenu').stop().slideUp();
        });
    });