package Maven.programming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class HelloMaven
{
    private final static Logger log = LoggerFactory.getLogger(HelloMaven.class);
    public static void main( String[] args )
    {
        log.info("Hello Maven project");
        System.out.println( "Hello Maven!" );
        log.debug(" \"Hello Maven!\" printed in the console");
    }
}
