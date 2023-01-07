package java8features;
//lambda example ads q2

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator obj = new StandardCalc();
		obj.add();
		ICalculator obj2 = new StandardCalc();
//		obj2.sub();
//		StandardCalc obj3 = new StandardCalc();
//		obj3.add();
		
		
		/// lets create anonymous class 
		ICalculator obj4 = new ICalculator()
		{
			
			@Override
			public void add()
			{
				// TODO Auto-generated method stub
				System.out.println("this is the anonymous class example");
			}
		};
		// anonymous class is implemented
		obj4.add();
		
		// lets implement Lambda 
		ICalculator obj5 =()->System.out.println("this is lambda");
		obj5.add();
//		obj5.sub();
		

	}

}
