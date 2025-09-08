package java_lecture;
public class VariableType {
    
    int age;
    String name;
    static int num1 = 98;

    void display(){
        System.out.println("name" + name+ age);
        System.out.println(num1);

    }
    public static void main(String[] args) {
        VariableType variableType = new VariableType();
        variableType.display();
        variableType.age=67;
        variableType.num1=2;
        variableType.name="gyanu";
        variableType.display();



        VariableType variableType2 =new VariableType();
        variableType2.display();
        variableType2.age=7;
        variableType2.num1=8;
        variableType2.display();







        System.out.println(VariableType.num1);


    }
    
}
