public class RestaurantService {
	private static String[] restaurant = {"Haldiram's","Gayatri Bhojnalaya","Naivedhyam","Veeraswami","Reddy’s Gokul Brindavan Restaurant",
											"Vishnuji Ki Rasoi","Barbecue Restaurant","The Breakfast Story","Ashoka Restaurant"};
	
	public String findRestaurantByName(String name) throws notFound {
		for(String s:restaurant) {
			if(s.contains(name)) {
				return s;
			}
		}
		throw new notFound("Restaurant not found");
		
	}
}

class notFound extends Exception{
	public notFound(String msg) {
		super(msg);
	}
