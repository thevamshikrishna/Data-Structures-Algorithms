/*Inheritance: Inheritance allows one class to inherit the 
attributes and methods of another class. This helps in code reuse and establishes a natural hierarchy between classes. 
For example, a Dog class might inherit from a Animal class.*/






public class inheritance {
	
	
    public static void main(String args[]){
        AdvCalc obj=new AdvCalc();
        int r1=obj.sum(4,5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(5,3);
        int r4=obj.div(15,4);

        System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }
}
