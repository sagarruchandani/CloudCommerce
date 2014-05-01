<html>
<head>
<title>Laptop Junction</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="<g:resource dir="css" file="laptopShowAll.css" />"></link>
<link rel="stylesheet" type="text/css" href="<g:resource dir="css" file="styleDelete.css" />"></link>

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
    
     <div class="content-box">
     	<div class="wrap">
     		<ul class="events">
				<li class="active"><a href="index.html">All</a></li>
				<li><a href="index.html">Hot Deals</a></li> 
				<li><a href="">Trending</a></li> 
			</ul>
     	   <div class="clear"></div>
     	</div>
     </div>


<g:each in="${laptops}" var="item">
<div class="col_1_of_3 span_1_of_3"> 
	<g:form url="[controller:'user',action:'addToCart']">
			   <g:link controller="laptop" action="details" id="${item.id}" >
				<div class="inner_content clearfix">
					<div class="product_image">
						<g:img dir="images/laptop" file="${item.Image}" width="270" height="200"/>
					</div>
                    <div class="sale-box"><span class="on_sale title_shop">${item.prod_type}</span></div>	
                    <div class="price">
					   <div class="cart-left">
							<g:link class="title" controller="laptop" action="details" id="${item.id}" >${item.Title}</g:link>
							<div class="price1">
							  <span class="actual">$ ${item.Price}</span>
							</div>
						</div>
						<g:link controller="user" name="${item.Title}" action="addToCart" id="${item.id}" ><div class="cart-right"> </div></g:link>
						<div class="clear"></div>
						
					 </div>				
                   </div>
                 </g:link>
                 </g:form>
				</div>
 </g:each>
  
</body>
</html>
