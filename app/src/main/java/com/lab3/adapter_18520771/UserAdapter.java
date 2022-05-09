package com.lab3.adapter_18520771;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter (Context context, ArrayList<User> users){
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName);
        TextView txtHome = (TextView) convertView.findViewById(R.id.txtHome);
        txtName.setText(user.name);
        txtHome.setText(user.hometown);
        return convertView;
    }
}
