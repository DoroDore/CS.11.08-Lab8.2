import java.util.ArrayList;

public class Song {

    private final String mTitle;
    private final String mArtist;
    private final ArrayList<String> mListeners = new ArrayList<>();
    public Song(String title, String artist) {
        mTitle = title;
        mArtist = artist;
    }
    public String getTitle() {
        return mTitle;
    }
    public String getArtist() {
        return mArtist;
    }
    public int howMany(ArrayList<String> listeners) {
        int newListeners = 0;
        for (String listener : listeners) {
            if (!mListeners.contains(listener.toLowerCase())) {
                mListeners.add(listener.toLowerCase());
                newListeners++;
            }

        }
        return newListeners;
    }
}
