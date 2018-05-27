package test;

import com.asiainfo.openplatform.AIESBClient;
import com.asiainfo.openplatform.TokenClient;
import com.asiainfo.openplatform.utils.AIESBConstants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName exec
 * @Description TODO
 * @Author zhangyong
 * @Date 2018/5/17 下午4:43
 * @Version 1.0
 **/
public class exec extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("石铭煜 is ssbb");
//        static Logger log=Logger.(test.class);
        doexec();
        System.out.println("石铭煜 is sb");



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        doGet(req,resp);
    }

    public static void doexec() {
        try {
        System.out.println("Hello World!");
        // 准备公共参数map
        Map<String, String> sysParam = new HashMap<String, String>();
        sysParam.put("apiCode", "OI_BalanceByAcctId");//需要根据不同用例进行替换
//sysParam.put("appId", "501086");
        sysParam.put("messageId", "83be127722b549a5a56a36664f676b04");
        sysParam.put("timestamp", "20181205104534");
        sysParam.put("accessToken", TokenClient.getToken() );
        sysParam.put("format", "json");

        InputStream input = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("OI_BalanceByAcctId.json");//需要根据不同用例进行替换

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
// 准备业务参数
        String busiParam = reader.readLine();

            // http接入
            System.out.println("http request response:" );
            String http_response = AIESBClient.execute(sysParam, busiParam, AIESBConstants.PROTOCOL.HTTP);
            System.out.println("http request response:" + http_response);

    reader.close();
}catch (Exception e){
            System.out.println("出错了");

}



    }

}
