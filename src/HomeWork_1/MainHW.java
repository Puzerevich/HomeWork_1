package HomeWork_1;

/**
 * Created by KOS on 27.03.2018.
 */
public class MainHW {
    public static void main(String[] args) {

     // Task_1 BEGIN
        System.out.println("--------------------------------- Task_1 ---------------------------------\n");
        Cat cat_1 = new Cat();
        cat_1.setName("Friske");
        cat_1.setAge(4);
        cat_1.setColor("Red");

        System.out.println(cat_1.toString());

        Cat cat_2 = new Cat("Tom",2,"Pink");
        System.out.println(cat_2.toString());
     // Task_1 END

        System.out.println("");

     // Task_2 BEGIN
        System.out.println("--------------------------------- Task_2 ---------------------------------\n");
        Triangle triangle_1 = new Triangle();
        Triangle triangle_2 = new Triangle(3,3,3);
        System.out.println("First triangle area: "+triangle_1.tr_area());
        System.out.println("Second triangle area: "+triangle_2.tr_area());
     // Task_2 END

        System.out.println("");

     // Task_3 BEGIN
        System.out.println("--------------------------------- Task_3 ---------------------------------\n");
        double[] x, y, z;
        x = new double[]{13, 25, 4};
        y = new double[]{43, -7, 11};
        z = new double[3];
        Vector3d.method(x,y,z);
     // Task_3 END

        System.out.println("");

     // Task_4 BEGIN
        System.out.println("--------------------------------- Task_4 ---------------------------------\n");
        Phone contact_1 = new Phone("0501356789","Konstantin");
        Phone contact_2 = new Phone("0971343674","Oleg");
        Phone contact_3 = new Phone("0509523214","Peter");
        Phone contact_4 = new Phone("0975123695","Alesya");
        Phone contact_5 = new Phone("0951475325","Viacheslav");

        System.out.println("Registration of subscribers in the network.");
        contact_1.registrarion();
        contact_2.registrarion();
        contact_4.registrarion();
        contact_5.registrarion();
        System.out.println();

        System.out.println(contact_1.getName()+" is trying to call.");
        contact_1.CallToContact(contact_2.getPhone_number());

        System.out.println();

        System.out.println(contact_2.getName()+" is trying to call.");
        contact_2.CallToContact(contact_3.getPhone_number());

        System.out.println();

        System.out.println(contact_3.getName()+" is trying to call.");
        contact_3.CallToContact(contact_2.getPhone_number());

        System.out.println("");
     // Task_4 END
    }
}