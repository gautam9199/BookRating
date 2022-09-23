
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>  
<html>  
<head>  
<script>  
var request=new XMLHttpRequest();  
function searchInfo(){  
var name=document.vinform.name.value;  
var url="Srch_category.jsp?val="+name;  
  
try{  
request.onreadystatechange=function(){  
if(request.readyState==4){  
var val=request.responseText;  
document.getElementById('mylocation').innerHTML=val;  
}  
}//end of function  
request.open("GET",url,true);  
request.send();  
}catch(e){alert("Unable to connect to server");}  
}  
</script>
<style>
        .hdr
        { height:100px; width:100%;
        background-color:#F3F4F5;
        }
</style>
</head>  
<body> 
    <div  class="hdr">
                   <img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
    </div>
<h1>Search Category</h1>  
<form name="vinform">  
<input type="text" name="name" onkeyup="searchInfo()">  
</form>  
  
<span id="mylocation"></span>  
</body>  
</html> 