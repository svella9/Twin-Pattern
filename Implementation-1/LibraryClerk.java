import java.util.*;

class LibraryClerk
{
	Library lib;
	LibraryClerk()
	{
		lib = Library.getInst();
	}
	
	void processItemIssue(String userid, String itemid)
	{
		if( lib.userTable.containsKey(userid) )
		{
			if( lib.itemTable.containsKey(itemid) && lib.itemTable.get(itemid).no_of_copy > 0 )
			{
				lib.userTable.get(userid).itemlist.add(itemid);
				lib.itemTable.get(itemid).no_of_copy -= 1;
				System.out.println(itemid + " item issued to " + userid);
			}
			else
			{
				System.out.println("Item not available..");
			}
		}
		else
		{
			System.out.println("User does not exists..");
		}
	}
	
	void processItemReturn(String userid, String itemid)
	{
		if( lib.userTable.containsKey(userid) )
		{
			if( lib.itemTable.containsKey(itemid) )
			{
				if( lib.userTable.get(userid).itemlist.contains(itemid) )
				{
					lib.userTable.get(userid).itemlist.contains(itemid);
					lib.itemTable.get(itemid).no_of_copy += 1;
					System.out.println(itemid + " item returned by " + userid);
				}
				else
				{
					System.out.println("User did not borrow the specified item..");
				}
			}
			else
			{
				System.out.println("Item with itemid "+itemid+" does not exists..");
			}
		}
		else
		{
			System.out.println("User does not exists..");
		}	
	}
}
