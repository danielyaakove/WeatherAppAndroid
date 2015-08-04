package teamtreehouse.com.stormy.weather;

import teamtreehouse.com.stormy.R;

/**
 * Created by Danielya on 30/07/2015.
 */
public class Forecast {
    private Current mCurrent;
    private Hour[] mHourlyForcast;
    private Day[] mdailyForcast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourlyForcast() {
        return mHourlyForcast;
    }

    public void setHourlyForcast(Hour[] hourlyForcast) {
        mHourlyForcast = hourlyForcast;
    }

    public Day[] getDailyForcast() {
        return mdailyForcast;
    }

    public void setDailyForcast(Day[] mdailyForcast) {
        this.mdailyForcast = mdailyForcast;
    }

    public static int getIconID(String iconString)
    {
        int iconId = R.drawable.clear_day;

        if (iconString.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        }
        else if (iconString.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        }
        else if (iconString.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (iconString.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (iconString.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (iconString.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (iconString.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (iconString.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (iconString.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (iconString.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }

    public static int ConvertToCelsius(double fahrenheitTemperature)
    {
        int celsiusTemperature=0;

        celsiusTemperature = (int) Math.round(((fahrenheitTemperature - 32) * 5) / 9);
        return celsiusTemperature;
    }
}
