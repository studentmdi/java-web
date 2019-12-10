var username = document.getElementById("user");
var password = document.getElementById("pass");
 var userLabel = document.getElementById("lbuser");
 var passwordLabel = document.getElementById("lbpasword");
// function validate(){


// if(username.value.trim()=="" || password.value.trim()==""){
//      alert("provide username or password");
//      return false;
// }
// else{
//       true;
// }
// }
// validate the length of the value entered by the user in the inputs




function validate(){

     if(username.value.trim()==""){
          username.style.border = "3px solid red";
          userLabel.style.visibility = "visible";
     
          // alert("provide username");
          return false;
     }

     else if(password.value.trim()==""){
          alert("provide password");
           return false;
     }
     else if(password.value.trim().length<5){
          passwordLabel.style.visibility = "visible";
          // alert("password too short");
           return false;
     }
     else{
          // this is the condition will take you to home page 
          true
     }
     }