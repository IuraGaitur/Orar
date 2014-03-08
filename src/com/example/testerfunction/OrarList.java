package com.example.testerfunction;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class OrarList extends ListFragment{
	
	String data[] = new String[] { "one", "two", "three", "four" };
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		ArrayAdapter<String>  adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
		setListAdapter(adapter);
		
		
	}
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState) {
	    return inflater.inflate(R.layout.activity_list_task, null);
	  }
	

}
