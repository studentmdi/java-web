  
     function dateTime() {
          var ap  ="";
          
          var date = new Date();
          var checkDate1 = date.getDate();
          var checkDate2 = date.getMonth();
          var checkDate3 = date.getFullYear();
          var hours = date.getHours();
          var mins = date.getMinutes();
          var sec = date.getSeconds();
          if(hours <= 12){
               
               ap = "<span>am</span>";
          }
          else{
               ap = "<span>PM</span>";
          }
          if(hours==0){
               hours= 12;
          }
          if(hours>12){
               // // for local timing 0nly stop at the hour 12
               // not 13,14,15.....24 else remove the condition 
               hours = hours-12;
          }
          hours = checkTime(hours);
          mins =  checkTime(mins);
          sec =  checkTime(sec);
       
 document.getElementById('clock-large').innerHTML = "Time: "+
//  for time check
 hours +":"+ mins+":"+sec+""+"<sub>"+ap+"</sub>"+"<br>"+"Date: "+checkDate1+"-"+checkDate2+"-"+checkDate3;
 function checkTime(i) {
     if(i<10){
          i="0"+i;
     }
     return i;
}
}
    setInterval(dateTime);