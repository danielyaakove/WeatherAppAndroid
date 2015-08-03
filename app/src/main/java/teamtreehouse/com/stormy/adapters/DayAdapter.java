package teamtreehouse.com.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import teamtreehouse.com.stormy.R;
import teamtreehouse.com.stormy.weather.Day;

/**
 * Created by Danielya on 02/08/2015.
 */
public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;


    public DayAdapter(Context context, Day[] days) {
        mContext = context;
        mDays = days;

    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int i) {
        return mDays[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder ;

        if (view == null) {
            //brand new view

            view = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);

            holder = new ViewHolder();
            holder.iconImageView = (ImageView) view.findViewById(R.id.iconImageView);
            holder.temperatureLable = (TextView) view.findViewById(R.id.temperatureLable);
            holder.dayLable = (TextView) view.findViewById(R.id.dayNameLable);

            view.setTag(holder);

        }
        else {
            holder = (ViewHolder) view.getTag();
        }

        Day day=mDays[i];

        holder.iconImageView.setImageResource(day.getIconID());
        holder.temperatureLable.setText(day.getTemperatureMax() + "");


        if(i==0)
        {
            holder.dayLable.setText(R.string.Today);
        }
        else
        {
            holder.dayLable.setText(day.getDayOfWeek());
        }
        return view;
    }

    private static class ViewHolder {
        ImageView iconImageView;
        TextView temperatureLable;
        TextView dayLable;


    }
}


