import java.util.*;

public class GenevieveTorkornooBridgeHand
{
  public final int CARDS_PER_HAND = 13;
  public final int CARDS_PER_SUIT = 13;
  public final int CARDS_PER_DECK = 52;
  public final char[] FACES 
    = { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7', '6', '5', '4', '3', '2' };
  private int [] cards; // has size CARDS_PER_HAND  
 
  /*
   * Default constructor
   * Fills the array cards with random, non-duplicate cards
   */   
  public GenevieveTorkornooBridgeHand( )
  {
    // randomly generate a hand
    Random random = new Random( );
    cards = new int[CARDS_PER_HAND]; 
    // all 0s (aces of spade) at this point
    for( int i = 0; i < CARDS_PER_HAND; i++ )
      cards[i] = -1;
    // Now all "invalid" cards
    int card = -1;
    // generate the hand
    for( int i = 0; i < CARDS_PER_HAND; i++ )
    {
      // draw a new card
      card = random.nextInt( CARDS_PER_DECK );
      
      while( isDuplicate( card ) ) // duplicate, keep drawing a card
        card = random.nextInt( CARDS_PER_DECK );
      // non-duplicate card, add to hand
      cards[i] = card;  
    }
    selectionSort( );
  }
  
  /*
   * isDuplicate method
   * @param number an int, represents a card, an int between 0 and CARDS_PER_DECK - 1
   * @return a boolean, true if number is already present in the array cards, false otherwise
   */
  private boolean isDuplicate( int number )
  {  
      for( int i = 0; i < cards.length; i++ )
      {
        if( cards[i] == number )
          return true;
      }
      return false;
  }
  
  /*
   * highCardPoints method
   * @return an int, the sum of all high card points in cards
   * ace = 4, king = 3, queen = 2, jack = 1, all other cards are worth 0
   */
  public int highCardPoints( )
  {
    int points = 0;
    for( int i = 0; i < cards.length; i++ )
    {
      if( cards[i] % CARDS_PER_SUIT < 4 ) // Ace, King, Queen, or Jack
        points += ( 4 - cards[i] % CARDS_PER_SUIT ) ;
    }
    return points;
  }
  
 public void selectionSort( )
 {
   for( int i = 0; i < cards.length - 1; i++ )
   {
     // get index of largest element in unsorted subarray
     int index = indexOfLargest( cards.length - i );
     // Swap last element of unsorted subarray with element at index index
     swap( index, cards.length - i - 1 );
   }
 }

 /**
  * returns index of largest element in subarray starting at index 0
  *         and ending at index size -1
  * @param size an int, the size of the unsorted subarray
  * @return an int, the index of the max element in the subarray
  */
 public int indexOfLargest( int size )
 {
   int index = 0;
   for( int i = 1; i < size; i++ )
   {
     if( cards[i] > cards[index] )
       index = i;
   }
   return index;
 }

 /**
  * swaps the elements of grades at indexes i and j
  * @param i an int, a valid index within grades
  * @param j an int, a valid index within grades
  */
 public void swap( int i, int j )
 {
   // example: 25 and 62
   int temp = cards[i]; // 25
   cards[i] = cards[j]; // 62 and 62
   cards[j] = temp;
 }
  
 public String toString( ) {
     // System.out.println( Arrays.toString( cards ) );
     String result = "";
     String spades = "S: ";
     String hearts = "H: ";
     String diamonds = "D: ";
     String clubs = "C: ";
     for (int i = 0; i < cards.length; i++) {
         if (cards[i] < 13) // spade
             spades += FACES[cards[i] % 13] + " ";
         else if (cards[i] < 26) // heart
             hearts += FACES[cards[i] % 13] + " ";
         else if (cards[i] < 39) // diamond
             diamonds += FACES[cards[i] % 13] + " ";
         else // club
             clubs += FACES[cards[i] % 13] + " ";
     }
     result = spades + "\n" + hearts + "\n" + diamonds + "\n" + clubs;
     return result;
 }
 // part B starts here:

    public int[] spades () {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] <= 12) {
                count += 1;
            }


        }
        int[] spadesArr = new int[count];
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] <= 12) {
                spadesArr[i] = cards[i];
            }

        }
        return spadesArr;
    }

     public int[] hearts() {
         int count = 0;
         for(int i = 0; i < cards.length; i++) {
             if ( cards[i] >= 13 && cards[i] <= 25 ) {
                 count += 1;
             }


         }
         int[] heartsArr = new int[count];
         //for( int i = 0; i < cards.length; i++ ) {
             //if (cards[i] >= 13 && cards[i] <= 25) {
                 //heartsArr[i] = cards[i];
             //}

         //}
         return heartsArr;
     }


    public int[] diamonds() {
        int count = 0;
        for(int i = 0; i < cards.length; i++) {
            if (cards[i]>= 26 && cards[i] <= 38) {
                count += 1;
            }


        }
        int[] diamondsArr = new int[count];
        //for (int i = 0; i < cards.length; i++) {
           // if (cards[i] <= 26 && cards[i] <= 38) {
               // diamondsArr[i] = cards[i];
           // }

        //}
        return diamondsArr;
    }

    public int[] clubs() {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i]>= 39 && cards[i] <= 51) {
                count += 1;
            }


        }
        int[] clubsArr = new int[count];
        //for (int i = 0; i < cards.length; i++) {
           // if (cards[i] <= 39 && cards[i] <= 51 ) {
              //  clubsArr[i] = cards[i];
           // }

        //}
        return clubsArr;
    }

    public int [] shape () {
    //it returns an array of 4 elements representing the number of spades, hearts, diamonds, and clubs in this hand,
    // For example, it could return an array with values 3, 4, 3, 3 or 3, 3, 5, 2, …
    int[] numCards = new int[4];

    numCards[0] = spades().length;
    numCards[1] = hearts().length;
    numCards[2] = diamonds().length;
    numCards[3] = clubs().length;
    //for (int i = 0; i < numCards.length; i++)
        //System.out.println(numCards[i]);
    return numCards;
}
    public int sumOfLengthsOfTwoLongestSuits(){
     //returns the sum of the number of cards in the two longest suits
        GenevieveTorkornooBridgeHand bh = new GenevieveTorkornooBridgeHand();
        int [] numCards = bh.shape();
        int largestNum = numCards[0];
        int secondLargest = numCards[0];
        for ( int i = 0; i < numCards.length; i++ ) {
            if (numCards[i] >= largestNum) {
                secondLargest = largestNum;
                largestNum = numCards[i];
            }
        }
        //int totalSum = largestNum + secondLargest;
        //System.out.println( largestNum + secondLargest);
        return largestNum + secondLargest;
        //if statement is < greater than statement then move on to the next one
        // return 1st biggest + second biggest

    }

    public int rule0f20(){
        return highCardPoints() + sumOfLengthsOfTwoLongestSuits();

    }
    public boolean hasRegularOpening(){

     if (rule0f20() >= 20){
         return true;
     }
     else
         return false;

    }

    public String typeOfHand (){
     int count = 0;

     for ( int i = 0; i < shape().length; i++ ){
        if (shape()[i] == 0) {
            return "UNBALANCED";
        }
        if (shape()[i] == 1 ) {
            return "UNBALANCED";
        }

        if ( shape()[i] == 2) {
              count += 1;
          }
        }

        if (count >= 2 ){
            return "UNBALANCED";
        }

        return "BALANCED";
    }

    public boolean has1NoTrump() {
     boolean type = false;
        if (typeOfHand().equals("BALANCED")) {
            //if they are less than or equal to 15 or greater than or equal to 17 then return true
            if (highCardPoints() >= 15 && highCardPoints() <= 17) {
                type = true;
            }
        }
        else
            type = false;
        return type;
    }

    /**
     * has2NoTrump
     *if typeofhand equals balanced and if highcards = 20 or 21
     * @return true
     * else
     * return false
     */
    public boolean has2NoTrump() {
     boolean type = false;
         if (typeOfHand().equals("BALANCED")) {

             // if they are equal to 21 or 20 then return 20
             if (highCardPoints() == 20 || highCardPoints() == 21) {
                 type = true;
             }
         }
        else
            type = false;
        return type;
     }

    /**
     * weHaveAGame
     * @param num
     * if highpoint + num is > or = 25
     * @return ture
     * else
     * @return false
     */
    public boolean weHaveAGame(int num ){
        //  if combinded they are less than or equal to 25 then return true
     if (highCardPoints()+ num  >= 25 ){
         return true;
     }
     else
         return false;
    }

    /**
     * weHaveSlam
     * @param hand
     * adding hand and highcards together if the sum of both is > = 33
     * @return true
     * else
     * @return false
     */
    public boolean weHaveSlam( GenevieveTorkornooBridgeHand hand){
        //  if it is less than or equal to 33 return true
     if (hand.highCardPoints()+highCardPoints() >= 33 ){
         return true;
     }
     else
         return false;
    }


     public boolean weHaveAFit(GenevieveTorkornooBridgeHand hand, char suit ) {
        if( suit == 'S' ){
            if (hand.highCardPoints()+highCardPoints() >= 8){

            }
            return true;
        }

         if( suit == 'D' ){
             if (hand.highCardPoints()+highCardPoints() >= 8){

             }
             return true;
         }
         if( suit == 'H' ){
             //  if it is less than 8 return true
             if (hand.highCardPoints()+highCardPoints() >= 8){

             }
             return true;
         }
         if( suit == 'C' ){
             //  if it is less than 8 return true
             if (hand.highCardPoints()+highCardPoints() >= 8){

             }
             return true;

         }
         else
             return false;

         }

    /**
     * weHaveAFit
     * @param suit, hand
     * Checks if D,C,S,C and is > or = 8
     * @return if it is true & if not return false
     */
    public int romanKeyCard( char suit ){

            int keyCards = 0;
            for ( int i = 0; i < CARDS_PER_HAND; i++){
                //seraching for the ace in each suite
                if ( cards[i] == 0 || cards[i] == 13 || cards[i] == 39 ){
                    keyCards += 1;
                }
                // searching for the kings in each suite
                else if ( suit == 'S' && cards[i] == 11 ){
                    keyCards += 1;
                }
                else if ( suit == 'H' && cards[i] == 24 ){
                    keyCards += 1;
                }
                else if ( suit == 'D' && cards[i] == 37 ){
                    keyCards += 1;
                }
                else if ( suit == 'C' && cards[i] == 50){
                    keyCards += 1;
                }
            }
            return keyCards;
        }

    /**
     * romanKeyCard
     * Checks if it is equal to H,D,C or S and if it is king & ace
     * @return key card
     */
        public boolean hasAClubs(){
            int points = highCardPoints();
            if ( points >= 22){
                return true;
            }
                return false;
/**
 * hasAClubs
 * checks if highcard points is > or = 22 if it is return true
 * else return false
 */
        }

     }
