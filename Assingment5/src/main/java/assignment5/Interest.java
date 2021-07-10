package assignment5;

public class Interest {

	void displayInterestRate(){
		System.out.println("There is no interest");
	}

	public static void main(String[] args) {
		Interest obj=new ChaseBank();
		obj.displayInterestRate();
		new CityBank().displayInterestRate();
		new TDBank().displayInterestRate();
	}
}

class ChaseBank extends Interest{
	void displayInterestRate(){
		System.out.println("Chase Bank interest is 8%");
	}
}

class CityBank extends Interest{
	void displayInterestRate(){
		System.out.println("City Bank interest is 7%");
	}
}

class TDBank extends Interest{
	void displayInterestRate(){
		System.out.println("TD Bank interest is 9%");
	}
}
