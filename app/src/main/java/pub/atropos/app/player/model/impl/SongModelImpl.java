package pub.atropos.app.player.model.impl;

import pub.atropos.app.player.model.ISongModel;
import pub.atropos.app.player.presenter.IHomePresenter;

/**
 * Created by 980558 on 2017/3/29.
 */

public class SongModelImpl implements ISongModel {
    private IHomePresenter songPresenter;

    public SongModelImpl(IHomePresenter songPresenter) {
        this.songPresenter = songPresenter;
    }


    @Override
    public void searchInternetSong() {

    }
}
