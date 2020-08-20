import java.util.Scanner;
/**
 * @author Dolunay Dagci
 * Date 5/2/19
 * This Program shows amount of gallons of gasoline, miles for remaining gallons, and how many gallons you drove until you run out of gasoline.
 */
public class DD_InstrumentDisplay {
    public static void main(String[] args) {

        //Create an instrument display object
        DD_InstrumentDisplay instrumentDisplay = new DD_InstrumentDisplay();
        //create a fuelgauge object from the FuelGauge class.
        DD_FuelGauge fuel = new DD_FuelGauge();
        //create a odometer object from the odometer class.
        DD_Odometer odometer = new DD_Odometer(0, fuel);
        //Scanner method for getting input from the user.
        Scanner keyboard = new Scanner(System.in);
        //create a cruisingrange object from the CruisingRange class.
        DD_CruisingRange cruisingRange = new DD_CruisingRange();
        //create a milesSinceLastGas object from the MilesSinceLastGas class.
        DD_MilesSinceLastGas milesSinceLastGas = new DD_MilesSinceLastGas(fuel, odometer, 0);

        //add gas
        for (int i = 0; i < fuel.gallonsTankOfGasoline; i++)  {
            fuel.addGas();
        }

        /*
          drives and consumes the whole gasoline while displaying the remaining gasoline, how many miles left until you run out
          of gasoline and how many miles you have driven total until you ran out of gasoline.
         */
        cruisingRange.setMilesLeft(420); //set miles to 420 (15 gallons * milesPerGallon(28))
        while (fuel.getGallons0fGasoline() > 0) { //until gallons reach zero, keep driving.
            odometer.addMileage(); //adds miles internally
            System.out.println("Current fuel level: " + fuel.getGallons0fGasoline() + " gallons."); //displays current fuel level
            cruisingRange.CruisingRange();
            if (odometer.getMileage() == 420) {
                //when it consumes the whole gasoline it will display "You are out of gasoline!". Else car will keep driving and show the amount of miles you've driven.
                System.out.println("You are out of gasoline!");
                System.out.println("o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
                System.out.println("You have driven " + milesSinceLastGas.getMSLG() + " miles since last added gasoline."); //shows how many miles you have driven total until you ran out of gasoline.
            } else {
                System.out.println("Miles: " + odometer.getMileage() + " miles.");
                System.out.println("There are " + cruisingRange.getMilesLeft() + " miles left until you run out of gasoline.");
                System.out.println("-----------------------------------------------");
            }
        }

    }

}


