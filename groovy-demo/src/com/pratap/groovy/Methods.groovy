package com.pratap.groovy

int product(int x=3, int y) {
	x*y
}
result = product 5,5
println result

void display(Map productDetails) {
	println productDetails.name
	println productDetails.price
}

display price:1000, name:'iPhone'