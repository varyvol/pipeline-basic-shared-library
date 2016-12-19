package varyvol.foo

class Greeting {

	def name

	Greeting(name) { 
		this.name = name
	}

	def print() {
		def greet = "Hello my friend " + this.name
		echo greet
	}

}