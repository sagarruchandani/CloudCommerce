package cloudcommerce

class LaptopController {

    def index() { 
	}
	
	def showAll() {
			
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
		
		def v = Variant.findAllByProduct_id(idx)
		println v.variants
		//println v.HDD
		//println v.OS
		
		//def x=v.variants.keySet() as String[]
		def y=v.variants.HDD
		//println k
		//println x
		println y
		
		[shared:Shared_db.findAllById(idx), custom:Laptop_db.findAllByProduct_id(idx), mongo:v.variants]
		
	}
	
	
	
}
