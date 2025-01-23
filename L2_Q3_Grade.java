import java.util.Scanner;

public class L2_Q3_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Physics, Chemistry and Math ");
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int math=sc.nextInt();
        double average=(physics+chemistry+math)/3;
        double percentage=average/10;
        if(percentage>=8) {
            System.out.printf("Average marks is %f Grade is A and remarks is Level 4 above agency-normalized standards",average);
        }
        else if(percentage>=7){
            System.out.printf("Average marks is %f Grade is B and remarks is Level 3, at agency-normalized standards",average);
        }
        else if(percentage>=6){
            System.out.printf("Average marks is %f Grade is C and remarks is Level 2, below, but approaching agency-normalized standards",average);  }
        else if(percentage>=5){
            System.out.printf("Average marks is %f Grade is D and remarks is Level 1, well below agency-normalized standards",average);  }
        else if(percentage>=4){
            System.out.printf("Average marks is %f Grade is E and remarks is Level 1-, too below agency-normalized standards",average);  }
        else
            System.out.printf("Average marks is %f Grade is R and remarks is Remedial standards",average);
    }
}
