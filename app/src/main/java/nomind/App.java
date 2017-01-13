package nomind;

import android.app.Application;

import nomind.module.AppModule;
import nomind.network.DaggerNetComponent;
import nomind.network.NetComponent;
import nomind.network.NetModule;

/**
 * Created by sayoojvalsan on 1/12/17.
 */

public class App extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
       mNetComponent = DaggerNetComponent.builder().netModule(new NetModule("http://jsonplaceholder.typicode.com")).appModule(new AppModule(this)).build();

    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
