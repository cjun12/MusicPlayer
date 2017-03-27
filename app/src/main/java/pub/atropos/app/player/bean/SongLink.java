package pub.atropos.app.player.bean;

import java.util.List;

/**
 * Created by 980558 on 2017/3/27.
 */
public class SongLink {

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

        private int time;
        private String xcode;
        private List<SongListBean> songList;

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getXcode() {
            return xcode;
        }

        public void setXcode(String xcode) {
            this.xcode = xcode;
        }

        public List<SongListBean> getSongList() {
            return songList;
        }

        public void setSongList(List<SongListBean> songList) {
            this.songList = songList;
        }

        public static class SongListBean {

            private String queryId;
            private int status;
            private int songId;
            private String songName;
            private String artistId;
            private String artistName;
            private int albumId;
            private String albumName;
            private String lrcLink;
            private int time;
            private int linkCode;
            private String songLink;
            private String showLink;
            private String format;
            private int rate;
            private int size;
            private Object linkinfo;
            private String version;
            private int copyType;
            private String enhancement;

            public String getQueryId() {
                return queryId;
            }

            public void setQueryId(String queryId) {
                this.queryId = queryId;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getSongId() {
                return songId;
            }

            public void setSongId(int songId) {
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

            public String getLrcLink() {
                return lrcLink;
            }

            public void setLrcLink(String lrcLink) {
                this.lrcLink = lrcLink;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public int getLinkCode() {
                return linkCode;
            }

            public void setLinkCode(int linkCode) {
                this.linkCode = linkCode;
            }

            public String getSongLink() {
                return songLink;
            }

            public void setSongLink(String songLink) {
                this.songLink = songLink;
            }

            public String getShowLink() {
                return showLink;
            }

            public void setShowLink(String showLink) {
                this.showLink = showLink;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }

            public int getRate() {
                return rate;
            }

            public void setRate(int rate) {
                this.rate = rate;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public Object getLinkinfo() {
                return linkinfo;
            }

            public void setLinkinfo(Object linkinfo) {
                this.linkinfo = linkinfo;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public int getCopyType() {
                return copyType;
            }

            public void setCopyType(int copyType) {
                this.copyType = copyType;
            }

            public String getEnhancement() {
                return enhancement;
            }

            public void setEnhancement(String enhancement) {
                this.enhancement = enhancement;
            }
        }
    }
}
