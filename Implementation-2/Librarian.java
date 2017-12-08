class Librarian
{
	Library lib;
	LibrarianClerk lc;
	LibrarianStaff ls;

	Librarian()
	{
		lib = Library.getInst();
		lc = new LibrarianClerk();
		ls = new LibrarianStaff();
	}

	class LibrarianClerk extends LibraryClerk
	{	

	}


	class LibrarianStaff extends LibraryStaff
	{

	}

	//Library Clerk's funcionalities
	void processItemIssue(String userid, String itemid)
	{
		lc.processItemIssue(userid, itemid);
	}

	void processItemReturn(String userid, String itemid)
	{
		lc.processItemReturn(userid, itemid);
	}

	//Library Staff's functionalities
	void addNewUser(String userid, String name)
	{
		ls.addNewUser(userid, name);
	}

	void removeUser(String userid)
	{
		ls.removeUser(userid);
	}

	void addNewItem(String itemid, String name, int copies)
	{
		ls.addNewItem(itemid, name, copies);
	}

	void deleteItem(String itemid)
	{
		ls.deleteItem(itemid);
	}

	
	//Librarian's functionalities
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
	
	
	void viewUserDetails(){
		lib.viewUserDetails();
		//this.lib.viewUserDetais();
	}
	
	
	void viewItemDetails(){
		System.out.println("Hi");
		lib.viewItemDetails();
	}
	
	
	void updateUserDetails()
	{
	}
	
	void updateItemDetails()
	{
	}	
}