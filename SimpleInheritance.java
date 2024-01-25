class SimpleInheritance 
{
	void eat()
	{
		System.out.println("i am eating");
	}
}
class Dog extends SimpleInheritance
{
	void bark()
	{
		System.out.println("i am barking");
	}
	
	public static void main(String aa[])
	{
		Dog DogObject = new Dog();
		DogObject.eat();
		DogObject.bark();
	}