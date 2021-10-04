
public class Chip
	{
		private String color;
		private int value;
		
		public Chip(String c, int v)
		{
			color = c;
			value = v;
		}

		public String getColor()
			{
				return color;
			}

		public void setColor(String color)
			{
				this.color = color;
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