/**
 * I fixed a bug
 */

// main class
public class Helloworld {

    // instance variable
    public int instanceVariable;
    public static int iamStatic;


    // ctor
    public Helloworld(int value) {
        instanceVariable = value;
        //iamStatic = value * 2;
    }

    // instance method 1
    public void usecase1() {
        // class instantiation.
        // Person is the class while one is an object.
        Person one = new Person("Baechul", "Kim");

        String name = one.getName();
        System.out.println(name);

        FamilyMan man = new FamilyMan("Baechul", "Kim", 3);
        System.out.println("My Babies: "+man.getNumerOfBabies());

        // one, man are local variables as they are defined within the method.


        System.out.println("First Name: "+man.firstName);
        System.out.println("Last Name: "+man.lastName);
    }

    // instance method 2
    public void usecase2() {
        int a = 5;
        float b = a;
        long c = a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        // be aware of different behavior between typecasting and Math.floor for number.
        float d = -5.9676f;
        //int e = d;  // vague
        int e = (int)d; // typecasting
        System.out.println(e);

//        float d = -5.56f;
//        System.out.println(Math.floor(d));  // -6.0
//        System.out.println(Math.ceil(d));   // -5.0



    }

    // main entry point: a static method
    public static void main(String[] args) {
        Helloworld myWorld = new Helloworld(1);
        //myWorld.usecase1();
        myWorld.usecase2();

//        Helloworld hello1 = new Helloworld(1);
//        System.out.println("hello1.instanceVariable="+hello1.instanceVariable); // 1
//        System.out.println("Helloworld.iamStatic="+Helloworld.iamStatic);       // 0
//        System.out.println("hello1.iamStatic="+hello1.iamStatic);               // 0
//        hello1.iamStatic = 7;
//
//
//        Helloworld hello2 = new Helloworld(2);
//        System.out.println("hello2.instanceVariable="+hello2.instanceVariable); // 2
//        System.out.println("Helloworld.iamStatic="+Helloworld.iamStatic);       // 7
//        System.out.println(hello2.iamStatic);                                   // 7


    }
}