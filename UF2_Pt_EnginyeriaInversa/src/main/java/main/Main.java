package main;

import org.hibernate.SessionFactory;

import models.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	}
}
