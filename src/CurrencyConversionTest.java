import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by eggplant on 2014/11/26.
 */
public class CurrencyConversionTest {
    @Test
    public void currency_convert_10_dollar_add_60_rmb_equals_20_dollar(){
        assertEquals(20, (new Dollar(10)).add(new RMB(60)).getValue());
    }
    @Test
    public void currency_convert_10_rmb_add_6_dollar_equals_46_rmb(){
        assertEquals(46, (new RMB(10)).add(new Dollar(6)).getValue());
    }
}
