class LibrarianClerk extends LibraryClerk
{
	Library lib;
	LibrarianStaff twin;

	LibrarianClerk()
	{
		lib = Library.getInst();
	}
	
	void getUserDetails(String userid)
	{
		if( lib.userTable.containsKey(userid) )
		{
			User u = lib.userTable.get(userid);
			System.out.println("User Name: " + u.name);
			System.out.println("Items borrowed: ");
			for(int i = 0; i < u.itemlist.size(); ++i)
			{
				System.out.println("\t " + u.itemlist.get(i));
			}
		}
		else
		{
			System.out.println("User does not exists..");
		}

	}
	
	void getItemDetails(String itemid)
	{
		if( lib.itemTable.containsKey(itemid) )
		{
			Item it = lib.itemTable.get(itemid);
			System.out.println("Item Name: " + it.name);
			System.out.println("No. of copies: " + it.no_of_copy);
		}
		else
		{
			System.out.println("Item does not exists..");
		}
	}
	
	void updateUserDetails()
	{
	}
	
	void updateItemDetails()
	{
	}
		
	void waiveFine(String userid)
	{
		if( lib.userTable.containsKey(userid) )
		{
			lib.userTable.get(userid).fine = 0;
			System.out.println("Fine waived..");
		}
		else
		{
			System.out.println("User does not exists..");
		}
	}
	
}