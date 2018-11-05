import com.itheima.dao.ItemMapper;
import com.itheima.domain.Item;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testMyBatis() throws Exception {
        InputStream in = Resources.getResourceAsStream("myBatisConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sessionFactory.openSession(true);
        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);
        List<Item> items = itemMapper.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
