<html>
<head>
<title>Laptop Junction : Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="<g:resource dir="css" file="laptopShowAll.css" />"></link>
<link rel="stylesheet" type="text/css" href="<g:resource dir="css" file="styleDelete.css" />"></link>
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
        <div class="logo">
			<g:img dir="images" file="LaptopJunction.jpg" />
			
		</div>
		<div class="cssmenu">
		  <nav id="nav" >
			<a href="#nav" title="Show navigation">Show navigation</a>
			<a href="#" title="Hide navigation">Hide navigation</a>
			<ul class="clearfix">
				<li class="active"><g:link controller="user" action="index">Home</g:link></li>
					
				<li><a href="start.html"><span>Motor Store</span></a></li>
				<li><a href="work.html"><span>Book Store</span></a></li>
				<li><a href="pricing.html">Cell Phone Store</a></li>
				<li>
				<g:if test="${session?.user}">
					<li><g:link controller="user" action="index">Hi, ${session?.user.username}</g:link></li>
					<li><g:link controller="user" action="logout">logout</g:link></li>
					</g:if>
					<g:else>
	 				 <g:link controller="user" action="login">Login</g:link>
	 				 <g:link controller="user" action="register">Sign up now!</g:link>
				    </g:else></li>
			</ul>
		    </nav>
		  </div>

				<div class="clear"></div>
		   </div>
		   	  <div class="header-bottom-right">
			     				<ul class="icon1 sub-icon1 profile_img">
			<li><a class="active-icon c2" href="#"> </a>
				<ul class="sub-icon1 list">
					<li><h3>CheckOut</h3><a href=""></a></li>
				</ul>
			</li>
		</ul>
		
			    <ul class="last"><li>
	  <g:if test="${session?.user}">
					<li><g:link controller="user" action="MyCart">Cart(${session?.user.counter})</g:link></li>
					</g:if>
					<g:else>
					<a href="#">Cart(0)
					</g:else> 
					</li>
					</ul>
				     
		</div>

		<h2 class="head">A <span class="m_1">Perfect </span>place to buy <span class="m_1">Laptop</span></h2>
	

     </div>
     
<table border="1">
	<g:each in="${shared}" var="item"> 
<tr><th rowspan="3"><g:img dir="images/laptop" file="${item.Image}" width="200" height="200"/>
<td><th colspan="3">${item.Title} <br>${item.Price} $<br>${item.Description}
 <br><g:link id="${item.id}" controller="user" action="addToCart">Add To Cart</g:link>
 
 	</g:each>
</table>
<table border="1">
	<g:each in="${custom}" var="item"> 
<tr><th>RAM: </th><td>${item.RAM}</tr>
<tr><th>Processor: </th><td>${item.Processor}</tr>
<tr><th>Hard Disk: </th><td>${item.HDD}</tr>
<tr><th>Screen Size: </th><td>${item.Screen_Size}</tr>
<tr><th>Battery life: </th><td>${item.Battery_life}</tr>
<tr><th>Operating System: </th><td>${item.OS}</tr>
 	</g:each>
</table>

</body>
</html>