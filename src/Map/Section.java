package Map;

import java.awt.*;

public class Section extends MapSubset
{
	Section()//Constructor
	{
		n = 2;
	}
	
	@Override
	Tile getTile(int x, int y)
	{
		return null;
	}
	
	@Override
	void draw(Graphics2D g2d, int x, int y, int horizontalOffset, int verticalOffset, int scale)
	{
	
	}
}