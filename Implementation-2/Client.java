class Client
{
	public static void main(String args [])
	{
		Librarian librarian = new Librarian();
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

	}
}