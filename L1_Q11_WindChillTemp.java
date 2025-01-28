import java.util.Scanner;
public class L1_Q11_WindChillTemp {
    public double calculateWindChill(double temperature, double windSpeed){
        // double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*(Math.pow(windSpeed,0.16));

        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temp=sc.nextDouble();
        System.out.println("Enter the windSpeed");
        double windSpeed=sc.nextDouble();
        L1_Q11_WindChillTemp obj=new L1_Q11_WindChillTemp();
        double windChill=obj.calculateWindChill(temp,windSpeed);
        System.out.printf("WindChill Temperature is %.2f",windChill);
    }
}
