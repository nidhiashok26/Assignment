
public class ReverseCharArray {
	
	
	public ReverseCharArray () {
		char[] cArr= {'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L'};
		int i = cArr.length - 1, j = 0;
		char[] cRev = new char[cArr.length];
		while(i >= 0){
		     cRev[j] = cArr[i];
		     i--;
		     j++;
		}
		for (char c : cRev){
		     System.out.print(c);
		}
	}

	public static void main(String[] args) {
		
		new ReverseCharArray();
	}

}
