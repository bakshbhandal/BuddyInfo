import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<BuddyInfo> buddyList;

	public AddressBook() {
		buddyList = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo b) {
		buddyList.add(b);
	}

	public void removeBuddy(BuddyInfo b) {
		buddyList.remove(b);
	}
	
	public void displayAddressBook(){
		for(BuddyInfo b: buddyList){
			System.out.println(b.toString());
		}
	}
	
	public static void main(String args[]){
		BuddyInfo buddy = new BuddyInfo("Baksh", "CU", "4242");
		AddressBook ad = new AddressBook();
		ad.addBuddy(buddy);
		ad.removeBuddy(null);
	}
}
