package com.example.accountSystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.example.phonicsapp.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageView;
import android.widget.Toast;

public class CameraPicture extends Activity implements SurfaceHolder.Callback
{
      //a variable to store a reference to the Image View at the main.xml file
      private ImageView iv_image;
      //a variable to store a reference to the Surface View at the main.xml file
      private SurfaceView surfaceView;
      //a bitmap to display the captured image
      private Bitmap bitmap;
      //Camera variables
      //a surface holder
      private SurfaceHolder sHolder; 
      //a variable to control the camera
      private Camera mCamera=null;
      //the camera parameters
      private Parameters parameters;
      //Debugging tag
      private String DEBUG_TAG=CameraPicture.class.getSimpleName();
      //number of camera
      private int numCamera;
      public static String camerafile;
      static FileOutputStream outStream = null;
     
    @SuppressLint("NewApi")
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_camera);
        //counting the numbers of camera
        numCamera=Camera.getNumberOfCameras();  
        //debug
        Log.d(DEBUG_TAG, "No of cameras:"+numCamera);
        //get the Image View at the main.xml file
        iv_image = (ImageView) findViewById(R.id.imageView);
        //get the Surface View at the main.xml file
        surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
        //Get a surface
        sHolder = surfaceView.getHolder();
        //add the callback interface methods defined below as the Surface   View callbacks
        sHolder.addCallback(this);
        //tells Android that this surface will have its data constantly replaced
        sHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

    }
      public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3)
      {
           //get camera parameters
           parameters = mCamera.getParameters();
           //set camera parameters
           mCamera.setParameters(parameters);
           mCamera.startPreview();
           //mCamera.stopPreview();
           
           //sets what code should be executed after the picture is taken
           Camera.PictureCallback mCall = new Camera.PictureCallback()
           {
           
             public void onPictureTaken(byte[] data, Camera camera)
             {
                 //decode the data obtained by the camera into a Bitmap
                 bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
                 
                 Matrix matrix = new Matrix();

                 matrix.postRotate(270);

                 Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap,600,600, true);
                 Bitmap rotatedBitmap = Bitmap.createBitmap(scaledBitmap , 0, 0, scaledBitmap .getWidth(), scaledBitmap .getHeight(), matrix, true);

				// String cameras="takenaaa";
				//
				// SharedPreferences
				// savePrefs=PreferenceManager.getDefaultSharedPreferences(getBaseContext());
				// SharedPreferences.Editor editor=savePrefs.edit();
				// editor.putString("cameras", cameras);
				// editor.commit();
                   
                        try
                        {
                            //outStream = new FileOutputStream("/storage/sdcard0/1.jpg");
                            FileOutputStream out = new FileOutputStream("/sdcard/1.jpg");
                            rotatedBitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);
                    		Log.d(DEBUG_TAG,"camerafile: " +camerafile);
                        }
                        catch (FileNotFoundException e)
                        {
                            Log.d("CAMERA", e.getMessage());
                        } 
                        catch (IOException e)
                        {
                            Log.d("CAMERA", e.getMessage());
                        }
                        
                        //closing the activity after taking picture
                        setResult(0);
                        // finishActivity
                        finish();
                       
             }
           };
          
           mCamera.takePicture(null, null, mCall);
      }
      @SuppressLint("NewApi")
	public void surfaceCreated(SurfaceHolder holder)
      {
    	// The Surface has been created, acquire the camera and tell it where
        
    	//if the device has two camera,open front camera
    	if(numCamera==2)
    	{  
    		mCamera = Camera.open(1);
    	}
    	else if(numCamera==1)
    	{
    		//if the device has one camera,open default back camera
    		mCamera=Camera.open();
    	}
    	else
    	{
    		//show if the device has no camera
    		Toast.makeText(getBaseContext(), "The Device has no camera", Toast.LENGTH_SHORT).show();
    	}
        try 
        {
           // to draw the preview.
           mCamera.setPreviewDisplay(holder);
        }
        catch (IOException exception) 
        {
            mCamera.release();
            mCamera = null;
        }
      }


      public void surfaceDestroyed(SurfaceHolder holder)
      {
            //stop the preview
    	  	mCamera.stopPreview();
            //release the camera
    	  	mCamera.release();
    	  	//unbind the camera from this object
    	  	mCamera = null;
        
      } 
      
      @Override
      public void finish() 
      {
    	// TODO Auto-generated method stub
//    	  Intent jIntent=new Intent(getBaseContext(),AutomaticEmailActivity.class);
//          startActivityForResult(jIntent, 0); 
          super.finish();
      }
}
