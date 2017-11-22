package di.quiz;

public class Person 
{
	private Animal animal;
	
	public Person()
	{
		System.out.println("person 생성장");
	}
	
	public Animal getAnimal()
	{
		return animal;
	}
	
	public void setAnimal(Animal animal)
	{
		this.animal = animal;
	}
}
