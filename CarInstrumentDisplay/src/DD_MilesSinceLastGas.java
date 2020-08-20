/**
 * @author Dolunay Dagci
 * Date 5/2/19
 * This class  shows how many miles traveled since you last added gasoline
 */
class DD_MilesSinceLastGas {
    //Field to reference a FuelGauge object
    private DD_FuelGauge gasoline;
    // Field to reference a Odometer object
    private DD_Odometer miles;
    private int MSLG;

    /**
     *
     * @param gas reference object
     * @param mi reference object
     * @param MSLG miles since last gas
     */
    DD_MilesSinceLastGas(DD_FuelGauge gas, DD_Odometer mi, int MSLG) { //gets total miles from Odometer class
        gasoline = new DD_FuelGauge(gas);
        miles = mi;
        this.MSLG = MSLG;
    }

    /**
     *
     * @return miles since last gas from Odometer class
     */
    int getMSLG() {  //getter for MSLG
        return miles.getMileage();
        }

}
