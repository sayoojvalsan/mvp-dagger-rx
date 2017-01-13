package nomind.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import nomind.App;
import nomind.mainscreen.DaggerMainScreenComponent;
import nomind.mainscreen.MainScreenContract;
import nomind.mainscreen.MainScreenModule;
import nomind.mainscreen.MainScreenPresenter;
import nomind.model.Post;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    MainScreenPresenter mMainScreenPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainScreenComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .mainScreenModule(new MainScreenModule(this))
                .build().inject(this);


        mMainScreenPresenter.loadPost();

    }

    @Override
    public void showPosts(List<Post> posts) {
        Toast.makeText(getApplicationContext(), "Posts = " + posts, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getApplicationContext(), "message = " + message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showComplete() {
        Toast.makeText(getApplicationContext(), "show Complete", Toast.LENGTH_SHORT).show();

    }
}
