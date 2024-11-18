Prooject 3 part A,
Due: Thursday March 3, 2022 at noon

**You cannot turn part A more than 24 hours late (part A is worth 32 points out of 100).  
I will be posting a solution to part A on Friday March 4, 2022; part B will be due on Tuesday March 22**  
Assignment:  You need to write two classes:   
FirstLastBridgeHand and FirstLastSimulator (for me, it would be HerveFranceschiBridgeHand and HerveFranceschiSimulator)

**NOTE: Although this project is applicable to the game of bridge, you do not need to know how to play bridge to do this project.**

A hand of cards has exactly 13 (different) cards. The FirstLastBridgeHand class encapsulates a hand of cards (13 different cards); it includes the following: 
 
1. An int constant storing 13, the number of cards in one's hand.  
2. An int constant storing 52, the number of cards in the deck.  
3. A char array constant storing characters representing the face of the cards, from A (Ace), K (King), to 2.  Note: 10 is T.   
4. An instance variable, an array of 13 ints, representing the cards in this hand. Each int represents a card as follows:  
0-12: spades, from the Ace of spades (0) to the 2 of spades (12)  
13-25: hearts, from the Ace of hearts (13) to the 2 of hearts (25)  
26-38: diamonds, from the Ace of diamonds (26) to the 2 of diamonds (38)  
39-51: clubs, from the Ace of clubs (39) to the 2 of clubs (51)

The FirstLastBridgeHand class includes the following methods:  

1. A default constructor: it generates randomly the 13 ints in the array; **no duplicates are allowed, all the cards must be different (see the isDuplicate method below)**.  
2. A isDuplicate method: it accepts an int parameter (representing a card) and checks if that int is already in the array instance variable. This method is called by the default constructor.  
3. A sort method: it sorts the array of ints so that they are ordered in ascending order (thus, spades will be first in ascending order, then hearts in ascending order, …). The constructor should call that method. This will be very useful when you code the toString method.  
To sort the hand of cards, you can either code your own method or use the sort method of the Arrays class.   
4. A method named highCardPoints: it returns the total number of high card points in this hand. Only the Ace, King, Queen, and Jack are worth points as follows: ace = 4 points, king = 3 points, queen = 2 points, jack = 1 point.
5. The toString method: it returns (note that the toString method does not output anything) a human-readable String representation of the hand on 4 lines; a possible such String is (each suit in descending order on one line starting with spades, then hearts, then diamonds, then clubs):  
S: A K 4  
H: 6  
D: K J 7 5 3  
C: J T 7 4  

The FirstLastHandSimulator class (where the main method is located) simulates the following (based on 100,000 randomly generated hands):  
* It calculates the average number of high card points in a hand. 
* It outputs a String representation of the last hand generated.

Submission Details: At the top of your program, make sure that you include your name. Test your program. For part A, submit your source code (two .java files) only on Moodle. For the whole project (part B), submit your source code on Moodle and github. 

Grading:  
* Variable names and constant names: 2 points  
* Style and comments : 2 points    
* Correctness: see below  

Class	Topic	Points  
* BridgeHand (part A)	Constants	2
* BridgeHand (part A)	Instance variable	2
* BridgeHand (part A)	Default constructor	4
* BridgeHand (part A)	sort method	4
* BridgeHand (part A)	isDuplicate method	4
* BridgeHand (part A)	highCardPoints method	3
* BridgeHand (part A)	toString 	3
* Simulator (part A) average number of points	3
* Simulator (part A) toString called	1

**Testing** Topic Points  
* highCardPoints method (in part A: place as a comment at the top of your Simulator class). On average, what do you **expect** this method to return?	1
* highCardPoints method (in part A: place as a comment at the top of your Simulator class). On average, what is the result of your simulation over 100,000 hands?	1

Your program should include appropriate comments (including at the top, your name, date created and date last updated), variables should have proper names, and style should be good (spacing, indentation, ..). 

**Testing**:  
You should test that your program produces the correct results, i.e. run your program several times (for example, check that each hand contains no duplicates).

**Submission Details**:  
Submit the Java source code (two .java files) on Moodle.  
1. GitHub: Completed .java files (including comments).  
2. Moodle: Same as above.  
