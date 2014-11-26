import com.sun.org.apache.bcel.internal.classfile.JavaClass;
import com.sun.org.apache.xml.internal.security.encryption.Reference;

import javax.print.attribute.Attribute;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.events.XMLEvent;

/**
 * Created by eggplant on 2014/11/26.
 */
public class RMB extends Currencies{
    private static final float RMB_TO_DOLLAR = 6;

    RMB(int number){
        super(number);
        this.exchangeRateToDollar = RMB_TO_DOLLAR;
    }
}
