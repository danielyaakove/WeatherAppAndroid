package teamtreehouse.com.stormy.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import teamtreehouse.com.stormy.R;

/**
 * Created by benjakuben on 12/8/14.
 */
public class Current {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;

    public String getmTimeZone() {
        return mTimeZone;
    }

    public void setmTimeZone(String mTimeZone) {
        this.mTimeZone = mTimeZone;
    }

    private String mTimeZone;

    public  int getIconID(){

       return Forecast.getIconID(mIcon);
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int) Math.round( mTemperature/2.8888);
    }

    public String getFormattedTime() {

        SimpleDateFormat formatter=new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getmTimeZone()));
        Date dateTime = new Date(getTime()*1000);

        String timeZoneString = formatter.format(dateTime);

        return timeZoneString;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int  getPrecipChance() {

        return (int) Math.round(mPrecipChance*100);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }
}
