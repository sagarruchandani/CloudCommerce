package cloudcommerce

class UserController {

    def index() {redirect(uri:'/') }
	
	def login = {
		
		
			println params.username
			def u = User.findByUsername(params.username)
			if (u) {
				// username and password match -> log in
				session.user = u
				redirect(uri:'/')
				//redirect(controller:'main')
			} else {
				render (view : "login")
				//redirect(controller:'user')
			}
	}
	def logout = {
		session.invalidate()
		//render (view : "index")
		redirect(uri:'/')
		}
	
	

	def newUser = {
		// new user posts his registration details
		
			// create domain object and assign parameters using data binding
			def u = new User(username:params.username,email:params.email,password:params.password,confirm:params.confirm,
				mobile:"",Address:"",Completedorder:"",Mycart:"")
			//street:"",apartment:"",city:"",state:"",pinCode:""
			u.save(flush:true)
			println params
			if (! u.save()) {
				println "Not saved"
				redirect(action:'register')
				// validation failed, render registration page again
				return [user:u]
			} else {
				// validate/save ok, store user in session, redirect to homepage
			println "CP2"
				session.user = u
				redirect(uri:'/')
			}
		}
	
	def register = {}
	
	def addToCart = {
		def idx = params.id;
		println params
		//println session?.user.username
		
		def u = User.findByUsername(session?.user.username)
		println u.username
		if (u) {
			println "TEST"
			
			//flash.total = Shared
			
			
			def priceFind = Shared_db.getAll(u.Mycart)
			println priceFind.Price
			flash.message= priceFind.Price
			
			u.addToMycart(idx).save()
			println u['counter']
			//u['counter']= u['counter']+1
			u.counter++;
			u.save(flush:true);
			session.user = u
			redirect(controller: "laptop", action: "showAll")
			
			//redirect(controller:'main')
		} else {
		println "bobby3"
			flash.message = "Please Login to Add Items to the Cart"
			render (view : "login")
			//redirect(controller:'user')
		}
		
	}
	
	def MyCart = {
		
		def idx = params.id;
		println params.id		
		def u = User.findByUsername(session?.user.username)
		println u.username
		
		[cart:Shared_db.getAll(u.Mycart)]

	}

	def removeFromCart = {

		def idx = params.id;
		def u = User.findByUsername(session?.user.username)
		println idx

		//def a= u.Mycart.get(idx)
		//list = [1,2,3,4]
		
		//println u.Mycart - idx
		u.Mycart = u.Mycart - idx
		u.counter = u.Mycart.count {it.next()}
		//u.update("MyCart":[3,5,10])
		u.save()
		session.user = u
/*		Iterator i = u.Mycart.iterator()
		while (i.hasNext()) {
			println i
			if (i.next() == idx) {
				println i
				i.remove()
				break
				}
		}
	*/	/*
		u.Mycart.remove(1)
		println u.Mycart.find()*/
		//def rm = u.Mycart.find(idx) //{ it.id == idx }
		//println rm
		//u.removeFromMycart(rm)
		//render (view:"MyCart")
		redirect (controller:"User", action:"MyCart")
	}
	
	def MyAccount = {
		
		def name = params.fullname
		def ccnumber=params.ccnumber
		def cvv=params.cvv
		def u = User.findByUsername(session?.user.username)
		
		def shipName = params.shipName
		def street=params.street
		def city=params.city
		def state = params.state
		
		u.setAddress("name":shipName,"street":street,"city":city,"state":state) 
		
		if (!u.Completedorder){
		u.Completedorder=[]
		}
		//u.Completedorder = u.Mycart
		u.Mycart.each {
			u.Completedorder.add(it)
		}
		//u.addToCompletedorder(u.Mycart).save()
		println u['counter']
		//u['counter']= u['counter']+1
		u.counter=0;
		
		//u.removeFromMycart(u.Mycart)
		u.Mycart.clear()
		u.save(flush:true);
		session.user = u
		
		println Shared_db.getAll(u.Completedorder)
		println u.Address
		
		
		
		//
		[previouscart:Shared_db.getAll(u.Completedorder),address:u.Address]
		//redirect(controller: "user", action: "MyAccount")
		
		
		
	}
		
}
