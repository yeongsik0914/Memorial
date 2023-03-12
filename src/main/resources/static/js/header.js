  // 햄버거 토글 버튼
  var burger = $('.menu-trigger');
  var burger_toggle = 0;
  var window_idx = undefined;
  var window_toggle = undefined;
  burger.each(function(index){
      var $this = $(this);
      window_idx = index;
      $this.on('click', function(e){
          e.preventDefault();
          window_toggle = 0;
          $(this).toggleClass('active-' + (index+1));  
      })
  });

  burger.on('click', function(){
    if(burger_toggle == 0){
      $('.sub_menubar').animate({left:'0px'});
      $('header').css({position:'fixed'}).animate({left:'350px'});
      $('.index_nav').css({position:'relative'}).animate({left:'350px'});
      $('body').css({overflow: 'hidden'});
      
      burger_toggle = 1;
    } else {
      $('.sub_menubar').animate({left:'-350px'});
      $('header').css({position:'fixed'}).animate({left:'0px'});
      $('.index_nav').css({position:'relative'}).animate({left:'0px'});
      $('body').css({overflow: 'visible'});
      burger_toggle = 0;
    }
  });

  // 햄버거 토글 버튼 끝
  $(document).ready(function(){
    var index = null;
    // 메뉴바 마우스 이벤트
    $('#nav_bar #menu').mouseover(function(){
      $('#sub_nav').css('display','block');
    });

    $('#sub_nav').mouseleave(function(){
      $('#sub_nav').css('display','none');
      $('#menu li a').css('color','gray');
      $('.submenu li a').css('color','gray');
    });

    $('#sub_nav').mouseover(function(){
      $('#sub_nav').css('display','block');
    });

    $('#nav_bar #menu').mouseleave(function(){
      $('#sub_nav').css('display','none');
      $('#menu li a').css('color','gray');
      $('.submenu li a').css('color','gray');
    });

    $('#menu li').mouseover(function(){
      index = $(this).index();
      $('#menu li:eq('+index+') a').css('color','white');
      $('.submenu:eq('+index+') li a').css('color','white');
    });

    $('#menu li').mouseleave(function(){
      $('#menu li:eq('+index+') a').css('color','gray');
      $('.submenu:eq('+index+') li a').css('color','gray');
    });

    $('.submenu').mouseover(function(){
      index = $(this).index();
      $('.submenu li a').mouseover(function(){
        $('#menu li:eq('+index+') a').css('color','white');
        $('.submenu:eq('+index+') li a').css('color','white');
        $(this).css('color','#d195ff');
      });
      $('.submenu li a').mouseleave(function(){
        $('.submenu:eq('+index+') li a').css('color','white');
      });
    });

    $('.submenu').mouseleave(function(){
      $('#menu li:eq('+index+') a').css('color','gray');
      $('.submenu:eq('+index+') li a').css('color','gray');
    }); 
    // 메뉴바 마우스 이벤트 끝
  });


  //반응형 메뉴바 닫기
  $(window).resize(function(){ 
  if (window.innerWidth > 1250) {  // 다바이스 크기가 480이상일때 
    $('.sub_menubar').css({left: '-350px'});
    $('.index_nav').css({left: '0px'});
    $('header').css({left: '0px'});
    burger_toggle = 0;
    $('body').css({overflow: 'visible'});
    if(window_toggle == 0){
      $(burger).toggleClass('active-' + (window_idx+1));
      window_toggle = 1;
    } else {
      return false;
    }
  } else {
     
  }
  }).resize(); 