package com.example.testerfunction;

import java.util.ArrayList;

import com.example.services.GrupaService;
import com.example.services.OrarulService;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.gesture.GestureOverlayView;
import android.gesture.GestureOverlayView.OnGestureListener;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class SingleOrarFragmentActivity extends Activity{
	
	
	private ViewPager viewer;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.item_fullscreen);
		
		RelativeLayout layout = (RelativeLayout)findViewById(R.id.item_full_screen);
		layout.setOnTouchListener((OnTouchListener) this);
		
		
	  
	}
	
	public boolean onTouch(View view, MotionEvent event)
	{
	    /*switch (event.getAction())
	    {
	    case MotionEvent.ACTION_DOWN: // Пользователь нажал на экран, т.е. начало движения 
	        // fromPosition - координата по оси X начала выполнения операции
	        fromPosition = event.getX();
	        break;
	    case MotionEvent.ACTION_UP: // Пользователь отпустил экран, т.е. окончание движения
	        float toPosition = event.getX();
	        if (fromPosition > toPosition)
	            flipper.showNext();
	        else if (fromPosition < toPosition)
	            flipper.showPrevious();
	    default:
	        break;
	    }*/
	    return true;
	}
	
}
