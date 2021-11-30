package hybrid_Inheritance;

public class Episode extends Title2 {
	public void episodename() {
    System.out.println("Episode: Guitar Kambi Mele Nindru");
	}
public static void main(String[] args) {
	Title1 direction = new Title1();
	Episode episode = new Episode();
	direction.director();
	System.out.println("MOVIE1 DETAILS:");
	direction.moviename("Movie: Neethane En Ponvasantham");
	direction.actor("Actor: Jeeva");
	System.out.println("MOVIE2 DETAILS:");
	episode.moviename("Movie: Navarasa");
	episode.episodename();
	episode.actor("Actor: Surya");
}	
}
