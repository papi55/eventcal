/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eventcal.web;
import org.springframework.web.servlet.ModelAndView;
import eventcal.web.HelloController;
import junit.framework.TestCase;

public class HelloControllerTests extends TestCase { 
    public void testHandleRequestView() throws Exception{
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
