//Exp 1a: vARIABLES IN JAVA
public class Exp1a{
    int instanceVar=10;
    static String staticVar= "I am Static";
    public void show_variables()
    {
        int localVar=5;
        System.out.println("Instance variable :" + instanceVar);
        System.out.println("Static variable :" + staticVar);
        System.out.println("Local variable :" + localVar);
    }
    public static void main(String[]args)
{
    Exp1a obj1= new Exp1a();
    obj1.show_variables();
    System.out.println("Accessing static variable via class:" + Exp1a.staticVar);
}
}
