package net.trolldad.dashclock.redditheadlines.imgur;

/**
 * Created by jacob-tabak on 1/18/14.
 */
public class ImgurImageResponse {
    public boolean success;
    public int status;
    private ImgurImage data;

    public ImgurImage getImage() {
        return data;
    }
}
