<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Cloud Commerce | My Cart </title>
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
<style>
table
{
border-collapse:collapse;
}
table, td, th
{
border:1px solid black;
}
</style>
</head>
<body>
       <div class="header-top">
			<div class="wrap"> 
			  
			 <div class="cssmenu">
				<ul>
					<li class="active"><a href="login.html">My Account</a></li> 
					<g:if test="${session?.user}">
					Hi, ${session?.user.username}
					<li><g:link controller="user" action="logout">logout</g:link></li>
					</g:if>
					<g:else>
	 				 <g:link controller="user" action="login">Login</g:link>
	 				 <g:link controller="user" action="register">Sign up now!</g:link>
				    </g:else>	
				</ul>
			</div>
			<div class="clear"></div>
			<div class="clear"></div>
 		</div>
	</div>
	 <div class="header-bottom">
	    <div class="wrap">
			<div class="header-bottom-left">
				<div class="logo">
					<g:link controller="user" action="index"><g:img dir="images" file="logo.jpg" width="250px" /></g:link>
				</div>
				<div class="menu">
	            <ul class="megamenu skyblue">
			<li class="active grid"><g:link controller="user" action="index">Home</g:link></li>
			<li><a class="color4" href="#">Cell Phone</a>
				</li>				
				<li><a class="color5" href="#">Motors</a>
				</li>
				<li><a class="color6" href="#">Books</a></li>
				<li><g:link controller="Laptop" action="showAll">Laptops</g:link></li>
			</ul>
			</div>
		</div>
	   <div class="header-bottom-right">
         <div class="search">	  
				<input type="text" name="s" class="textbox" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
				<input type="submit" value="Subscribe" id="submit" name="submit">
				<div id="response"> </div>
		 </div>
	  <div class="tag-list">
	    
	    <ul class="last"><li><a href="#">Cart(${session?.user.counter})</a></li></ul>
	  </div>
    </div>
     <div class="clear"></div>
     </div>
	</div>
	
<h4 class="title">My Address</h4>

    <table border="1">	    
 
	<fieldset class="input">
						    <p id="register_ccnumber">
						      <label for="ship_username">Name : ${address.name }</label>
						     
						    </p>
						    <p id="register_CVV">
						      <label for="modlgn_passwd">Street : ${address.street }</label>
						      
						    </p>
						    <p id="register_confirm">
						      <label for="modlgn_fullname">City : ${address.city }</label>
						   
						    </p>
						   <p id="register_confirm">
						      <label for="modlgn_fullname">State : ${address.state }</label>
						    
						    </p>
						  </fieldset>
    </table>

  
    	     <h4 class="title">My Previous Orders</h4>
   
    <table border="1">	    
    <g:each in="${previouscart}" var="item">   
	<tr><th><g:img dir="images/laptop" file="${item.Image}" width="270" height="200"/>
					
	<th><g:link class="title" controller="laptop" action="details" id="${item.id}" >${item.Title}</g:link>
				<br>		$ ${item.Price}
			<div class="clear"></div>		
	 	</th></tr>	
	</g:each>
    </table>	 
    

	
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

</body>
</html>