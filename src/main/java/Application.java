import com.me.inner.mode.ModeTest;
import com.me.inner.mode.abstractFactory.AbstractFactoryTest;
import com.me.inner.mode.adapter.second.AdapterTest;
import com.me.inner.mode.bridge.BridgeTest;
import com.me.inner.mode.builder.BuilderTest;
import com.me.inner.mode.chain.ChainTest;
import com.me.inner.mode.command.CommandTest;
import com.me.inner.mode.composite.CompositeTest;
import com.me.inner.mode.decorator.DecoratorTest;
import com.me.inner.mode.facade.FacadeTest;
import com.me.inner.mode.factoryMethod.FactoryMethodTest;
import com.me.inner.mode.flyweight.FlyweightTest;
import com.me.inner.mode.interpreter.InterpreterTest;
import com.me.inner.mode.mediator.MediatorTest;
import com.me.inner.mode.memento.MementoTest;
import com.me.inner.mode.observer.ObserverTest;
import com.me.inner.mode.prototype.PrototypeTest;
import com.me.inner.mode.proxy.ProxyTest;
import com.me.inner.mode.singleton.SingletonTest;
import com.me.inner.mode.state.StateTest;
import com.me.inner.mode.strategy.StrategyTest;
import com.me.inner.mode.templateMode.TemplateModeTest;
import com.me.inner.mode.visitor.VisitorTest;

import java.util.Random;

/**
 * Created by yanyanghong on 2019/4/8
 */
public class Application {

    public static void main(String[] args) {

        ModeTest mode = new InterpreterTest();
        mode.test();

    }
}
