
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main(String args[]){
        String weatherCondition = "tornado";
        System.out.println(weatherCondition.length());
        System.out.println(weatherCondition.substring(0));
        
        String cc5 = "mixed rain and snow";
        System.out.println(cc5.substring(0,5));
        String cc6 = "mixed rain and sleet";
        System.out.println(cc6.substring(0,5));
        String cc7 = "mixed snow and sleet";
        System.out.println(cc7.substring(0,5));
        String cc14 = "light snow showers";
        System.out.println(cc14.substring(0,5));
        String cc18 = "sleet";
        System.out.println(cc18.substring(0,5));
        String cc22 = "smoky";
        System.out.println(cc22.substring(0,5));
        String cc24 = "windy";
        System.out.println(cc24.substring(0,5));
        String cc31 = "clear (night)";
        System.out.println(cc31.substring(0,5));
        String cc32 = "sunny";
        System.out.println(cc32.substring(0,5));
        String cc35 = "mixed rain and hail";
        System.out.println(cc35.substring(0,5));
        String cc41 = "scattered snow showers (day)";
        System.out.println(cc41.substring(0,9));
        String cc43 = "blizzard";
        System.out.println(cc43.substring(0,8));
        /// the statement would print -1
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(50, 20, 30, "sunny"));
    }
}
