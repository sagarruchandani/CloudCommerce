class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
		//"/myCart"(view:"/MyCart")
        "500"(view:'/error')
	}
}
