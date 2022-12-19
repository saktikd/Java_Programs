package revision_35_Programs;

public class P_036_wap_duplicate_string {

	public static void main(String[] args) {

		
        String s = "bikerboyk";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					System.out.println(s.charAt(i));
			}
		}
	}

}
