package pub.atropos.app.player.Service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 980558 on 2017/3/27.
 */
public interface ISongServes {
    final static String BASEURL = "http://play.baidu.com/";
    @GET("data/music/songinfo")
    public Call<String> getInfo(@Query("songIds") String ids);
    @GET("data/music/songlink")
    public Call<String> getLink(@Query("songIds") String ids);
}
