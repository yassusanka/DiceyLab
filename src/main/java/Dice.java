
/*Create a `Dice` class that acts like a set of N random-tossed dies.
        ```
Dice dice = new Dice(2); // for craps
Dice dice = new Dice(5); // for yatzee

Integer toss = dice.tossAndSum();*/

public class Dice {

  private  static final  int  MAX=6;

  private Integer numberOfRolls;
  private Integer tossSum;

    public Dice(Integer numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
    }



    public Integer tossAddSum()
    {
        Integer tossSum =0;
        for (int i=0; i< numberOfRolls; i++) {

            tossSum += (int) (Math.random() * MAX) + 1;
        }
        return tossSum;
    }


}
