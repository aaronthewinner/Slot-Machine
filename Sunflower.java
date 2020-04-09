public class Sunflower
{
   private double sunflowerTime = 0.00;
   private double sunflowerRNG = Math.random()*9.5+3;
   public boolean incrementTime()
   {
      sunflowerTime += 0.01;
      if(sunflowerTime >= sunflowerRNG)
      {
         sunflowerTime = 0;
         sunflowerRNG = Math.random()*1.5+23.5;
       return true;
      }
      return false;
   
   }

}