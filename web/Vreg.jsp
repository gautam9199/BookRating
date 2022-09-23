<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style>
.hdr
{ height:100px; width:100%;
background-color:#F3F4F5;
}
.button1 { 
	background-color:#0fcabf; 
	border: none;
    color: white;
    padding: 10px 30px;
    text-align: center;
    font-size: 16px;
    cursor: pointer;
	border-radius: 6px;	
}
</style>
<script>
function Submit()
{
var fname = document.forms["myform"]["fname"].value;
    
    if (fname == "") {
        alert("Name must be filled out");
        return false;
    }
var lname = document.forms["myform"]["lname"].value;
    
    if (lname == "") {
        alert("Last Name must be filled out");
        return false;
    }	
var emailRegex = /^[A-Za-z0-9._]*\@[A-Za-z]*\.[A-Za-z]{2,5}$/; 
var email = document.forms["myform"]["email"].value;
 if (email == "" )
 {
  alert("e-mail must be filled out");
  return false;
  }else if(!emailRegex.test(email)){
  alert("invalid email address");
  return false;
  }
 var passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/;
 var pwd = document.forms["myform"]["pwd"].value;
	if(pwd == "" )
	{
	alert("please Enter The Password");
	return false;
	}else if(!passwordRegex.test(pwd)){
	alert("Your password should be Minimum 8 characters at least 1 Alphabet and 1 Number");
	return false;
	}
var phoneRegex = /^(\+\d{1,3}[- ]?)?\d{10}$/;
var phone =	document.forms["myform"]["phone"].value;
 if(phone == "" )
	{
	alert("please Enter The Contact number");
	return false;
	}else if(!phoneRegex.test(phone)){
	alert("Youe have entered invalid contact number");
	return false;
	}
}
</script>
</head>
<body background="F:\wallies\HD Wallpapers\img36.jpg">
	<div  class="hdr" >
		<img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
	</div>
	
	<form name="myform" onsubmit="return Submit()" action="Reg.jsp" method=post>
	<center>
	<table cellpadding=8 cellspacing=8 border="0" bgcolor="transparent"><BR><BR>
		<tr>
		<th colspan="3">
		<font size=10 face="verdana" color="#585858">Member Registration</font><br>
		</th>
		</tr>
		<tr bgcolor="transparent">
			<td valign=top> <font size=5 face="verdana" color="#0fcabf"><b>NAME</b></font></td>
			<td colspan="2"><input type="text" name="fname" placeholder="firstname"  id="txt1" size=18 maxlength=15>
				<input type="text" name="lname" placeholder="lastname" size=18 maxlength=15></td>
		</tr>
		<tr>
			<td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Email-Id</b></font></td>
			<td colspan="2"><input type="text" name="email" value="" size=40 maxlength=50></td>
		</tr>
		<tr>
			<td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Password</b></font></td>
			<td colspan="2"><input type="Password" name="pwd" value="" size=40 maxlength=10></td>
		</tr>
		<tr>
			<td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Country</b></font></td>
			<td colspan="2">
			<select name="cntry" value="choose..">
			<option value="AF">Afghanistan</option>
			<option value="AR">Argentina</option>
			<option value="AU">Australia</option>
			<option value="BH">Bahrain</option>
			<option value="BD">Bangladesh</option>
			<option value="BE">Belgium</option>
			<option value="BR">Brazil</option>
			<option value="CA">Canada</option>
			<option value="CN">China</option>
			<option value="DK">Denmark</option>
			<option value="EG">Egypt</option>
			<option value="FI">Finland</option>
			<option value="FR">France</option>
			<option value="GE">Georgia</option>
			<option value="DE">Germany</option>
			<option value="HK">Hong Kong</option>
			<option value="IS">Iceland</option>
			<option value="IN">India</option>
			<option value="ID">Indonesia</option>
			<option value="IQ">Iraq</option>
			<option value="JP">Japan</option>
			<option value="JE">Jersey</option>
			<option value="KE">Kenya</option>
			<option value="KP">Korea, Democratic People's Republic of</option>
			<option value="KR">Korea, Republic of</option>
			<option value="KW">Kuwait</option>
			<option value="MO">Macao</option>
			<option value="MY">Malaysia</option>
			<option value="MM">Myanmar</option>
			<option value="NP">Nepal</option>
			<option value="NL">Netherlands</option>
			<option value="NZ">New Zealand</option>
			<option value="OM">Oman</option>
			<option value="PK">Pakistan</option>
			<option value="RO">Romania</option>
			<option value="RU">Russian Federation</option>
			<option value="SA">Saudi Arabia</option>
			<option value="ES">Spain</option>
			<option value="LK">Sri Lanka</option>
			<option value="SE">Sweden</option>
			<option value="CH">Switzerland</option>
			<option value="TH">Thailand</option>
			<option value="UA">Ukraine</option>
			<option value="GB">United Kingdom</option>
			<option value="US">United States</option>
			<option value="VN">Viet Nam</option>
			<option value="EH">Western Sahara</option>
			<option value="YE">Yemen</option>
			<option value="ZM">Zambia</option>
			<option value="ZW">Zimbabwe</option>
		</select>
			</td>
		</tr>
		<tr>
			<td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Contact no.</b></font></td>
			<td colspan="2"><input type="text" name="phone" value="" size=40 maxlength=12></td>
		</tr>
		<tr bgcolor="transparent">
			<td></td>
			<td><input class="button1" type="SUBMIT" value="SUBMIT">
			<input class="button1" type="button" value="   EXIT  " onclick="location.href='Vhome.jsp'"></td>
		</tr>
	</table>
	</center>
	</form>
</body>
</html>
