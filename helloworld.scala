//scala program to print Hello World !
object Geeks
{
	// Main Method
	def multi10(m:Int):Int=m*10  
	def main(args:Array[String])
	{
		//prints Hello World
		println("Hello World by " + args(0))

		var val1 = args(1).toInt
		for(a <-1 to val1){
			println("valeur de a :" + a)
		}
	println(multi10(2))	
	}
	
}
