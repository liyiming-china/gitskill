package aop.Impl;

import aop.UserDao;
import aop.UserService;

public class UserServiceImpl implements UserService {
        private UserDao testDao;

    public void setTestDao(UserDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public void modify() {
        testDao.modify();
    }

    @Override
    public void view() {
        testDao.view();
    }
}
