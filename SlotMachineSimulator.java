import java.util.*;
public class SlotMachineSimulator
{
   public static void main(String[]args)
   {
         double totalOfTrials = 0;
         int subFive = 0;
         double maxTime = 0;
         double minTime = 100000000;
         for(int b = 0;b<10000;b++)
      {
      int sun = 25;
      double totalTime = 0;
      double spinnerTime = 0;
      int numSunsFallen = 0;
      double nextSunFromSky = Math.min(9.50, 4.25 + (numSunsFallen * .1)) + (Math.random() * 2.75);
      double sunSkyTime = 0;

      ArrayList<Sunflower> a = new ArrayList<Sunflower>();
      

     

      while(sun<2000)
      {
  
  
      if(sunSkyTime>=nextSunFromSky)//checking if sun from sky is available
      {
         sun+= 25;
         sunSkyTime = 0;
         numSunsFallen++;
         nextSunFromSky = Math.min(9.50, 4.25 + (numSunsFallen * .1)) + (Math.random() * 2.75);
  
      }



         if(spinnerTime>= 4.25 && sun>0)//checking if spinner is available
         {
            spinnerTime = 0;
   
            sun -= 25;
            double spinnerRNG = Math.random();
                  
            if(spinnerRNG < 0.1) // bonus sun
            {
               sun += 100;
            }
            if(spinnerRNG > 0.1 && spinnerRNG < 0.11)// sun jackpot
            {
               sun += 500;
            }
            if(spinnerRNG > 0.11 && spinnerRNG < 0.21)
            {
               a.add(new Sunflower());
            }
            if(spinnerRNG > 0.21 && spinnerRNG < 0.22)
            {
               a.add(new Sunflower());
               a.add(new Sunflower());
               a.add(new Sunflower());
            }
                     }
                     for(int i =0;i<a.size();i++)
                     {
                        if(a.get(i).incrementTime())
                        {
                           sun += 25;
                        }
                     }
          totalTime+=0.01;
          sunSkyTime += 0.01;
          spinnerTime+=0.01;


      }
      totalTime += 9;
               totalOfTrials += totalTime;
               if(totalTime<=300)
               subFive++;
               if(totalTime<minTime)
               minTime = totalTime;
               if(totalTime>maxTime)
               maxTime= totalTime;
               }
               System.out.println(totalOfTrials/10000);
               System.out.println(subFive/10000.0);
               System.out.println(minTime);
               System.out.println(maxTime);
   }

}