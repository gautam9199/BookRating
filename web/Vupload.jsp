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
</head>
<body background="F:\wallies\HD Wallpapers\img36.jpg">
    <div  class="hdr" >
            <img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
    </div>
    
    <form action="Upload.jsp" method=post>
    <center>
    <table cellpadding=8 cellspacing=8 border="0" bgcolor="transparent"><BR><BR>
    <tr>
        <th colspan="2"><font size=10 face="verdana" color="#585858">Upload Book</font><br></th>
    </tr>
    <tr bgcolor="transparent">
        <td valign=top><font size=5 face="verdana" color="#0fcabf"><b>Book Name</b></font></td>
        <td><input type="text" name="bname" value=""  id="txt1" size=40 maxlength=40>
    <tr>
        <td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Publication</b></font></td>
        <td><input type="text" name="pub" value="" size=40 maxlength=40></td>
    </tr>
    <tr>
        <td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Author</b></font></td>
        <td><input type="text" name="author" value="" size=40 maxlength=30></td>
    </tr>
    <tr>
        <td valign=top><font size=5 face="Verdana" color="#0fcabf"><b>Genre</b></font></td>
            <td>
            <select name="cat">
                <option>Fiction</option>
                <option>Non-fiction</option>
                <option>Satire</option>
                <option>Drama</option>
                <option>Action and Adventure</option>
                <option>Romance</option>
                <option>Mystery</option>
                <option>Horror</option>
                <option>Self help</option>
                <option>Health</option>
                <option>Guide</option>
                <option>Travel</option>
                <option>Children's</option>
                <option>Religion, spirituality & New age</option>
                <option>Science</option>
                <option>History</option>
                <option>Math</option>
                <option>Anthology</option>
                <option>Poetry</option>
                <option>Encyclopedias</option>
                <option>Dictionaries</option>
                <option>Comics</option>
                <option>Art</option>
                <option>Cookbooks</option>
                <option>Diaries</option>
                <option>Journals</option>
                <option>Prayer Books</option>
                <option>Series</option>
                <option>Biography</option>
                <option>Autobiography</option>
                <option>Fantasy</option>
                <option>Satire</option>
                   
    </select>
         </td>
    </tr>
    <tr bgcolor="transparent">
        <td valign=top> <font size=5 face="verdana" color="#0fcabf"><b>Description</b></font></td>
        <td><TEXTAREA name="des" ROWS=4 COLS=42></textarea>
    </tr>
    <tr>
        <td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Cover Page</b></font></td>
        <td><input type="file" name="photo" accept="image/*" onchange="loadFile(event)"><br>
        <div align="center"><img id="output" width="80" height="80"/>
        <script>
            var loadFile = function(event) {
        var output = document.getElementById('output');
        output.src = URL.createObjectURL(event.target.files[0]);
      };
      </script>
      </td>
    </tr>

    <tr bgcolor="transparent">
        <td></td>
        <td><input class="button1" type="SUBMIT" value="SUBMIT">
        <input class="button1" type="button" value="   EXIT  " onclick="location.href='Vsuccess.jsp'"></td>
    </tr>
    </table>
    </center>
    </form>
</body>
</html>
