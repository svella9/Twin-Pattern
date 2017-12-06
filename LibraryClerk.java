class LibraryClerk
{
	LibraryClerk()
	{
		
	}
	
	void processItemIssue(String user, String item)
	{
		System.out.println("Scanning user card and item barcode..");
		System.out.println(item + "item issued to " + user);
	}
	
	void processItemReturn(String user, String item)
	{
		System.out.println("Scanning and item barcode..");
		System.out.println(item + "item returned by " + user);
	}
}