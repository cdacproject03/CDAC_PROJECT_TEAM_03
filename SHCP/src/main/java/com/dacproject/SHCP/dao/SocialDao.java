package com.dacproject.SHCP.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dacproject.SHCP.model.SocialWorker;

@Repository
@Transactional
public class SocialDao {
  
  @Autowired
  private SessionFactory _sessionFactory;
  
  private Session getSession() {
    return _sessionFactory.getCurrentSession();
  }

  public void save(SocialWorker sw) {
    getSession().save(sw);
  }
  

}