class LibraryManager extends Librarian
{
	Library lib;
	LibraryManager()
	{
		lib = Library.getInst();
	}

	void addNewStaff()
	{
		System.out.println("Recruited and Added new staff..");
	}
}