class Contact {
	String name;
	String email ;
	String address;
	String phoneNumber;
}
class Man{
	
	Contact[] myFriends;
	int friendsCount;
	Man(){
		myFriends= new Contact[500];
		friendsCount= 0 ;
	}
	void addContact(Contact contact){
		myFriends[friendsCount]=contact;
		friendsCount++;
	}
	
	Contact searchContact(String searchName){
		for(int i = 0 ; i <friendsCount ; i++){
			if (myFriends[i].name.equals(searchName)){
				return myFriends[i];
			}
		}
	return null;
	}
}

class basic{
	public static void main(String[] args  ){
		Man myContactManager = new Man();
		Contact first = new Contact();
		first.name = "Ramesh";
		first.phoneNumber = "9945793202";
		first.address = "Atlanta";
		myContactManager.addContact(first);
		System.out.println(first.name);
		System.out.println(first.address);
}
}

















			
		
