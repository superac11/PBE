import java.util.ArrayList;
import java.util.List;

/**
 * Purpose: THe program will save the 5 name and phone number in an arraylist and print it.
 */

/**
 * @author super
 * Date: 2018-11-1
 * 
 * Write a class named PhoneBookEntry that has fields for a person’s name and phone number.
 *  The class should have a constructor and appropriate accessor and mutator methods. 
 *  Then write a program that creates at least five PhoneBookEntry
objects and stores them in an ArrayList. Use a loop to display the contents of each object in the ArrayList.
 * 
 *
 */
public class PhoneBookEntry {

	/**
	 * 
	 */
	private String fullName;
	private String phoneNo;
	/// Constructor 
	public PhoneBookEntry(String fullName, String string) {
		this.fullName=fullName;
		this.phoneNo=string;
		
	}

	/**
	 * @param args
	 * the name and phone no are passed as the construcctor object.
	 * Main method create an arraylist then save to the arraylist.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> storedContact=new ArrayList<String>();    /// Create a arraylist
		//Create a Constructor 
		PhoneBookEntry sagar=new PhoneBookEntry("Super Ac"," 4456675389");
		PhoneBookEntry sunil=new PhoneBookEntry("Test Ac"," 1234567834");
		PhoneBookEntry tori=new PhoneBookEntry("Tori Solti"," 7523623992");
		PhoneBookEntry susan=new PhoneBookEntry("Ghas Bro"," 67723863872");
		PhoneBookEntry John=new PhoneBookEntry("JOhn Ghas"," 62733473432");
		
		
		
		PhoneBookEntry test1=new PhoneBookEntry("test","1");
		
		test1.ListPrinter(storedContact);
		
		
		
		
		/////Add to the arraylist
		storedContact.add(sagar.getfullName()+sagar.getphoneNo());
		storedContact.add(sunil.getfullName()+sunil.getphoneNo());
		storedContact.add(tori.getfullName()+tori.getphoneNo());
		storedContact.add(susan.getfullName()+susan.getphoneNo());
		storedContact.add(John.getfullName()+John.getphoneNo());

		
		//Call the method to print the phonebook
		ListPrinter(storedContact);
		
		
	}
	
	
	
	/*
	 * THis method takes the arraylist as argument and print it.
	 */
	public static void ListPrinter(List<String> list)
	{
		for(String print:list) {
            System.out.println(print+" ");
        }

	}
	
///Accessor for full name
	public String getfullName()
	{
		return fullName;
	}
	///Accessor for phone Number

	public String getphoneNo()
	{
		return phoneNo;
	}
}
