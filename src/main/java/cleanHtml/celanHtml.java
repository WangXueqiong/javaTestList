package cleanHtml;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class celanHtml {




    public static void main(String[] args){
        //声明Connection对象
        Connection con;
//驱动程序名
        String driver = "com.mysql.cj.jdbc.Driver";
//URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://192.168.3.55:3306/alengin?serverTimezone=GMT%2b8&useSSL=false";
//MySQL配置时的用户名
        String user = "root";
//MySQL配置时的密码
        String password = "123456";
//遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //要执行的SQL语句
            String sql = "select t.ITEM_ID,t.CONTENT,t.HOWTO,t.CORRECT_RESPONSE from al_res_zhuguan_item t ";
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(sql);
            System.out.println("-----------------");

            Whitelist whitelist =new Whitelist();
            whitelist.addAttributes("img", "src");

            String upSql = "update al_res_zhuguan_item t set t.content = ?,t.HOWTO = ?,t.CORRECT_RESPONSE=? where 1=1 and t.ITEM_ID = ?";
            PreparedStatement stmt = con.prepareStatement(upSql);
            while(rs.next()){
                //获取stuname这列数据
                String itemId = rs.getString("ITEM_ID");
                String content = rs.getString("CONTENT");
                String howTo = rs.getString("HOWTO");
                String cr = rs.getString("CORRECT_RESPONSE");
                //输出结果
                if(StringUtils.isBlank(content)){
                    content = "";
                }
                content = Jsoup.clean(content, whitelist);

                if(StringUtils.isBlank(howTo)){
                    howTo = "";
                }
                howTo = Jsoup.clean(howTo, whitelist);

                if(StringUtils.isBlank(cr)){
                    cr = "";
                }
                cr = Jsoup.clean(cr, whitelist);

                stmt.setString(1,content);
                stmt.setString(2,howTo);
                stmt.setString(3,cr);
                stmt.setString(4,itemId);
                Integer i = stmt.executeUpdate();
                System.out.println(itemId + ":" + i);
            }
            System.out.println("finish");
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }




    }


    public void test2(){
        String str = "<p class=MsoNormal align=left style='text-align:left'>从上面看能得到<img\n" +
                "width=60 height=43 id=\"图片 674\"\n" +
                "src=\"/alEngin/upload/word/4028803a2c408e3e012c409026b60005/2c2880432c7d6f51012c7e300e9c0021/2c2880432dc13f98012e513e99d402f4//howto/2c2880432dc13f98012e513ed0e102f5.files/image001.jpg\">，从正面看能得到<img\n" +
                "width=56 height=55 id=\"图片 675\"\n" +
                "src=\"/alEngin/upload/word/4028803a2c408e3e012c409026b60005/2c2880432c7d6f51012c7e300e9c0021/2c2880432dc13f98012e513e99d402f4//howto/2c2880432dc13f98012e513ed0e102f5.files/image002.jpg\">，从左面能看得到<img\n" +
                "width=44 height=51 id=\"图片 676\"\n" +
                "src=\"/alEngin/upload/word/4028803a2c408e3e012c409026b60005/2c2880432c7d6f51012c7e300e9c0021/2c2880432dc13f98012e513e99d402f4//howto/2c2880432dc13f98012e513ed0e102f5.files/image003.jpg\"></p>\n" +
                "<p class=MsoNormal align=left style='text-align:left'>正确答案是：<img\n" +
                "width=44 height=51 id=\"图片 677\"\n" +
                "src=\"/alEngin/upload/word/4028803a2c408e3e012c409026b60005/2c2880432c7d6f51012c7e300e9c0021/2c2880432dc13f98012e513e99d402f4//howto/2c2880432dc13f98012e513ed0e102f5.files/image003.jpg\"></p>";
        Whitelist whitelist =new Whitelist();
        whitelist.addAttributes("img", "src");
        String clean = Jsoup.clean(str, whitelist);
        System.out.println(clean);
    }
}
