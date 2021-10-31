package week1.day2;

public class CharUpperCase {

	public static void main(String[] args) {
		String str="Welcome";
		char[] charArray = str.toCharArray();
		int length=charArray.length;
		for(int i=0; i<length; i++)
		{
			if(i%2 !=0)
			{
				char uc=Character.toUpperCase(charArray[i]);
				System.out.println(uc);
			}
			else
			{
				System.out.println(charArray[i]);
			}
		}

	}

}
