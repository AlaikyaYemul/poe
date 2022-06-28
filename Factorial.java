public class Factorial {
	
	public static void main(String[] args) {
        int n = 7;
        int res=1;
        for(int i=n;i>0;i--) {
        	res=res*i;
        }
        System.out.println("Factorial of 7 is: "+res);    
        
	}
	
}
