package algorithm;

public class NumberOf1Bits {

	public int hammingWeight(int n) {

		int count = 0;
		
		while(!(n==0)) {
			n &= n-1;
			count++;
		}
		
		return count;
	}
}
