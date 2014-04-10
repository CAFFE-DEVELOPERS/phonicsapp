package com.example.phonicsapp.boxGame;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.util.debug.Debug;

import com.example.phonicsapp.Menu;

public class LoadResources 
{

	public static void loadAllObjects()
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("BoxGameGfx/");
		
		//Mo
		if( Menu.letterNumber == 1)
		{
			BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("BoxGameGfx/");

			BoxGameActivity.mBitmapTextureAtlasJungleBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasJungleBackGround, BoxGameActivity.boxGameActivityInstance,
					"JungleBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasJungleBackGround.load();
			
			
			BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"JungleBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mJungleBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mJungleBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"JungleBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mJungleBitmapTextureAtlasBoxClose.load();
			
			
			
			//Letter-Mo
			BoxGameActivity.mBitmapTextureAtlasMo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo1, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/ma.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo2, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/megh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo3, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/mohis.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo4, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/moi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo5, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/mula.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo6, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/mama.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/mo.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWMo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWMo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWMo1, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/kola.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWMo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWMo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWMo2, BoxGameActivity.boxGameActivityInstance,
					"LetterMo/keramBoard.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo1.load();
			BoxGameActivity.mBitmapTextureAtlasMo2.load();
			BoxGameActivity.mBitmapTextureAtlasMo3.load();
			BoxGameActivity.mBitmapTextureAtlasMo4.load();
			BoxGameActivity.mBitmapTextureAtlasMo5.load();
			BoxGameActivity.mBitmapTextureAtlasMo6.load();
			BoxGameActivity.mBitmapTextureAtlasMo.load();
			BoxGameActivity.mBitmapTextureAtlasWMo1.load();
			BoxGameActivity.mBitmapTextureAtlasWMo2.load();
			
			
			BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mJungleParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "animatedParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//Bo
		else if( Menu.letterNumber == 6)
		{
			BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("BoxGameGfx/");

			BoxGameActivity.mBitmapTextureAtlasBeachBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBeachBackGround, BoxGameActivity.boxGameActivityInstance,
					"BeachBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasBeachBackGround.load();
			
			
			BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"BeachBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mBeachBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBeachBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"BeachBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mBeachBitmapTextureAtlasBoxClose.load();
			
			
			//Letter-Bo
			BoxGameActivity.mBitmapTextureAtlasBo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo1, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/balish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo2, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/ballon.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo3, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/boi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo4, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/bok.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo5, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/brinjal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo6, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/ball.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasBo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/bo.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWBo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWBo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWBo1, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/robi.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWBo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWBo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWBo2, BoxGameActivity.boxGameActivityInstance,
					"LetterBo/rocket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo1.load();
			BoxGameActivity.mBitmapTextureAtlasBo2.load();
			BoxGameActivity.mBitmapTextureAtlasBo3.load();
			BoxGameActivity.mBitmapTextureAtlasBo4.load();
			BoxGameActivity.mBitmapTextureAtlasBo5.load();
			BoxGameActivity.mBitmapTextureAtlasBo6.load();
			BoxGameActivity.mBitmapTextureAtlasBo.load();
			BoxGameActivity.mBitmapTextureAtlasWBo1.load();
			BoxGameActivity.mBitmapTextureAtlasWBo2.load();
			
			BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mBeachParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "beachParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
			 
			
		}
		//Raw
		else if( Menu.letterNumber == 4)
		{
			BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround, BoxGameActivity.boxGameActivityInstance,
					"UnderWaterBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround.load();
			
			
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBoxTextureOpenRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"underWaterBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"underWaterBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose.load();
			
			
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/rui.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/rocket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/rongdhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/ranna.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/mohis.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"LetterRaw/boi.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
			
			
			BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mUnderWaterParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "underWaterParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//Toh
		else if( Menu.letterNumber == 19)
		{
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPlanetBackGround, BoxGameActivity.boxGameActivityInstance,
					"PlanetBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround.load();
			
			
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose.load();
	 		
			
			//Letter-Toh
			BoxGameActivity.mBitmapTextureAtlasToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh1, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/table.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh2, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/taka.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh3, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/tin.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh4, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/tob.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh5, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/tomato.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh6, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/tomtom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTohTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/toh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh1, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/brinjal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh2, BoxGameActivity.boxGameActivityInstance,
					"LetterToh/rongdhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh1.load();
			BoxGameActivity.mBitmapTextureAtlasToh2.load();
			BoxGameActivity.mBitmapTextureAtlasToh3.load();
			BoxGameActivity.mBitmapTextureAtlasToh4.load();
			BoxGameActivity.mBitmapTextureAtlasToh5.load();
			BoxGameActivity.mBitmapTextureAtlasToh6.load();
			BoxGameActivity.mBitmapTextureAtlasToh.load();
			BoxGameActivity.mBitmapTextureAtlasWToh1.load();
			BoxGameActivity.mBitmapTextureAtlasWToh2.load();
			
			BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mPlanetParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "planetParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//To
		else if( Menu.letterNumber == 5)
		{
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPlanetBackGround, BoxGameActivity.boxGameActivityInstance,
					"PlanetBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround.load();
			
			
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose.load();
			
			//Letter-To 
			BoxGameActivity.mBitmapTextureAtlasTo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo1, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/ma.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo2, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/megh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 152, TextureOptions.BILINEAR);
			BoxGameActivity.mTo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo3, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mohis-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 153, TextureOptions.BILINEAR);
			BoxGameActivity.mTo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo4, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/moi-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 153, TextureOptions.BILINEAR);
			BoxGameActivity.mTo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo5, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mula-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 152, TextureOptions.BILINEAR);
			BoxGameActivity.mTo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo6, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mama-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mo.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 120, 120, TextureOptions.BILINEAR);
			BoxGameActivity.mWTo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTo1, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/kola-1.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 120, 122, TextureOptions.BILINEAR);
			BoxGameActivity.mWTo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTo2, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/keramBoard1.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasTo1.load();
			BoxGameActivity.mBitmapTextureAtlasTo2.load();
			BoxGameActivity.mBitmapTextureAtlasTo3.load();
			BoxGameActivity.mBitmapTextureAtlasTo4.load();
			BoxGameActivity.mBitmapTextureAtlasTo5.load();
			BoxGameActivity.mBitmapTextureAtlasTo6.load();
			BoxGameActivity.mBitmapTextureAtlasTo.load();
			BoxGameActivity.mBitmapTextureAtlasWTo1.load();
			BoxGameActivity.mBitmapTextureAtlasWTo2.load();
			
			BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mPlanetParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "planetParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
			
		}

	}
}
