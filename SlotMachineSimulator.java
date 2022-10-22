import java.util.*;
public class SlotMachineSimulator
{
   public static void main(String[]args)
   {
int sunflowerdiff = 0;
int sundiff = 1500;
double globalTotal = 800;

double totalOfTrials = 0;
         for(int b = 0;b<10000;b++) {
      int sun = 50;
      double totalTime = 0;
      double spinnerTime = 4.27;
      int numSunsFallen = 0;
      double nextSunFromSky = Math.min(9.50, 4.25 + (numSunsFallen * .1)) + (Math.random() * 2.75);
      double sunSkyTime = 0;
      List<Double> a = new ArrayList<>();
      double peashooterextra = 100;
      while(sun<2000){ 
      if(sunSkyTime>=nextSunFromSky) {//checking if sun from sky is available
         sun+= 25;
         sunSkyTime = 0;
         numSunsFallen++;
         nextSunFromSky = Math.min(9.50, 4.25 + (numSunsFallen * .1)) + (Math.random() * 2.75);
      }
      if(spinnerTime > 4.25 && spinnerTime < 4.26) {
                 double jackpotchance = (100/(530+peashooterextra))*(100/(530+peashooterextra))*150/(580+peashooterextra);
  
            double spinnerRNG = Math.random();
            double bonuschance = (100/(530+peashooterextra))*(300/(530+peashooterextra))*(150/(630+peashooterextra))*2+(100/(530+peashooterextra))*(100/(530+peashooterextra))*((430+peashooterextra)/(580+peashooterextra))+(100/(530+peashooterextra))*30/(530+peashooterextra)*150/(580+peashooterextra)*2+(100/(530+peashooterextra))*((100+peashooterextra)/(530+peashooterextra))*(150/(630+peashooterextra*1.5))*2;
            if(spinnerRNG < jackpotchance) // sun jackpot
            {
               sun += 500;
            }
            if(spinnerRNG > jackpotchance && spinnerRNG < jackpotchance + bonuschance)// bonus sun
            {
               sun += 100;
            }
            if(spinnerRNG > jackpotchance + bonuschance && spinnerRNG < jackpotchance + bonuschance + bonuschance)
            {
               a.add(Math.random()*9.5+3);
            }
            if(spinnerRNG > jackpotchance + bonuschance + bonuschance && spinnerRNG < jackpotchance + bonuschance + bonuschance + jackpotchance)
            {
               a.add(Math.random()*9.5+3);
               a.add(Math.random()*9.5+3);
               a.add(Math.random()*9.5+3);
            }
            if(peashooterextra != 0) {
               double peashooterjackpot = ((100+peashooterextra)/(530+peashooterextra))*((100+peashooterextra)/(530+peashooterextra))*((150+peashooterextra*1.5)/(580+peashooterextra*1.5));
               double peashooterbonus = ((100+peashooterextra)/(530+peashooterextra))*((100+peashooterextra)/(530+peashooterextra))*(430/(580+peashooterextra*1.5))+((100+peashooterextra)/(530+peashooterextra))*30/(530+peashooterextra)*(150+peashooterextra*1.5)/(580+peashooterextra*1.5)*2+((100+peashooterextra)/(530+peashooterextra))*(400/(530+peashooterextra))*((150+peashooterextra*1.5)/(630+peashooterextra*1.5))*2;
               if(spinnerRNG > jackpotchance + bonuschance + bonuschance + jackpotchance && spinnerRNG < jackpotchance + bonuschance + bonuschance + jackpotchance + peashooterjackpot) {
                  peashooterextra -= 60;
                  if(peashooterextra < 0) {
                     peashooterextra = 0;
                  }
               }
               if(spinnerRNG > jackpotchance + bonuschance + bonuschance + jackpotchance + peashooterjackpot && spinnerRNG < jackpotchance + bonuschance + bonuschance + jackpotchance + peashooterjackpot + peashooterbonus) {
                  peashooterextra -= 20;
                  if(peashooterextra < 0) {
                    peashooterextra = 0;
                  }
               }
            }
      }
         if(spinnerTime>= 4.25 && sun>0 && sun<1900-100*a.size()) {//checking if spinner is available
            spinnerTime = 0;
             sun -= 25;
         }
         for(int i =0;i<a.size();i++) {
            if(a.get(i) <= 0.0)
            {
                sun += 25;
               a.set(i,Math.random()*1.5+23.5);
            }
            a.set(i,a.get(i) - 0.01);
        }
        totalTime+=0.01;
        sunSkyTime += 0.01;
        spinnerTime+=0.01;
      }
      totalTime += 9;
      totalOfTrials += totalTime;
      }
System.out.println(totalOfTrials/10000.0);
   }

}