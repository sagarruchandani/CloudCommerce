package cloudcommerce

class LaptopController {

    def index() { 
	}
	
	def showAll() {
		
			//println Shared_db.list()
		
			[laptops:Shared_db.findAllByStore('laptop')]
	}
	
	def hot() {
		
		[laptops:Shared_db.findAllByProd_type('Hot')]
	}
	def trend() {
		
		[laptops:Shared_db.findAllByProd_type('Trending')]
	}
		
	
	def details() {
		
		println params
		def idx = params.id;
		println idx
		
		[shared:Shared_db.findAllById(idx), custom:Laptop_db.findAllByProduct_id(idx)]
		
	}
	
	
	
}
