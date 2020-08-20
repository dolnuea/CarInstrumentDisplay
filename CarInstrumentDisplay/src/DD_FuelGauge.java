/**
 * @author Dolunay Dagci
 * Date 5/2/19
 * This class has 15 gallon tank of gasoline and average consumption  of 1galon/28miles
 * when you "add gas to the tank", +1. and -1 every 28 miles. It displays its current value.
 */
public class DD_FuelGauge {

    //Constant for the max gallons of gasoline
    final int gallonsTankOfGasoline = 15;
    private int gallons0fGasoline;


    DD_FuelGauge() { //constructor that initializes gallons of gasoline to 0
        gallons0fGasoline = 0;
    }

    /**
     *
     * @param gasoline fou fuel gauge
     */
    DD_FuelGauge(DD_FuelGauge gasoline) {
        gallons0fGasoline = getGallons0fGasoline();

    }

    /**
     *
     * @param gallons0fGasoline the amount of gallons
     */
    public DD_FuelGauge(int gallons0fGasoline) {
        if (gallons0fGasoline <= gallonsTankOfGasoline ) {
            this.gallons0fGasoline = gallons0fGasoline;
        } else {
            this.gallons0fGasoline = gallonsTankOfGasoline;
        }
    }


        void burnFuel() {
            if (gallons0fGasoline > 0) { //Burns gasoline until it reaches 0
                gallons0fGasoline--;
            } else
                 {
                    System.out.println("Out of fuel!");
                }
        }

    /**
     *
     * @return gallons of gasoline
     */
    int getGallons0fGasoline() {
        return gallons0fGasoline;
    }


    void addGas() {
        if (gallons0fGasoline < gallonsTankOfGasoline) { //adds gasoline until it reaches max gallons
            gallons0fGasoline++;
        } else {
            System.out.println("Warning! You are over-fueling.");
        }
    }
}

