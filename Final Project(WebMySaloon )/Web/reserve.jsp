<%-- 
    Document   : reserve
    Created on : Sep 22, 2020, 11:49:54 AM
    Author     : Ukdmp Kasun
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");
  
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

String id = request.getParameter("id");
String time = request.getParameter("time");
    HttpSession session2=request.getSession(false);  
        String name=(String)session2.getAttribute("name"); 
        
           HttpSession session4=request.getSession(false);  
        String phone=(String)session4.getAttribute("phone"); 
        
        HttpSession session1=request.getSession(false);  
        String uid=(String)session1.getAttribute("id"); 
        if(session1.getAttribute("id")!= null  ){  
         
      
        
        }  
       
        else{
           response.sendRedirect("../Auth/login.jsp");  
        }

            %>
          
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>My Saloon</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="Vogue template project">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="styles/bootstrap-4.1.2/bootstrap.min.css">
<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="styles/main_styles.css">
<link rel="stylesheet" type="text/css" href="styles/responsive.css">
</head>
<body>

    
<div class="super_container">
	
	<!-- Header -->

	<header class="header trans_400">
		<div class="header_content d-flex flex-row align-items-center justify-content-center trans_400">

			<!-- Logo -->
			<div class="logo">
				<a href="#">
					<div>V<span>o</span>black</div>
					<div>hair</div>
				</a>
				<div class="hamburger"><div></div><div></div><div></div></div>
			</div>

			<!-- Main Navigation -->
			<nav class="main_nav">
				<ul class="d-flex flex-row align-items-start justify-content-start">
					<li class="active"><a href="index.jsp">Home<div><div></div><div></div><div></div></div></a></li>
					<li><a href="index.jsp">Services<div><div></div><div></div><div></div></div></a></li>
					<li><a href="contact.html">Contact<div><div></div><div></div><div></div></div></a></li>
                                         <li><a href="./LogOut">Log Out</a></li>
				</ul>
			</nav>

			<!-- Appointment -->
			
		</div>
	</header>

	<!-- Menu -->
	
	<div class="menu">
		<nav class="menu_nav">
			<ul class="d-flex flex-column align-items-start justify-content-start">
				<li><a href="index.jsp">Home</a></li>
				<li><a href="index.jsp">Services</a></li>
				<li><a href="myreservations.jsp">My Reservations</a></li>
				<li><a href="contact.html">Contact</a></li>
                               <li><a href="./LogOut">Log Out</a></li>
			</ul>
		</nav>
	</div>
        <div class="main" style="width: 100%; height: 100px"></div>
        <div class="container" style="margin-top: 20px" >
        <div class="card">
  <div class="card-body">
      
      <br>
      <br>
    		
        <div class="container">
        <div class="card">
  <div class="card-body">
 
      <br>
      <form action="./reserve" method="POST">
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" readonly=""  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" value="<%=name %>">
      <input type="hidden" name="name" class="form-control" id="exampleInputPassword1" value="<%=name %>" >
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Phone Number</label>
    <input type="number" readonly=""  class="form-control" id="exampleInputPassword1" placeholder="<%=phone %>">
      <input type="hidden" name="id" class="form-control" id="exampleInputPassword1" value="<%=id %>" >
        <input type="hidden" name="phone" class="form-control" id="exampleInputPassword1" value="<%=phone %>" >
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Time Slot</label>
    <input type="text" name="time" class="form-control" id="exampleInputPassword1" readonly value="<%=time %>">
  </div>
  <button type="submit" class="btn btn-primary float-right">Reserve</button>
</form>		
  </div>
</div></div>
    </body>
</html>

