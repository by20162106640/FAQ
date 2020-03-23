// JavaScript Document
var id = function(el) {          return document.getElementById(el);        },
       c = id('photo-list');
   if(c) {
       var ul = id('scroll'),
           lis = ul.getElementsByTagName('li'),
           itemCount = lis.length,
           width = lis[0].offsetWidth, 
           marquee = function() {
               c.scrollLeft += 2;
               if(c.scrollLeft % width <= 1){  
                   ul.appendChild(ul.getElementsByTagName('li')[0]);
                   c.scrollLeft = 0;
               };
           },
           speed = 800; //数值越大越慢
       ul.style.width = width*itemCount + 'px';         
       var timer = setInterval(marquee, speed);
       c.onmouseover = function() {
           clearInterval(timer);
       };
       c.onmouseout = function() {
           timer = setInterval(marquee, speed);
       };
   };
