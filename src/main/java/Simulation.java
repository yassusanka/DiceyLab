/*Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run

        Create a simulation where two dies are thrown one million times. Keep track of each roll by incrementing the correct Bin.

        Simulation sim = new Simulation(2, 10000);

        sim.runSimulation();

        sim.printResults();
        You can use a main() to run the simulations.

*/

public class Simulation  {

    private Integer numberOfDies;

    private Integer numberOfTosses;
    private Dice dice;
    private Bins bins;

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDies);
        this.bins = new Bins(numberOfDies);
    }

    public void runSimulation () {

        int tossValue = 0;
        for (Integer i = 0; i < numberOfTosses; i++) {
            tossValue = this.dice.tossAddSum();
            this.bins.incrementBin(tossValue);
        }

    }


    /*
    * ***
Simulation of 2 dice tossed for 1000000 times.
***

 2 :    27917: 0.03 **
 3 :    55422: 0.06 *****
 4 :    83457: 0.08 ********
 5 :   110961: 0.11 ***********
 6 :   139098: 0.14 *************
 7 :   166977: 0.17 ****************
 8 :   138386: 0.14 *************
 9 :   111102: 0.11 ***********
10 :    83367: 0.08 ********
11 :    55799: 0.06 *****
12 :    27514: 0.03 **
    *
    *
    * */

    public void printResults() {


        //int binSize = this.bins.;
        int numberOfBins = this.numberOfDies*6;
        Integer binValue = 0;
        float percentofToss = 0;
        Integer numberOfStars = 0;
        StringBuffer sb ;

        System.out.println("***\n");
        System.out.println("Simulation of " + this.numberOfDies + " dice tossed for "+ this.numberOfTosses +" times.\n");
        System.out.println("***\n\n");

        for (Integer i = this.numberOfDies; i <= numberOfBins; i++) {
            sb = new StringBuffer("");
            binValue = this.bins.getBin(i);
            percentofToss = (float)binValue/ (float) this.numberOfTosses;
            //System.out.println (" percentofToss - "+percentofToss);
            numberOfStars = (int) Math.round (binValue/10000);
            sb.append(String.format("%2d" ,i));
            sb.append(String.format(" :%9d", binValue ));
            sb.append(String.format(": %6.2f", percentofToss ));
            //sb.append(percentofToss);
            sb.append(" ");
            for (int j=0; j< numberOfStars; j++){
                sb.append("*");
            }
            sb.append("\n");
            System.out.println(sb.toString());

        }

    }

    public static void main (String args[]) {

        Simulation s = new Simulation(4, 5);
        s.runSimulation();
        s.printResults();

    }


}

