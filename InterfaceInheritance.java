abstract class Animal{
	protected String name;
    protected int legs;
	protected Animal(int legs,string name){
		this.legs = legs;
        this.name=name;
	}
	abstract void eat();
	void walk(){
        System.out.println("This animal walk with "+legs+"legs");
    }
}
class Spider extends Animal{
	protected Spider(int legs){
		super(legs,"Spider");
	}
	void eat(){
		System.out.println("Spider can eats");
	}
}
interface pet{
    String getName();
    void setName(String name);
    void play();
}
class Cat extends Animal implements pet{
	protected Cat (int legs, String name){
		super(legs,name);
	}
	
	public String getName()
	{
		return name;
	}

public void setName(String name) {
	this.name = name;
	}
public void play(){
	System.out.println("Cat likes to play with a ball.");
	}

	void eat(){
		System.out.println("Cat eats fishes.");
	}
	void walk()
	{
		System.out.println("cat walk on "+legs+" legs");
	}
}

class Fishs extends Animal implements pet{

	Fishs(int legs,String name) {
		super(legs);
		this.name = name;
}

	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("Fish likes to swim around.");
	}

	void eat() {
		System.out.println("Fish eats plants.");
	}
	void walk()
	{
		System.out.println("Fish has no legs.");
	}
}


public class InterfaceInheritance{
	public static void main(String[] args)
	{
		System.out.println("Spider");
		Spider S = new Spider(8);
		S.eat();
		S.walk();

//Animal A = new Animal(4);

//Fish
		System.out.println("Fish");
		Fishs F = new Fishs(0,"Mimi");
		System.out.println("This fish's name is "+F.getName());
		F.eat();
		F.walk();
		F.setName("Momo");
		System.out.println("This fish's name is "+F.getName()+"\n");

//Cat
		System.out.println("Cat");
		Cat C = new Cat(4,"Fluffy");
		System.out.println("This cat's name is "+C.getName());
		C.walk();
		C.eat();
		C.setName("Moose");
		System.out.println("This Cat's name is "+C.getName()+"\n");

		}

}