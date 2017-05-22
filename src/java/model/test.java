/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author nasrallah
 */
public class test {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();   //init
        Session s = sf.openSession();
        s.beginTransaction();
        s.close();
    }
}
