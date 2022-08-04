
class Farmer {
	int farmer_id;
	String name;
	int rating;
	Farmer(int id,String fname){
		farmer_id=id;
		name=fname;
	}
}

class Bid_details{
	String crop_name;
	int base_price;
	int bid_current;
	Bid_details(String crop_name,int base_price,int bid_current){
		this.crop_name=crop_name;
		this.base_price=base_price;
		this.bid_current=bid_current;
	}
	void display() {
		System.out.println("The crop " + crop_name + " has a base price of " + base_price + " and has a current bid value of"  +bid_current );
	}
	
}

class Place_bid extends Bid_details{
	int bid_price;
	Place_bid(int price){
		bid_price=price;
	}
	void bid() {
		if (bid_price>bid_current) {
			bid_current=bid_price;
			System.out.println("The current bid details:");
			System.out.println("The crop " + crop_name + " and has a current bid value of"  +bid_current );
		}
		else {
			System.out.println("Your bid value is lower than the previous bid");
		}
	}
	
}

class Product{
	String crop_name;
	int quantity;
	int price;
	Product(String crop,int amount,int price){
		crop_name=crop;
		quantity=amount;
		this.price=price;
	}
	void display() {
		System.out.println("Crop name : " +crop_name);
		System.out.println("Quantity : " +quantity);
		System.out.println("price : " +price);
	}
}

class Rating extends Retailer{
	int rating_score;
	Rating(int score){
		rating_score=score;
	}
	void Rate() {
		rating=(rating+rating_score)/2;
		System.out.println("The current rating of the retailer is "+rating);
	}
}

class Retailer{
	int R_id;
	String name;
	String address;
	int contact;
	int rating;
	Retailer (int R_id,String name,String address,int contact,int rating){
		this.R_id=R_id;
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.rating=rating;
	}
}

class interact{
	public static void main(String[] args) {
		Farmer farm = new Farmer(001,"Ram");
		Retailer R = new Retailer(002,"Raju","XXX",12345,5);
		Bid_details Bd = new Bid_details("Tomato",500,0);
		Rating r = new Rating(3);
		Bd.display();
		r.Rate();
	}
}
