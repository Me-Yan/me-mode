import com.me.inner.mode.ModeTest;
import com.me.inner.mode.abstractFactory.AbstractFactoryTest;
import com.me.inner.mode.adapter.second.AdapterTest;
import com.me.inner.mode.builder.BuilderTest;
import com.me.inner.mode.factoryMethod.FactoryMethodTest;
import com.me.inner.mode.prototype.PrototypeTest;
import com.me.inner.mode.singleton.SingletonTest;
import com.me.inner.mode.templateMode.TemplateModeTest;

/**
 * Created by yanyanghong on 2019/4/8.
 */
public class Application {

    public static void main(String[] args) {

        ModeTest mode = new AbstractFactoryTest();
        mode.test();

    }
}
