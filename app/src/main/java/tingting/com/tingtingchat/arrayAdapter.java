package tingting.com.tingtingchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class arrayAdapter extends ArrayAdapter<cards> {
    Context context;
    public arrayAdapter(Context context, int resourceId, List<cards> items){
        super(context, resourceId, items);
    }
    public View getView(int pos, View convertView, ViewGroup parent){
        cards card__item = getItem(pos);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent,false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        name.setText(card__item.getName());
        image.setImageResource(R.mipmap.ic_launcher);
        return  convertView;
    }
}
