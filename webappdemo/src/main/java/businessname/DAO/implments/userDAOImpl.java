package main.java.businessname.DAO.implments;

import main.java.businessname.DAO.interfaces.UserDAO;
import main.java.businessname.entity.userBean;

/**
 * @ClassName userDAOImpl
 * @Description TODO
 * @Author zhangyong
 * @Date 2018/5/28 上午1:16
 * @Version 1.0
 **/
public class userDAOImpl implements UserDAO {
    @Override
    public boolean addUser(userBean user) {
        System.out.println("add commit"+user.getUserName());
        return true;
    }
}
