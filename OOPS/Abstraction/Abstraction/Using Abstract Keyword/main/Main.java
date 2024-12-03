abstract class system{
	abstract void method();
}

public class Main{
	public static void main(String args[]){
		Laptop obj=new Laptop();
		obj.method();
	}
}


class Laptop extends system{
	public void method(){
		System.out.println("Using Laptop");
	}
}

class Desktop extends system{
	public void method(){
		System.out.println("Using Desktop");
	}
}
