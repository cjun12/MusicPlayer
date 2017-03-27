package pub.atropos.app.player.bean;

import java.util.List;

/**
 * Created by 980558 on 2017/3/27.
 */
public class Suggestion {

    private DataBean data;
    private List<String> Pro;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public List<String> getPro() {
        return Pro;
    }

    public void setPro(List<String> Pro) {
        this.Pro = Pro;
    }

    public static class DataBean {
        private List<SongBean> song;
        private List<AlbumBean> album;
        private List<ArtistBean> artist;

        public List<SongBean> getSong() {
            return song;
        }

        public void setSong(List<SongBean> song) {
            this.song = song;
        }

        public List<AlbumBean> getAlbum() {
            return album;
        }

        public void setAlbum(List<AlbumBean> album) {
            this.album = album;
        }

        public List<ArtistBean> getArtist() {
            return artist;
        }

        public void setArtist(List<ArtistBean> artist) {
            this.artist = artist;
        }

        public static class SongBean {

            private String bitrate_fee;
            private String weight;
            private String songname;
            private String songid;
            private String has_mv;
            private String yyr_artist;
            private String artistname;
            private String resource_type_ext;
            private String resource_provider;
            private String encrypted_songid;

            public String getBitrate_fee() {
                return bitrate_fee;
            }

            public void setBitrate_fee(String bitrate_fee) {
                this.bitrate_fee = bitrate_fee;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getSongname() {
                return songname;
            }

            public void setSongname(String songname) {
                this.songname = songname;
            }

            public String getSongid() {
                return songid;
            }

            public void setSongid(String songid) {
                this.songid = songid;
            }

            public String getHas_mv() {
                return has_mv;
            }

            public void setHas_mv(String has_mv) {
                this.has_mv = has_mv;
            }

            public String getYyr_artist() {
                return yyr_artist;
            }

            public void setYyr_artist(String yyr_artist) {
                this.yyr_artist = yyr_artist;
            }

            public String getArtistname() {
                return artistname;
            }

            public void setArtistname(String artistname) {
                this.artistname = artistname;
            }

            public String getResource_type_ext() {
                return resource_type_ext;
            }

            public void setResource_type_ext(String resource_type_ext) {
                this.resource_type_ext = resource_type_ext;
            }

            public String getResource_provider() {
                return resource_provider;
            }

            public void setResource_provider(String resource_provider) {
                this.resource_provider = resource_provider;
            }

            public String getEncrypted_songid() {
                return encrypted_songid;
            }

            public void setEncrypted_songid(String encrypted_songid) {
                this.encrypted_songid = encrypted_songid;
            }
        }

        public static class AlbumBean {

            private String albumname;
            private String weight;
            private String artistname;
            private String resource_type_ext;
            private String artistpic;
            private String albumid;

            public String getAlbumname() {
                return albumname;
            }

            public void setAlbumname(String albumname) {
                this.albumname = albumname;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getArtistname() {
                return artistname;
            }

            public void setArtistname(String artistname) {
                this.artistname = artistname;
            }

            public String getResource_type_ext() {
                return resource_type_ext;
            }

            public void setResource_type_ext(String resource_type_ext) {
                this.resource_type_ext = resource_type_ext;
            }

            public String getArtistpic() {
                return artistpic;
            }

            public void setArtistpic(String artistpic) {
                this.artistpic = artistpic;
            }

            public String getAlbumid() {
                return albumid;
            }

            public void setAlbumid(String albumid) {
                this.albumid = albumid;
            }
        }

        public static class ArtistBean {

            private String yyr_artist;
            private String artistname;
            private String artistid;
            private String artistpic;
            private String weight;

            public String getYyr_artist() {
                return yyr_artist;
            }

            public void setYyr_artist(String yyr_artist) {
                this.yyr_artist = yyr_artist;
            }

            public String getArtistname() {
                return artistname;
            }

            public void setArtistname(String artistname) {
                this.artistname = artistname;
            }

            public String getArtistid() {
                return artistid;
            }

            public void setArtistid(String artistid) {
                this.artistid = artistid;
            }

            public String getArtistpic() {
                return artistpic;
            }

            public void setArtistpic(String artistpic) {
                this.artistpic = artistpic;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }
        }
    }
}
