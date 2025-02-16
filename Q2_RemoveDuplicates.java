import java.util.*;
public class Q2_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
        HashSet<Character> hs=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(!hs.contains(ch)){
                sb.append(ch);
                hs.add(ch);
            }
            
        }
        System.out.printf("Original String: %s%n",str);
        System.out.printf("String without repetitions: %s",sb.toString());
        sc.close();
    }

}
