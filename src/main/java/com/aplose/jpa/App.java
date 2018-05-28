package com.aplose.jpa;

import com.aplose.smooss.dao.JPASingleton;
import com.aplose.smooss.model.Event;
import rachid.smooss.services.EventService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Event evt = new Event();
    	evt.setName("First event");
    	evt.setDescription("Description de l'event");
    	EventService.getInstance().create(evt);
    	long id = evt.getId();
    	System.out.println("Id de l'évent créé:"+id);
    	evt=EventService.getInstance().read(id);
    	System.out.println("Event name :"+evt.getName());
    	JPASingleton.getInstance().close();
    }
}
