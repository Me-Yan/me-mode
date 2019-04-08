import com.me.inner.mode.ModeTest;
import com.me.inner.mode.adapter.second.AdapterTest;
import com.me.inner.mode.templateMode.TemplateModeTest;

/**
 * Created by yanyanghong on 2019/4/8.
 * 模板方法模式
 */
public class Application {

    public static void main(String[] args) {

        ModeTest mode = new TemplateModeTest();
        mode.test();

    }
}
