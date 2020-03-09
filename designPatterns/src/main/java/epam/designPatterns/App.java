package epam.designPatterns;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App extends Phone
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
      Phone p=new Phone();
      LOGGER.info(p.GetName());
      LOGGER.info(p.SetPrice(900000));
    }
}
