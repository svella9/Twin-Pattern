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
		//System.out.println("Singleton");
		userTable = new HashMap<String, User>();
		itemTable = new HashMap<String, Item>();
	}
	
	static Library getInst()
	{
		if(obj == null)
		{
			obj = new Library();
		}
		return obj;
	}
	
	public void viewUserDetails(){
		userTable.forEach((k,v) -> System.out.println(k+" "+v.name));
	}
	
	
	public void viewItemDetails(){
		itemTable.forEach((k,v) -> System.out.println(k+" "+v.name));
	}
}
