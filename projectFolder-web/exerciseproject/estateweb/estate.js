// for estate home page
var image = [ 
     'es1.jpg',
     'es2.jpg',
     'es3.jpg',
     
      ] 
      
     var x = 0;
     setInterval(move,5000);
     
     function move() {
          var imageId = document.getElementById("slider");
             x++; // incrementing the src by 1 every time it loops
          if ( x >=image.length) {
             x= 0; // to the first image 
     
          }
          imageId.src = image[x];
     } 
     
     



// for estate teams 

    var ie1 = [
     'web templates/man1.jpg',
     'web templates/man2.jpg',
     'web templates/man4.jpg'
     
     ]
     var ie2 = [
     
     'web templates/man4.jpg',
     'web templates/man2.jpg',
     'web templates/man1.jpg'
     ]
     var ie3= [
     
          'web templates/man4.jpg',
          'web templates/man2.jpg',
          'web templates/man1.jpg'
          ]
     var x = 0;
     setInterval(go,5000);
     
     function go() {
          var imageId1 = document.getElementById("id1");
          var imageId2 = document.getElementById("id2");
          var imageId3 = document.getElementById("id3");
             x++; // incrementing the src by 1 every time it loops
          if ( x >=ie1.length) {
             x= 0; // to the first image 
     
          }
          if ( x >=ie2.length) {
             x= 0; // to the first image 
     
          }
          if ( x >=ie3.length) {
               x= 0; // to the first image 
       
            }
          imageId1.src = ie1[x];
          imageId2.src = ie2[x];
          imageId3.src = ie3[x];
     
     
     } 

