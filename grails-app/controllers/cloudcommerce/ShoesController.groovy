package cloudcommerce

class ShoesController {

    def index() { }
	
	def showAllShoes() {
		
			//println Shared_db.list()
		
			[shoes:Shared_db.findAllByStore('shoes')]
	}
}
