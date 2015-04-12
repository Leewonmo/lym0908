package com.shinhan.cspclass;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class MemberManager {

	public static TeamMember addMember(String name, String socialNum,
			String hakname, String tell, String add, String id, String value,
			String gitid) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		TeamMember m = new TeamMember(name, socialNum, hakname, tell, add, id,
				value, gitid);
		pm.makePersistent(m);

		return m;
	}

	public static TeamMember getMember(String key) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		TeamMember m = pm.getObjectById(TeamMember.class, key);

		return m;
	}

	public static void deleteMember(String key) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		TeamMember m = MemberManager.getMember(key);
		pm.deletePersistent(m);
	}

	public static List<TeamMember> getMemberByName(String name) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		Query qry = pm.newQuery(TeamMember.class);
		qry.setFilter("name == nameParam");
		qry.declareParameters("String nameParam");

		@SuppressWarnings("unchecked")
		List<TeamMember> memberList = (List<TeamMember>) qry.execute(name);

		return memberList;
	}

	public static List<TeamMember> getAllMembers() {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory(
				"transactions-optional").getPersistenceManager();
		Query qry = pm.newQuery(TeamMember.class);
		@SuppressWarnings("unchecked")
		List<TeamMember> memberList = (List<TeamMember>) qry.execute();

		return memberList;
	}
}
