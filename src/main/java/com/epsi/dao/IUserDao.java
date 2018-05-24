package com.epsi.dao;



public interface IUserDao {

	boolean create(Utilisateur utilisateur);
	boolean delete(Utilisateur utilisateur);
	Utilisateur get(String id);
	boolean check(Utilisateur utilisateur);
	
}
