<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>CloudCommerce | Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="<g:resource dir="css" file="style.css" />"></link>
<link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery1.min.js"></script>
<!-- start menu -->
<link rel="stylesheet" type="text/css" href="<g:resource dir="css" file="megamenu.css" />"></link>

<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<!-- dropdown -->
<script src="js/jquery.easydropdown.js"></script>
</head>
<body>
    <div class="header-top">
			<div class="wrap"> 
			  <div class="header-top-left">
			  	   
   				    <div class="clear"></div>
   			 </div>
			 <div class="cssmenu">
				<ul>
					<li class="active"><g:link controller="user" action="register">Contact us!</g:link></li>
				</ul>
			</div>
			<div class="clear"></div>
 		</div>
	 </div>
	<div class="header-bottom">
	    <div class="wrap">
			<div class="header-bottom-left">
				<div class="logo">
					<a href="index.html"><g:img dir="images" file="logo.jpg" width="250px"/></a>
					
				</div>
				<div class="menu">
	            <ul class="megamenu skyblue">
			<li class="active grid"><a href="index.html">HOME</a></li>
			<li><a class="color4" href="#">CELL PHONE</a></li>			
			<li><a class="color5" href="#">MOTORS</a></li>
			<li><a class="color6" href="other.html">BOOKS</a></li>
			<li><a class="color7" href="other.html">LAPTOPS</a></li>
			</ul>
			</div>
		</div>
	   
     <div class="clear"></div>
     </div>
	</div>
        <div class="login" >
          	
				<div class="col_1_of_login span_1_of_login">
				<div class="login-title">
	           		<h4 class="title">Customer Registration Form</h4>
					<div id="loginbox" class="loginbox">
						<g:form url="[controller:'user',action:'newUser']">
						  <fieldset class="input">
						    <p id="register_username">
						      <label for="modlgn_username">User name</label>
						      <g:textField  type="text" name="username" class="inputbox" size="18" width="15px" autocomplete="off"/>
						    </p>
						    <p id="register_password">
						      <label for="modlgn_passwd">Password</label>
						      <g:passwordField  name="password" class="inputbox" size="18" autocomplete="off"/>
						    </p>
						    <p id="register_confirm">
						      <label for="modlgn_passwd">Re-type Password</label>
						      <g:passwordField  name="confirm" class="inputbox" size="18" autocomplete="off"/>
						    </p>
						    <p id="register_email">
						      <label for="modlgn_passwd">Email</label>
						      <g:textField  type="email" name="email" class="inputbox" size="18" autocomplete="off"/>
						    </p>
						    <div class="remember">
							   
							    <g:submitButton value="Sign Up Now!" name="submitButton"/><div class="clear"></div>
							 </div>
						  </fieldset>
						 </g:form>
					</div>
			    </div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
     
		<div class="footer-bottom">
			<div class="wrap">
	            <div class="copy">
			           <p>© 2014 Template by <a href="http://w3layouts.com" target="_blank">w3layouts</a></p>
		        </div>
			  <div class="f-list2">
				<ul>
					<li class="active"><a href="about.html">About Us</a></li> |
					<li><a href="delivery.html">Delivery & Returns</a></li> |
					<li><a href="delivery.html">Terms & Conditions</a></li> |
					<li><a href="contact.html">Contact Us</a></li> 
				</ul>
			  </div>
				<div class="clear"></div>
		      </div>
			</div>
		</div>
</body>
</html>