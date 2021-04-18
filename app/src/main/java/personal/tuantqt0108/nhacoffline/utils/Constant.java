package personal.tuantqt0108.nhacoffline.utils;

import android.provider.MediaStore;

public class Constant {
    /*TuanTeo: Mang cac thuoc tinh cua Song*/
    public static final String[] BASE_PROJECTION = new String[]{
            MediaStore.Audio.AudioColumns.TITLE,
            MediaStore.Audio.AudioColumns.TRACK,
            MediaStore.Audio.AudioColumns.YEAR,
            MediaStore.Audio.AudioColumns.DURATION,
            MediaStore.Audio.AudioColumns.DATA,
            MediaStore.Audio.AudioColumns.ALBUM,
            MediaStore.Audio.AudioColumns.ALBUM_ID,
            MediaStore.Audio.AudioColumns.ARTIST,
            MediaStore.Audio.AudioColumns.ARTIST_ID,
            MediaStore.Audio.AudioColumns.ALBUM_ID,
            MediaStore.Audio.AudioColumns._ID,
    };

    /*TuanTeo: vi tri cac thuoc tinh cua 1 bai hat luu trong database*/
    /*Properties's position when get by cursor*/
    public static final int PATH = 0;
    public static final int TRACK = 1;
    public static final int YEAR = 2;
    public static final int DURATION = 3;
    public static final int TITLE = 4;
    public static final int ALBUM_NAME = 5;
    public static final int ARTIST_ID = 6;
    public static final int ARTIST_NAME = 7;
    public static final int ALBUM_ID = 8;
    public static final int ID = 9;


}
