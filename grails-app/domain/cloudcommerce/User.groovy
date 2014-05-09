package cloudcommerce


class User {

	static mapWith="mongo"
	
	String username
	String password
	String confirm
	String email
	String mobile
	
	/*String street
	String apartment
	String city
	String state
	String pinCode*/
	List<String> Mycart
	List<String> Completedorder
	Map Address
	Integer counter=0
	
	static mapping={
		collection "user"
		database "test"
	   
	   }
	
	static transients = {confirm}
	
    static constraints = {
		username unique:true
		
		password nullable: true
		email nullable: true
		mobile nullable: true
		/*street nullable: true
		apartment nullable: true
		city nullable: true
		state nullable: true
		pinCode nullable: true*/
    }
}
