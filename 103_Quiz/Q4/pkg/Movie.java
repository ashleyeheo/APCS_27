
package pkg;

public class Movie(){
   
   // Global Variables
    public void Movie(){
        String movieName;
        double rating;
        int numRatings;
        int revenue; 
    }
  // Constructors 
public Movie(){
    movieName= "unknown";
    rating = 0.0;
    numRatings = 0;
    revenue = 0;
    }
public Movie(String mN, int r){
    movieName = mN;
    revenue = r;
    }
public Movie(String mN, int r, double rt, int num){
    movieName = mN;
    revenue = r;
    rating = rt;
    numRatings = num;
    }   
// Methods
public double addRating(double ratings){
    rating = ((numRatings*rating)+this.rating)/(numRatings+1);
    return rating;
}
public void movieToString(){
     System.out.println(movieName);
     System.out.println(rating);
     System.out.println(numRatings);
     System.out.println(revenue);
}
public void getMovieName(){
    System.out.println(movieName);
}
public boolean compareRatings(){
    rating.equals(this.rating);
    return false;
}
public void revenueToString(){
    
    }    
    }

}
public void pirateMovie(){

}

}
            


