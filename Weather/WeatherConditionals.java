
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice (int temperature, String description){
       boolean windy = false;
       if (description.equals("windy")) {
           windy = true;
        }
        if (temperature > 32){
            return "It's safe to go outside, " + temperature + " degrees and " + description + ".";
        }
        if (temperature > 80 && description.equals("snowy")){
        return "Impossible weather condition!";
    }
      
    return "Too windy or cold! Enjoy watching the weather through the window.";
}

        // #25 a. freezing = false      b. sunny = true     c. sunny = true
            // 
                // #27 a. !(sunny && clear)     b. (raining || snowing)
                //
                    // #28 a. (temperature <= 75)   b. (temperature > 75)   c. (temperature != 32)


    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
        if (temperature > 120 || windchill> 129){
            return "Too hot to go out";
        }
        if(temperature>60 || windchill>60){
            if (humidity > 50){
                if (description.equals("sunny")){
                    return "bring a hat, and prepare to be sweaty";
                }
                if (description.equals("thunder")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("heavy")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("blizzard")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("smoky")){
                    return "bad air quality, not safe to hike";
                }
                if (description.equals("snow")){
                    return "Be extremely careful when walking in snow, better to not go hiking";
                }
                if (description.equals("tornado")){
                    return "You might die, so don't go";
                }
                if (description.equals("tropical")){
                    return "Extremely dangerous weather, not safe to go";
                }
                if (description.equals("hurricane")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("freezing")){
                    return "Careful of slipping, not safe to go";
                }
                if (description.equals("sleet")){
                    return "Careful of slipping, not safe to go";
                }
                if (description.equals("rain")){
                    return "bring some rain boots";
                }
                return "remember to wear light clothing, it'll be hot and sweaty.";
            }
            if (description.equals("thunder")){
                    return "remember to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("heavy")){
                    return "remember to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("blizzard")){
                    return "remember to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("smoky")){
                    return "remember to hydrate. bad air quality, not safe to hike";
                }
                if (description.equals("snow")){
                    return "remember to hydrate. Be extremely careful when walking in snow, better to not go hiking";
                }
                if (description.equals("tornado")){
                    return "remember to hydrate. You might die, so don't go";
                }
                if (description.equals("tropical")){
                    return "remember to hydrate. Extremely dangerous weather, not safe to go";
                }
                if (description.equals("hurricane")){
                    return "remmeber to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("freezing")){
                    return "remember to hydarte. Careful of slipping, not safe to go";
                }
                if (description.equals("sleet")){
                    return "remember to hydrate. Careful of slipping, not safe to go";
                }
                if (description.equals("rain")){
                    return "remember to hydrate. bring some rain boots";
                }
                if (description.equals("sunny")){
                    return "bring a hat, remember to hydrate and wear light clothing";
                }
            return "remmeber to wear light clothing, remember to hyrate yourself";
        }
    if ((temperature<61 && temperature >32) || (windchill>32 && windchill<61)){
        if (humidity>50){
            if (description.equals("sunny")){
                return "remember to bring a jacket and a hat. you might be sweaty";
            }
            if (description.equals("thunder")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("heavy")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("blizzard")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("smoky")){
                return "remember to bring a jacket. you might be sweaty. bad air quality, not safe to hike";
            }
            if (description.equals("snow")){
                return "remember to bring a jacket. you might be sweaty. Be extremely careful when walking in snow, better to not go hiking";
            }
            if (description.equals("tornado")){
                return "remember to bring a jacket. you might be sweaty. You might die, so don't go";
            }
            if (description.equals("tropical")){
                return "remember to bring a jacket. you might be sweaty. Extremely dangerous weather, not safe to go";
            }
            if (description.equals("hurricane")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("freezing")){
                return "remember to bring a jacket. you might be sweaty. Careful of slipping, not safe to go";
            }
            if (description.equals("sleet")){
                return "remember to bring a jacket. you might be sweaty. Careful of slipping, not safe to go";
            }
            if (description.equals("rain")){
             return "remember to bring a jacket. you might be sweaty. bring some rain boots";
            }
            return "remember to bring a jacket.";
        }
        if (description.equals("thunder")){
                return "remember to bring a jacket and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("heavy")){
                return "remember to bring a jacke and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("blizzard")){
                return "remember to bring a jacket and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("smoky")){
                return "remember to bring a jacket and water. bad air quality, not safe to hike";
            }
        if (description.equals("snow")){
                return "remember to bring a jacket and water. Be extremely careful when walking in snow, better to not go hiking";
            }
        if (description.equals("tornado")){
                return "remember to bring a jacket and water. You might die, so don't go";
            }
        if (description.equals("tropical")){
                return "remember to bring a jacket and water. Extremely dangerous weather, not safe to go";
            }
        if (description.equals("hurricane")){
                return "remember to bring a jacket and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("freezing")){
                return "remember to bring a jacket and water. Careful of slipping, not safe to go";
            }
        if (description.equals("sleet")){
                return "remember to bring a jacket and water. Careful of slipping, not safe to go";
            }
        if (description.equals("rain")){
             return "remember to bring a jacket and water. bring some rain boots";
            }
        if (description.equals("sunny")){
                return" remember to bring a jacket, water, and cap";
            }
            return "remember to bring jacket and water.";
    }
    if (temperature<32 ||windchill< 32){
     return "too cold to hike";   
    }
     return "Weather is perfect, have fun hiking!";
       }
       
       public static String getHikingAdvice2(int temperature, int windchill, int humidity, String description){
           String n = "recommended to not go";
           String vh = "humid temperature";
           String a = "The tempearture is ";
           String b = " degrees, the windchill is ";
           String c = " degrees, and humidity is ";
           String d = ", and the weather is ";
           String e = ".";
        if (temperature > 120 || windchill> 129){
            return "Too hot to go out";
        }
        if(temperature>60 || windchill>60){
            if (humidity > 50){
                if (description.equals("sunny")){
                    return "bring a hat, and prepare to be sweaty";
                }
                if (description.equals("thunder")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("heavy")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("blizzard")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("smoky")){
                    return "bad air quality, not safe to hike";
                }
                if (description.equals("snow")){
                    return "Be extremely careful when walking in snow, better to not go hiking";
                }
                if (description.equals("tornado")){
                    return "You might die, so don't go";
                }
                if (description.equals("tropical")){
                    return "Extremely dangerous weather, not safe to go";
                }
                if (description.equals("hurricane")){
                    return "bad weather for hiking, not safe to go";
                }
                if (description.equals("freezing")){
                    return "Careful of slipping, not safe to go";
                }
                if (description.equals("sleet")){
                    return "Careful of slipping, not safe to go";
                }
                if (description.equals("rain")){
                    return "bring some rain boots";
                }
                return "remember to wear light clothing, it'll be hot and sweaty.";
            }
            if (description.equals("thunder")){
                    return "remember to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("heavy")){
                    return "remember to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("blizzard")){
                    return "remember to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("smoky")){
                    return "remember to hydrate. bad air quality, not safe to hike";
                }
                if (description.equals("snow")){
                    return "remember to hydrate. Be extremely careful when walking in snow, better to not go hiking";
                }
                if (description.equals("tornado")){
                    return "remember to hydrate. You might die, so don't go";
                }
                if (description.equals("tropical")){
                    return "remember to hydrate. Extremely dangerous weather, not safe to go";
                }
                if (description.equals("hurricane")){
                    return "remmeber to hydrate. bad weather for hiking, not safe to go";
                }
                if (description.equals("freezing")){
                    return "remember to hydarte. Careful of slipping, not safe to go";
                }
                if (description.equals("sleet")){
                    return "remember to hydrate. Careful of slipping, not safe to go";
                }
                if (description.equals("rain")){
                    return "remember to hydrate. bring some rain boots";
                }
                if (description.equals("sunny")){
                    return "bring a hat, remember to hydrate and wear light clothing";
                }
            return "remmeber to wear light clothing, remember to hyrate yourself";
        }
    if ((temperature<61 && temperature >32) || (windchill>32 && windchill<61)){
        if (humidity>50){
            if (description.equals("sunny")){
                return "remember to bring a jacket and a hat. you might be sweaty";
            }
            if (description.equals("thunder")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("heavy")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("blizzard")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("smoky")){
                return "remember to bring a jacket. you might be sweaty. bad air quality, not safe to hike";
            }
            if (description.equals("snow")){
                return "remember to bring a jacket. you might be sweaty. Be extremely careful when walking in snow, better to not go hiking";
            }
            if (description.equals("tornado")){
                return "remember to bring a jacket. you might be sweaty. You might die, so don't go";
            }
            if (description.equals("tropical")){
                return "remember to bring a jacket. you might be sweaty. Extremely dangerous weather, not safe to go";
            }
            if (description.equals("hurricane")){
                return "remember to bring a jacket. you might be sweaty. bad weather for hiking, not safe to go";
            }
            if (description.equals("freezing")){
                return "remember to bring a jacket. you might be sweaty. Careful of slipping, not safe to go";
            }
            if (description.equals("sleet")){
                return "remember to bring a jacket. you might be sweaty. Careful of slipping, not safe to go";
            }
            if (description.equals("rain")){
             return "remember to bring a jacket. you might be sweaty. bring some rain boots";
            }
            return "remember to bring a jacket.";
        }
        if (description.equals("thunder")){
                return "remember to bring a jacket and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("heavy")){
                return "remember to bring a jacke and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("blizzard")){
                return "remember to bring a jacket and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("smoky")){
                return "remember to bring a jacket and water. bad air quality, not safe to hike";
            }
        if (description.equals("snow")){
                return "remember to bring a jacket and water. Be extremely careful when walking in snow, better to not go hiking";
            }
        if (description.equals("tornado")){
                return "remember to bring a jacket and water. You might die, so don't go";
            }
        if (description.equals("tropical")){
                return "remember to bring a jacket and water. Extremely dangerous weather, not safe to go";
            }
        if (description.equals("hurricane")){
                return "remember to bring a jacket and water. bad weather for hiking, not safe to go";
            }
        if (description.equals("freezing")){
                return "remember to bring a jacket and water. Careful of slipping, not safe to go";
            }
        if (description.equals("sleet")){
                return "remember to bring a jacket and water. Careful of slipping, not safe to go";
            }
        if (description.equals("rain")){
             return "remember to bring a jacket and water. bring some rain boots";
            }
        if (description.equals("sunny")){
                return" remember to bring a jacket, water, and cap";
            }
            return "remember to bring jacket and water.";
    }
    if (temperature<32 ||windchill< 32){
     return "too cold to hike";   
    }
     return "Weather is perfect, have fun hiking!";
       }
       
}












