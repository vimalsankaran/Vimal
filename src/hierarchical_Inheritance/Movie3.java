package hierarchical_Inheritance;

public class Movie3 extends Cinema {
	public void moviename3() {
        System.out.println("Movie Name: Vinnaithaandi Varuvaya");
	}
	public void actor3() {
		System.out.println("Actor: Silambarasan T.R");
	}
	public static void main(String[] args) {
		Cinema directorname = new Cinema();
		Movie1 movie1 = new Movie1();
		Movie2 movie2 = new Movie2();
		Movie3 movie3 = new Movie3();
		
		directorname.director();
		System.out.println("Movie1 Details:");
		movie1.moviename1();
		movie1.actor1();
		
		System.out.println("Movie2 Details:");
		movie2.moviename2();
		movie2.actor2();
		
		System.out.println("Movie3 Details:");
		movie3.moviename3();
		movie3.actor3();
	}
}
