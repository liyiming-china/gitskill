package aop.Impl;

import aop.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void modify() {
        System.out.println("执行修改操作");
    }

    @Override
    public void view() {
        System.out.println("执行查询操作");
    }
}
