import java.util.ArrayList;

class User
{
	String id;
	String name;
	ArrayList<String> itemlist;

	User(String id, String name)
	{
		this.id = id;
		this.name = name;
		this.itemlist = new ArrayList<>();
	}
}