package api;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.Iterator;

public class xml {
    public static void main(String[] args) throws DocumentException {
        String text = "" +
                "<syncInfo><user><userId>10001111</userId><userName>中央用户系统管理员</userName><userType/><accountStatus>11</accountStatus><employeeId>S0000000000000569651</employeeId><departmentId>O0000000000000056522</departmentId><departmentName>教育部</departmentName><coporationId>O0000000000000056522</coporationId><corporationName>教育部</corporationName><userSex></userSex><userDuty></userDuty><userBirthday></userBirthday><userPost></userPost><userPostCode></userPostCode><userAlias></userAlias><userRank></userRank><userPhone></userPhone><userHomeAddress></userHomeAddress><userMobilePhone></userMobilePhone><userMailAddress></userMailAddress><userMSN></userMSN><userNt></userNt><userCA/><userPwd>79b2cf0337180351d2dcc5ee9d625481</userPwd><userClass>0</userClass><parentId>000013602</parentId><bxlx></bxlx></user><operationType>UPDATE_USER</operationType><msgId>297e4e3b42b6d19b0142b75a73250017</msgId></syncInfo>" +
                "";
        Document document = DocumentHelper.parseText(text);
        //获取根节点元素对象
        Element node = document.getRootElement();
        System.out.println("根节点：" + node.getName()); // 拿到根节点的名称
        Element operationType = node.element("operationType");
        System.out.println(operationType.getText());
        String msgId = node.element("msgId").getText();
        System.out.println("msgId:" + msgId);
        //遍历所有的元素节点
        Iterator iter = node.elementIterator("user"); // 获取根节点下的子节点cxtj
        while (iter.hasNext()) {
            Element user = (Element) iter.next();
            System.out.println(user.elementTextTrim("userId"));
            System.out.println(user.elementTextTrim("userName"));
            System.out.println(user.elementTextTrim("accountStatus"));
            System.out.println(user.elementTextTrim("employeeId"));
            System.out.println(user.elementTextTrim("userCA"));
            System.out.println(user.elementTextTrim("userClass"));
            System.out.println(user.elementTextTrim("parentId"));

        }
    }


}
