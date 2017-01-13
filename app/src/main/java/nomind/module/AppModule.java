package nomind.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sayoojvalsan on 1/12/17.
 */


@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }


    @Singleton
    @Provides
    Application provideApplication(){
        return mApplication;
    }
}
