import java.util.TreeMap;

/*Create a tracking class `Bins` that can be used to track the results of dice tosses.

        ```
Bins results = new Bins(2, 12); // for bins from 2..12
Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
results.incrementBin(10); // should increment bin # 10
*/
public class Bins {

    private TreeMap<Integer, Integer> bintreemap ;

    private int numberOfDice;

    private static final int ZERO = 0;

    // Constructor initialize the fields
    public Bins( int numberOfDice) {
        this.bintreemap = new TreeMap < Integer, Integer> ();
        this.numberOfDice = numberOfDice;
        initializeBinTreeMap();
    }

    // Create and initiate the Bins with ZERO
    private void initializeBinTreeMap () {

        int numberOfBins = numberOfDice * 6;
        for (int i=this.numberOfDice; i<=numberOfBins; i++) {
            this.bintreemap.put(i, ZERO);
        }
    }

    public Integer getBin (Integer inputBinNo) {

        Integer result = bintreemap.get(inputBinNo);

        return result;
    }

    public void incrementBin (Integer binNumber) {
        Integer result = bintreemap.getOrDefault(binNumber, ZERO);
        result++;
        bintreemap.put(binNumber, result);
    }



}
