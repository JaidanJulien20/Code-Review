package DeckOfCards;

// Credits to Dave Mikesell

public class ShuffledDeck {

	public static void main(String[] args) {
		 
		String[] suit = {"Spades","Diamonds","Hearts","Clubs"};
		String[] rank = {"2","3","4","5","6","7","8","9","10","Queen","Jack","King","Ace"};
	    String[] deck =  new String[52];
			
	        
	      for (int n = 0; n < deck.length; n++) {      
			 deck[n] = rank[n%13] + " " + suit[n/13];	         
	      }
	      
	      for (int n = 0; n < deck.length;n++) {
	    	   int index = (int)(Math.random()*deck.length);
	    	   
	    	   if(n == index) {
	    	      continue;
	    	   }   
	    	   
	    	   String temp = deck[n];
	    	   deck[n] = deck[index];
	    	   deck [index] = temp;	    	  
	      }
	     
	      for(String u: deck) {
	    	  System.out.println(u);
	      }
}
}
