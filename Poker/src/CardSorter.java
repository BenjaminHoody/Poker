import java.util.Comparator;

public class CardSorter implements Comparator<Card>
	{
	
		public int compare (Card c1, Card c2)
		{
			if(c1.getValue() < c2.getValue())
				{
						return 1;
				}
				else
					{
						return -1;
					}
		}
	}
