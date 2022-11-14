//scala program to print Hello World !
object Geeks
{
	// Main Method
	def main(args:Array[String])
	{
		//prints Hello World
		println("Hello World by " + args(0))

		var val1 = args(1).toInt
		for(a <-1 to val1){
			println("valeur de a :" + a)
		}
	}
}
