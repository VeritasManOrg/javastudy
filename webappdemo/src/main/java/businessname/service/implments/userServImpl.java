package main.java.businessname.service.implments;

import main.java.businessname.DAO.implments.userDAOImpl;
import main.java.businessname.DAO.interfaces.UserDAO;
import main.java.businessname.entity.userBean;
import main.java.businessname.service.interfaces.userServ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName userServImpl
 * @Description TODO
 * @Author zhangyong
 * @Date 2018/5/28 上午1:10
 * @Version 1.0
 **/
public class userServImpl implements userServ {
    @Override
    public boolean OI_addUser(userBean userBean)  {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//        UserDAO user= new userDAOImpl();
        UserDAO user=(userDAOImpl)context.getBean("userBean");
        return user.addUser(userBean);
    }
}
