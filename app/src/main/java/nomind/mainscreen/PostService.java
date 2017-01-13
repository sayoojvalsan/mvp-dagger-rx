package nomind.mainscreen;

import java.util.List;

import nomind.model.Post;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by sayoojvalsan on 1/12/17.
 */

public interface PostService {

    @GET("/posts")
    Observable<List<Post>> getPostList();


}
