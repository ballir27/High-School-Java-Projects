
public class Hi {
	public static void main (String[]args){
		int n = 50;
		int m = 3;
		int fals = 0;
	while (m<=n){
		for(int i=2;i<m;i++) {
			if(m%i==0)
				fals = m;
			if (m!=fals)
				System.out.println(m);
			

		}
m=m+1;
		
	}
	
	}
}
