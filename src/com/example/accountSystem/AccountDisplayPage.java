package com.example.accountSystem;

import com.example.phonicsapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AccountDisplayPage extends Activity 
{
	ImageView iv1, iv2, iv3, iv4, iv5, iv6;
	public static String TAG = AccountDisplayPage.class.getSimpleName();

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		iv1 = (ImageView) findViewById(R.id.imageView1);
		iv2 = (ImageView) findViewById(R.id.imageView2);
		iv3 = (ImageView) findViewById(R.id.imageView3);
		iv4 = (ImageView) findViewById(R.id.imageView4);
		iv5 = (ImageView) findViewById(R.id.imageView5);
		iv6 = (ImageView) findViewById(R.id.imageView6);
		
		iv1.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v)
			{
				// TODO Auto-generated method stub
				 startActivity(new Intent(getBaseContext(),CameraPicture.class));
				 finish();
			}
		});
	}
}
