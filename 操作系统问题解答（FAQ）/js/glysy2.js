$(function(){
	var imgList = $(".rImg li");
	var biaoti = $(".rTit li");
	var num = $(".rNum li");
	var roll =$(".roll");
	var count = imgList.length;
	var interval = 2000;
	var t;//定时器标识
	
	var index=0;
	/*
	  这里是函数定义
	  function fn(arg1){}
	  var fn = function(arg1){}
	*/
	var hideAll = function(){
		imgList.hide();
		biaoti.hide();
		num.removeClass("current");
	}
	
	var showItem = function(){
		hideAll();
			 //console.info(index);
			$(imgList[index]).fadeIn();
			$(biaoti[index]).fadeIn();
			$(num[index]).addClass("current");
	};
	
	var next=function(){
			 index=index+1;
			 if(index==count)
			 {
				index=0;
			 }
			 showItem();
		};
	
	
	t = setInterval(next,interval);//调用定时器，（next代表下一个，interval表示周期）
	roll.bind("mouseover",function(){
		clearInterval(t);
	});
	roll.bind("mouseout",function(){
		t = setInterval(next,interval);
	});
	num.each(function(i,n){
		$(n).bind("click",function(){
			index = i;
			showItem();
		});
	});
})