package oopsConcepts;
//Test Class------

public class TestClass 
{		public static void main(String[] args) 
	{
		//using inheritance of classes
		//Animal a = new Animal();
		//a.eatfood(); a.sleep(); 
		//Dogs d = new Dogs();
		//d.bark(); d.dogtype();
		LabraDog lb = new LabraDog();
		lb.eyes();lb.jaw();lb.eatfood();lb.bark();lb.dogtype();lb.sleep();
		//inheritance of Abstract class 
		HeroHonda mybike = new HeroHonda();
		mybike.engine();mybike.handle();mybike.seat();mybike.wheels();
		//interface and abstract class
		TestInterface bikefr = new TestInterface();
		bikefr.seat();bikefr.handle();bikefr.engine();
		bikefr.wheel();
		//constructor with parameters
		Constructor const1 = new Constructor();
		const1.calarea(5, 10);
		const1.areavalue();
		//boolean truth table
		Operators booln = new Operators();
		//encapsulation---
		EncapClass encap= new EncapClass();
		encap.setAge(35);
		encap.setId("101");
		encap.setName("Gobind G");
		System.out.println("Name:"+ encap.getName() + "\nAge:" + encap.getAge() + "\nID:" + encap.getId());
	}
	
}
-----------------------------------------------------------------
//Inhertiance super/base/parent Class----
public class Animal 
{
 void eatfood()
 { System.out.println( "Eating Habit:"+ "All the animals eat food");
 }
 void sleep()
 {
	 System.out.println("Sleeping Habit:"+ "All the animals sleep");
 }
}
//---Child/derived/sub class
public class Dogs extends Animal
{
  void bark()
  { 
	  System.out.println("Barking:"+"All the dogs bark");
  }
   void dogtype() {
	   System.out.println("Dogtype is:"+"The dogs have different types");
   }
}
//inheritance of child class 
public class LabraDog extends Dogs
{
	void jaw() 
	{
		System.out.println("Jaw of Labra dog:" +"The labra dog has powerful jaws");
	}
	void eyes()
	{
		System.out.println("Labra dog eyes:"+ "The labra dog has friendly eyes");
	}
}
-------------------------------------------------
//inheritance of abstract calss
public abstract class Bikes {
public void seat()
{
	System.out.println("Bike Seat"+"Every bike has seat");
}
	public void handle()
{
	System.out.println("Bike handle"+"Every bike has handle");
}	public abstract void engine();
	public abstract void wheels();}
	------------------------------------
public class HeroHonda extends Bikes
{
	public void engine() 
	{
		System.out.println("Engine:"+"The bike has powerful engine");
	}
	public void wheels() 
	{
		System.out.println("Wheels:"+"The bike has 2 powerful rotating wheels");	
	}
}
------------------------------------------
//Abstarct and interface of class
public abstract class Bikes {
public void seat()
{
	System.out.println("Bike Seat"+"Every bike has seat");
}
	public void handle()
{
	System.out.println("Bike handle"+"Every bike has handle");
}
	public abstract void engine();
	public abstract void wheels();
}
//interface of class
public interface InterfaceBike 
{
	public void engine();
	public void wheel();
	public void seat();
	public void handle();
	public class TestInterface implements InterfaceBike
	{
	public void engine() 
	{
	System.out.println("case1:" + "All bikes have engine");	
	}
	public void wheel() 
	{
	System.out.println("case2:" + "All bikes have wheels");		
	}
	public void seat() 
	{
	System.out.println("case3:" + "All bikes have single seat");		
	}
	public void handle() 
	{
	System.out.println("case4:" + "All bikes have handles");		
	}
	}
}

-----------------------------------------------------------
//costructor with parameter and return value
public class Constructor 
{
	int length;
	int width;
	void calarea(int length,int width) 
	{
		this.length= length;
		this.width = width;
	}
		public void areavalue() 
		{
		System.out.println("The area of the rectangle is = " + (length*width));
		}
}
---------------------------------------------------------------------
package polymorphism;

public class FruitsClass {
		public int fruitWeight(int a,int b) 
	{
	int result = a*b;
	return result;
	}
	public double fruitWeight(double b,int a) 
	{
		double result = (double)(a*b);
		return result;
	}
}
package polymorphism;

public class TestFruits1 extends FruitsClass
{
	public int fruitWeight(int a,int b) 
	{
		int result = a*b;
		return result;
	}

}
package polymorphism;

public class TestFruit 
{
	public static void main(String[] args) 
	{
		FruitsClass fruits = new FruitsClass();
		System.out.println("Total Weight of friuts: " 
							+ fruits.fruitWeight(10,10));
		System.out.println("Total Weight of friuts: " 
				+ fruits.fruitWeight(5.5,10));
		
		TestFruits1 fruits1 = new TestFruits1();
		System.out.println("Weight of the fruits is : " + fruits1.fruitWeight(2,5));
	
	}
}
----------------------------------------
package oopsConcepts;

public class Operators 
{
boolean a = true;
boolean b = false;
{
System.out.println(a && b);//false
System.out.println(a||b);//true
System.out.println(!(a&&b));//true
System.out.println(!(a||b));//false
}
}
--------------------------------------------
//encapsulation
 package oopsConcepts;

public class EncapClass 
{
	private String name;
	private String idNum;
	private int age;
	
	public int getAge() 
	{
		return age;
	}
	public String getName() 
	{
	return name;
	}
	public String getId() 
	{
		return idNum;
	}
		public void setAge(int newAge) 
	{
		age = newAge;
	}
	public void setName(String newName) 
	{
		name = newName;
	}
	public void setId(String newId) 
	{
		idNum = newId;
	}
}

