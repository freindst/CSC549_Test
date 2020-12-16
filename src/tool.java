
public class tool {
	public static int[] countOccurrences(String input, char[]salt)
	{
		int len = salt.length;
		int result[] = new int[len];
		for(int i = 0; i < input.length(); i++)
		{
			for(int j = 0; j < len; j++)
			{
				char c = salt[j];
				if (input.charAt(i) == c)
				{
					result[j] = result[j] + 1;
				}
			}
		}		
		return result;
	}
}
