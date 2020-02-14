import java.awt.Point;
import javafx.scene.layout.AnchorPane;

public class Ship {
	 int X,Y;
	 Point currentLocation;
	 AnchorPane root;
	 public Ship(int x, int y) {

			X = x;
			Y = y;
		}
	public Ship(OceanMap oceanMap) {
		// TODO Auto-generated constructor stub
	}
	public void goWest() 
	{
		// TODO Auto-generated method stub
		if (X != 0)
		{
			X--;
		}
	}
	public void goSouth() {
		// TODO Auto-generated method stub
		if (Y != 9)
		{
			Y++;
		}
	}
	public void goNorth() {
		// TODO Auto-generated method stub
		if (Y != 0)
		{
			Y--;
		}
	}
	public void goEast() 
	{
		// TODO Auto-generated method stub
		if (X != 9)
		{
			X++;
		}
	}
	public Point getShipLocation() {
		// TODO Auto-generated method stub
		return new Point(X,Y);
	}
	

}
