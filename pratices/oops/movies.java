package oops;

import java.util.ArrayList;
import java.util.Arrays;

class mov{
    private String title;
    private String director;
    private ArrayList<String> actor;
    private ArrayList<Review>reviews;
    public mov(String title, String director, ArrayList<String> actor) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.reviews=new ArrayList<Review>();
    }
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public ArrayList<String> getActor() {
        return actor;
    }
    public void addreview(Review rv)
    {
        reviews.add( rv);
    }
    public ArrayList<Review> getReviews() {
        return reviews;
    }
    public void print()
    {
        System.out.println("title: "+title);
        System.out.println("director: "+director);
        System.out.println("actors: "+actor);
        System.out.println("reviews: ");
        for(Review r: reviews)
        {
        System.out.println("name: " +r.getReviewername()+", feedback: "+r.getReviewtext()+", rate: "+r.getRate());
        }    }
    
}
class Review
{
private String reviewtext;
private String reviewername;
private int rate;
public Review(String reviewtext, String reviewername, int rate) {
    this.reviewtext = reviewtext;
    this.reviewername = reviewername;
    this.rate = rate;
}
public String getReviewtext() {
    return reviewtext;
}
public String getReviewername() {
    return reviewername;
}
public int getRate() {
    return rate;
}

}
public class movies {
    public  static void main(String a[])
    {
    mov m1=new mov("vanam", "vicky",new ArrayList<String>(Arrays.asList("vicky","ram","anish","vijay")));
    mov m2=new mov("winner", "vicky",new ArrayList<String>(Arrays.asList("hari","suriya","vijay","ajith")));
    
    Review review1=new Review("good awesome", "vignesh", 4);
    Review review2=new Review("good ", "ram", 3);
    Review review3=new Review(" awesome", "hari", 4);
    Review review4=new Review("well ", "teena", 4);
    m1.addreview(review4);
    m1.addreview(review3);
    m2.addreview(review2);
    m2.addreview(review1);

 
  
    m1.print();
  System.out.println("---------------");    m2.print();

    }
}
