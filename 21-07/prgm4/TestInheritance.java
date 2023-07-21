package animal;

public class TestInheritance {
	public static void main(String args[])
    {
		Dog e = new Dog();
        BabyDog d=new BabyDog();
        d.weep();
        e.bark();
        d.eat();
}
}