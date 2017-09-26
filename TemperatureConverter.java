package TinyCodes;


/**
 * Provides conversions between different temparature scales
 */
public class TemperatureConverter
{
   /**
    * 
    * @param centigrade the temperature in degrees centigrade
     * @return 
    */
   public double centigradeToFahrenheit(double centigrade)
   {
       double fahrenheit = (centigrade * 9 / 5) + 32;
       return fahrenheit;
   }
   
   /**
    * 
    * @param fahrenheit the temperature in degrees fahrenheit
     * @return 
    */
   public double fahrenheitToCentigrade(double fahrenheit)
   {
       double centigrade= (fahrenheit-32) *5/9;
       return centigrade;
   }
}
