package com.example.navigator;

import java.util.ArrayList;







import org.w3c.dom.Text;

import com.example.testerfunction.R;

import android.R.layout;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NavDraweListAdapter extends BaseAdapter{

	Context context;
	ArrayList<NavDrawerItem> list;
	
	public NavDraweListAdapter(Context context,ArrayList<NavDrawerItem> list){
	this.context = context;
	this.list = list;
	}
	
	
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}
	//convert view checking for reusing view if it is not visible and not creating it again
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null){
			LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
			convertView = mInflater.inflate(R.layout.drawer_list_item, null);
		}
		
		ImageView icon = (ImageView)convertView.findViewById(R.id.drawer_icon);
		TextView text = (TextView)convertView.findViewById(R.id.title);
		TextView count = (TextView)convertView.findViewById(R.id.counter);
		
		icon.setImageResource(list.get(position).getIcon());
		text.setText(list.get(position).getText());
		
		if(list.get(position).isCounterVisible()){
			count.setText(list.get(position).getCount());
		}else{
			count.setVisibility(View.GONE);
			
		}
		return convertView;
			
	}
	
	

}
