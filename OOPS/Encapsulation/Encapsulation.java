/*Encapsulation: This principle states that an object should hide its 
 * internal state and require all interaction to be performed through its methods. 
 * Encapsulation helps to protect the internal state of an object from unintended interference and misuse.*/


class Human{
    private int age;
    private String name;
    public Human() {
        //TODO Auto-generated constructor stub
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }
    public void setName(String b){
        name=b;
    }

}
public class Encapsulation {
    public static void main(String args[]){
        Human obj=new Human();
        obj.setAge(30);
        obj.setName("VK");
        System.out.println(obj.getName()+":"+ obj.getAge());

    }
}
