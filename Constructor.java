public class Constructor
//Don't get confused by class name, given class as Constructor.
{
int age;
float height;
String name;

public static void main(String[] args)
{
//creating object
Constructor obj = new Constructor();
}

//creating Constructor to understand
public Constructor()
{
System.out.println("The initial value of age is "+ age);
System.out.println("The initial value of height is "+ height);
System.out.println("The initial value of name is "+ name);
}

}