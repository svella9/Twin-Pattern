import java.util.*;
class LibrarianStaff extends LibraryStaff
{
	LibrarianClerk twin;
	
	void create(){
		if(twin == null)
			twin = new LibrarianClerk();
	}
	
	void processItemIssue(String userid, String itemid){
		create();
		twin.processItemIssue(userid,itemid);
	}
	
	void processItemReturn(String userid, String itemid){
		create();
		twin.processItemReturn(userid,itemid);
	}
	
	void viewUserDetails(){
		create();
		twin.viewUserDetails();
	}
	
	
	void viewItemDetail(){
		create();
		twin.viewItemDetails();
	}

}
