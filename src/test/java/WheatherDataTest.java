import com.guga.lab.patterns.observer.CurrentConditionDisplay;
import com.guga.lab.patterns.observer.ForecastDisplay;
import com.guga.lab.patterns.observer.Observer;
import com.guga.lab.patterns.observer.WheatherData;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by guga
 */
public class WheatherDataTest {

    @Test
    public void test1(){
        WheatherData wheatherData = new WheatherData();
        Observer currentConditionDisplay = new CurrentConditionDisplay(wheatherData);
        Observer forecastDisplay = new ForecastDisplay(wheatherData);
        wheatherData.setMeasurements(1,2,3);
        wheatherData.setMeasurements(4,5,6);

        wheatherData.deregisterObserver(currentConditionDisplay);
        wheatherData.setMeasurements(7,8,9);
    }
}
