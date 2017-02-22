package edu.ucsd.cs110.temperature;

import edu.ucsd.cs110.temperature.Temperature;
import edu.ucsd.cs110.temperature.Celsius;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }



    public String toString()
    {
        // TODO: Complete this method
        return "" + this.getValue() + " F";
    }

    @Override
    public Temperature toCelsius(){
    	float z = ((this.getValue() - 32)*5)/9;
    	return new Celsius(z);
    }

    @Override
    public Temperature toFahrenheit(){
    	return this;//Temperature(super.getValue());
    }
}

