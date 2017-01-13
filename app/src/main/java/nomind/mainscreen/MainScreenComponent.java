package nomind.mainscreen;

import dagger.Component;
import nomind.daggertest.MainActivity;
import nomind.network.NetComponent;

/**
 * Created by sayoojvalsan on 1/12/17.
 */
@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);

}
