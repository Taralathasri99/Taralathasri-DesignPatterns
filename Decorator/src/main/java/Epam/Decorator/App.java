package Epam.Decorator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}
class Circle implements Shape {
	private static final  Logger LOGGER=LogManager.getLogger(Circle.class);
    @Override
    public void draw() {
    LOGGER.info("Drawing Circle");
    }
    @Override
    public void resize() {
    LOGGER.info("Resizing Circle");
    }
    @Override
    public String description() {
    return "Circle object";
    }
    @Override
    public boolean isHide() {
    return false;
    }
}
class Rectangle implements Shape {
	private static final  Logger LOGGER=LogManager.getLogger(Rectangle.class);
    @Override
    public void draw() {
    LOGGER.info("Drawing Rectangle");
    }
    @Override
    public void resize() {
    LOGGER.info("Resizing Rectangle");
    }
    @Override
    public String description() {
    return "Rectangle object";
    }
    @Override
    public boolean isHide() {
    return false;
    }
}
public class App 

{
	private static final  Logger LOGGER=LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
    	Circle c=new Circle();
    	Rectangle r=new Rectangle();
    	c.draw();
    	c.resize();
    	LOGGER.info(c.description());
    	LOGGER.info(c.isHide());
    	r.draw();
    	r.resize();
    	LOGGER.info(r.description());
    	LOGGER.info(r.isHide());  	
    	
    			
    }
        
}
