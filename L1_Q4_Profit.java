public class L1_Q4_Profit {
    public static void main(String[] args) {

        int cp = 129;
        int sp = 191;

        //Calculating Profit
        int p = sp-cp;
        double pp = ((double)p/(double)cp)*100;
        System.out.println("The Cost Price is INR "+cp+"and Selling Price is INR "+sp+"\nThe Profit is INR "+p+"and the Profit Percentage is "+pp);
    }
}
