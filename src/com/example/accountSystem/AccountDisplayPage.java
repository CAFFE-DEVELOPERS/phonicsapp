package com.example.accountSystem;

import java.util.ArrayList;

import com.example.phonicsapp.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AccountDisplayPage extends Activity 
{
	
	public static String TAG = AccountDisplayPage.class.getSimpleName();

	GridView gridView;
	ArrayList<Item> gridArray = new ArrayList<Item>();
	CustomGridViewAdapter customGridAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// set grid view item
		Bitmap accountOneIcon = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.images);
		Bitmap accountTwoIcon = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.images);
		Bitmap accountThreeIcon = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.images);
		Bitmap accountFourIcon = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.images);
		Bitmap accountFiveIcon = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.images);
		Bitmap accountSixIcon = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.images);
		

		gridArray.add(new Item(accountOneIcon, "1"));
		gridArray.add(new Item(accountTwoIcon, "2"));
		gridArray.add(new Item(accountThreeIcon, "3"));
		gridArray.add(new Item(accountFourIcon, "4"));
		gridArray.add(new Item(accountFiveIcon, "5"));
		gridArray.add(new Item(accountSixIcon, "6"));

		gridView = (GridView) findViewById(R.id.gridView1);
		gridView.setOnItemClickListener(new OnItemClickListener() {
	          public void onItemClick(AdapterView<?> parent, View v,
	                  int position, long id) {
	        	  
	              // Send intent to SingleViewActivity
	              Intent i = 
	              new Intent(getApplicationContext(), SingleViewActivity.class);
	              // Pass image index
	              i.putExtra("id", position);
	              startActivity(i);
	          }
	      });
		customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid,
				gridArray);
		gridView.setAdapter(customGridAdapter);
		
	}

}