public class Video {
	String videoName;
	boolean checkout;
	int rating;
	Video(String name){
		videoName=name;
	}
	public String getName() {
		return videoName;
	}
	public void doCheckout() {
		checkout=true;
	}
	public void doReturn() {
		checkout=false;
	}
	public void receiveRating(int rating) {
		this.rating=rating;
	}
	public int getRating() {
		return rating;
	}
	public boolean getCheckout() {
		return checkout;
	}

}
