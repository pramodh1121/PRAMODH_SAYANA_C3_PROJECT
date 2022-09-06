import java.util.Scanner;

public class RestaurantServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		RestaurantService service=new RestaurantService();
		System.out.print("Enter the name of restaurant to search : ");
		String name=sc.nextLine();
		try {
			System.out.println("Restaurant Name : "+service.findRestaurantByName(name));
		}
		catch(notFound ex){
			System.out.println(ex.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
