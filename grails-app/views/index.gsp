<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Cloud Commerce | Home </title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/form.css" rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery1.min.js"></script>
<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<!--start slider -->
    <link rel="stylesheet" href="css/fwslider.css" media="all">
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/css3-mediaqueries.js"></script>
    <script src="js/fwslider.js"></script>
<!--end slider -->
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
					<li class="active"><a href="#">My Account</a></li> 
					
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
				<li><g:link controller="Shoes" action="showAllShoes">Shoes</g:link></li>
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
		<ul class="icon1 sub-icon1 profile_img">
			<li><a class="active-icon c2" href="#"> </a>
				<ul class="sub-icon1 list">
					<li><h3>CheckOut</h3><a href=""></a></li>
				</ul>
			</li>
		</ul>
	    <ul class="last"><li>
	  <g:if test="${session?.user}">
					<g:link controller="user" action="MyCart">Cart(${session?.user.counter})</g:link>
					</g:if>
					<g:else>
					<a href="#">Cart(0)
					</g:else> 
					</li>
					</ul>
				     
	    
	    
	  
	  
	  </div>
    </div>
     <div class="clear"></div>
     </div>
	</div>
  <!-- start slider -->
    <div id="fwslider">
        <div class="slider_container">
            <div class="slide"> 
                <!-- Slide image -->
                    <img src="images/banner.jpg" alt=""/>
                <!-- /Slide image -->
                <!-- Texts container -->
                <div class="slide_content">
                    <div class="slide_content_wrap">
                        <!-- Text title -->
                        <h4 class="title">Laptop Junction</h4>
                        <!-- /Text title -->
                        
                        <!-- Text description -->
                        <p class="description">A perfect place to buy Laptops</p>
                        <!-- /Text description -->
                    </div>
                </div>
                 <!-- /Texts container -->
            </div>
            <!-- /Duplicate to create more slides -->
            <div class="slide">
                <img src="images/banner.jpg" alt=""/>
                <div class="slide_content">
                    <div class="slide_content_wrap">
                        <h4 class="title">Laptop Junction </h4>
                        <p class="description">A perfect place to buy Laptops</p>
                    </div>
                </div>
            </div>
            <!--/slide -->
			    <div class="slide">
                <img src="images/banner.jpg" alt=""/>
                <div class="slide_content">
                    <div class="slide_content_wrap">
                        <h4 class="title">Laptop Junction </h4>
                        <p class="description">A perfect place to buy Laptops</p>
                    </div>
                </div>
            </div>
			
			    <div class="slide">
                <img src="images/banner1.jpg" alt=""/>
                <div class="slide_content">
                    <div class="slide_content_wrap">
                        <h4 class="title">consectetuer adipiscing </h4>
                        <p class="description">diam nonummy nibh euismod</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="timers"></div>
        <div class="slidePrev"><span></span></div>
        <div class="slideNext"><span></span></div>
    </div>

		<div class="footer-bottom">
			<div class="wrap">
	             <div class="copy">
			        <p>© 2014 Template by <a href="#" target="_blank">w3layouts</a></p>
		         </div>
				<div class="f-list2">
				 <ul>
					<li class="active"><a href="about.html">About Us</a></li> |
					<li><a href="#">Delivery & Returns</a></li> |
					<li><a href="#">Terms & Conditions</a></li> |
					<li><a href="#">Contact Us</a></li> 
				 </ul>
			    </div>
			    <div class="clear"></div>
		      </div>
	     </div>
	</div>
</body>
</html>