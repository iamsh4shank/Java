class Contact {
	String name;
	String email ;
	String phoneNumber;
}
class man{
	
	Contact[] myFriends;
	int friendsCount;
	man(){
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
		man myContactManager = new man();
		Contact first = new Contact();
		first.name = "Shashank";
		first.phoneNumber = "9936596075";
		myContactManager.addContact(first);
		System.out.println(first.name);
}
}

















			
		
