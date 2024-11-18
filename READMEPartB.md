Prooject 3 part B (add your code to part A)
Due: Tuesday March 22, 2022 at beginning of class

Part A of this project should be included in part B 

Assignment:  You need to write two classes:   
FirstLastBridgeHand and FirstLastSimulateHand (for me, it would be HerveFranceschiBridgeHand and HerveFranceschiSimulateHand)

NOTE: Although this project is applicable to the game of bridge, you do not need to know how to play bridge to do this project.

**In addition to all the code in part A**, your FirstLastBridgeHand should contain the following:  

1. 4 public methods named spades, hearts, diamonds, and clubs. They each return an array of ints representing the spades, hearts, diamonds, or clubs, respectively, in this hand.  
Important note: each array must have minimal size. For example, if there are 4 ints in an array, it should have size 4.
2. A public method named shape: it returns an array of 4 elements representing the number of spades, hearts, diamonds, and clubs in this hand, respectively.  
For example, it could return an array with values 3, 4, 3, 3 or 3, 3, 5, 2, …
3. A public method named sumOfLengthsOfTwoLongestSuits: it returns the sum of the number of cards in the two longest suits (for example, if there are 5 spades, 2 hearts, 4 diamonds, and 2 clubs, it returns 9 (5 + 4)).  
It could be useful to call the shape method inside this method.
4. A public method named ruleOf20: it returns the total number of high card points in this hand plus the total number of cards in the two longest suits.
5. A public method named hasRegularOpening: it returns true if the ruleOf20 method returns 20 or more, false otherwise.
6. A public method named typeOfHand: it returns either BALANCED or UNBALANCED. A balanced hand is defined as a hand having no void (no card in a suit), no singleton (one card in a suit), and at most one doubleton (two cards in a suit).  
7. A public method named has1NoTrump: it returns true if this hand is balanced and has between 15 and 17 high card points (both) included.  
8. A public method named has2NoTrump: it returns true if this hand is balanced and has either 20 or 21 high card points.  
9. A public method named weHaveGame: it takes an int parameter and returns true if the total of high card points in this hand added to the int parameter is 25 or more, false otherwise.  
10. A public method named weHaveSlam: it takes a FirstLastBridgeHand parameter and returns true if the total of high card points in both hands is 33 or more, false otherwise.  
11. A public method named weHaveAFit: it takes a FirstLastBridgeHand and a char parameter (representing a suit) whose value is either S, H, D, or C and returns true if the total number of cards in that suit in both hands is greater than or equal to 8, false otherwise.  
12. A public method named romanKeyCard: it takes a char parameter (representing a suit) whose value is S, H, D, or C; it returns the number of key cards in this hand. A key card is either an ace (any ace) or the king of trump (the char parameter is the trump suit).  
13. A public method named has2Clubs: it returns true if the number of high cards points in this hand is 22 or more, false otherwise.
14. All the above methods should have javadoc style comments

In addition to the existing code in part A, the FirstLastHandSimulator class (where the main method is located) simulates the following (based on 100,000 randomly generated hands):  
1. It calculates the percentage of time that a hand has a regular opening (i.e. the hasRegularOpening method returns true). 
2. It calculates the percentage of time that a hand has a 1 No Trump opening (i.e. the has1NoTrump method returns true). 
3. It calculates the percentage of time that a hand is balanced (i.e. the typeOfHand method returns BALANCED). 
4. It calculates the average sum of lengths of the 2 longest suits in a hand. 
5. It (still, like in part A) outputs a String representation of the last hand generated.

Note: You need to use DecimalFormat, not NumberFormat, for maximum precision (because the precision of NumberFormat may be insufficient).

Submission Details: At the top of your program, make sure that you include your name. Test your program.  
For the whole project, submit your source code on Moodle and github. 

Grading (100 points):
Part A = 32 points (already graded)
Part B = 68 points as follows):

Class	Topic	Points  
BridgeHand	spades, hearts, diamonds and clubs methods	6 points  
BridgeHand	shape method	4 points  
BridgeHand	sumOfLengthsOfTwoLongestSuits method	4 points  
BridgeHand	ruleOf20Points method 4 points  
BridgeHand	hasRegularOpening method 4 points  
BridgeHand	typeOfHand method	4 points  
BridgeHand	oneNoTrump method	3 points  
BridgeHand	twoNoTrump method	3 points  
BridgeHand	weHaveGame	4 points  
BridgeHand	weHaveSlam	4 points  
BridgeHand	weHaveAFitIn	4 points  
BridgeHand	romanKeyCard	4 points  
BridgeHand	has2Clubs 	3 points  
Javadoc comments 3 points  

HandSimulator	% regular opening	3 points  
HandSimulator	% 1 No Trump opening	3 points  
HandSimulator	% balanced	3 points  
HandSimulator	Average sum of lengths of 2 longest suits	3 points  


Testing	Topic	Points  
sumOfLengthsOfTwoLongestSuits method	
On average, what do you expect this method to return? (roughly) 1 point    

Your program should include **javadoc comments for all the methods in the FirstLastBridgeHand class**, variables should have proper names, and style should be good (spacing, indentation, ..).  

**Testing**:  
You should test that your program produces the correct results, i.e. play several games of baseball yourself using your program.  

1. GitHub: Completed .java files (including comments).  
2. Moodle: Same as above.  