
public class drive {

	public static void main(String[] args) {
		String a = "ROT13 is used in online forums as a means of hiding spoilers, punchlines, puzzle solutions, and offensive materials from the casual glance.";
		char[] b = new char[] {'a', 'b', 'c', 'd'};
		int[] c = tool.countOccurrences(a, b);
		System.out.println("Occurrence:");
		for(int i = 0; i < b.length; i++)
		{
			System.out.println(b[i] + " - " + c[i]);
		}		
		Rotate13 sample1 = new Rotate13("Why did the chicken cross the road?", false);
		System.out.println(sample1);
		System.out.println("***********Decrypt***********");
		System.out.println(sample1.decryption());
		System.out.println(sample1);
		System.out.println("***********Ecrypt***********");
		System.out.println(sample1.encryption());
		System.out.println(sample1);
		System.out.println("***********Ecrypt***********");
		System.out.println(sample1.encryption());
		System.out.println(sample1);
		System.out.println("***********Decrypt***********");
		System.out.println(sample1.decryption());
		System.out.println(sample1);
	}

}
