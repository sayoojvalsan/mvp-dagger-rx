package nomind.network;

import javax.inject.Singleton;

import dagger.Component;
import nomind.module.AppModule;
import retrofit2.Retrofit;

/**
 * Created by sayoojvalsan on 1/12/17.
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {


    Retrofit retrofit();

}
