import java.util.Date;

abstract class Items{
	private String u_ID;
	private String title;
	private int no_of_copies;
	void setItem(String id, String name, int copy){
		this.u_ID = id;
		this.title = name;
		this.no_of_copies = copy;
	}
	void getItem(String str){
		System.out.println(str + " Details:");
		System.out.println("unique Id : " + this.u_ID);
		System.out.println("title : " + this.title);
		System.out.println("no of copies : " + this.no_of_copies);
	}
	abstract void checkIn(String dateIn);
	abstract void checkOut(String dateOut);
}

abstract class WrittenItems extends Items{
	
	void setItem(String id, String name, int copy){
		super.setItem(id,name,copy);
	}
	String dateIn, dateOut;
	void checkIn(String din){
		this.dateIn = din;
	}
	void checkOut(String dout){
		this.dateOut = dout;
	}

}

class Book extends WrittenItems{
	private String author;
	void setItem(String id, String name, int copy){
		super.setItem(id,name,copy);
	}
	void setAuthor(String authorName){
		this.author = authorName;
	}
	void getAuthor(){
		System.out.println("Author: " + author);
	}

}

class JournalPaper extends WrittenItems{
	private String publisher;
}

abstract class MediaItems extends Items{
	String dateIn, dateOut;
	void checkIn(String din){
		this.dateIn = din;
	}
	void checkOut(String dout){
		this.dateOut = dout;
	}

}

class Video extends MediaItems{
	private int releaseYear;
	void setItem(String id, String name, int copy){
		super.setItem(id,name,copy);
	}
	void setReleaseYear(int year){
		this.releaseYear = year;
	}
	void getReleaseYear(){
		System.out.println("Year of Release: " + releaseYear);
	}
}

class CD extends MediaItems{
	private String genre;
	void setItem(String id, String name, int copy){
		super.setItem(id,name,copy);
	}
	void setGenre(String genName){
		this.genre = genName;
	}
	void getGenre(){
		System.out.println("Genre: " + genre);
	}
}

class ClientAccess{
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setItem("bo1","Notebook",60);
		book1.setAuthor("Shelly");
		book1.getItem("Book");
		book1.getAuthor();

		System.out.println("------------------------------");

		CD cd1 = new CD();
		cd1.setItem("cd01","Rush",15);
		cd1.setGenre("Disaster");
		cd1.getItem("CD");
		cd1.getGenre();

		System.out.println("------------------------------");

		Video vd1 = new Video();
		vd1.setItem("vd01","happy",25);
		vd1.setReleaseYear(2018);
		vd1.getItem("Video");
		vd1.getReleaseYear();

	}

}