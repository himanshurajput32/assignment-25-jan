object URL{

  def apply(protocol:String,domain:String,path:String, params:Map[String,String]):String = {
     val result_one=protocol+"://"+domain+path+"?"
     val temp=params.toList
     val final_result=result_one+temp(0)._1+"="+temp(0)._2+"&"+temp(1)._1+"="+temp(1)._2+"&"+temp(2)._1+"="+temp(2)._2
     final_result
     }

  def unapply(url:String):Option[(String , String, String,Map[String,String])] = {
   val parts= url.split("\\?")
   if(parts.length==2){
   val parts_1=parts(0).split("://")
   val protocol=parts_1(0)
   val parts_2=parts_1(1).split("/")
   val domain=parts_2(0)
   val path="/"+parts_2(1)+"/"+parts_2(2)
   val temp=parts(1).split("=|&") 
   val params=Map(temp(0)->temp(1),temp(2)->temp(3),temp(4)->temp(5))
   Some(protocol,domain,path,params) 
   }
   else
   None
   }
}


