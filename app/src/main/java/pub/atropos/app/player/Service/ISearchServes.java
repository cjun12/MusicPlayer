package pub.atropos.app.player.Service;

import io.reactivex.Observable;
import pub.atropos.app.player.bean.SearchResult;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by 980558 on 2017/3/27.
 * baseUrl
 */
public interface ISearchServes {

    final static String BASEURL="http://sug.music.baidu.com/";

    @Headers("User-Agent:Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 UBrowser/6.1.2107.204 Safari/537.36")
    @GET("info/suggestion?from=0")
    Observable<SearchResult> getIds(@Query("word") String search);
}
