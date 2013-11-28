object product {
	//def product(f:Int => Int)(a: Int, b:Int) : Int = {
	//	if(a > b) 1
	//	else
	//		f(a) * product(f)(a+1, b)
	//}
	
	//product ((x:Int) => x*x) (3,7)

	//def fact(n:Int) = product(x=>x)(1,n)
	//fact(5)
	
	def mapReduce(f:Int => Int, combine: (Int, Int) => Int, zero:Int)(a:Int, b:Int):Int = {
		if(a > b) zero
		else combine(f(a), mapReduce(f, combine,zero)(a+1,b))
	}                                         //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
	
	def product(f:Int=>Int)(a:Int, b:Int): Int = mapReduce(f, (x,y) => x*y, 1)(a,b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
  
  product(x => x*x)(3,4)                          //> res0: Int = 144
}