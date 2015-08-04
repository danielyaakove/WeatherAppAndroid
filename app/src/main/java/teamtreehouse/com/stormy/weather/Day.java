package teamtreehouse.com.stormy.weather;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Danielya on 30/07/2015.
 */
public class Day implements Parcelable {
    private long mTime;
    private String mSummery;
    private double mTemperatureMax;
    private String mIcon;
    private String mTimeZone;


    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummery() {
        return mSummery;
    }

    public void setSummery(String summery) {
        mSummery = summery;
    }

    public int getTemperatureMax() {

        return Forecast.ConvertToCelsius(mTemperatureMax);
    }

    public void setTemperatureMax(double temperatureMax) {
        mTemperatureMax = temperatureMax;
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

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public  int getIconID()
    {
        return Forecast.getIconID(mIcon);
    }

    public String getDayOfWeek()
    {
        SimpleDateFormat formater=new SimpleDateFormat("EEEE");
        formater.setTimeZone(TimeZone.getTimeZone(mTimeZone));

        Date dateTime = new Date(mTime*1000);
        String dayString ="";

       switch (formater.format(dateTime).toLowerCase()){
           case "sunday":
               dayString="ראשון" ;
               break;
           case "monday":
               dayString="שני" ;
               break;
           case "tuesday":
               dayString="שלישי" ;
               break;
           case "wednesday":
               dayString="רביעי" ;
               break;
           case "thursday":
               dayString="חמישי" ;
               break;
           case "friday":
               dayString="שישי" ;
               break;
           case "saturday":
               dayString="שבת" ;
               break;
       }

        return dayString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeLong(mTime);
        parcel.writeString(mSummery);
        parcel.writeDouble(mTemperatureMax);
        parcel.writeString(mIcon);
        parcel.writeString(mTimeZone);

    }

    public Day() {

    }

    private Day(Parcel parcel)
    {
        mTime=parcel.readLong();
        mSummery=parcel.readString();
        mTemperatureMax = parcel.readDouble();
        mIcon = parcel.readString();
        mTimeZone = parcel.readString();
    }

    public static final Creator<Day> CREATOR=new Creator<Day>() {
        @Override
        public Day createFromParcel(Parcel parcel) {
            return new Day(parcel);
        }

        @Override
        public Day[] newArray(int i) {
            return new Day[i];
        }
    };

}
