package pub.atropos.app.player.presenter.impl;

import android.database.Cursor;
import android.provider.MediaStore;

import pub.atropos.app.player.model.ISongModel;
import pub.atropos.app.player.model.impl.SongModelImpl;
import pub.atropos.app.player.presenter.IHomePresenter;
import pub.atropos.app.player.view.IHomeView;

/**
 * Created by 980558 on 2017/3/27.
 */
public class HomePresenterImpl implements IHomePresenter {
    private ISongModel songModel;
    private IHomeView homeView;

    public HomePresenterImpl(IHomeView homeView) {
        this.homeView = homeView;
        this.songModel = new SongModelImpl(this);
    }

    @Override
    public void showLocalSong() {

    }

    @Override
    public String getSongById() {
        return null;
    }

    @Override
    public void changeLocalSongCount() {
        int cnt=0;
        Cursor cursor = homeView.getContext().getContentResolver()
                .query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,null,null,null,null);
        while(cursor.moveToNext()){
            cnt++;
        }
        homeView.changeLocalSongCount(cnt);
    }
}
