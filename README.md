# Twin-Pattern
Simulate Multiple Inheritance in Java

Library class
	Singleton
	usertable <String, User>
	itemtable <String, Item>

Item class
	id, name , no_of_cpoies

User class
	id, name itemlist, fine

LibraryClerk 
	processItemIssue(String userid, String itemid)
	processItemReturn(String userid, String itemid)

LibraryStaff
	addNewUser(String userid, String name)
	removeUser(String userid)
	addNewItem(String itemid, String name, int copies)
	deleteItem(String itemid)

Librarian
	void getUserDetails(String userid)
	void getItemDetails(String itemid)
	void waiveFine(String userid)
	void updateUserDetails()
	void updateItemDetails()




