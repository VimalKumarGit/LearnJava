
public class Basic2 {
	
	static int total = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic2 obj = new Basic2();
		obj.display(5);

	}
	
	public void display(int i)	{
		total = total + i;
		i--;
		if(i>0)
			display(i);
		else
			System.out.println(total);
		
		
	}

}
