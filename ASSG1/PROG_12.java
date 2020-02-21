import java.util.Scanner;
 class flower
 {
	private String name;
	private int petals;
	 private float price;
	  void Flower(String n, int p, float r) 
	 {

         name = n;
         petals = p ;
         price = r;
 }
	  public void setName(String n) 
	  { name = n;
	  }
	  

      public void setPetals(int p)
      { 
    	  petals = p;
      }

      public void setPrice(float p) 
      { 
    	  price = p;
      }
      public String getName() { return name;}

      public int getPedals() { return petals;}

      public float getPrice() { return price;}
 
 }
