package pub.atropos.app.player.bean;

import java.util.List;

/**
 * Created by 980558 on 2017/3/27.
 */
public class SongInfo {

    private int errorCode;
    private DataBean data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<SongListBean> songList;

        public List<SongListBean> getSongList() {
            return songList;
        }

        public void setSongList(List<SongListBean> songList) {
            this.songList = songList;
        }

        public static class SongListBean {

            private String queryId;
            private String songId;
            private String songName;
            private String artistId;
            private String artistName;
            private int albumId;
            private String albumName;
            private String songPicSmall;
            private String songPicBig;
            private String songPicRadio;
            private String relateStatus;
            private String resourceType;
            private int del_status;
            private String fchar;
            private String allRate;
            private String distribution;
            private int area;
            private int compress_status;
            private int tingUid;
            private int sid;
            private int musician;
            private int resource_type_ext;
            private String source;
            private String yyr_artist_id;
            private int korean_bb_song;
            private int has_mv;
            private String encryptedSongid;
            private String resource_provider;
            private int baidu_has;
            private String bitrate_fee;
            private String si_presale_flag;
            private String si_market_price;
            private String si_price;
            private String publishtime;
            private int beDownloaded;
            private int bePlayed;
            private int bePaged;
            private int isJump;
            private int beCollected;
            private List<?> song_links;

            public String getQueryId() {
                return queryId;
            }

            public void setQueryId(String queryId) {
                this.queryId = queryId;
            }

            public String getSongId() {
                return songId;
            }

            public void setSongId(String songId) {
                this.songId = songId;
            }

            public String getSongName() {
                return songName;
            }

            public void setSongName(String songName) {
                this.songName = songName;
            }

            public String getArtistId() {
                return artistId;
            }

            public void setArtistId(String artistId) {
                this.artistId = artistId;
            }

            public String getArtistName() {
                return artistName;
            }

            public void setArtistName(String artistName) {
                this.artistName = artistName;
            }

            public int getAlbumId() {
                return albumId;
            }

            public void setAlbumId(int albumId) {
                this.albumId = albumId;
            }

            public String getAlbumName() {
                return albumName;
            }

            public void setAlbumName(String albumName) {
                this.albumName = albumName;
            }

            public String getSongPicSmall() {
                return songPicSmall;
            }

            public void setSongPicSmall(String songPicSmall) {
                this.songPicSmall = songPicSmall;
            }

            public String getSongPicBig() {
                return songPicBig;
            }

            public void setSongPicBig(String songPicBig) {
                this.songPicBig = songPicBig;
            }

            public String getSongPicRadio() {
                return songPicRadio;
            }

            public void setSongPicRadio(String songPicRadio) {
                this.songPicRadio = songPicRadio;
            }

            public String getRelateStatus() {
                return relateStatus;
            }

            public void setRelateStatus(String relateStatus) {
                this.relateStatus = relateStatus;
            }

            public String getResourceType() {
                return resourceType;
            }

            public void setResourceType(String resourceType) {
                this.resourceType = resourceType;
            }

            public int getDel_status() {
                return del_status;
            }

            public void setDel_status(int del_status) {
                this.del_status = del_status;
            }

            public String getFchar() {
                return fchar;
            }

            public void setFchar(String fchar) {
                this.fchar = fchar;
            }

            public String getAllRate() {
                return allRate;
            }

            public void setAllRate(String allRate) {
                this.allRate = allRate;
            }

            public String getDistribution() {
                return distribution;
            }

            public void setDistribution(String distribution) {
                this.distribution = distribution;
            }

            public int getArea() {
                return area;
            }

            public void setArea(int area) {
                this.area = area;
            }

            public int getCompress_status() {
                return compress_status;
            }

            public void setCompress_status(int compress_status) {
                this.compress_status = compress_status;
            }

            public int getTingUid() {
                return tingUid;
            }

            public void setTingUid(int tingUid) {
                this.tingUid = tingUid;
            }

            public int getSid() {
                return sid;
            }

            public void setSid(int sid) {
                this.sid = sid;
            }

            public int getMusician() {
                return musician;
            }

            public void setMusician(int musician) {
                this.musician = musician;
            }

            public int getResource_type_ext() {
                return resource_type_ext;
            }

            public void setResource_type_ext(int resource_type_ext) {
                this.resource_type_ext = resource_type_ext;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getYyr_artist_id() {
                return yyr_artist_id;
            }

            public void setYyr_artist_id(String yyr_artist_id) {
                this.yyr_artist_id = yyr_artist_id;
            }

            public int getKorean_bb_song() {
                return korean_bb_song;
            }

            public void setKorean_bb_song(int korean_bb_song) {
                this.korean_bb_song = korean_bb_song;
            }

            public int getHas_mv() {
                return has_mv;
            }

            public void setHas_mv(int has_mv) {
                this.has_mv = has_mv;
            }

            public String getEncryptedSongid() {
                return encryptedSongid;
            }

            public void setEncryptedSongid(String encryptedSongid) {
                this.encryptedSongid = encryptedSongid;
            }

            public String getResource_provider() {
                return resource_provider;
            }

            public void setResource_provider(String resource_provider) {
                this.resource_provider = resource_provider;
            }

            public int getBaidu_has() {
                return baidu_has;
            }

            public void setBaidu_has(int baidu_has) {
                this.baidu_has = baidu_has;
            }

            public String getBitrate_fee() {
                return bitrate_fee;
            }

            public void setBitrate_fee(String bitrate_fee) {
                this.bitrate_fee = bitrate_fee;
            }

            public String getSi_presale_flag() {
                return si_presale_flag;
            }

            public void setSi_presale_flag(String si_presale_flag) {
                this.si_presale_flag = si_presale_flag;
            }

            public String getSi_market_price() {
                return si_market_price;
            }

            public void setSi_market_price(String si_market_price) {
                this.si_market_price = si_market_price;
            }

            public String getSi_price() {
                return si_price;
            }

            public void setSi_price(String si_price) {
                this.si_price = si_price;
            }

            public String getPublishtime() {
                return publishtime;
            }

            public void setPublishtime(String publishtime) {
                this.publishtime = publishtime;
            }

            public int getBeDownloaded() {
                return beDownloaded;
            }

            public void setBeDownloaded(int beDownloaded) {
                this.beDownloaded = beDownloaded;
            }

            public int getBePlayed() {
                return bePlayed;
            }

            public void setBePlayed(int bePlayed) {
                this.bePlayed = bePlayed;
            }

            public int getBePaged() {
                return bePaged;
            }

            public void setBePaged(int bePaged) {
                this.bePaged = bePaged;
            }

            public int getIsJump() {
                return isJump;
            }

            public void setIsJump(int isJump) {
                this.isJump = isJump;
            }

            public int getBeCollected() {
                return beCollected;
            }

            public void setBeCollected(int beCollected) {
                this.beCollected = beCollected;
            }

            public List<?> getSong_links() {
                return song_links;
            }

            public void setSong_links(List<?> song_links) {
                this.song_links = song_links;
            }
        }
    }
}
