package Epam.SingletonPattern;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App extends Singleton
{
	private static final  Logger LOGGER=LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
        Singleton s=new Singleton();
		LOGGER.info(Singleton.getInstance());
    }
}
