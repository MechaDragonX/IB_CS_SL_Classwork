package drawingPanel;
import java.awt.*;
import java.util.Scanner;

public class Projectile
{
	public static int canvaswidth = 1920;
	public static int canvasheight = 1080;
	public static DrawingPanel canvas;
	public static Graphics gr;
	public static Scanner sc = new Scanner(System.in);
	public static final double GRAVITY = -9.81;
	public static void main(String[] args)
	{
		input();
	}
	public static void input()
	{
		double velocity = 0;
		double deg = 0;
		int steps = 0;
		double horizscalefactor = 0;
		double amplitude = 0;
		System.out.println("Please input the velocity of the projectile in meters per second (m/s).");
		System.out.print("> ");
		while (sc.hasNextDouble() == false)
		{
			System.out.println("Please type a rational number.");
			break;
		}
		velocity = sc.nextDouble();
		System.out.println("Please input the angle of the projectile in degrees.");
		System.out.print("> ");
		
		while (sc.hasNextDouble() == false)
		{
			System.out.println("Please type a rational number.");
			break;
		}
		deg = sc.nextDouble();
		System.out.println("Please input the amount of times you want to image of the ball to appear in the air.");
		System.out.print("> ");
		
		while (sc.hasNextInt() == false)
		{
			System.out.println("Please type an integer.");
			break;
		}
		steps = sc.nextInt();
		System.out.println("Please input the horizontal scale factor you desire.");
		System.out.print("> ");
		sc.hasNextDouble();
		while (sc.hasNextDouble() == false)
		{
			System.out.println("Please type a rational number.");
			break;
		}
		horizscalefactor = sc.nextDouble();
		System.out.println("Please input the vertical scale factor (amplitude) you desire.");
		System.out.print("> ");
		sc.hasNextDouble();
		while (sc.hasNextDouble() == false)
		{
			System.out.println("Please type a rational number.");
			break;
		}
		amplitude = sc.nextDouble();
		canvas = new DrawingPanel(canvaswidth, canvasheight);
		gr = canvas.getGraphics();
		projectile(velocity, deg, steps, horizscalefactor, amplitude);
	}
	public static void projectile(double velocity, double deg, int steps, double horizscalefactor, double amplitude)
	{
		double xVelocity = xVector(velocity, deg);
		double yVelocity = yVector(velocity, deg);
		double totaltime = totaltime(yVelocity);
		double timeincrement = totaltime / steps;
		double xIncrement = xVelocity * timeincrement;
		double x = 0.0;
		double y = 0.0;
		double time = 0.0;
		drawProjectile(x, y);
		for (int n = 0; n < steps; n++)
		{
			x += horizscalefactor * xIncrement;
			time += timeincrement;
			y = amplitude * (yVelocity * time + 0.5 * GRAVITY * (time * time));
			drawProjectile(x, y);
		}
	}
	public static double xVector(double velocity, double deg)
	{
		double xVelocity = velocity * Math.cos(Math.toRadians(deg));
		return xVelocity;
	}
	public static double yVector(double velocity, double deg)
	{
		double yVelocity = velocity * Math.sin(Math.toRadians(deg));
		return yVelocity;
	}
	public static double totaltime(double yVelocity)
	{
		return -2.0 * yVelocity / GRAVITY;
	}
	public static void drawProjectile(double x, double y)
	{
		int posy = (int) y - (canvasheight - 50);
		gr.setColor(Color.BLUE);
		gr.fillOval((int) x, -posy, 50, 50);
		canvas.sleep(20);
		gr.setColor(Color.WHITE);
		gr.fillOval((int) x - 2, -posy - 2, 54, 54);
	}
}