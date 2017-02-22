package edu.ucsd.cs110.temperature;

import edu.ucsd.cs110.temperature.Temperature;
import edu.ucsd.cs110.temperature.Fahrenheit;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }


        public String toString()
        {
            // TODO: Complete this method
            return ""+ this.getValue() + " C";
        }

    @Override
    public Temperature toCelsius(){
    	return this;
    }

    @Override
    public Temperature toFahrenheit(){
    	float temp = ((this.getValue() * 1.80f) + 32.00f);
    	return new Fahrenheit(temp);
    }
}
