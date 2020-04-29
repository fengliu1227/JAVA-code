<!--fengliu -->
<%@ page import="java.io.*" %>
<%
String length = request.getParameter("length");
String area = request.getParameter("area");
if(length != null && area != null){
    String file = application.getRealPath("/") + "fengliu-databaseForTomcat.txt";
    FileWriter filewriter = new FileWriter(file, true);
    filewriter.write(length+" ");    
    filewriter.write(area+" ");     
    filewriter.close();
}
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=2.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>homework for CPE552-fengliu</title>
</head>
<label for="materials">Choose a material:</label>

<select id="materials">
  <option value="copper">copper</option>
  <option value="tungsten">tungsten</option>
  <option value="aluminum">aluminum</option>
</select>
<body>
    <form method="GET" action="552homework-fengliu.jsp">
        length(m)
        <input type="text" name="length">
        area(m^2)
        <input type="text" name="area">
    
        <input type="submit" name="sub_btn" value="submit"  onclick="tan()"style="width:100px; height:50px; font-family:TimesNewRoman; color:black;">
    </form>
</body>
<script>


function tan()

{
document.write("运算结果是："+(length/area)); 
document.write("<h1>it should be works<h1>"); 


}

</script>

</html>
