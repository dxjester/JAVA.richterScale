
package richterscale;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.DataInputStream;
/**
 * @author patrickbenitez
 */
public class RichterScale {

    
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader console = new BufferedReader(inputStreamReader);
        
            System.out.println("Enter a magnitude on the Richter scale:");
            String input = console.readLine();
            double magnitude = Double.parseDouble(input);
        
            earthquake quake= new earthquake(magnitude);
            System.out.println(quake.getDescription());
        }
        
        catch(IOException e){
            System.out.println(e);
            System.exit(1);
        }
    }
    
    public static class earthquake{
        
        public earthquake(double magnitude){
            richter = magnitude;
        }
        
        public String getDescription() {
            String r;
            if (richter >= 8.0)
                r = "Most structures fall";
            else if (richter >= 7.0)
                r = "Many buildings destroyed";
            else if (richter >= 6.0)
                r = "Many buildings considerably damaged, some collapse";
            else if (richter >= 4.5)
                r = "Damage to poorly constructed buildings";
            else if (richter >= 3.5)
                r = "Felt by many people, no destruction";
            else if (richter >= 0)
                r = "Generally not felt by people";
            else
                r = "Negative Nmbers are not valid";
            return r;
        }
        
        private double richter;
    }
    

}
