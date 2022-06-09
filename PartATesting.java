import java.io.IOException;
import java.io.File;

public class PartATesting {
    public static void main(String args[]) throws IOException {

        float expectedP,actualP;
        boolean pass;
       // CakeInfo cakeInfo = new CakeInfo();
         Cake cake;
	    // Cake cakeB;


        cake = new Cake("hojicha", 3, "gluten-free");

        System.out.println("Output: "+cake.toString());

        // System.out.println(new File(".").getAbsolutePath());
        // cake = new Cake("hojicha", 3, "gluten-free");
        // System.out.println("Test 1 - 3-layer hojicha gluten-free for $160.00");
        // // the expected output value
        // expectedP = 160.00f; 
        // // calling the calCakeInfo method
        // actualP = cakeInfo.calCakePrice(cake); 
        // pass = actualP == expectedP;
        // if (pass){
        //     System.out.println("Passed this test for calCakePrice in CakeInfo class");
        // }else{
        //     System.out.println("Failed this test for calCakePrice in CakeInfo class, the expected value is " + Float.toString(expectedP) + " but the actual value is "+Float.toString(actualP)+". Please check your code!");
        // }

        // cakeB = new Cake("banana foster", 1, "none");
        // System.out.println("Test 1 - 1-layer banana foster no dietary requirements for $40.00");
        // // the expected output value
        // expectedP = 40.00f; 
        // // calling the calCakeInfo method
        // actualP = cakeInfo.calCakePrice(cakeB); 
        // pass = actualP == expectedP;
        // if (pass){
        //     System.out.println("Passed this test for calCakePrice in CakeInfo class");
        // }else{
        //     System.out.println("Failed this test for calCakePrice in CakeInfo class, the expected value is " + Float.toString(expectedP) + " but the actual value is "+Float.toString(actualP)+". Please check your code!");
        // }


    }
}