public class VasanthAndCo
{

String brand, model;
int cap, price, size;

public VasanthAndCo()
{
System.out.println("Welcome to our shop! How can we help you?");
}

public VasanthAndCo(String i)
{
System.out.println("Hi"+i);
}

public VasanthAndCo(String brand, int cap, int price)
{
//this(5);
this();
this.brand = brand;
this.cap = cap;
this.price = price;
System.out.println("Fridge Brand = "+this.brand);
System.out.println("Fridge Capacity = "+this.cap);
System.out.println("Fridge Price = "+this.price);
}

public VasanthAndCo(String brand, int size, String model)
{
this("-fi");
//this();
this.brand = brand;
this.size = size;
this.model = model;
System.out.println("TV Brand = "+this.brand);
System.out.println("TV Size = "+this.size);
System.out.println("TV Model = "+this.model);
}

public static void main(String[] args)
{
//VasanthAndCo obj = new VasanthAndCo();
VasanthAndCo fridge = new VasanthAndCo("SAMSUNG", 165, 10000);
VasanthAndCo tv = new VasanthAndCo("LG", 40, "LED");
}

}

/*public VasanthAndCo(String brand, int cap, int price, int discount)
{
this.brand = brand; 
this.cap = cap; 
this.price = price; 
this.discount = discount; 
}*/




