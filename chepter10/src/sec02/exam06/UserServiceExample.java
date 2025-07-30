package sec02.exam06;

public class UserServiceExample {
	
	public static void main(String[] args) throws InvalidAgeExceptiom{
		UserService service = new UserService();
		
		try {
			service.registerUser(10);
			service.registerUser(-5);
		} catch (InvalidAgeExceptiom e) {
			System.out.println("예외 발생: " + e.getMessage());
		} {
			
		}
		
	}

}
