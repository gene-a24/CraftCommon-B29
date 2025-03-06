package polymophism;

public class methode_overiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal myAnimal = new Animal(); // Creates an Animal object
	        myAnimal.makeSound(); // Output: Animal makes a sound

	        Dog Dog = new Dog(); // Polymorphism
	        Dog.makeSound(); // Output: Dog barks
	}

}
