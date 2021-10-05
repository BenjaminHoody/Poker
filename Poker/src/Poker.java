import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class Poker
	{
		static ArrayList<Card> playerOneHand = new ArrayList<Card>();
		static ArrayList<Card> playerTwoHand = new ArrayList<Card>();
		
		static boolean checkingForHand = true;
		static boolean checkingForHand2 = true;
		static int playerOneWinningPoints = 0;
		static int playerTwoWinningPoints = 0;
		static Card highestCard;
		static Card highestCard2;

		
		public static void main(String[] args)
			{			
        Deck.fillDeck();
				Deck.shuffle();
				dealCards();
				sortPlayerOneHand();
				displayHand();
				checkForWinner();
			}
		
		public static void dealCards()
			{
			
				for(int i = 0; i < 5; i++)
        	{
        		playerOneHand.add(Deck.deck.get(0));
        		Deck.deck.remove(0);
        	}
			
				for(int i = 0; i < 5; i++)
					{
						playerTwoHand.add(Deck.deck.get(0));
						Deck.deck.remove(0);
					}
			}
		
    public static void displayHand()
    	{
        System.out.println("Player 1 Hand \n");
        for (Card c : playerOneHand)
        {
            System.out.println(c.getRank() + " of " + c.getSuit());
        }
        
        checkForWinningHands();

        System.out.println("\nPlayer 2 Hand \n");

        for (Card i : playerTwoHand)
        {
            System.out.println(i.getRank() + " of " + i.getSuit());
        }
        
        checkForWinningHands2();
    	}
    
    public static void sortPlayerOneHand()
    {   	
    	Collections.sort(playerOneHand, new CardSorter());
    	Collections.sort(playerTwoHand, new CardSorter());
    }
    
    public static void checkForWinner()
    {
    	if(playerOneWinningPoints>playerTwoWinningPoints)
    		{
    			System.out.println("\n\n\nPlayer One wins this hand!!!");
    		}
    	
    	if(playerOneWinningPoints<playerTwoWinningPoints)
    		{
    			System.out.println("\n\n\nPlayer Two wins this hand!!!");
    		}
    	
    	
    	if(playerOneWinningPoints==playerTwoWinningPoints)
    		{
    			
    			
    					if(highestCard.getValue() > highestCard2.getValue())
    						{
    							System.out.println("\n\n\nPlayer One wins this hand!!!");
    						}
    					
    					if(highestCard.getValue() < highestCard2.getValue())
    						{
    							System.out.println("\n\n\nPlayer Two wins this hand!!!");
    						}
    					
    					if(highestCard.getValue() == highestCard2.getValue())
    						{
    							System.out.println("\n\n\nThis hand is a draw!");
    						}
    		}
    	
    	
    }
    
    public static void checkForWinningHands()
      {   	
      	checkingForHand = true;
      	
      	
      	if(checkingForHand)
      		{
      			checkForRoyalFlush();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForStraightFlush();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForFourOfKind();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForFullHouse();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForFlush();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForStraight();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForThreeOfKind();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForTwoPair();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForPair();
      		}
      	
      	if(checkingForHand)
      		{
      			checkForHighCard();
      		}
      	
      }
    
    public static void checkForWinningHands2()
      {   	
      	checkingForHand2 = true;
      	
      	
      	if(checkingForHand2)
      		{
      			checkForRoyalFlush2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForStraightFlush2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForFourOfKind2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForFullHouse2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForFlush2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForStraight2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForThreeOfKind2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForTwoPair2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForPair2();
      		}
      	
      	if(checkingForHand2)
      		{
      			checkForHighCard2();
      		}
      	
      }
    
    public static void checkForRoyalFlush()
    	{		

    						if(playerOneHand.get(0).getSuit() == playerOneHand.get(1).getSuit() 
    								&& playerOneHand.get(0).getSuit() == playerOneHand.get(2).getSuit()
    								&& playerOneHand.get(0).getSuit() == playerOneHand.get(3).getSuit()
    								&& playerOneHand.get(0).getSuit() == playerOneHand.get(4).getSuit())
    							{
    								if(playerOneHand.get(0).getValue() == 14 
        								&& playerOneHand.get(1).getValue() == 13
        								&& playerOneHand.get(2).getValue() == 12
        								&& playerOneHand.get(3).getValue() == 11
        								&& playerOneHand.get(4).getValue() == 10)
        							{
        								System.out.println("\nRoyal Flush");
        								checkingForHand = false;
        								playerOneWinningPoints = 10;
        							}
    							}
    			
    	}   
    
    public static void checkForStraightFlush()
    	{		

    						if(playerOneHand.get(0).getValue() == playerOneHand.get(1).getValue()+1 
    								&& playerOneHand.get(1).getValue() == playerOneHand.get(2).getValue()+1
    								&& playerOneHand.get(2).getValue() == playerOneHand.get(3).getValue()+1
    								&& playerOneHand.get(3).getValue() == playerOneHand.get(4).getValue()+1)
    							{
    								if(playerOneHand.get(0).getSuit() == playerOneHand.get(1).getSuit() 
        								&& playerOneHand.get(0).getSuit() == playerOneHand.get(2).getSuit()
        								&& playerOneHand.get(0).getSuit() == playerOneHand.get(3).getSuit()
        								&& playerOneHand.get(0).getSuit() == playerOneHand.get(4).getSuit())
        							{
        								System.out.println("\nStraight Flush");
        								checkingForHand = false;
        								playerOneWinningPoints = 9;
        							}
    							}
    			
    	} 
    
    public static void checkForFourOfKind()
    	{		
    		for(int i = 0; i < playerOneHand.size()-3; i++)
    			{
    						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue() 
    								&& playerOneHand.get(i).getValue() == playerOneHand.get(i+2).getValue()
    								&&  playerOneHand.get(i).getValue() == playerOneHand.get(i+3).getValue())
    							{
    								System.out.println("\nFour of a Kind of " + playerOneHand.get(i).getRank() + "s!");
    								checkingForHand = false;
    								playerOneWinningPoints = 8;
    							}
    			}
    	}
    
    public static void checkForFullHouse()
    	{	
    		
    						if(playerOneHand.get(0).getValue() == playerOneHand.get(1).getValue() && playerOneHand.get(0).getValue() == playerOneHand.get(2).getValue())
    							{
    								
    								if(playerOneHand.get(3).getValue() == playerOneHand.get(4).getValue())
    									{
    										System.out.println("\nFull House");
    										checkingForHand = false;
    										playerOneWinningPoints = 7;
    									}
    							}
    						
    						if(playerOneHand.get(2).getValue() == playerOneHand.get(3).getValue() && playerOneHand.get(2).getValue() == playerOneHand.get(4).getValue())
    							{
    								
    								if(playerOneHand.get(0).getValue() == playerOneHand.get(1).getValue())
    									{
    										System.out.println("\nFull House");
    										checkingForHand = false;
    										playerOneWinningPoints = 7;
    									}
    							}

    		
    		
    	}
    
    public static void checkForFlush()
    	{		

    						if(playerOneHand.get(0).getSuit() == playerOneHand.get(1).getSuit() 
    								&& playerOneHand.get(0).getSuit() == playerOneHand.get(2).getSuit()
    								&& playerOneHand.get(0).getSuit() == playerOneHand.get(3).getSuit()
    								&& playerOneHand.get(0).getSuit() == playerOneHand.get(4).getSuit())
    							{
    								System.out.println("\nFlush");
    								checkingForHand = false;
    								playerOneWinningPoints = 6;
    							}
    			
    	}  
    
    public static void checkForStraight()
    	{		

    						if(playerOneHand.get(0).getValue() == playerOneHand.get(1).getValue()+1 
    								&& playerOneHand.get(1).getValue() == playerOneHand.get(2).getValue()+1
    								&& playerOneHand.get(2).getValue() == playerOneHand.get(3).getValue()+1
    								&& playerOneHand.get(3).getValue() == playerOneHand.get(4).getValue()+1)
    							{
    								System.out.println("\nStraight");
    								checkingForHand = false;
    								playerOneWinningPoints = 5;
    							}
    			
    	}   

    public static void checkForThreeOfKind()
    	{		
    		for(int i = 0; i < playerOneHand.size()-2; i++)
    			{
    						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue() && playerOneHand.get(i).getValue() == playerOneHand.get(i+2).getValue())
    							{
    								System.out.println("\nThree of a Kind of " + playerOneHand.get(i).getRank() + "s!");
    								checkingForHand = false;
    								highestCard = playerTwoHand.get(i);
    								playerOneWinningPoints = 4;
    							}
    			}
    	}
    
    public static void checkForTwoPair()
    	{	
    		
    		int pairLocation = 0;
    		
    		for(int i = 0; i < playerOneHand.size()-3; i++)
    			{
    						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue())
    							{
    								
    								pairLocation = i+1;
    							}
    			}
    		
    		if(pairLocation == 2 && playerOneHand.get(3).getValue() == playerOneHand.get(4).getValue())
    			{
    				System.out.println("\nTwo pair of " + playerOneHand.get(1).getRank() + "s and " + playerOneHand.get(3).getRank() + "s!");
    				checkingForHand = false;
    				playerOneWinningPoints = 3;
    			}
    		
    		if(pairLocation == 1)
    			{
    				for(int i = 2; i < playerOneHand.size()-1; i++)
        			{
        						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue())
        							{
        								System.out.println("\nTwo pair of " + playerOneHand.get(1).getRank() + "s and " + playerOneHand.get(i).getRank() + "s!");
        								checkingForHand = false;
        								playerOneWinningPoints = 3;
        							}
        			}
    			}
    		
    		
    	}
    
    public static void checkForPair()
    	{		
    		for(int i = 0; i < playerOneHand.size()-1; i++)
    			{
    						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue())
    							{
    								System.out.println("\npair of " + playerOneHand.get(i).getRank() + "s!");
    								checkingForHand = false;
    								highestCard = playerOneHand.get(i);
    								playerOneWinningPoints = 2;
    							}
    			}
    	}
    
    public static void checkForHighCard()
    	{		
    		
    		highestCard = playerOneHand.get(0);

    		for(int i = 0; i < playerOneHand.size()-1; i++)
    			{
    						if(playerOneHand.get(i).getValue() > highestCard.getValue())
    							{
    								highestCard = playerOneHand.get(i);
    							}
    			}
    		
    		System.out.println("\nHigh Card is a " + highestCard.getRank() + " of " + highestCard.getSuit());
    		checkingForHand = false;
    		playerOneWinningPoints = 1;
    							
    	}  

    public static void checkForRoyalFlush2()
    	{		

    						if(playerTwoHand.get(0).getSuit() == playerTwoHand.get(1).getSuit() 
    								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(2).getSuit()
    								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(3).getSuit()
    								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(4).getSuit())
    							{
    								if(playerTwoHand.get(0).getValue() == 14 
        								&& playerTwoHand.get(1).getValue() == 13
        								&& playerTwoHand.get(2).getValue() == 12
        								&& playerTwoHand.get(3).getValue() == 11
        								&& playerTwoHand.get(4).getValue() == 10)
        							{
        								System.out.println("\nRoyal Flush");
        								checkingForHand2 = false;
        								playerTwoWinningPoints = 10;
        							}
    							}
    			
    	}   
    
    public static void checkForStraightFlush2()
    	{		

    						if(playerTwoHand.get(0).getValue() == playerTwoHand.get(1).getValue()+1 
    								&& playerTwoHand.get(1).getValue() == playerTwoHand.get(2).getValue()+1
    								&& playerTwoHand.get(2).getValue() == playerTwoHand.get(3).getValue()+1
    								&& playerTwoHand.get(3).getValue() == playerTwoHand.get(4).getValue()+1)
    							{
    								if(playerTwoHand.get(0).getSuit() == playerTwoHand.get(1).getSuit() 
        								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(2).getSuit()
        								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(3).getSuit()
        								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(4).getSuit())
        							{
        								System.out.println("\nStraight Flush");
        								checkingForHand2 = false;
        								playerTwoWinningPoints = 9;
        							}
    							}
    			
    	} 
    
    public static void checkForFourOfKind2()
    	{		
    		for(int i = 0; i < playerTwoHand.size()-3; i++)
    			{
    						if(playerTwoHand.get(i).getValue() == playerTwoHand.get(i+1).getValue() 
    								&& playerTwoHand.get(i).getValue() == playerTwoHand.get(i+2).getValue()
    								&&  playerTwoHand.get(i).getValue() == playerTwoHand.get(i+3).getValue())
    							{
    								System.out.println("\nFour of a Kind of " + playerTwoHand.get(i).getRank() + "s!");
    								checkingForHand2 = false;
    								playerTwoWinningPoints = 8;
    							}
    			}
    	}
    
    public static void checkForFullHouse2()
    	{	
    		
    						if(playerTwoHand.get(0).getValue() == playerTwoHand.get(1).getValue() && playerTwoHand.get(0).getValue() == playerTwoHand.get(2).getValue())
    							{
    								
    								if(playerTwoHand.get(3).getValue() == playerTwoHand.get(4).getValue())
    									{
    										System.out.println("\nFull House");
    										checkingForHand2 = false;
    										playerTwoWinningPoints = 7;
    									}
    							}
    						
    						if(playerTwoHand.get(2).getValue() == playerTwoHand.get(3).getValue() && playerTwoHand.get(2).getValue() == playerTwoHand.get(4).getValue())
    							{
    								
    								if(playerTwoHand.get(0).getValue() == playerTwoHand.get(1).getValue())
    									{
    										System.out.println("\nFull House");
    										checkingForHand2 = false;
    										playerTwoWinningPoints = 7;
    									}
    							}

    		
    		
    	}
    
    public static void checkForFlush2()
    	{		

    						if(playerTwoHand.get(0).getSuit() == playerTwoHand.get(1).getSuit() 
    								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(2).getSuit()
    								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(3).getSuit()
    								&& playerTwoHand.get(0).getSuit() == playerTwoHand.get(4).getSuit())
    							{
    								System.out.println("\nFlush");
    								checkingForHand2 = false;
    								playerTwoWinningPoints = 6;
    							}
    			
    	}  
    
    public static void checkForStraight2()
    	{		

    						if(playerTwoHand.get(0).getValue() == playerTwoHand.get(1).getValue()+1 
    								&& playerTwoHand.get(1).getValue() == playerTwoHand.get(2).getValue()+1
    								&& playerTwoHand.get(2).getValue() == playerTwoHand.get(3).getValue()+1
    								&& playerTwoHand.get(3).getValue() == playerTwoHand.get(4).getValue()+1)
    							{
    								System.out.println("\nStraight");
    								checkingForHand2 = false;
    								playerTwoWinningPoints = 5;
    							}
    			
    	}   

    public static void checkForThreeOfKind2()
    	{		
    		for(int i = 0; i < playerTwoHand.size()-2; i++)
    			{
    						if(playerTwoHand.get(i).getValue() == playerTwoHand.get(i+1).getValue() && playerTwoHand.get(i).getValue() == playerTwoHand.get(i+2).getValue())
    							{
    								System.out.println("\nThree of a Kind of " + playerTwoHand.get(i).getRank() + "s!");
    								checkingForHand2 = false;
    								highestCard2 = playerTwoHand.get(i);
    								playerTwoWinningPoints = 4;
    							}
    			}
    	}
    
    public static void checkForTwoPair2()
    	{	
    		
    		int pairLocation = 0;
    		
    		for(int i = 0; i < playerTwoHand.size()-3; i++)
    			{
    						if(playerTwoHand.get(i).getValue() == playerTwoHand.get(i+1).getValue())
    							{
    								
    								pairLocation = i+1;
    							}
    			}
    		
    		if(pairLocation == 2 && playerTwoHand.get(3).getValue() == playerTwoHand.get(4).getValue())
    			{
    				System.out.println("\nTwo pair of " + playerTwoHand.get(1).getRank() + "s and " + playerTwoHand.get(3).getRank() + "s!");
    				checkingForHand2 = false;
    				playerTwoWinningPoints = 3;
    			}
    		
    		if(pairLocation == 1)
    			{
    				for(int i = 2; i < playerTwoHand.size()-1; i++)
        			{
        						if(playerTwoHand.get(i).getValue() == playerTwoHand.get(i+1).getValue())
        							{
        								System.out.println("\nTwo pair of " + playerTwoHand.get(1).getRank() + "s and " + playerTwoHand.get(i).getRank() + "s!");
        								checkingForHand2 = false;
        								playerTwoWinningPoints = 3;
        							}
        			}
    			}
    		
    		
    	}
    
    public static void checkForPair2()
    	{		
    		for(int i = 0; i < playerTwoHand.size()-1; i++)
    			{
    						if(playerTwoHand.get(i).getValue() == playerTwoHand.get(i+1).getValue())
    							{
    								System.out.println("\npair of " + playerTwoHand.get(i).getRank() + "s!");
    								checkingForHand2 = false;
    								highestCard2 = playerTwoHand.get(i);
    								playerTwoWinningPoints = 2;
    							}
    			}
    	}
    
    public static void checkForHighCard2()
    	{		
    		
    		highestCard2 = playerTwoHand.get(0);

    		for(int i = 0; i < playerTwoHand.size()-1; i++)
    			{
    						if(playerTwoHand.get(i).getValue() > highestCard2.getValue())
    							{
    								highestCard2 = playerTwoHand.get(i);
    							}
    			}
    		
    		System.out.println("\nHigh Card is a " + highestCard2.getRank() + " of " + highestCard2.getSuit());
    		checkingForHand2 = false;
    		
    		playerTwoWinningPoints = 1;
    							
    	}  
    
    
	}
