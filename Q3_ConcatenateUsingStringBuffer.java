public class Q3_ConcatenateUsingStringBuffer {
    public static void main(String[] args) {
        String arr[]={"hello","welcome","to","capgemini","and","Bridgelabz"};
        StringBuffer sb=new StringBuffer();
        for(String s:arr){
            sb.append(s);
        }
        System.out.println("concatenated string is: "+sb);
    }
}
