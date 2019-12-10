

function validate() {
     var password= document.getElementById("password").value;
     // for case insensitive use i after /
     // var regx = /E00/i; meaning E can be small or capital word
     var regx = /E00/;
//  for it to be valid input must contain E00 NOTE: 0 is twice

// letter check and ranges  

var regx1 = /simple/;  
// if you want only 'simple' to be in the user input use this
var regx2 = /[sde]imple/;
// if you want the first word to start with either s,d,e only
// follow by ... imple
var regx3 =/[a-m]00/ //meaning first letter starts a-m follow by 00
// and can be any part in the input
var regx4 =/[0-9]abc/
// meaning first number starts 0-9 follow by abc
// and can be any part in the input
var regx5 =/[0-5]a[6-9]c/ ; var regx6 =/[0-5]a[6-9][a-z]/
// specifies particular letter at a particular location
//starts from 0-5 follow by 'a' then from 0 - 9 then letter 'c' 
// or ends with a- z as in case in 'regx6'
var regx8 =/[^1abc]a/; //[^1abc] exclude [^1abc]
 var regx9 =/[^a-z]05t/
// to exclude a particular chracters 
// in the regx8 we dont input to start with 1,a,b,c
// and in case of regx9  no input to start with a-z

// VALIDATING A MOBILE NUMBER FOR GAMBIA
var mobile = /^[235679][0-9]{6}$/; //^[] start with [235679] $ end of the input
// \d  == [0-9]

// EMAIL VADIDATION

var email = /^([a-zA-Z0-9\.-]+)@([a-z]+).([a-z]{2,3}).([a-z]{2,3})?$/
//^[a-zA-Z0-9\.-] the first position ,'+' one or more than one chracter
//{2,3} min 2, max 10 hard codding
// . means any cracter in th string therefore use \. 
var exicise =/^[5-9][a-z]{8}0$/;
var regx7 =/[0-5]a[6-9]c/
if (email.test(password)) {
     document.getElementById("lbUser2").style.visibility = "visible";
     document.getElementById("password").style.border = "1px solid green";

}
else{

    document.getElementById("lbUser1").style.visibility = "visible";
}

}