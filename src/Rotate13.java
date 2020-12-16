
public class Rotate13 {
	private String text;
	
	private Boolean isEncrypted;
	
	private static int lowerA = 97;
	private static int lowerZ = 122;
	private static int upperA = 65;
	private static char upperZ = 90;
	
	public Rotate13(String text, Boolean isEncrypted)
	{
		this.text = text;
		this.isEncrypted = false;
	}
	
	private void encrypt()
	{
		if (!this.isEncrypted)
		{
			this.text = rotate();
			this.isEncrypted = true;
		}		
	}
	
	private void decrypt()
	{
		if (this.isEncrypted)
		{
			this.text = rotate();
			this.isEncrypted = false;
		}
	}
	
	public String rotate()
	{
		String result = "";
		for(int i = 0; i < this.text.length(); i++)
		{
			char c = text.charAt(i);
			int ascii = (int)(c);
			if (ascii >= upperA && ascii <= upperZ)
			{
				if (ascii + 13 <= upperZ)
				{
					result = result + (char)(ascii + 13);
				}
				else
				{
					result = result + (char)(ascii - 13);
				}
			}
			else if (ascii >= lowerA && ascii <= lowerZ)
			{
				if (ascii + 13 <= lowerZ)
				{
					result = result + (char)(ascii + 13);
				}
				else
				{
					result = result + (char)(ascii - 13);
				}
			}
			else
			{
				result = result + c;
			}
		}
		return result;
	}
	
	public String encryption()
	{
		encrypt();
		return this.text;
	}
	
	public String decryption()
	{
		decrypt();
		return this.text;
	}
	
	public String toString()
	{
		String result = "";
		if (this.isEncrypted)
		{
			result = result + "Text has been encrpted: ";
		}
		else
		{
			result = result + "Text has not been encrypted: ";
		}
		result = result + this.text;
		return result;
	}
}
