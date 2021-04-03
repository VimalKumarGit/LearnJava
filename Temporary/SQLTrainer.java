public class SQLTrainer extends Trainer
{

public SQLTrainer()
{
super("SQL", "Payilagam");
//System.out.println(super.dept);
//System.out.println(super.institute);
}

/*public SQLTrainer(String dept, String institute)
{
//super.dept = dept;
//super.institute = institute;
}*/

public static void main(String[] args)
{
SQLTrainer ram = new SQLTrainer();
System.out.println(ram.dept);
System.out.println(ram.institute);
ram.training();
System.out.println(ram.getSalary());
}

}