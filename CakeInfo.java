import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class CakeInfo {
    private String [][] flavoursInfo;
    private float[][] priceInfo;
    private static final String flavoursInfoFile = "data/flavours.txt";
    private static final String priceInfoFile = "data/price.txt";

    
    public CakeInfo() throws IOException {
        flavoursInfo = new String[9][10];
        priceInfo = new float[3][3];

        //load flavour information to flavoursInfo
        loadFlavours(flavoursInfoFile);
        //loading price information to priceInfo
        loadPriceInfo(priceInfoFile);
    }

    public void loadFlavours(String flavoursInfoFile) throws IOException {
        // Task 2.1: WRITE YOUR CODE HERE
        try{
            File cakeFlavours = new File(flavoursInfoFile);
            Scanner myReader = new Scanner(cakeFlavours);
            while(myReader.hasNextLine()){
                String[]data= Scanner.nextLine()trim.split(":|\\");
                for (int i = 0; i <flavoursInfo; ++i){
                    for(int j = 0; j< data[i].length();j++){
                        flavoursInfo [i][j] = data[i];
                    }
                }
                System.out.println(data);
            }catch(FileNotFoundException e){
                System.out.println("An error occured.");
                e.printStackTrace();
            }
            }
        }
    }

    public void loadPriceInfo(String priceInfoFile) throws IOException {
        // Task 2.2: WRITE YOUR CODE HERE
        try{
            File cakePrice = new File(priceInfoFile);
            Scanner myReader = new Scanner(cakePrice);
            while(myReader.hasNextLine()){
                String[]data = Scanner.nextLine()trim.split(":|\\");
                for(int i =0; i< priceInfo; i++){
                    for(int j = 0; j< data[i].length();j++){
                        priceInfo = [i][j] = data[i];

                    }
                }
                System.out.println(data);
            }catch(FileNotFoundException e){
                System.out.println("An error occured.");
                e.printStackTrace();`
            }
        }

    }
    /*returns the cake price of a cake*/
    public float calCakePrice(Cake cake) { 
	// Task 2.3: WRITE YOUR CODE HERE 
       



    }
    
    /*returns the flavour category of the specific cake flavour
    */
    public int getFlavourCategoryIndex(Cake cake){ 
                                    
        int flavourCatIndex = -1; 
	    //specific cake flavour i.e. mint chocolate, red velvet etc..
        String flavour = cake.getFlavour(); 
        for (int i = 0; i < flavoursInfo.length; ++i) {
            int j = 0;

            //loop until the end and until index is still not found
            while (j < flavoursInfo[i].length && flavourCatIndex == -1) {
                if (flavoursInfo[i][j] != null && !flavoursInfo[i][j].isEmpty()) {

		    //found the flavour within each flavour categories (1-9)
                    if (flavour.equals(flavoursInfo[i][j])) {
                        flavourCatIndex = i + 1;
                    }
                }
                j += 1;
            }
        }
        
	    //if no flavour is found, flavourCatIndex will remain as -1 when it was initialised
        return flavourCatIndex; 
    }




}