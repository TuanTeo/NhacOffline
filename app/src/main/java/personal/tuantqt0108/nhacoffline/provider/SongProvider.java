package personal.tuantqt0108.nhacoffline.provider;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;

import java.util.ArrayList;

import personal.tuantqt0108.nhacoffline.object.Song;
import personal.tuantqt0108.nhacoffline.utils.Constant;
import personal.tuantqt0108.nhacoffline.utils.Util;

/**
 * TuanTeo: Lop cung cap danh sach bai hat
 */
public class SongProvider {
    private static SongProvider sInstance;

    private ArrayList<Song> mListAllSongs;

    private SongProvider(Context context){
        mListAllSongs = getAllSongs(makeSongCursor(context));
    }

    public static SongProvider getInstance(Context context){
        if(sInstance == null){
            sInstance = new SongProvider(context);
        }
        return sInstance;
    }

    /**
     * TuanTeo: Lay ra danh sach tat ca bai hat trong bo nho
     * @param cursor
     * @return
     */
    private ArrayList<Song> getAllSongs(Cursor cursor) {
        ArrayList<Song> listAllSong = new ArrayList<>();
        while(cursor!=null && cursor.moveToFirst()){
            Song song = Util.getSongFromCursor(cursor, false);
            //Bai hat phai co thoi luong lon hon 5s
            if(song.getmDuration() >= 5000){
                listAllSong.add(song);
            }
            cursor.moveToNext();
        }
        return listAllSong;
    }

    /**
     * TuanTeo: Tao Cursor query CSDL chua nhac
     * @param context
     * @return
     */
    private Cursor makeSongCursor(Context context) {
        Cursor cursor = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                Constant.BASE_PROJECTION,null, null, null);
        return cursor;
    }

    public ArrayList<Song> getListAllSongs(){
        return mListAllSongs;
    }
}
