package nomind.mainscreen;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sayoojvalsan on 1/12/17.
 */

@Module
public class MainScreenModule {

    private final MainScreenContract.View mView;

    public MainScreenModule(MainScreenContract.View view) {
        mView = view;
    }


    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
