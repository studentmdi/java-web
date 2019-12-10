var image = [

'images/img1.jpg',
'images/img2.jpg',
'images/img3.jpg',
'images/img4.jpg'

]
var x= 0;
setInterval(resume, 5000);
function resume() {
     
     var getImage = document.getElementById("resume-image");
     x++;
     if(x >=image.length){
          x=0;
     }
     getImage.src = image[x];
}