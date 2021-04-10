import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ClassPathResourceTest {
    public static void main(String[] args) throws Exception {
        ClassPathResource cr = new ClassPathResource("student.xml");
        //获取资源的简单信息
        System.out.println(cr.getFilename());
        System.out.println(cr.getDescription());
        //创建Dom4j的解析器
        SAXReader reader = new SAXReader();
        Document doc = reader.read(cr.getFile());
        //获取根元素
        Element el = doc.getRootElement();
        List l = el.elements();
        //遍历根元素的全部子元素
        for(Iterator it1 = l.iterator(); it1.hasNext();)
        {
            Element student = (Element)it1.next();
            List ll = student.elements();
            //遍历每个节点的全部子节点
            for(Iterator it2 = ll.iterator(); it2.hasNext();)
            {
                Element eee = (Element)it2.next();
                System.out.println(eee.getText());
            }
        }
    }
}
