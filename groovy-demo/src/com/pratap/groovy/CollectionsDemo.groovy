package com.pratap.groovy

LinkedList l = [1, 2, 3]

println l
println l.class

l << 4
println l

l = l + [5, 6, 7]
println l

println l-[3, 5]

l.each { println it }
l.reverseEach { println it }
l.eachPermutation { println it }

// Set
TreeSet s = ['java', 'rest', 'spring', 'java'] as Set
println s
println s.class

// Map
m=[courseName:'Gradle', rating:5, price:200]
//println m.class
println m
m.each { k,v ->
	println k
	println v
}

println m.courseName
println m['courseName']
println m.get('courseName')
m['review']='Its awesome'
println m.get('review')