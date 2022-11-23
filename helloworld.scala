//scala program to print Hello World !
object Geeks
{
	// Main Method
	def liste(){
		val fruits : List[String] = List("bananes","oranges","pommes")

		fruits.foreach { println }

		val chiffres : List[Int] = List(1,3,9,7)

		chiffres.foreach { println }

		val listeDeListes = List(List(1,3),List(2,5,7))

		listeDeListes.foreach { println }

		val result = chiffres.filter(_ <= 3)
		println(result)

		val chiffre1 : List[Int] = List(1,3,9,7)
		val chiffre2 : List[Int] = List(2,5,6,10)

		val c = chiffre1 ++ chiffre2
		println(c.sorted)
		println(c(2))

		val chiffre3 : List[Int] = List(1,1,2,3,2,4,5)
		println{chiffre3 map(x => (x, chiffre3.count(_ == x)))}

		val chiffre4 : List[Int] = List(1,1,2,3,2,4,5)
		println{chiffre4.groupBy(x => x).map(x=>(x._1, x._2.length))}
		println{chiffre4.groupBy(x => x).map(x=>(x._1, x._2.sum))}

		val lettre1 : List[String] = List("AA","BBB","C","DDDD")
		println{lettre1 map(x => (x, x.length))} 

	}
	
	def multi10(m:Int):Int=m*10  
	def multi(m:Int,n:Int):Int=m*n
	def main(args:Array[String])
	{
		//prints Hello World
		println("Hello World by " + args(0))

		var val1 = args(1).toInt

		for(a <- 1 to val1){
			println("valeur de a :" + a)
		}

	println(multi10(2))	
	println(multi(3,5))

	liste()
		
	}
	
}
