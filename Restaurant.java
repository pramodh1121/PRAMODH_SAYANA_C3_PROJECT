import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	//Select opening and closing time
	private static LocalTime opening_time=LocalTime.parse( "10:00" );
	private static LocalTime closing_time=LocalTime.parse( "21:30" );
	
	public List<String> getMenu() {
		List<String> list = new ArrayList<String>(List.of("Chicken pot pie","Mashed potatoes","Fried chicken","Burgers (with an option to add cheese/ bacon)",
				"Chicken soup","Meatloaf","Lasagna","Spaghetti with meatballs","Chicken burger","Chicken parmesan",
				"Chicken Pesto","Burger Sliders"));
		
		return list;
	}
	
	public boolean isOpen() {
		
		// get current time
		LocalTime now=LocalTime.now();
		
		System.out.println("Current time : "+now);
		
		//if current time is between opening and closing
		if(now.isAfter(opening_time) && now.isBefore(closing_time)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
