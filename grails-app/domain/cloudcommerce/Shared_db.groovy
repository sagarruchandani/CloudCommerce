package cloudcommerce

class Shared_db {

	
	
	String Store
	Integer Product_id
	String Title
	String Description
	Float Price
	String Image
	String Prod_type
	String Extra1
	String Extra2
	
	
    static constraints = {
		id column: 'Product_id'	
		//Price(blank:false, scale:2)
		}
}
