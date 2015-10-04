
public class isPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPower(2));
		
		
	}

	public static boolean isPower(int n){
		System.out.println(Integer.toBinaryString(~n));
		return n == 1 + ~n;
	}
}
