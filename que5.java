import java.util.Scanner;
class que5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder : ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of cylinder : ");
        double height= sc.nextDouble();
        double volume= Math.PI * Math.pow(radius, 2)*height;
        System.out.println("Volume = "+volume+" unit cube.");
    }
}