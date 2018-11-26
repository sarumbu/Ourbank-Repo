
public class TestReverseNumber {
	
	

	    public static void main(String[] args) {

	        int num = 1234;
	        double reversed = 0;

	        while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);
	    }

}
