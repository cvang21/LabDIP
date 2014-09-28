package dip.lab2.Ching.Solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
//    public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
 
    public static void main(String[] args) {
        TipCalculator calc1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 2);        
        TipCalculator calc2 = new FoodServiceTipCalculator(ServiceQuality.FAIR, 150.55);
        double amt = calc1.getTip();
        double amt2 = calc2.getTip();
        System.out.println("Baggage Service Tip: " + amt);
        System.out.println("Food Service Tip: " + amt2);
        
    }

}
