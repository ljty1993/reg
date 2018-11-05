import com.itheima.domain.Item;
import com.itheima.service.ItemService;
import com.itheima.service.impl.ItemServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void testSpring(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("springConfig.xml");
        ItemService itemService = ac.getBean("itemServiceImpl", ItemServiceImpl.class);
        List<Item> items = itemService.findAll();
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
