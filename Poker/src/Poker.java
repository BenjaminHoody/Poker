import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class Poker
	{
		static ArrayList<Card> playerOneHand = new ArrayList<Card>();
		static ArrayList<Card> playerTwoHand = new ArrayList<Card>();
		
		public static void main(String[] args)
			{			
        Deck.fillDeck();
				Deck.shuffle();
				dealCards();
				sortPlayerOneHand();
				displayHand();
				checkForTwoPair();
				checkForFullHouse();
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

//        System.out.println("\nPlayer 2 Hand \n");
//
//        for (Card i : playerTwoHand)
//        {
//            System.out.println(i.getRank() + " of " + i.getSuit());
//        }
    	}
    
    public static void sortPlayerOneHand()
    {   	
    	Collections.sort(playerOneHand, new CardSorter());
    	Collections.sort(playerTwoHand, new CardSorter());
    }
    

    
    
    
    
 
    
    public static void checkForFourOfKind()
    	{		
    		for(int i = 0; i < playerOneHand.size()-3; i++)
    			{
    						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue() 
    								&& playerOneHand.get(i).getValue() == playerOneHand.get(i+2).getValue()
    								&&  playerOneHand.get(i).getValue() == playerOneHand.get(i+3).getValue())
    							{
    								System.out.println("\nFour of a Kind");
    							}
    			}
    	}
    
    public static void checkForFullHouse()
    	{	
    		
    		int pairLocation = 0;
    		
    		for(int i = 0; i < playerOneHand.size()-3; i++)
    			{
    						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue())
    							{
    								
    								pairLocation = i+1;
    							}
    			}
    		
    		
    		if(pairLocation == 1)
    			{
    				for(int i = 2; i < playerOneHand.size()-2; i++)
        			{
        						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue() && playerOneHand.get(i).getValue() == playerOneHand.get(i+2).getValue())
        							{
        								System.out.println("\nFull House");
        							}
        			}
    			}
    		
    		if(pairLocation == 3)
    			{
    				for(int i = 0; i < playerOneHand.size()-2; i++)
        			{
        						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue() && playerOneHand.get(i).getValue() == playerOneHand.get(i+2).getValue())
        							{
        								System.out.println("\nFull House");
        							}
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
    							}
    			
    	}   

    public static void checkForThreeOfKind()
    	{		
    		for(int i = 0; i < playerOneHand.size()-2; i++)
    			{
    						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue() && playerOneHand.get(i).getValue() == playerOneHand.get(i+2).getValue())
    							{
    								System.out.println("\nThree of a Kind");
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
    				System.out.println("\nTwo pair");
    			}
    		
    		if(pairLocation == 1)
    			{
    				for(int i = 2; i < playerOneHand.size()-1; i++)
        			{
        						if(playerOneHand.get(i).getValue() == playerOneHand.get(i+1).getValue())
        							{
        								System.out.println("\nTwo pair");
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
    								System.out.println("\npair");
    							}
    			}
    	}
    
    public static void checkForHighCard()
    	{		
    		
    		Card highestCard = playerOneHand.get(0);

    		for(int i = 0; i < playerOneHand.size()-1; i++)
    			{
    						if(playerOneHand.get(i).getValue() > highestCard.getValue())
    							{
    								highestCard = playerOneHand.get(i);
    							}
    			}
    		
    		System.out.println("\nHigh Card is a " + highestCard.getRank() + " of " + highestCard.getSuit());
    							
    	}  

	}
