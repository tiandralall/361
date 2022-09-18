/**
 * 
 */
package circle;

/**
 * @author Tiandra Lall
 *
 */
public class DemoCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Circle c = new Circle();
		c.centerX = 5.0;
		c.centerY = 5.0;	
		
		ColoredCircle cc = new ColoredCircle();
		cc.centerX = 6.0;
		cc.centerY = 6.0;

		System.out.println("c - x = " + c.centerX + " y = " + c.centerY );
		System.out.println("cc - x = " + cc.centerX + " y = " + cc.centerY );
		
		c.draw(); 	// Drawing a Circle... 
					// draw method from Circle
		
		// Upcasting
		c = cc; 
		
		System.out.println("c: Circle = cc: ColoredCircle"); 

		System.out.println("c - x = " + c.centerX + " y = " + c.centerY );
		c.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time
		
		System.out.println("cc - x = " + cc.centerX + " y = " + cc.centerY );
		cc.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time
		
		Circle c1 = new Circle();
		c1.centerX = 6.0;
		c1.centerY = 6.0;
		c1.radius = 6.0;
		
		Circle c2 = new Circle();
		c2.centerX = 6.0;
		c2.centerY = 6.0;
		c2.radius = 6.0;

		System.out.println(c1);
		System.out.println(c2);

		Circle c3 = new Circle();
		try {
			c3= (Circle) c1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		if(c3.equals(c1))
		{
			System.out.println("c3.equals(c1) is true");
		}
		else
		{
			System.out.println("c3.equals(c1) is false");
		}
	}

}
