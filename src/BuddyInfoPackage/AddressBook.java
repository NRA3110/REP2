package BuddyInfoPackage;

import java.util.ArrayList;

public class AddressBook
{
	public static ArrayList<BuddyInfo> buddies;
	
	void addBuddy(BuddyInfo buddy)
	{
		buddies.add(buddy);
	}
	void removeBuddy(BuddyInfo buddy)
	{
		buddies.remove(buddy);
	}
	
	
	public static void main2(String[] args)
	{
		BuddyInfo Jeff = new BuddyInfo();
		Jeff.setName("Jeff");
		AddressBook buddyBook = new AddressBook();
		buddyBook.addBuddy(Jeff);
		System.out.println(AddressBook.buddies);
		System.out.println("Words and things");
	}
}