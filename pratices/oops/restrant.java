package oops;

import java.util.ArrayList;

class Restaurant
{
    private String item;
    private ArrayList<Integer> count;
    private ArrayList <Double> prize;
    private ArrayList<Double> rate;
    public Restaurant(ArrayList<String> item, ArrayList<Integer> count, ArrayList<Double> prize,
            ArrayList<Double> rate) {
        this.item = item;
        this.count = count;
        this.prize = prize;
        this.rate = rate;
    }
   public void addItem(String name,double prize)
   {
  this.item.add(name);
  this.prize.add( prize);
  this.count.add(0);
  this.rate.add( 0);
  
   }
}
public class restrant {
    restrant n=new restrant();
    
}
