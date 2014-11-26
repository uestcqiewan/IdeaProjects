import com.sun.org.apache.bcel.internal.util.ClassSet;
import com.sun.org.apache.xml.internal.security.encryption.ReferenceList;

import javax.print.attribute.AttributeSet;
import javax.xml.stream.XMLEventWriter;
import java.util.Currency;

/**
 * Created by eggplant on 2014/11/26.
 */
public class Dollar extends Currencies{
    public Dollar(int number) {
        super(number);
        this.exchangeRateToDollar = 1;
    }
}
