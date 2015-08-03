package teamtreehouse.com.stormy.weather;

/**
 * Created by Danielya on 30/07/2015.
 */
public class Hour {
    private long mTime;
    private String sSummery;
    private double mTemperature;
    private String mIcon;
    private String mTimeZone;

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getsSummery() {
        return sSummery;
    }

    public void setsSummery(String sSummery) {
        this.sSummery = sSummery;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone)
    {
        mTimeZone = timeZone;
    }
}
