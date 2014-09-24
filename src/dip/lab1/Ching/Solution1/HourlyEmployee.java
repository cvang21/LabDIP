package dip.lab1.Ching.Solution1;;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyRate;
    private double totalHrsForYear;
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    /* Custom implementation of Inteface contract. Therefore, this method
     * is polymorphic (common) to all employess and can be used in the
     * high-level class. The other methods are not part of the contract and
     * therefore can't be used in the high-level class.
     */
    @Override
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }
    
    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }    
}
