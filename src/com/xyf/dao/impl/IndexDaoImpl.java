package com.xyf.dao.impl;

import com.xyf.dao.IndexDao;
import com.xyf.entity.RunoobTbl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;


public class IndexDaoImpl implements IndexDao {

    //在SSH的设计理念：要使用某个实例，那么就定义声明一个对象，然后
    //给它添加set方法（用于spring注入进来)
    //实现不要关注这个实例来自于那里，以及怎么创建，或者它是谁
    //sessionFactory这个实例可以自己按常规的hibernate传统写法创建,也可以交给spring去托管
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<RunoobTbl> getAllRunoob() {
        //获取session
        Session session = sessionFactory.openSession();
        //后面当使用JPA的时候，EntityManager 类似于 Session
        Query query = session.createQuery("from runoob_tbl");
        //将所有的数据查询出来并放到List集合里
        List<RunoobTbl> list = query.getResultList();
        //将集合遍历循环
        for(RunoobTbl tbl : list){
            System.out.println(tbl);
        }
        session.close();
        sessionFactory.close();
        return list;
    }
}
