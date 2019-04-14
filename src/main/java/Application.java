import com.me.inner.mode.ModeTest;
import com.me.inner.mode.abstractFactory.AbstractFactoryTest;
import com.me.inner.mode.adapter.second.AdapterTest;
import com.me.inner.mode.bridge.BridgeTest;
import com.me.inner.mode.builder.BuilderTest;
import com.me.inner.mode.composite.CompositeTest;
import com.me.inner.mode.decorator.DecoratorTest;
import com.me.inner.mode.factoryMethod.FactoryMethodTest;
import com.me.inner.mode.prototype.PrototypeTest;
import com.me.inner.mode.singleton.SingletonTest;
import com.me.inner.mode.strategy.StrategyTest;
import com.me.inner.mode.templateMode.TemplateModeTest;

import java.util.Random;

/**
 * Created by yanyanghong on 2019/4/8.e
 */
public class Application {

    public static void main(String[] args) {

        ModeTest mode = new DecoratorTest();
        mode.test();

    }
}
