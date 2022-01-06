<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="background-color:grey;">
<h4><b>SIGN-IN</b></h4><br/>
 <style>
h4{ text-align: center;}
</style> 
<div>
<div style="text-align:center;">
  <form:form action="addUser" method="post" modelAttribute="user">
    <!-- <input type ="text" name="id"></input><br/>
    <input type ="text" name="name"></input><br/>
    <input type ="text" name="age"></input><br/> -->
    <label><b>Email: </b></label>
    <br>
    <input type ="text" placeholder="Enter Email" name="email"></input><br><br>
    <label><b>Password:</b></label>
    <br>
    <input type ="password" placeholder="Enter Password" name="password"></input><br><br>
      <input type ="submit" value="submit"></input><br/>
      </form:form>
      
     </div> 
</body>
</html>