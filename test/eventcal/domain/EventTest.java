/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eventcal.domain;
import junit.framework.TestCase;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author lstewart
 */
public class EventTest extends TestCase{
    private Event event;
    protected void setUp() throws Exception {
        event = new Event();
    }

    public void testSetAndGetDescription(){
        String testDesc = "This is awesome";
        assertNull(event.getDescription());
        event.setDescription(testDesc);
        assertEquals(testDesc, event.getDescription());
    }

    public void testSetAndGetClub(){
        String clubname = "Pirate Club";
        assertNull(event.getClub());
        event.setClub(clubname);
        assertEquals(clubname, event.getClub());
    }

    public void testSetAndGetFinalizedDate(){

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date today = df.parse("20/12/2005");
            assertNull(event.getFinalizedDate());
            event.setFinalizedDate(today);
            assertEquals(today,event.getFinalizedDate());

        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }

    public void testGetLastModified(){

            assertNull(event.getLastModified());

    }

    public void testGetDateCreated(){

            assertNull(event.getDateCreated());

    }

}
