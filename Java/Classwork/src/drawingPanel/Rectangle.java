package drawingPanel;
import java.awt.*;

public class Rectangle
{
	public static DrawingPanel canvas = new DrawingPanel(640, 480);
	public static Graphics gr = canvas.getGraphics();
	public static void main(String[] args)
	{
		drawRectangle(175, 255, 0, "Raghav");
	}
	public static void drawRectangle(int r, int g, int b, String str)
	{
		gr.setColor(new Color(r, g, b));
		gr.fillRect(200, 200, 300, 200);
		gr.setColor(Color.BLACK);
		gr.drawString(str, 250, 300);
	}
}