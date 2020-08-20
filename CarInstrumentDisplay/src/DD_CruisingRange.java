/**
 * @author Dolunay Dagci
 * Date 5/2/19
 * This class is a display for the estimated number of miles until you run out of gasoline
 */
class DD_CruisingRange {

    private int milesLeft;


    DD_CruisingRange() { //gets miles left from Odometer class
    }

    void setMilesLeft(int m) {
        milesLeft = m;
    }

    int getMilesLeft() {
        return milesLeft;
    }

    void CruisingRange() {
        milesLeft--;
    }
    }


