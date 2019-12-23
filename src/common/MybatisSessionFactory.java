package common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisSessionFactory {
    private static final String CONFIG_PATH = "mybatis-config.xml";
    private static final ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();
    private static SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    private static SqlSessionFactory sessionFactory;
    private static String configFile = CONFIG_PATH;

    private MybatisSessionFactory(){

    }

    public static void rebuildSessionFactory(){
        try{
            InputStream in = Resources.getResourceAsStream(configFile);
            sessionFactory = builder.build(in);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        SqlSession session = threadLocal.get();
        if (session == null){
            if (sessionFactory == null){
                rebuildSessionFactory();
            }
            session = (sessionFactory!=null)?sessionFactory.openSession():null;
            threadLocal.set(session);
        }
        return session;
    }


    public static void close(){
        SqlSession session = threadLocal.get();
        threadLocal.set(null);
        if (session!= null){
            session.close();
        }
    }
}
