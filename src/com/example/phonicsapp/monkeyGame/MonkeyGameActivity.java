package com.example.phonicsapp.monkeyGame;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.IOnAreaTouchListener;
import org.andengine.entity.scene.ITouchArea;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.util.color.Color;
import StatusBarController.StatusBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.Display;

import com.example.phonicsapp.GameMainPage;
import com.example.phonicsapp.Menu;
import com.example.phonicsapp.R;
import com.example.phonicsapp.boxGame.BoxGameActivity;


public class MonkeyGameActivity  extends SimpleBaseGameActivity implements IOnAreaTouchListener
{
	// ===========================================================
	// Constants
	// ===========================================================
	static MonkeyGameActivity MonkeyGameActivityActivity;
	
	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;
	static float distance;
	// ===========================================================
	// Fields
	// ===========================================================
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBoxSide;
	public static TextureRegion mBoxSideTextureRegion;
	
	public static ITextureRegion mJungleBackGroundTextureRegion, mBeachBackGroundTextureRegion,
								 mUnderWaterBackGroundTextureRegion, mPlanetBackGroundTextureRegion;
	public static BitmapTextureAtlas mBitmapTextureAtlasJungleBackGround, mBitmapTextureAtlasUnderWaterBackGround,
									 mBitmapTextureAtlasBeachBackGround, mBitmapTextureAtlasPlanetBackGround;
	
	public static Sprite backGround, obj1, obj2, obj3, obj4, wrongObj1, wrongObj2, banana, monkey1, monkey2;
	public static Sprite[] boxSide = new Sprite[7];
	
	public static Camera mCamera;
	public static Scene mScene;
	
	//Fixed Objects monkey1, monkey2, banana;
	public static BitmapTextureAtlas mBitmapTextureAtlasMonkeyWithoutBanana, mBitmapTextureAtlasMonkeyWithBanana,
									mBitmapTextureAtlasMonkeyWithFish, mBitmapTextureAtlasMonkeyWithAlien, 
									mBitmapTextureAtlasMonkeyWithCup, mBitmapTextureAtlasMonkeyWithoutCup,
									mBitmapTextureAtlasMonkeyWithoutAlien, mBitmapTextureAtlasMonkeyWithoutFish;
	public static ITextureRegion mFaceTextureRegionMonkeyWithoutBanana, mFaceTextureRegionMonkeyWithBanana, 
									mFaceTextureRegionMonkeyWithFish, mFaceTextureRegionMonkeyWithAlien,
									mFaceTextureRegionMonkeyWithCup, mFaceTextureRegionMonkeyWithoutCup,
									mFaceTextureRegionMonkeyWithoutAlien, mFaceTextureRegionMonkeyWithoutFish;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBanana;
	public static ITextureRegion mFaceTextureRegionBanana;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasFish;
	public static ITextureRegion mFaceTextureRegionFish;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasCup;
	public static ITextureRegion mFaceTextureRegionCup;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasAlien;
	public static ITextureRegion mFaceTextureRegionAlien;
	
	//Letter-Mo
	public static BitmapTextureAtlas mBitmapTextureAtlasMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo4;
	
	public static ITextureRegion mFaceTextureRegionMo1;
	public static ITextureRegion mFaceTextureRegionMo2;
	public static ITextureRegion mFaceTextureRegionMo3;
	public static ITextureRegion mFaceTextureRegionMo4;
	public static ITextureRegion mFaceTextureRegionWMo1;
	public static ITextureRegion mFaceTextureRegionWMo2;
	public static ITextureRegion mFaceTextureRegionWMo3;
	public static ITextureRegion mFaceTextureRegionWMo4;
	
	//Letter-Bo
	public static BitmapTextureAtlas mBitmapTextureAtlasBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo2;
	
	public static ITextureRegion mFaceTextureRegionBo1;
	public static ITextureRegion mFaceTextureRegionBo2;
	public static ITextureRegion mFaceTextureRegionBo3;
	public static ITextureRegion mFaceTextureRegionBo4;
	public static ITextureRegion mFaceTextureRegionWA1;
	public static ITextureRegion mFaceTextureRegionWA2;
	
	//Letter-Ko
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw2;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw3;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw2;
		
	public static ITextureRegion mFaceTextureRegionRaw1;
	public static ITextureRegion mFaceTextureRegionRaw2;
	public static ITextureRegion mFaceTextureRegionRaw3;
	public static ITextureRegion mFaceTextureRegionRaw4;
	public static ITextureRegion mFaceTextureRegionWRaw1;
	public static ITextureRegion mFaceTextureRegionWRaw2;
	
	//Letter-Lo
	public static BitmapTextureAtlas mBitmapTextureAtlasToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh2;
		
	public static ITextureRegion mFaceTextureRegionToh1;
	public static ITextureRegion mFaceTextureRegionToh2;
	public static ITextureRegion mFaceTextureRegionToh3;
	public static ITextureRegion mFaceTextureRegionToh4;
	public static ITextureRegion mFaceTextureRegionWToh1;
	public static ITextureRegion mFaceTextureRegionWToh2;
	
	//Letter-To
	public static BitmapTextureAtlas mBitmapTextureAtlasTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo2;
		
	public static ITextureRegion mFaceTextureRegionTo1;
	public static ITextureRegion mFaceTextureRegionTo2;
	public static ITextureRegion mFaceTextureRegionTo3;
	public static ITextureRegion mFaceTextureRegionTo4;
	public static ITextureRegion mFaceTextureRegionWTo1;
	public static ITextureRegion mFaceTextureRegionWTo2;
	
	
	static float mFaceCount = -100;

	public static int aCount = 0;
	public static int randomItem, randomItem1;
	
	//reward objects like banana, fish, cup, alien
	public static Sprite[] position = new Sprite[7];
	
	static float ImageHeight;
	static float ImageWidth;
	
	static float ImageHeightObjects;
	static float ImageWidthObjects;
	
	static int value = 0;
	static int bananaValue = 0;
	
	public static VertexBufferObjectManager vbo;
	static Boolean audioPlay = false;
	static MediaPlayer mediaPlayer = new MediaPlayer();
	static int obj1Sound, obj2Sound, obj3Sound, obj4Sound, wrongObj1Sound, wrongObj2Sound;
	
	public static TimerHandler timer1, timer2;
	public static int monkeyGameLevelSelector;
	public static int monkeyGameMenuLetterSelector;
	public static double monkeyGameObjectScale;
	public static int[] monkeyGameLevelSelector1 = new int[25];
	
	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================
	
	@Override
	public EngineOptions onCreateEngineOptions() 
	{
		MonkeyGameActivityActivity = this;
		
		CAMERA_HEIGHT = 454;
		CAMERA_WIDTH = 800;
		
		ImageHeight = CAMERA_HEIGHT/1.1f;
		ImageWidth = CAMERA_WIDTH/6.0f;
		
		ImageHeightObjects = CAMERA_HEIGHT/5.0f;
		ImageWidthObjects = CAMERA_WIDTH/7.5f;
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	public void onCreateResources() 
	{
		LoadResources.loadAllObjects();
	}
	
	@Override
	public void onBackPressed()
	{
	    new AlertDialog.Builder(this)
	        .setTitle("Really Exit?")
	        .setMessage("Are you sure you want to exit?")
	        .setNegativeButton(android.R.string.no, null)
	        .setPositiveButton(android.R.string.yes, new OnClickListener()
	        {

	            public void onClick(DialogInterface arg0, int arg1) 
	            {
	            	aCount = 0;
					mFaceCount = -100; 
	                MonkeyGameActivity.super.onBackPressed();
	            }
	        }).create().show();
	}
	
	@Override
	public Scene onCreateScene() 
	{
		mScene = new Scene();
		mScene.setBackground(new Background(Color.WHITE));
		vbo = getVertexBufferObjectManager();

		//debug mode
		//RootTools.debugMode = true; 
//		StatusBar.hideStatusBar();
				
		monkeyGameObjectScale = 0.6;
		
//		MonkeyGameActivity.monkeyGameLevelSelector = 2;
		
		monkeyGameMenuLetterSelector = Menu.letterNumber;
		
		GameObjects.createObjects(monkeyGameMenuLetterSelector);
		
		
		mScene.registerUpdateHandler(new TimerHandler(1, true, new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler) 
			{
				// TODO Auto-generated method stub
				
				if(value == 1)
				{
					MonkeyFunction.monkey1();
				}
			}
		}));
		 
		mScene.registerUpdateHandler(new TimerHandler(3, true, new ITimerCallback() 
		{
			
			@Override
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				// TODO Auto-generated method stub
				//Adding Banana
				if(bananaValue == 1)
				{
					MonkeyFunction.addFace(CAMERA_WIDTH / 2, CAMERA_HEIGHT / 2);
				}
			}
		}));
		
		MonkeyGameTimerHandlers.selectRandromObjects();
		

		//playing the introduction sound of parrot
		mScene.registerUpdateHandler(new TimerHandler((float) 0.5,new ITimerCallback()
		{
				@Override
				public void onTimePassed(TimerHandler pTimerHandler)
				{
					playIntroSound();
				}
		}));
		
		mScene.setOnAreaTouchListener(this);
		return mScene;
	}

	
	@Override
	public boolean onAreaTouched(TouchEvent pSceneTouchEvent,ITouchArea pTouchArea, float pTouchAreaLocalX,float pTouchAreaLocalY) 
	{
		// TODO Auto-generated method stub
		
		if (pSceneTouchEvent.isActionDown()) 
		{
			ObjectRemoveFunctions.removeFace((Sprite) pTouchArea);
			return true;
		}
		return false;
	}

	public void playIntroSound()
	{
		MonkeyGameActivity.audioPlay = true;
		if(monkeyGameMenuLetterSelector==1)
		{
			ObjectRemoveFunctions.playAudio(R.raw.monkey_mo);
		}
		else if(monkeyGameMenuLetterSelector==6)
		{
			ObjectRemoveFunctions.playAudio(R.raw.monkey_bo);
		}
		else if(monkeyGameMenuLetterSelector==4)
		{
			ObjectRemoveFunctions.playAudio(R.raw.monkey_ro);
		}
		else if(monkeyGameMenuLetterSelector==19)
		{
			ObjectRemoveFunctions.playAudio(R.raw.monkey_toh);
		}
		
	}

	

	public static void startActivity()
	{
		if(monkeyGameMenuLetterSelector==1)
		{
			if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 0)
			{
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 1;
				monkeyGameLevelSelector = 1;
				mScene.unregisterUpdateHandler(timer1);
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, MonkeyGameActivity.class));
			}
			else if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 1)
			{
				monkeyGameLevelSelector = 0;
				mScene.unregisterUpdateHandler(timer1);
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, GameMainPage.class));
		
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 0;
			}
		
		}
		else if(monkeyGameMenuLetterSelector==6)
		{
			if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 0)
			{
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 1;
				monkeyGameLevelSelector = 1;
				mScene.unregisterUpdateHandler(timer1);
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, MonkeyGameActivity.class));
			}
			else if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 1)
			{
				monkeyGameLevelSelector = 0;
				mScene.unregisterUpdateHandler(timer1);
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, GameMainPage.class));
		
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 0;
			}
		}
		else if(monkeyGameMenuLetterSelector==4)
		{
			if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 0 )
			{
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 1;
				monkeyGameLevelSelector = 1;
				mScene.unregisterUpdateHandler(timer1); 
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, MonkeyGameActivity.class));
			}
			else if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 1 )
			{
				monkeyGameLevelSelector = 0;
				mScene.unregisterUpdateHandler(timer1);
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, GameMainPage.class));
		
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 0;
			}
		}
		else if(monkeyGameMenuLetterSelector==19)
		{
			if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 0 )
			{
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 1;
				
				mScene.unregisterUpdateHandler(timer1);
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, MonkeyGameActivity.class));
			}
			else if(monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] == 1 )
			{
				mScene.unregisterUpdateHandler(timer1);
				MonkeyGameActivityActivity.finish();
				MonkeyGameActivityActivity.startActivity(new Intent(MonkeyGameActivityActivity, GameMainPage.class));
		
				monkeyGameLevelSelector1[monkeyGameMenuLetterSelector] = 0;
			}
		}
	}
	
	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}