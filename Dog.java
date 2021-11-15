class Dog 
{
	public String dName;
	public Dog(String a)
	{
		dName=a;
	}
	public void displayDogName()
	{
      System.out.println("Dog name is : "+dName);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Dog d1=new Dog("jimmy");
		Dog d2=new Dog("tommy");
		Dog d3=new Dog("blacky");
		d1.displayDogName();
		d2.displayDogName();
		d3.displayDogName();
	}
}
