package com.shinhan.cspclass;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

public class MyPersistenceManager {
	private static PersistenceManager pm;
	
	public static PersistenceManager getManager() {
		
		pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		return pm;
	
	}

}