import java.util.Arrays;

public class RestaurantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant rest=new Restaurant();
		System.out.println("Menu : "+rest.getMenu());
		
		if(rest.isOpen()==true) {
			System.out.println("Restaurant is open .");
		}
		else {
			System.out.println("Restaurant is closed");
		}
		
	}

}
