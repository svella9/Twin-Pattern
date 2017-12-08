import java.util.*;
class LibraryStaff
{
	Library lib;
	LibraryStaff()
	{
		//System.out.println("Hi");
		lib = Library.getInst();
	}
	
	void addNewUser(String userid, String name)
	{	
		if( !lib.userTable.containsKey(userid) )
		{
			User user = new User(userid,name);
			lib.userTable.put(userid, user);
			System.out.println(name +" added to the system successfully..");	
		}
	}
	
	void removeUser(String userid)
	{
		if( lib.userTable.containsKey(userid) )
		{
			User u = lib.userTable.remove(userid);
			System.out.println(u.name +" removed from the system..");
		}
	}
	
	void addNewItem(String itemid, String name, int copies)
	{
		if( !lib.itemTable.containsKey(itemid) )
		{
			Item item = new Item(itemid, name, copies);
			lib.itemTable.put(itemid, item);
			System.out.println(name + " added to the system successfully...");
		}
	}
	
	void deleteItem(String itemid)
	{
		if( lib.itemTable.containsKey(itemid) )
		{
			Item it = lib.itemTable.remove(itemid);
			System.out.println(it.name + " removed from the system..");
		}
	}
}
