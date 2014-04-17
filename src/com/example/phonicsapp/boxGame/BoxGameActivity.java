package com.example.phonicsapp.boxGame;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.Entity;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import com.example.phonicsapp.Menu;
import com.example.phonicsapp.R;
import com.example.phonicsapp.monkeyGame.MonkeyGameActivity;
import StatusBarController.StatusBar;
import android.content.Context;
import android.content.Intent;

public class BoxGameActivity extends SimpleBaseGameActivity 
{

	static int CAMERA_WIDTH;
	static int CAMERA_HEIGHT;

	public Camera mCamera;
	public static Scene mScene;
	static Context context;
	
	public static ITextureRegion mJungleBackGroundTextureRegion, mBeachBackGroundTextureRegion,
								 mUnderWaterBackGroundTextureRegion, mPlanetBackGroundTextureRegion;
	public static BitmapTextureAtlas mBitmapTextureAtlasJungleBackGround, mBitmapTextureAtlasUnderWaterBackGround,
									 mBitmapTextureAtlasBeachBackGround, mBitmapTextureAtlasPlanetBackGround;
	
	
	//All the Boxes
	public static ITextureRegion mUnderWaterBoxCloseTextureRegion, mUnderWaterBoxTextureOpenRegion, mPlanetBoxCloseTextureRegion, mPlanetBoxOpenTextureRegion,
								 mBeachBoxCloseTextureRegion, mBeachBoxOpenTextureRegion, mJungleBoxCloseTextureRegion, mJungleBoxOpenTextureRegion;
	public static BitmapTextureAtlas mUnderWaterBitmapTextureAtlasBoxClose, mUnderWaterBitmapTextureAtlasBoxOpen, mPlanetBitmapTextureAtlasBoxClose,
								 mPlanetBitmapTextureAtlasBoxOpen, mBeachBitmapTextureAtlasBoxClose, mBeachBitmapTextureAtlasBoxOpen, mJungleBitmapTextureAtlasBoxClose,
								 mJungleBitmapTextureAtlasBoxOpen;
	
	
	public static BuildableBitmapTextureAtlas mAnimatedJungleParrotBitmapTextureAtlas, 
										mAnimatedUnderWaterParrotBitmapTextureAtlas,
										mAnimatedBeachParrotBitmapTextureAtlas,
										mAnimatedPlanetParrotBitmapTextureAtlas;
	public static TiledTextureRegion mJungleParrotTextureRegion, mUnderWaterParrotTextureRegion,
										mBeachParrotTextureRegion, mPlanetParrotTextureRegion;
	
	//Letter-Mo
	public static ITextureRegion mMo1TextureRegion;
	public static ITextureRegion mMo2TextureRegion;
	public static ITextureRegion mMo3TextureRegion;
	public static ITextureRegion mMo4TextureRegion;
	public static ITextureRegion mMo5TextureRegion;
	public static ITextureRegion mMo6TextureRegion;
	public static ITextureRegion mMoTextureRegion;
	public static ITextureRegion mWMo1TextureRegion;
	public static ITextureRegion mWMo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasMo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWMo2;
	
	
	//Letter-Bo
	public static ITextureRegion mBo1TextureRegion;
	public static ITextureRegion mBo2TextureRegion;
	public static ITextureRegion mBo3TextureRegion;
	public static ITextureRegion mBo4TextureRegion;
	public static ITextureRegion mBo5TextureRegion;
	public static ITextureRegion mBo6TextureRegion;
	public static ITextureRegion mBoTextureRegion;
	public static ITextureRegion mWBo1TextureRegion;
	public static ITextureRegion mWBo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasBo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWBo2;
	
	
	//Letter-Raw
	public static ITextureRegion mRaw1TextureRegion;
	public static ITextureRegion mRaw2TextureRegion;
	public static ITextureRegion mRaw3TextureRegion;
	public static ITextureRegion mRaw4TextureRegion;
	public static ITextureRegion mRaw5TextureRegion;
	public static ITextureRegion mRaw6TextureRegion;
	public static ITextureRegion mRawTextureRegion;
	public static ITextureRegion mWRaw1TextureRegion;
	public static ITextureRegion mWRaw2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw2;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw3;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw4;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw5;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw6;
	public static BitmapTextureAtlas mBitmapTextureAtlasRaw;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWRaw2;
	
	//Letter-Toh
	public static ITextureRegion mToh1TextureRegion;
	public static ITextureRegion mToh2TextureRegion;
	public static ITextureRegion mToh3TextureRegion;
	public static ITextureRegion mToh4TextureRegion;
	public static ITextureRegion mToh5TextureRegion;
	public static ITextureRegion mToh6TextureRegion;
	public static ITextureRegion mTohTextureRegion;
	public static ITextureRegion mWToh1TextureRegion;
	public static ITextureRegion mWToh2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh2;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh3;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh4;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh5;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh6;
	public static BitmapTextureAtlas mBitmapTextureAtlasToh;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWToh2;
	
	//Letter-To
	public static ITextureRegion mTo1TextureRegion;
	public static ITextureRegion mTo2TextureRegion;
	public static ITextureRegion mTo3TextureRegion;
	public static ITextureRegion mTo4TextureRegion;
	public static ITextureRegion mTo5TextureRegion;
	public static ITextureRegion mTo6TextureRegion;
	public static ITextureRegion mToTextureRegion;
	public static ITextureRegion mWTo1TextureRegion;
	public static ITextureRegion mWTo2TextureRegion;
	
	public static BitmapTextureAtlas mBitmapTextureAtlasTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo2;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo3;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo4;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo5;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo6;
	public static BitmapTextureAtlas mBitmapTextureAtlasTo;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo1;
	public static BitmapTextureAtlas mBitmapTextureAtlasWTo2;
	
	
	public static Sprite backGround, openedBox, closedBox;
	static Sprite obj1, obj2, obj3, obj4, obj5, obj6,wrongObj1, wrongObj2;
	static int obj1Sound, obj2Sound, obj3Sound, obj4Sound, obj5Sound, obj6Sound, wrongObj1Sound, wrongObj2Sound, letterSound;
	
	static Letter letter ;
	//Obj1-mula, Obj2-ma, Obj3-mohis, Obj4-megh, Obj5-moi, Obj6-mama, wrongObj1-kola, wrongObj2-keramBoard;
	static AnimatedSprite  parrot;
	public static Entity parrotLetter;
	public static TimerHandler timer1, timer2, timer3;
	
	static float obj1X , obj1Y, obj2X, obj2Y, obj3X, obj3Y, obj4X, obj4Y, obj5X, obj5Y, 
				 obj6X, obj6Y, wrongObj1X, wrongObj1Y, wrongObj2X, wrongObj2Y,
				 letterX, letterY;
	
	static float ImageHight;
	static float ImageWidth;

	public static BoxGameActivity boxGameActivityInstance;
	public static int counter, bCounter, aCounter;
	public static String DEBUG_TAG = BoxGameActivity.class.getSimpleName();
	public static double objectScale;
	//variables for function files
	public static int val, count, disableCol ;
	
	//level selector of box game
	public static int boxGameMenuLetterSelector;
	public static int[] letterLevelSelector = new int[25];
	//public static int letterLevelSelector1, letterLevelSelector4, letterLevelSelector6, letterLevelSelector19;
	
	public static BoxGameActivity getSharedInstances()
	{
		return boxGameActivityInstance;
	}
	
	@Override
	public EngineOptions onCreateEngineOptions()
	{
		// TODO Auto-generated method stub
		boxGameActivityInstance = this;
		CAMERA_WIDTH = 800;
		CAMERA_HEIGHT = 454;
		
		ImageHight = 120;
		ImageWidth = 120;
		
		obj1X = CAMERA_WIDTH/2 - CAMERA_WIDTH/4;
		obj1Y =	CAMERA_HEIGHT/2 - CAMERA_HEIGHT/4;
		
		obj6X = CAMERA_WIDTH/2 - CAMERA_WIDTH/3;
		obj6Y =	CAMERA_HEIGHT-130;
		
		wrongObj1X = 35;
		wrongObj1Y = CAMERA_HEIGHT-130;
		
		obj2X = 50;
		obj2Y = CAMERA_HEIGHT/2 - CAMERA_HEIGHT/4;
		
		obj3X = CAMERA_WIDTH - 150;
		obj3Y = CAMERA_HEIGHT-130;
		
		wrongObj2X = CAMERA_WIDTH - CAMERA_WIDTH/4 -95;
		wrongObj2Y = CAMERA_HEIGHT-130;
		
		obj4X =  CAMERA_WIDTH/2 + 40;
		obj4Y = CAMERA_HEIGHT/4;
		
		obj5X = CAMERA_WIDTH/2-90;
		obj5Y = CAMERA_HEIGHT/2 - CAMERA_HEIGHT/4;
		
		letterX = 160;
		letterY = 250;
		
		//Box game every object scale
		objectScale = 0.7;
		
		BoxGameActivity.counter = 0;
		
		//setting the level to 0
		//boxGameLevel = 0;
		
		mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		
		return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);
	}

	@Override
	protected void onCreateResources() 
	{
		// TODO Auto-generated method stub
		LoadResources.loadAllObjects();
	}

	@Override
	public void onBackPressed()
	{
	   
//	    BoxGameActivity.super.onBackPressed();
		BoxGameActivity.boxGameActivityInstance.finish();
	}
	
	@Override
	protected Scene onCreateScene()
	{
		// TODO Auto-generated method stub
		mScene = new Scene();
//		mScene.setBackground(new Background(Color.WHITE));
//		mScene.setTouchAreaBindingOnActionDownEnabled(true);
		
		counter = 0;
		bCounter = 0;
		aCounter = 0;
		val = 0;
		count = 0 ;
		disableCol = 0;
		
//		StatusBar.hideStatusBar();
//		StatusBar.showStatusBar();
		
		//Getting the menu letter number
		boxGameMenuLetterSelector = Menu.letterNumber;
		 
		//Loading the objects according to letter
		LevelObject.loadObjects(boxGameMenuLetterSelector); 
		
		//check collisions
		TimerHandlers.checkObjectCollisions();
		
		//change wrong objects with right ones when it is second level
		if(boxGameMenuLetterSelector==1) 
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 1)
			{
				TimerHandlers.ExchangeObjects();
			}
		}
		else if(boxGameMenuLetterSelector==6)
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 1)
			{
				TimerHandlers.ExchangeObjects();
			} 
		}
		else if(boxGameMenuLetterSelector==4)
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 1)
			{
				TimerHandlers.ExchangeObjects();
			}
		}
		else if(boxGameMenuLetterSelector==19)
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 1)
			{
				TimerHandlers.ExchangeObjects();
			}
		}

			
		CreateObjects.create(boxGameMenuLetterSelector);
		
		//getting the context
		BoxGameActivity.context = getApplicationContext();
		
		//playing the introduction sound of parrot
		mScene.registerUpdateHandler(new TimerHandler((float) 0.5,new ITimerCallback()
		{
			@Override
			public void onTimePassed(TimerHandler pTimerHandler)
			{
				playIntroSound();
			}
		}));
		
		return mScene;
	}
	
	

	public void playIntroSound()
	{
		Functions.audioPlay = true;
		if(boxGameMenuLetterSelector==1)
		{
			Functions.playAudio(R.raw.box_mo);
		}
		else if(boxGameMenuLetterSelector==6)
		{
			Functions.playAudio(R.raw.box_bo);
		}
		else if(boxGameMenuLetterSelector==4)
		{
			Functions.playAudio(R.raw.box_ro);
		}
		else if(boxGameMenuLetterSelector==19)
		{
			Functions.playAudio(R.raw.box_toh);
		}
		
	}
	
	public static void startActivity()
	{
		//Debug.d("level:"+boxGameLevel);
	
		if(boxGameMenuLetterSelector==1)
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 0)
			{
				letterLevelSelector[boxGameMenuLetterSelector] = 1;
				
				mScene.unregisterUpdateHandler(timer1);
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, BoxGameActivity.class));
			}
			else if(letterLevelSelector[boxGameMenuLetterSelector] == 1)
			{
				mScene.unregisterUpdateHandler(timer1);
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, MonkeyGameActivity.class));
		
				letterLevelSelector[boxGameMenuLetterSelector] = 0;
			}
		
		}
		else if(boxGameMenuLetterSelector==6)
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 0)
			{
				letterLevelSelector[boxGameMenuLetterSelector] = 1;
				
				mScene.unregisterUpdateHandler(timer1);
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, BoxGameActivity.class));
			}
			else if(letterLevelSelector[boxGameMenuLetterSelector] == 1)
			{
				mScene.unregisterUpdateHandler(timer1);
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, MonkeyGameActivity.class));
		
				letterLevelSelector[boxGameMenuLetterSelector] = 0;
			}
		}
		else if(boxGameMenuLetterSelector==4)
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 0 )
			{
				letterLevelSelector[boxGameMenuLetterSelector] = 1;
				
				mScene.unregisterUpdateHandler(timer1); 
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, BoxGameActivity.class));
			}
			else if(letterLevelSelector[boxGameMenuLetterSelector] == 1 )
			{
				mScene.unregisterUpdateHandler(timer1);
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, MonkeyGameActivity.class));
		
				letterLevelSelector[boxGameMenuLetterSelector] = 0;
			}
		}
		else if(boxGameMenuLetterSelector==19)
		{
			if(letterLevelSelector[boxGameMenuLetterSelector] == 0 )
			{
				letterLevelSelector[boxGameMenuLetterSelector] = 1;
				
				mScene.unregisterUpdateHandler(timer1);
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, BoxGameActivity.class));
			}
			else if(letterLevelSelector[boxGameMenuLetterSelector] == 1)
			{
				mScene.unregisterUpdateHandler(timer1);
				BoxGameActivity.boxGameActivityInstance.finish();
				BoxGameActivity.boxGameActivityInstance.startActivity(new Intent(boxGameActivityInstance, MonkeyGameActivity.class));
		
				letterLevelSelector[boxGameMenuLetterSelector] = 0;
			}
		}
		
	}
	
	
	
	public void setCurrentScene(Scene scene)
	{
		mScene = scene;
		getEngine().setScene(mScene);
	}
}
