public class BranchVAC extends VasanthAndCo
{

String brand; 
int cap, price, discount; 

public BranchVAC(String brand, int cap, int price, int discount)
{
super("-fi"); 
this.brand = brand; 
this.cap = cap; 
this.price = price; 
this.discount = discount; 
System.out.println("Fridge Brand = "+this.brand);
System.out.println("Fridge Capacity = "+this.cap);
System.out.println("Fridge Price = "+this.price);
System.out.println("Fridge Discount = "+this.discount);
}

public static void main(String[] args)
{
BranchVAC fridge = new BranchVAC("Samsung", 165, 12000,1200); 
fridge.clean(); 
}
public void clean()
{

}

}