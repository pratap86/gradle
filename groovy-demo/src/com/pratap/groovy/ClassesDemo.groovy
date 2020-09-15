package com.pratap.groovy

class Patient {
	def firstName, lastName, age
	static hospitalCode = 'Apollo_BLR'
	
	void setFirstName(firstName) {
		if(firstName == null) {
			throw new IllegalArgumentException('firstName can not be '+firstName)
		}
		this.firstName=firstName
	}
	static void display() {
		println getHospitalCode()
	}
}
p = new Patient(firstName: 'Pratap', lastName: 'Narayan', age: 34)
p.setFirstName('Jackob')
println p.firstName+" "+p.lastName+' '+p.age

p.display()



