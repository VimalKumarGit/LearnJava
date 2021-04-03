public class Trainer
{
String dept = "Java";
String institute = "Payilagam";
private  int salary = 10000;
String department, inst;

public int getSalary()
{
return this.salary;
}

public void training()
{
System.out.println("Java Training");
}

public Trainer(String dept, String institute)
{
this.dept = dept;
this.institute = institute;
System.out.println("I am from:"+this.dept);
System.out.println("I am from:"+this.institute);
}

public static void main(String[] args)
{
Trainer trainerKumar = new Trainer("CSE", "Payilagam");
System.out.println(trainerKumar.dept);
System.out.println(trainerKumar.institute);

}

}