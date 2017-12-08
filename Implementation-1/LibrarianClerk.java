class LibrarianClerk extends LibraryClerk
{
	Library lib;	// why do u need this? parent already has lib, child can use that
					// I assumed each person would have a lib obj through which he can access the tables.
	
	static LibrarianStaff twin;

	LibrarianClerk(){
		
		lib = Library.getInst();
	}
	
	void create(){
		if(twin == null)
			twin = new LibrarianStaff(); 
	}
	
	void addNewUser(String userid, String name){
		create();
		if(twin == null)
			System.out.println("Null Pointer\n");
		twin.addNewUser(userid, name);
	}
	
	void removeUser(String userid){
		create();
		twin.removeUser(userid);
	}
	
	void addNewItem(String itemid, String name, int copies){
		create();
		twin.addNewItem(itemid,name,copies);
	}
	
	void deleteItem(String itemid){
		create();
		twin.deleteItem(itemid);
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
		System.out.println("Hello");
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
