package com.example.fragments;

import java.util.ArrayList;
import java.util.List;

import com.example.adapters.OrarAdapter;
import com.example.services.GrupaService;
import com.example.testerfunction.R;
import com.example.testerfunction.R.dimen;
import com.example.testerfunction.R.id;
import com.example.testerfunction.R.layout;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class OrarFragment extends Fragment{
	
	static OrarFragment orar = null;
	public static OrarFragment getInstance()
	{
		orar= new OrarFragment();
		return orar;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		GrupaService service = new GrupaService();
		
		
		ArrayList list = service.GetListPerechi("FAF-121");
		
		
		
		ViewGroup view = (ViewGroup)inflater.inflate(R.layout.activity_orar, null);
		GridView orar = (GridView)view.findViewById(R.id.orarul);
		orar.setHorizontalSpacing((int) getResources().getDimension(R.dimen.lesson_item_horiz_space));
		orar.setVerticalSpacing((int) getResources().getDimension(R.dimen.lesson_item_vert_space));
		
		
		orar.setAdapter(new OrarAdapter(view.getContext(),list));
		orar.setOnItemClickListener(new OnItemClickListener() {
	          public void onItemClick(AdapterView<?> parent, View v,
	                  int position, long id) {
	        	  
	              // Send intent to SingleViewActivity
	              Intent i = 
	              new Intent(getActivity().getApplicationContext(), SingleOrarFragmentActivity.class);
	              // Pass image index
	              i.putExtra("id", position);
	              startActivity(i);
	          }
	      });
		
		return view;
	}
}
