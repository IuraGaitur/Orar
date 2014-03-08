package com.example.adapters;

import java.util.ArrayList;
import java.util.List;

import com.example.entities.Pereche;
import com.example.services.GrupaService;
import com.example.testerfunction.R;
import com.example.testerfunction.R.id;
import com.example.testerfunction.R.layout;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class OrarAdapter  extends BaseAdapter {
		private Context mContext;
		ArrayList list;
		
		
		public  OrarAdapter(Context c,ArrayList list) {
		    mContext = c;
		    this.list = list;
		}

		public int getCount() {
		    return list.size();
			
		}

		public Object getItem(int position) {
		    return list.get(position);
		}

		public long getItemId(int position) {
		    return 0;
		}

		

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = (LayoutInflater) mContext
	                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View cellView = null;
			if(position < 7 && position > 0)
			{
				cellView = inflater.inflate(R.layout.item_day, parent,false);
				TextView day = (TextView)cellView.findViewById(R.id.day_item);
				day.setText((CharSequence) getItem(position));
				RelativeLayout layout = (RelativeLayout)cellView.findViewById(R.id.day_iem_layout);
				layout.setBackgroundColor(Color.CYAN);
			}
			else if(position % 7 == 0 && position > 0)
			{
				cellView = inflater.inflate(R.layout.item_hour, parent,false);
				TextView day = (TextView)cellView.findViewById(R.id.item_hour);
				day.setText((CharSequence) getItem(position));
				RelativeLayout layout = (RelativeLayout)cellView.findViewById(R.id.hour_item_layout);
				layout.setBackgroundColor(Color.MAGENTA);
			}
			
			else if(position >= 8)
			{
			cellView = inflater.inflate(R.layout.lesson_item, parent,false);
			TextView lesson = (TextView)cellView.findViewById(R.id.type_name);
			TextView professor = (TextView)cellView.findViewById(R.id.professor);
			TextView room = (TextView)cellView.findViewById(R.id.room);
			RelativeLayout layout = (RelativeLayout)cellView.findViewById(R.id.lesson_item_layout);
			
			
			
			lesson.setText(((Pereche)getItem(position)).getTipPereche()+((Pereche)getItem(position)).getName());
			professor.setText(((Pereche)getItem(position)).getProfesorul().getName());
			room.setText(String.format("%s", ((Pereche)getItem(position)).getRoom()));
			
			
			if(((Pereche)getItem(position)).getTipPereche().equals("course"))
				layout.setBackgroundColor(Color.RED);
			else if(((Pereche)getItem(position)).getTipPereche().equals("practice"))
				layout.setBackgroundColor(Color.BLUE);
			else if(((Pereche)getItem(position)).getTipPereche().equals("lab"))
				layout.setBackgroundColor(Color.YELLOW);
			}
			
			else 
			{
				cellView = inflater.inflate(R.layout.item_day, parent,false);
				TextView day = (TextView)cellView.findViewById(R.id.day_item);
				day.setText("FAF-121");
				RelativeLayout layout = (RelativeLayout)cellView.findViewById(R.id.day_iem_layout);
				layout.setBackgroundColor(Color.GRAY);
			}
			return cellView;
		}
		
		
		
		
		
		
}
