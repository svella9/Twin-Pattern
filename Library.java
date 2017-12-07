import java.util.HashMap;
import java.util.Map;

//Singleton class
class Library
{
	static Library obj;
	
	HashMap<String, User> userTable;
	HashMap<String, Item> itemTable;
	
	private Library()
	{
		userTable = new HashMap<>();
		itemTable = new HashMap<>();
	}
	
	static Library getInst()
	{
		if(obj != null)
		{
			obj = new Library();
		}
		return obj;
	}
}