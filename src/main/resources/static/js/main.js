    // 햄버거 메뉴바 디자인 작업 시작
    var index = null;
    $('.sub_header_menu').mouseenter(function(){
        index = $(this).index();
        $('.sub_header_menu:eq('+index+')').css({background: 'white'});
        $('.sub_header_menu:eq('+index+') a h3').css({color: 'black'});
    });
    $('.sub_header_menu').mouseleave(function(){
        index = $(this).index();
        $('.sub_header_menu:eq('+index+')').css({background: 'black'});
        $('.sub_header_menu:eq('+index+') a h3').css({color: 'white'});
    });
    // 햄버거 메뉴바 디자인 작업 끝