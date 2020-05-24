
import scala.math.{Pi}

object 18001165 {
  def main(args: Array[String]){

        
    println("Temperature in Fahrenheit = " + TempConver(35) + "\n\n")
    println("The volume of a sphere = " + Volume(5) + "\n\n")
    println("Total Wholesale Cost = " + Cost(60) + "\n\n")
    
        
    }
  
  def TempConver(C:Float) :Float = {
    
    var F:Float = 0
    F = C * 1.8F + 32.0F
    println("Temperature given in ºC = " + C)
    
    return F
  }
  
  def Volume(r:Float) :Float = {
  
    var vol:Float = r*r*r * 4/3 * 22/7
    println("Given sphere radius is = " + r)
    
    return vol 
  }
  
  def Cost(no:Float) :Float = {
       
    println("Given number of copies are = " + no)   
    
    if(no <= 50){
      var pri: Float = no * 24.95F * 60/100 + no*3  
      return pri 
    }
    
    else{
      
      var pri: Float = no * 24.95F * 60/100 + 50*3 + (no - 50)*0.75F
      return pri 
      
    }
            
  }  
  
}