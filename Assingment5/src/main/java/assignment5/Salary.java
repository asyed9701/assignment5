package assignment5;

public class Salary {
	
	static int count=1;
	Salary(String name,int age,int salary,String address){
		System.out.println("Employee Number: "+count);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Address: "+address);
		count++;
		System.out.println("");
	}

	public static void main(String[] args) {
		Salary[] obj=new Salary[5];
		obj[0]=new Salary("Abid",23,100000,"Forest Hills");
		obj[1]=new Salary("Todd",36,190000,"Lexington Ave.");
		obj[2]=new Salary("Jack",23,10000,"Bushwick");
		obj[3]=new Salary("Anderson",58,1100000,"Greenwhich");
		obj[4]=new Salary("Bob",30,110000,"Yonkers");
	}

}


