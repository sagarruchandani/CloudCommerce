package cloudcommerce

class Variant {

	static mapWith="mongo"
	
	String Category
	Integer Product_id
	
	Map variants
	
	/*String HDD
	String RAM
	String Processor
	String OS
	String Screen_Size
	String Battery_life
*/
		
    static constraints = {
		id column: 'Product_id'
		}
}
