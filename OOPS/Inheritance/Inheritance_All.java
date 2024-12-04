class Inheritance_All{
	public static void main(String args[]){
		
		Parent obj=new Child();
		obj.add(1,2);
		obj.sub(3,2);
		obj.mul(5,9);
		obj.div(200,25);
		
	}
}

class Parent{
	public void add(int a,int b){
		System.out.println("Addition of two numbers is:"+(a+b));
	}
	
		public void sub(int a,int b){
		System.out.println("Subtraction of two numbers is:"+(a-b));
	}
}

class Child extends Parent{
	public void mul(int a,int b){
		System.out.println("Multiplication of two numbers is:"+(a*b));
	}
	
		public void div(int a,int b){
		System.out.println("Division of two numbers is:"+(a/b));
	}
}
