package personal.tuantqt0108.nhacoffline.utils;

import android.database.Cursor;

import personal.tuantqt0108.nhacoffline.object.Song;

/**
 * TuanTeo: Lop chua cac ham dung chung
 */
public class Util {

    /**
     * Ham tra ve 1 doi tuong Song tu Cursor
     * @param cursor
     * @param isFavorite
     * @return
     */
    public static Song getSongFromCursor(Cursor cursor, boolean isFavorite){
        String title = cursor.getString(Constant.TITLE);
        int trackNumber = cursor.getInt(Constant.TRACK);
        int year = cursor.getInt(Constant.YEAR);
        int duration = cursor.getInt(Constant.DURATION);
        String path = cursor.getString(Constant.PATH);
        String albumName = cursor.getString(Constant.ALBUM_NAME);
        int albumId = cursor.getInt(Constant.ALBUM_ID);
        int artistId = cursor.getInt(Constant.ARTIST_ID);
        String artistName = cursor.getString(Constant.ARTIST_NAME);
        int id = cursor.getInt(Constant.ID);

        return new Song(title, trackNumber, duration, path, albumName, artistId, artistName, year, albumName, id, isFavorite);
    }

}
