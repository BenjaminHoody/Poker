

public class Card
	{
		private String rank;
		private String suit;
		private int value;

		
		public Card(String r, String s, int v)
		{
			rank = r;
			suit = s;
			value = v;
		}

		public String getRank()
			{
				return rank;
			}

		public void setRank(String rank)
			{
				this.rank = rank;
			}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}


		
		
		
		
	}
