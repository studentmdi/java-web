
 let red = document.getElementById("redDiv");
 let green = document.getElementById("greenDiv");
 let blue = document.getElementById("blueDiv");
 
 let red2 = document.getElementById("red");
 let green2 = document.getElementById("green");
 let blue2 = document.getElementById("blue");

function show(){


     if(red2){
          red.style.visibility="visible";
          green.style.visibility="hidden";
          blue.style.visibility="hidden";
         
     }
     if(green2){
          red.style.visibility="hidden";
          green.style.visibility="visible";
          blue.style.visibility="hidden";
         
     }
     if(blue2){
          blue.style.visibility="visible";
          blue.innerHTML="you click blur"
          green.style.visibility="hidden";
          red.style.visibility="hidden";
        
     }

}




