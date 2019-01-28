import RemoteControl.Plane;
import RemoteControl.Ship;
import RemoteControl.Truck;
import RemoteControl.RemoteControl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

import java.rmi.Remote;

@RunWith(MockitoJUnitRunner.class)
public class Testclass {

    //Creating "Fake" plane to test RemoteControl
    @Mock
    Plane mockPlane = mock(Plane.class);

    @Test
    public void testRemoteControl(){
        RemoteControl remoteControl = new RemoteControl(mockPlane);
        Assert.assertEquals(mockPlane, remoteControl.getMachine());
    }

    @Test
    public void testFuelRemainingShip(){
        Ship ship = new Ship();
        Assert.assertEquals(90d, ship.fuelRemaining(), 0);
    }

    @Test
    public void testFuelRemainingTruck(){
        Truck truck = new Truck();
        Assert.assertEquals(90d, truck.fuelRemaining(), 0d);
    }

    @Test
    public void testFuelRemainingPlane(){
        Plane plane = new Plane();
        Assert.assertEquals(90d, plane.fuelRemaining(), 0d);
    }
}
