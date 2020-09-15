package com.pratap.groovy

def a = 10.24F
println a
println a.class

s = 'Hello'
println s

name = 'Pratap Narayan'
/**
 * String "" called groovy string or G-String
 */
s = "Hello ${name}"
println s

s = '''
	Groovy is awesome.
	You can put everything inside triple quotes.
'''
println s

emailPattern = /([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})/
print "test@gmail.com" ==~emailPattern
