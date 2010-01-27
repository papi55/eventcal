/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eventcal.web;
import org.springframework.web.servlet.ModelAndView;
import eventcal.web.DashboardController;
import junit.framework.TestCase;

public class DashboardControllerTests extends TestCase {
    public void testHandleRequestView() throws Exception{
        DashboardController controller = new DashboardController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull(nowValue);
    }
}
