public class Main {
 
    public static void main(String args[]) {
     Car c = new SportsCar();
     SportsCar sc = (SportsCar) c;
     
     c.gasType();
     sc.gasType();
     ((SportsCar) c).sound();
   
    }
   }