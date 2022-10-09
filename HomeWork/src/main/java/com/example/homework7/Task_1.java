package com.example.homework7;
public class Task_1 {
      public static void main(String[] args){
            Temperature temperatureWinter = new Temperature(-5,3);
            Temperature temperatureSpring = new Temperature(8,6);
            Temperature temperatureSummer = new Temperature(18, 9);
            Temperature temperatureAutumn = new Temperature(-8,12);

            temperatureSummer.description();

            System.out.println(Seasons.WINTER+ " is the " + getDescription(Seasons.WINTER));
            System.out.println(Seasons.SUMMER+ " is the " + getDescription(Seasons.SUMMER));

            temperatureWinter.AllSeasons();
            temperatureSpring.AllSeasons();
            temperatureSummer.AllSeasons();
            temperatureAutumn.AllSeasons();
      }
      public static String getDescription(Seasons seasons){
            if(seasons == Seasons.SUMMER){
                  return "Warm season";
            }
            return "Cold season";
      }

}
class Temperature {
      Seasons seasons = Seasons.SUMMER;
      public double averageTemperature;
      int month;
      public Temperature(double averageTemperature, int month) {
            this.averageTemperature = averageTemperature;
            this.month= month;
      }
      void description(){

            switch (seasons){
                  case WINTER:
                        System.out.println("My least favorite time of the year. The average winter temperature is about: " + averageTemperature+"'C");
                        break;
                  case SPRING:
                        System.out.println("My least favorite time of the year. The average spring temperature is about: "+ averageTemperature+"'C");
                        break;
                  case SUMMER:
                        System.out.println("My favorite time of the year.The average summer temperature is about: "+ averageTemperature+"'C");
                        break;
                  case AUTUMN:
                        System.out.println("My least favorite time of the year. The average autumn temperature is about:" + averageTemperature+"'C");
                        break;
            }
      }

      void AllSeasons(){
            int monthNumber;
            for (monthNumber=1; monthNumber <= 12; monthNumber++){
                  if (monthNumber==3 && month==3){
                        System.out.println("I don't really like Belarusian winter. The average winter temperature is about: "+averageTemperature+"'C");
                  } if (monthNumber==6 && month==6){
                        System.out.println("Again a blizzard, what .... it's already April! The average spring temperature is about: "+ averageTemperature+"'C");
                  } if (monthNumber==9 && month==9){
                        System.out.println("My favorite time of the year.The average summer temperature is about: "+ averageTemperature+"'C");
                  } if (monthNumber==12 && month==12){
                        System.out.println("Just not autumn. The average autumn temperature is about:" + averageTemperature+"'C");
                  }
            }
      }
}
enum Seasons{
      WINTER,
      SPRING,
      SUMMER,
      AUTUMN
}


