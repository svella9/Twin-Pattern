import java.util.*;
public class Client
{
	public static void main(String args[])
	{
		// accessing all functionalties using LibrarianClerk
		LibrarianClerk lc = new LibrarianClerk();
				
		lc.addNewUser("101","Vijay");
		lc.addNewUser("102","Ajay");
		lc.addNewUser("103","Sanjay");
		lc.addNewUser("104","Sujay");
		
		lc.viewUserDetails();
				
		lc.removeUser("104");
		
		lc.viewUserDetails();
		
		
		lc.addNewItem("201","GOF",10);
		lc.addNewItem("202","PPL",15);
		lc.addNewItem("203","CPP",20);
		lc.addNewItem("204","DAA",5);
		
		lc.viewItemDetails();
		
		lc.deleteItem("204");
		
		lc.viewItemDetails();
		
		//lc.lib.viewUserDetails();
		
		lc.processItemIssue("101","201");
		
		lc.processItemReturn("101","201");
		
		//accessing all functionalities using LibrarianStaff
		
		LibrarianStaff ls = new LibrarianStaff();
		
		ls.addNewUser("301","Ram");
		ls.addNewUser("302","Abhi");
		ls.addNewUser("303","Jon");
		ls.addNewUser("304","Raj");
		
		ls.viewUserDetails();
				
		ls.removeUser("304");
		
		ls.viewUserDetails();
		
		ls.addNewItem("401","DS",10);
		ls.addNewItem("402","DBMS",15);
		ls.addNewItem("403","CD",20);
		ls.addNewItem("404","WT",5);
		
		lc.viewItemDetails();
		
		ls.deleteItem("404");
		
		lc.viewItemDetails();
		
		ls.processItemIssue("301","401");
		
		ls.processItemReturn("301","401");
		
		/*
		*/
				
	}
}
