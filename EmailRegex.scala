object EmailRegex extends App {
  	    val Email = """([\w\.]+)@([\w\.]+)""".r
            val Email(user,domain)= "himanshu.rajput@knoldus.in"
            println(s"user: $user")
            println(s"domain: $domain")
            val Email(user1,domain1)= "kunal.sethi@knoldus.in"
            println(s"user: $user1")
            println(s"domain: $domain1")
      
    
}

