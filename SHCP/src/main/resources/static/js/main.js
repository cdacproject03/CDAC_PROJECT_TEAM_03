	//Automatic Slideshow - change image every 4 seconds
   var myIndex = 0;
   imageSlide();
   
   function imageSlide() {
	   var i;
	   var x = document.getElementsByClassName("mySlides");
	   for (i = 0; i < x.length; i++) {
		  x[i].style.display = "none";  
	   }
	   myIndex++;
	   if (myIndex > x.length) {myIndex = 1}    
	   x[myIndex-1].style.display = "block";  
	   setTimeout(imageSlide, 2000);    
   }