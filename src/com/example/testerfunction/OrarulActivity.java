package com.example.testerfunction;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class OrarulActivity extends Activity {

	
	 static final String[] numbers = new String[] {


         "Luni", "Marti", "Miercru", "Joi", "Vineri","Simbata",
         "F", "G", "H", "I", "J",
         "K", "L", "M", "N", "O",
         "P", "Q", "R", "S", "T",
         "U", "V", "W", "X", "Y", "Z"

     };
	GridView orarul;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_orar);
		
		orarul = (GridView)findViewById(R.id.orarul);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,numbers);
		
		orarul.setAdapter(adapter);
		adjustGridView();
		
	}
	
	public void adjustGridView()
	{
		
		orarul.setNumColumns(6);
		orarul.setColumnWidth(50);
		orarul.setVerticalSpacing(5);
		orarul.setHorizontalSpacing(5);
	}
}
