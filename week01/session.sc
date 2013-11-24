object session {
  1 + 3                                           //> res0: Int(4) = 4
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
	
	// Block
  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt: (x: Double)Double
  
  sqrt(2)                                         //> res1: Double = 1.4142156862745097
  sqrt(4)                                         //> res2: Double = 2.0000000929222947
  sqrt(1.0e50)                                    //> res3: Double = 1.0000003807575104E25
  sqrt(1.0e60)                                    //> res4: Double = 1.0000000031080746E30
}