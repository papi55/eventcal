/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eventcal.service;
import java.io.Serializable;
import java.util.List;

import eventcal.domain.Event;

/**
 *
 * @author alan
 */
public interface EventManager {
	public List<Event> getEvents();
}
