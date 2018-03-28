package HomeWork_1;

/**
 * Created by Konstantin on 28.03.2018.
 */
public class Vector3d {

    public static void method(double []x,double []y,double []z){
        double SkalProd = 0;
        System.out.print("Векторное произведение векторов:[a,b] = < ");
        for(int i=0;i<3;i++){
            SkalProd += x[i] * y[i];
            z[i] = x[(i + 1) % 3] * y[(i + 2) % 3] - x[(i + 2) % 3] * y[(i + 1) % 3];
            System.out.print(z[i]+(i != 2 ?" , ":" >\n"));
        }
        System.out.println("Скалярное произведение векторов: "+SkalProd);
    }

}
