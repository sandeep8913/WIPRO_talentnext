public class VideoStore {
	Video[] store;
	void addVideo(String name) {
		
		Video v=new Video(name);
		int s;
		try {
			s=store.length;
		} catch (Exception e) {
			s=0;
		}
		Video[] newstore=new Video[s+1];
		newstore[s]=v;
		store=newstore;
		
	}
	void doCheckout(String name) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video v :store) {
			if(v.getName().equals(name)) {
				v.doCheckout();
			}
		}
		
	}
	void doReturn(String name) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video v :store) {
			if(v.getName().equals(name)) {
				v.doReturn();
			}
		}
		
	}
	void receiveRating(String name,int rating) {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video v :store) {
			if(v.getName().equals(name)) {
				v.receiveRating(rating);
			}
		}
		
	}
	void listInventory() {
		if(store==null || store.length==0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video v :store) {
			System.out.print("---------------------------------------------------------------------------");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Video Name","Checkout Status","Rating");
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", v.getName(), v.getCheckout(),v.getRating());
			System.out.println("---------------------------------------------------------------------------");
		}
		
	}
	int checkVideo(String name) {
		int f=0;
		if(store==null) {
			return -1;
		}
		for(Video v:store) {
			if(v.getName().equals(name)) {
				f=1;
				break;
			}
		}
		return f;
		
	}

}
