/**
 * @author Dolunay Dagci
 * Date 5/2/19
 * This class keeps track of mileage
 */
class DD_Odometer {
    // Constant for the maximum mileage
    private final int maxMileage = 999999;

    // Constant for the miles-per-gallon
    private final int milesPerGallon = 28;

    private int initialMileage;
    private int mileage;

    // Field to reference a FuelGauge object
    private DD_FuelGauge fuelGauge;

    /**
     *
     * @param mileage miles to assign
     * @param fuelGauge reference object
     */
    DD_Odometer(int mileage, DD_FuelGauge fuelGauge) {
        this.initialMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }

    /**
     *
     * @return mileage
     */
    int getMileage() {
        return mileage;
    }

    void addMileage() {  //adds gasoline until it reaches max gasoline

        if (mileage < maxMileage) {
            mileage++;
        } else {
            mileage = 0;
        }

        int driven = initialMileage - mileage; //burns fuel when it reaches 28 miles
        if (driven % milesPerGallon == 0) {
            fuelGauge.burnFuel();
        }
    }
}
