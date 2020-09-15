package com.pratap.groovy

c = { n = 2 ->
			println(n % 2 == 0 ? "even" : "odd")
}
c.call();

5.times { n -> print n }
println("---------------------")
5.times { print it }