package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Mayur","Mohite");
		em1.setAlternateEmail("javacore@gmail.com");
		System.out.println(em1.getAlternateEmail());
		System.out.println(em1.showInfo());
	}

}
