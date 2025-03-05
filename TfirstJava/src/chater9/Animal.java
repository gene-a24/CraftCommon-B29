package chater9;

public interface Animal {
	
	void eat(); 
	void travle();
}

interface dog{
	
	void sound();
}

interface car extends Animal, dog{
}