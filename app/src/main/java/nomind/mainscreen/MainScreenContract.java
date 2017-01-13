package nomind.mainscreen;

import java.util.List;

import nomind.model.Post;

/**
 * Created by sayoojvalsan on 1/12/17.
 */

public interface MainScreenContract {

    interface View{

        void showPosts(List<Post> posts);

        void showError(String message);

        void showComplete();


    }

    interface  Presenter{
        void loadPost();
    }
}
