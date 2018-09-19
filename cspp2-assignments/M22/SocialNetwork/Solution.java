import java.util.Scanner;
import java.util.Arrays;
class Solution {
	public static void main(String[] args) {
		SocialNetwork fb = new SocialNetwork();
		Scanner s = new Scanner(System.in);
		String[] x = s.nextLine().split(" ");
		int i = 0;
		while(i < Integer.parseInt(x[1])) {
			String[] tokens = s.nextLine().split(" is connected to ");
			String[] friends = tokens[1].replace(".", "").split(", ");
			List<String> friendsList = new List<String>();
			for (int j = 0; j < friends.length; j++) {
				friendsList.add(friends[j]);
			}
			fb.addUser(new User(tokens[0], friendsList));
			i++;
		}
		while (s.hasNext()) {
			String set = s.nextLine();
			String[] works = set.split(" ");
			System.out.println(works[0]);
			switch (works[0]) {
				case "Network":
					System.out.println(fb.tostring());
				break;
				case "addConnections":
					fb.addConnections(works[1], works[2]);
				break;
				case "getConnections":
					if (fb.getConnections(works[1]) == null) {
						System.out.println("Not a user in Network");
					}else {
						System.out.println(fb.getConnections(works[1]));
					}
				break;
				case "CommonConnections":
					System.out.println(fb.CommonConnections(works[1], works[2]));
				break;
				default:
				break;
			}
		}
	}
}
class User {
	private String username;
	private List<String> friends;

	User() {

	}

	User(final String usernamee, final List<String> friendss) {
		this.username = usernamee;
		this.friends = friendss;
	}
	public String getusername() {
		return this.username;
		//give this.username
	}
	public List<String> getfriends() {
		return this.friends;
	}

}
class SocialNetwork {
	private List<User> userlist;
	SocialNetwork() {
		userlist = new List<User>();
	}
	public void addUser(User friend) {
		userlist.add(friend);
	}
	public void addConnections(String friend, String other) {
		int index = indexOf(friend);
		if (index != -1) {
			List<String> friends = userlist.get(index).getfriends();
			friends.add(other);
		}
	}
	public int indexOf(String name) {
		for (int i = 0; i < userlist.size(); i++) {
			if (userlist.get(i).getusername().equals(name)) {
				return i;
			}
		}
		return -1;
	} 
	public List<String> getConnections(String name) {
		int index = indexOf(name);
		if (index != -1) {
			return userlist.get(indexOf(name)).getfriends();
		}
		return null;
	}
	public List<String> CommonConnections(String name1, String name2) {
		int index1 = indexOf(name1);
		int index2 = indexOf(name2);
		if(index1 != -1 || index2 != -1) {
			List<String> frnd1 = userlist.get(index1).getfriends();
			List<String> frnd2 = userlist.get(index2).getfriends();
			List<String> commonFrnds = new List<String>();
			for (int i = 0; i < frnd2.size(); i++) {
				if (frnd1.contains(frnd2.get(i))) {
					commonFrnds.add(frnd2.get(i));
				}
			}
			return commonFrnds;
		}
		return null;
	}
	public String tostring() {
		String[] keys = new String[userlist.size()];
		for (int i = 0; i < userlist.size(); i++) {
			keys[i] = userlist.get(i).getusername();
		}
		Arrays.sort(keys);
		String s = "";
		int i = 0;
		for (i = 0; i < keys.length - 1; i++) {
			s += keys[i] + ": " + getConnections(keys[i]) + ", ";
		}
		s += keys[i] + ": " + getConnections(keys[i]);
		return s;
	}
}
