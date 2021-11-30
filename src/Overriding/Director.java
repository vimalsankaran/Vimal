package Overriding;
//Upcasting
public class Director extends Cinema {
           @Override
        public void moviename(String a) {
        	super.moviename(a);
        }
        @Override
        public void director(String b) {
        super.director(b);
        }
        @Override
        public void actor(String c) {
        super.actor(c);
        }
       @Override
       public void music_director(String d) {
       super.music_director(d);
       }
       public static void main(String[] args) {
		Cinema show = new Director();       //Upcasting
		show.moviename("Achcham Yenbathu Madamayada");
		show.director("Gautham Vasudev Menon");
		show.actor("Silambarasan T.R");
		show.music_director("A.R.Rahman");	   
	}
}
