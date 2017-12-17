import java.util.*;

class Client
{
	public static void main(String args [])
	{
	/*	Librarian librarian = new Librarian();
		librarian.addNewUser("101","Vijay");
		librarian.addNewUser("102","Ajay");

		librarian.viewUserDetails();
		librarian.removeUser("102");
		librarian.viewUserDetails();

		librarian.addNewItem("201","GOF",10);
		librarian.addNewItem("202","PPL",15);
		
		librarian.viewItemDetails();
		librarian.deleteItem("204");
		librarian.viewItemDetails();

		librarian.processItemIssue("101","201");
		librarian.processItemReturn("101","201");

		//testing subclassing
		Librarian lcm = new LibraryManager();
		LibraryManager lmanager = (LibraryManager)lcm;
		lmanager.viewUserDetails();
		lmanager.addNewStaff();
    	lmanager.addNewUser("087","Dhamo");
      	lmanager.viewUserDetails();
    */

      	while(true)
      	{
      		System.out.println("1. Library Clerk");
      		System.out.println("2. Library Staff");
      		System.out.println("3. Librarian");
      		System.out.println("4. Library Manager");
      		System.out.println("0. Exit");

      		Scanner in = new Scanner(System.in);
      		int choice = in.nextInt();
      		switch(choice)
      		{
      			case 1: libraryClerk();
      					break;

      			case 2: libraryStaff();
      					break;

				case 3: librarian();
      					break;

      			case 4: libraryManager();
      					break;
      			
      			case 0: System.exit(0);

      			default: System.out.println("Wrong choice");
      		}
      	}

	}

	public static void libraryClerk()
	{
		System.out.println("Hello Library Clerk!");
		LibraryClerk libclerk = new LibraryClerk();
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Process Item Issue");
			System.out.println("2. Process Item Return");
			System.out.println("0. Logout");
			int choice = in.nextInt();
			String uid;
			String iid;

			if(choice == 0)
				break;

			switch(choice)
			{
				case 1: System.out.println("Enter user id and item id");
						uid = in.next();
						iid = in.next();
						libclerk.processItemIssue(uid, iid);
						break;

				case 2: System.out.println("Enter user id and item id");
						uid = in.next();
						iid = in.next();
						libclerk.processItemIssue(uid, iid);
						break;

				default: System.out.println("Wrong choice");
			}
		}
	}

	public static void libraryStaff()
	{
		System.out.println("Hello Library Staff!");
		LibraryStaff libstaff = new LibraryStaff();
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add New User");
			System.out.println("2. Remove User");
			System.out.println("3. Add New Item");
			System.out.println("4. Remove Item");
			System.out.println("0. Logout");

			int choice = in.nextInt();
			String uid;
			String iid;
			String name;

			if(choice == 0)
				break;
			switch(choice)
			{
				case 1: System.out.println("Enter uid and name");
						uid = in.next();
						name = in.next();
						libstaff.addNewUser(uid, name);
						break;

				case 2:	System.out.println("Enter uid");
						uid = in.next();
						libstaff.removeUser(uid);
						break;

				case 3:	System.out.println("Enter item id, name, copies available");
						iid = in.next();
						name = in.next();
						int copies = in.nextInt();
						libstaff.addNewItem(iid, name, copies);
						break;

				case 4: System.out.println("Enter item id");
						iid = in.next();
						libstaff.deleteItem(iid);
						break;
				default: System.out.println("Wrong choice.");
			}

		}
	}

	public static void librarian()
	{
		System.out.println("Hello Librarian!");
		Librarian libran = new Librarian();
		Scanner in = new Scanner(System.in);

		while(true)
		{
			System.out.println("1. Process Item Issue");
			System.out.println("2. Process Item Return");
			System.out.println("3. Add New User");
			System.out.println("4. Remove User");
			System.out.println("5. Add New Item");
			System.out.println("6. Remove Item");
			System.out.println("7. Get User details");
			System.out.println("8. Get Item details");
			System.out.println("9. Waive Fine");
			System.out.println("0. Logout");

			int choice = in.nextInt();
			if(choice  == 0)
				break;

			String uid, iid, name;

			switch(choice)
			{
				case 1: System.out.println("Enter user id and item id");
						uid = in.next();
						iid = in.next();
						libran.processItemIssue(uid, iid);
						break;

				case 2: System.out.println("Enter user id and item id");
						uid = in.next();
						iid = in.next();
						libran.processItemIssue(uid, iid);
						break;

				case 3: System.out.println("Enter uid and name");
						uid = in.next();
						name = in.next();
						libran.addNewUser(uid, name);
						break;

				case 4: System.out.println("Enter uid");
						uid = in.next();
						libran.removeUser(uid);
						break;

				case 5: System.out.println("Enter item id, name, copies available");
						iid = in.next();
						name = in.next();
						int copies = in.nextInt();
						libran.addNewItem(iid, name, copies);
						break;

				case 6: System.out.println("Enter item id");
						iid = in.next();
						libran.deleteItem(iid);
						break;

				case 7: System.out.println("Enter user id");
						uid = in.next();
						libran.getUserDetails(uid);
						break;

				case 8: System.out.println("Enter item id");
						iid = in.next();
						libran.getItemDetails(iid);
						break;

				case 9: System.out.println("Enter user id");
						uid = in.next();
						libran.waiveFine(uid);
						break;

				default: System.out.println("Wrong choice");
			}
		}
	}

	public static void libraryManager()
	{
		System.out.println("Hello Library Manager!");
		Librarian libman = new LibraryManager();
	}

}