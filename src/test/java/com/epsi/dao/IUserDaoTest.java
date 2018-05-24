package com.epsi.dao;

import org.junit.Test;

public class IUserDaoTest {
	@Test
	public void insertUser() {

		try {
			IUserDao utilisateurDao;
			utilisateurDao = DAOFactory.getInstance().getUtilisateurDao();
			Utilisateur u=new Utilisateur();
			u.setNom("Guegan");
			u.setPassword("ceece");

			System.out.println(utilisateurDao.create(u));
		} catch (DAOConfigurationException e) {
			e.printStackTrace();
		}

	}
}
