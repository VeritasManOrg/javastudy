package main.java.controller.interfaces;

import main.java.businessname.entity.userBean;
import main.java.businessname.service.implments.userServImpl;
import main.java.businessname.service.interfaces.userServ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName abc
 * @Description TODO
 * @Author zhangyong
 * @Date 2018/5/25 上午2:03
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/")
public class abc {




    @RequestMapping(value = "/hello")
    public Object hello(Model modelMap,String username){
        System.out.println("hello,wp");
        System.out.println("已经进入控制器");
        modelMap.addAttribute("message","hello word");
        userServ userServ=new userServImpl();
        userBean userBean=new userBean();
        userBean.setUserName(username);
        if (userServ.OI_addUser(userBean)) {
            modelMap.addAttribute("username", username);
            return "hello";
        }
        return null;
    }
}
