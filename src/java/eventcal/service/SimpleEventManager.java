/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eventcal.service;

import java.util.ArrayList;
import java.util.List;

import eventcal.domain.Event;

/**
 *
 * @author alan
 */
public class SimpleEventManager implements EventManager {

	private List<Event> events;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
}