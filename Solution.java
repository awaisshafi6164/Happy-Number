
public class Solution {
	public boolean happy(int n) {
		
		if(n<10)
			if(n==1||n==7)
				return true;
			else 
				return false;
		
		int b, sum=0;
		while(n>0) {
			b=n%10;
			sum+=b*b;
			n/=10;
		}
		return happy(sum);
	}
}
