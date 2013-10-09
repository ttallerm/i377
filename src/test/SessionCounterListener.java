package test;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCounterListener 
	implements HttpSessionListener {
	
	private static int totalActiveSessions;
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
	totalActiveSessions++;
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		if(totalActiveSessions > 0)
			totalActiveSessions--;
	}
	
	public static int getTotalActiveSession() {
	return totalActiveSessions;
	}
}
