/* BridgeHandSimulator class
*/

import java.text.DecimalFormat;

public class GenevieveTorkornooBridgeHandSimulator
{
  public static void main( String [] args )
  {
    // # of simulation runs
    int RUNS = 100000;
    GenevieveTorkornooBridgeHand bh = new GenevieveTorkornooBridgeHand( );
    int sumOfHighCardPoints = 0;
    int count = 0;
    int countA = 0;
    int countB = 0;
    int countC = 0;
    DecimalFormat format = new DecimalFormat("#.##%");
    while( count < RUNS )

    {


      // generate a new hand of cards
      bh = new GenevieveTorkornooBridgeHand( );
      // add high card points of new hand to total
      sumOfHighCardPoints += bh.highCardPoints( );
      count++;

      if(bh.hasRegularOpening() == true) {
        countA++;
      }
      // calculates the percentage of time that a hand has a 1 No Trump opening
      // checks if they are true
      if(bh.has1NoTrump() == true) {
        countB++;
      }
      //calculates the percentage of time that a hand is balanced
      if(bh.typeOfHand().equals("BALANCED")) {
        countC++;
      }

    } 
    
    // expected results: 10 +/- 0.02
    // there are 40 points in the deck of cards
    // a hand has 1/4 of the deck
    // on average, it will have 1/4 of the points, i.e. 10 points
    // Run: average high card points = 10.00072
    // calculate and output average of high card points 
    double averageHighCardPoints = ( double ) sumOfHighCardPoints / RUNS;
    System.out.println( "average high card points = " + averageHighCardPoints );

    //calculates the percentage of time that a hand has a regular opening
    double a = (double) countA/RUNS;
    System.out.println(format.format(a));

    double b = (double) countB/RUNS;
    System.out.println(format.format(b));

    double c = (double) countC/RUNS;
    System.out.println(format.format(c));
   //outputs a String representation of the last hand generated.

    double averagesumOfLengthsOfTwoLongestSuits = ( double ) bh.sumOfLengthsOfTwoLongestSuits()/ RUNS;
    System.out.println( "average sum of the two largest cards = " + averagesumOfLengthsOfTwoLongestSuits );
  }
}