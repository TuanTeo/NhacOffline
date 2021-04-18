package personal.tuantqt0108.nhacoffline.object;

import android.content.ContentUris;
import android.net.Uri;

import java.text.SimpleDateFormat;

public class Song {
    private final String mtitle;
    private final int mTrackNumber;
    private final int mDuration;
    private final String mPath;
    private final String mAlbumName;
    private final int mArtistId;
    private final String mArtistName;
    private final int mYear;
    private final String mAlbumID;
    private final int mID;


    //bien xac dinh la bai hat yeu thich hay khong
    private boolean mIsFavorite;

    //Diem so lan phat nhac cua bai hat
    private int mCount;

    public Song(String title, int trackNumber, int duration, String path, String mAlbumName,
                int mArtistId, String mArtistName, int mYear, String albumName, int id, boolean mIsFavorite) {
        this.mtitle = title;
        this.mTrackNumber = trackNumber;
        this.mDuration = duration;
        this.mPath = path;
        this.mAlbumID = mAlbumName;
        this.mArtistId = mArtistId;
        this.mArtistName = mArtistName;
        this.mYear = mYear;
        this.mAlbumName = albumName;
        this.mID = id;
        this.mIsFavorite = mIsFavorite;
    }


    public void countIncrease(){
        if(!mIsFavorite){
            mCount++;
        } else {
            mIsFavorite = true;
            mCount = 0;
        }
    }

    //Ham tra ve text tong thoi gian cua bai hat
    public String getDurationString(){
        int totalTime = this.mDuration;
        SimpleDateFormat format = new SimpleDateFormat("mm:ss");
        return format.format(totalTime);
    }

    /*Ham lay Uri cua anh album*/
    public Uri queryUriAlbumImage(){
        final Uri artworkUri = Uri.parse("content://media/external/audio/albumart");
        return ContentUris.withAppendedId(artworkUri, Long.parseLong(mAlbumID));
    }

    public String getMtitle() {
        return mtitle;
    }

    public int getmTrackNumber() {
        return mTrackNumber;
    }

    public int getmDuration() {
        return mDuration;
    }

    public String getmPath() {
        return mPath;
    }

    public String getmAlbumName() {
        return mAlbumName;
    }

    public int getmArtistId() {
        return mArtistId;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public int getmYear() {
        return mYear;
    }

    public String getmAlbumID() {
        return mAlbumID;
    }

    public int getmID() {
        return mID;
    }

    public boolean ismIsFavorite() {
        return mIsFavorite;
    }

    public void setmIsFavorite(boolean mIsFavorite) {
        this.mIsFavorite = mIsFavorite;
    }

    public int getmCount() {
        return mCount;
    }

    public void setmCount(int mCount) {
        this.mCount = mCount;
    }
}
