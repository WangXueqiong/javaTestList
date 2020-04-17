package api;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

public class api {

    public static void main(String[] args){
        api2();
    }

    private static void api1(){
        String result = "";
        try {
            String endpoint = "http://211.153.22.29:8091/scms_sin/services/UserPermissionWebService";
//            String endpoint = "http://localhost:8080/scms_sin/services/UserPermissionWebService";
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);
            call.setOperationName("queryTableOut");//设置调用方法名
            call.addParameter("xtbh", org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);//接口的参数
            call.addParameter("jkxlh",org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.addParameter("jkid",org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.addParameter("tableName",org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.addParameter("from",org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.addParameter("end",org.apache.axis.encoding.XMLType.XSD_STRING,javax.xml.rpc.ParameterMode.IN);
            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型

            String xtbh = "JHPT";
            String jkxlh="S9JnRXCvkEww/hoVMNmDlA==";
            String jkid="01YHRZ";
            String tableName="BASE_PROPERTIES";
            String from="0";
            String end="1";

            //result = (String)call.invoke(new Object[]{xtbh,jkxlh,jkid,QueryXmlDoc});
            result = (String)call.invoke(new Object[]{xtbh,jkxlh,jkid,tableName,from,end});
            System.out.println(result);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void api2(){
        String namespace = "http://loushang.ws";
        String result = "";
        String msgId = "ff80808167aaa21b0167aaa353110003";
        try {
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(
                    "http://smartedu.gsedu.cn/uum/services/updateMsgActionStatus.updateMsgActionStatus"));
            call.setOperationStyle(Style.RPC);
            call.setOperationUse(Use.LITERAL);
            call.setOperationName(new QName(namespace, "updateMsgActionStatus"));
            Object obj = call.invoke(new Object[] {msgId });
            result = (String) obj;
            System.out.println(result);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
