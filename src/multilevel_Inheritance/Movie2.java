package multilevel_Inheritance;

public class Movie2 extends Movie1 {
    public void episodename() {
	   System.out.println("Movie: Guitar Kambi mele Nindru");
}
    public void director() {
	   System.out.println("Director: Gautham Vasudev Menon");
}
    public void actor() {
       System.out.println("Actor: Surya");
}
    public static void main(String[] args) {
    	Movie2 show = new Movie2();
    	show.producer();
    	show.moviename();
    	show.episodename();
		show.director();
		show.actor();
	}
}
