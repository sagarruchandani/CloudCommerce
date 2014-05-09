import cloudcommerce.*
class BootStrap {

    def init = { servletContext ->
println "SAGAR"
		def v1 = new Variant(category:"laptop",product_id:1,variants:[HDD:"64GB SSD",RAM:"2 GB DDR3",Processor:"Intel Atom Quad Core Processor - Baytrail-T Z3740 1.33GHz (Turbo 1.86GHz)",OS:"Windows 8.1",Screen_Size:"10.1-Inch",Battery_life:"8-hour battery life"])
		def v2 = new Variant(category:"laptop",product_id:2,variants:[HDD:"500 GB 5400 rpm",RAM:"4 GB DDR3L SDRAM",Processor:"Intel Pentium-2127U Processor",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"7-hour battery life"])
		def v3 = new Variant(category:"laptop",product_id:3,variants:[HDD:"500 GB 5400 rpm",RAM:"4 GB DDR3L SDRAM",Processor:"AMD E2-3000 DC 1.65 GHz",OS:"Windows 7",Screen_Size:"15.6-Inch",Battery_life:"4-hour battery life"])
		def v4 = new Variant(category:"laptop",product_id:4,variants:[HDD:"500GB 5400rpm",RAM:"4GB DDR3 1333MHz memory",Processor:"AMD E1-2100 Accelerated 1.0 GHz",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"Up to 5.30 hours battery life"])
		def v5 = new Variant(category:"laptop",product_id:5,variants:[HDD:"500 GB 5400 rpm",RAM:"4 GB DDR3 RAM",Processor:"Intel Core i3-3217U 1.8 GHz (3 MB Cache)",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"4-hour battery life"])
		def v6 = new Variant(category:"laptop",product_id:6,variants:[HDD:"320 GB 5400 rpm",RAM:"4 GB DDR3 RAM",Processor:"AMD E-Series Dual-Core E1-1200 1.4 GHz (1 MB Cache)",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"5-hour battery life"])
		def v7 = new Variant(category:"laptop",product_id:7,variants:[HDD:"250 GB",RAM:"4 GB",Processor:"2.40 GHz, Intel Core 2 Duo",OS:"Mac OS X 10.6, Snow Leopard",Screen_Size:"13.3-Inch",Battery_life:"6-hour battery life"])
		def v8 = new Variant(category:"laptop",product_id:8,variants:[HDD:"128 GB Flash Storage",RAM:"4 GB 1600 MHz LPDDR3",Processor:"1.3GHz dual-core Intel Core i5 processor , Turbo Boost up to 2.6GHz",OS:"OS X Mavericks",Screen_Size:"13-Inch",Battery_life:"Up to 12 Hours of Battery Life"])
		def v9 = new Variant(category:"laptop",product_id:9,variants:[HDD:"16 GB Solid-State Drive",RAM:"2 GB DDR3L SDRAM",Processor:"Intel Celeron 2955U 1.4 GHz (Haswell micro-architecture)",OS:"Chrome",Screen_Size:"11.6-Inch",Battery_life:"8.5-hour battery life"])
		def v10 = new Variant(category:"laptop",product_id:10,variants:[HDD:"320 GB 5400 rpm",RAM:"2 GB DDR3L SDRAM",Processor:"AMD A4 1.0 GHz (1 MB Cache)",OS:"Windows 8",Screen_Size:"10.1-Inch",Battery_life:"7-hour battery life"])
println v1
println v2
println v3
println v4
println v5

		v1.save(flush:true)
		v2.save(flush:true)
		v3.save(flush:true)
		v4.save(flush:true)
		v5.save(flush:true)
		v6.save(flush:true)
		v7.save(flush:true)
		v8.save(flush:true)
		v9.save(flush:true)
		v10.save(flush:true)
println v6
println v7
println v8
println v9
println v10

		
		
		
		
		
		    
	
		
		
		//Variant v1 = new Variant(abc:[Category: "Stephen King", Product_id: 1,HDD:"1TB",OS:"Win8"]).save(failOnError: false);
		//Variant v2 =new Variant(Category: "Stephen King", Product_id: 2,variants:[OS:"1ABC",Types:"XYZ"]).save(failOnError: false);
	
//		def va2 = ["HDD":"2TB"]
//		
//		v1.addToVariants(va2)
//		v1.save
		
//		if(Variant.count() !=10)
//		{
//
			
//Variant v1 = new Variant(category:"laptop",product_id:1,variants:[HDD:"64GB SSD",RAM:"2 GB DDR3",Processor:"Intel Atom Quad Core Processor - Baytrail-T Z3740 1.33GHz (Turbo 1.86GHz)",OS:"Windows 8.1",Screen_Size:"10.1-Inch",Battery_life:"8-hour battery life"]).save(failOnError: false);
//Variant v2 = new Variant(category:"laptop",product_id:2,variants:[HDD:"500 GB 5400 rpm",RAM:"4 GB DDR3L SDRAM",Processor:"Intel Pentium-2127U Processor",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"7-hour battery life"]).save(failOnError: false);
//Variant v3 = new Variant(category:"laptop",product_id:3,variants:[HDD:"500 GB 5400 rpm",RAM:"4 GB DDR3L SDRAM",Processor:"AMD E2-3000 DC 1.65 GHz",OS:"Windows 7",Screen_Size:"15.6-Inch",Battery_life:"4-hour battery life"]).save(failOnError: false);
//Variant v4 = new Variant(category:"laptop",product_id:4,variants:[HDD:"500GB 5400rpm",RAM:"4GB DDR3 1333MHz memory",Processor:"AMD E1-2100 Accelerated 1.0 GHz",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"Up to 5.30 hours battery life"]).save(failOnError: false);
//Variant v5 = new Variant(category:"laptop",product_id:5,variants:[HDD:"500 GB 5400 rpm",RAM:"4 GB DDR3 RAM",Processor:"Intel Core i3-3217U 1.8 GHz (3 MB Cache)",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"4-hour battery life"]).save(failOnError: false);
//Variant v6 = new Variant(category:"laptop",product_id:6,variants:[HDD:"320 GB 5400 rpm",RAM:"4 GB DDR3 RAM",Processor:"AMD E-Series Dual-Core E1-1200 1.4 GHz (1 MB Cache)",OS:"Windows 8",Screen_Size:"15.6-Inch",Battery_life:"5-hour battery life"]).save(failOnError: false);
//Variant v7 = new Variant(category:"laptop",product_id:7,variants:[HDD:"250 GB",RAM:"4 GB",Processor:"2.40 GHz, Intel Core 2 Duo",OS:"Mac OS X 10.6, Snow Leopard",Screen_Size:"13.3-Inch",Battery_life:"6-hour battery life"]).save(failOnError: false);
//Variant v8 = new Variant(category:"laptop",product_id:8,variants:[HDD:"128 GB Flash Storage",RAM:"4 GB 1600 MHz LPDDR3",Processor:"1.3GHz dual-core Intel Core i5 processor , Turbo Boost up to 2.6GHz",OS:"OS X Mavericks",Screen_Size:"13-Inch",Battery_life:"Up to 12 Hours of Battery Life"]).save(failOnError: false);
//Variant v9 = new Variant(category:"laptop",product_id:9,variants:[HDD:"16 GB Solid-State Drive",RAM:"2 GB DDR3L SDRAM",Processor:"Intel Celeron 2955U 1.4 GHz (Haswell micro-architecture)",OS:"Chrome",Screen_Size:"11.6-Inch",Battery_life:"8.5-hour battery life"]).save(failOnError: false);
//Variant v10 = new Variant(category:"laptop",product_id:10,variants:[HDD:"320 GB 5400 rpm",RAM:"2 GB DDR3L SDRAM",Processor:"AMD A4 1.0 GHz (1 MB Cache)",OS:"Windows 8",Screen_Size:"10.1-Inch",Battery_life:"7-hour battery life"]).save(failOnError: false);
//		}
			//v1.setVariants(HDD:"64GB SSD", RAM:"2 GB DDR3",Processor:"Intel Atom Quad Core Processor - Baytrail-T Z3740 1.33GHz (Turbo 1.86GHz)",OS:"Windows 8.1",Screen_Size:"10.1-Inch",Battery_life:"8-hour battery life")
			//v1.save()
		
		
		
	}
    def destroy = {
    }
}
