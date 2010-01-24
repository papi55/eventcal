/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eventcal.service;

import java.util.ArrayList;
import java.util.List;
import eventcal.domain.Event;

import junit.framework.TestCase;

/**
 *
 * @author alan
 */
public class SimpleEventManagerTests extends TestCase {
    private SimpleEventManager eventManager;
    private List<Event> events;
    private static int EVENT_COUNT = 2;

    private static String PARTY_DESCRIPTION = "Weekly house party";
    private static String PARTY_CLUB = "Roommates";

    private static String MEETING_DESCRIPTION = "Weekly club meeting";
    private static String MEETING_CLUB = "Basket Weaving Club";

    protected void setUp() throws Exception {
        eventManager = new SimpleEventManager();
	events = new ArrayList<Event>();

	Event party = new Event();
	party.setDescription(PARTY_DESCRIPTION);
	party.setClub(PARTY_CLUB);
	events.add(party);

	Event meeting = new Event();
	meeting.setDescription(MEETING_DESCRIPTION);
	meeting.setClub(MEETING_CLUB);
	events.add(meeting);

	eventManager.setEvents(events);
    }

    public void testGetEventsWithNoEvents() {
        eventManager = new SimpleEventManager();
        assertNull(eventManager.getEvents());
    }

    public void testGetEvents() {
	List<Event> events = eventManager.getEvents();
	assertNotNull(events);
	assertEquals(EVENT_COUNT, eventManager.getEvents().size());

	Event event = events.get(0);
	assertEquals(PARTY_DESCRIPTION, event.getDescription());
	assertEquals(PARTY_CLUB, event.getClub());

	event = events.get(1);
	assertEquals(MEETING_DESCRIPTION, event.getDescription());
	assertEquals(MEETING_CLUB, event.getClub());
    }
}
