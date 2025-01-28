import java.util.*;
public class L1_Q12_TrigonometricFunction {
    public double[] calculateTrigonometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double[]res=new double[3];
        res[0]=Math.sin(radians);
        res[1]=Math.cos(radians);
        res[2]=Math.tan(radians);
        return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        L1_Q12_TrigonometricFunction obj=new L1_Q12_TrigonometricFunction();
        System.out.println("Enter the value of angle in degrees");
        double angle=sc.nextDouble();
        double trigoFun[]=obj.calculateTrigonometricFunctions(angle);
        System.out.printf("Sine value is %.2f Cosine value is %.2f and tangent values is %.2f",trigoFun[0],trigoFun[1],trigoFun[2]);
    }
}
