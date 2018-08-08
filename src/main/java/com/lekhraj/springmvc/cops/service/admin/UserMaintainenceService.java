package com.lekhraj.springmvc.cops.service.admin;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lekhraj.springmvc.cops.model.User;

@Service
public class UserMaintainenceService 
{
	private static List<User> users = new ArrayList<User>();
	private static int userCount = 3;

	static {
		users.add(new User("Lekhraj Dinkar", "INYLBD", "DEVELOPER", "IRVINE", new Date()));
		users.add(new User("Shrish Buradkar", "INYSQB", "LEAD", "IRVINE", new Date()));
		users.add(new User("Kiran Gade", "INYKFG", "LEAD", "IRVINE", new Date()));
	}

	public List<User> retrieveUsers()
	{
		return users;
	}

	public void addUser(String name, String inits, String role, Date d, String loc) {
		users.add(new User(name, inits, role, loc, d));
	}

	public void deleteUser(String inits)
	{
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User User = iterator.next();
			if (User.getInitial().equals(inits)) {
				iterator.remove();
			}
		}
	}
}