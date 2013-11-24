object tailrec_factorial {
	def factorial(n:Int, m:Int = 1): Int = {
			if(n==0)
				m
			else
				factorial(n-1, n*m)
	}                                         //> factorial: (n: Int, m: Int)Int
	
	factorial(7)                              //> res0: Int = 5040
}