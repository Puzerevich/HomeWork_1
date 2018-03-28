package HomeWork_1;

/**
 * Created by KOS on 27.03.2018.
 */
public class Triangle {

    private double x;
    private double y;
    private double z;
    private double res;


    public Triangle() {
        x=1;
        y=1;
        z=1;
    }

    public Triangle(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double tr_area(){
        this.res=(this.x+this.y+this.z)/2;
        this.res=Math.sqrt(res*(res-this.x)*(res-this.y)*(res-this.z));
        return res;
    }
}