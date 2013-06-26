package my.parser.nordea_parser;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testParseSwedishNumber()
    {
    	NumberFormat nf = NumberFormat.getNumberInstance(new Locale("de", "DE"));
    	Double parsedInt;
		Double resultLong=-1628.1;
		try {
			parsedInt = nf.parse("-1.628,10").doubleValue();
			if( null != parsedInt)
			{
				System.out.println(parsedInt);
				assertEquals(resultLong, parsedInt);
			}
			else
				assertTrue(false);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
        
    }
}
