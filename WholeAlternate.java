import java.util.ArrayList;
import java.util.List;

public class WholeAlternate {

	public static void main(String[] args) {
		//List<Integer> num1List = new ArrayList<>();
		Integer [] num1 = {8,9,10,11,12,13};
		for (Integer int1: num1) {
			System.out.print(int1 + ",");
		}
		System.out.println();
		//List<Integer> num2List = new ArrayList<>();
		Integer [] num2 = {6,5,4,3,2,1};
		for (Integer int2 : num2) {
			System.out.print(int2+ ",");
		}
		System.out.println();
		for(int i = 0;i<num1.length;i++)
		{
			System.out.print(num1[i]+",");
			System.out.print(num2[i]+",");
		}

	}

}
