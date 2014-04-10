package com.example.phonicsapp.monkeyGame;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;

import com.example.phonicsapp.Menu;

public class LoadResources
{

	public static void loadAllObjects()
	{ 
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("MonkeyGameGfx/");
		
		//Mo
		if(Menu.letterNumber == 1)
		{
			MonkeyGameActivity.mBitmapTextureAtlasJungleBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mJungleBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasJungleBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "jungleBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasJungleBackGround.load();
			
			//Letter-Mo
			MonkeyGameActivity.mBitmapTextureAtlasMo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasMo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWMo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			
			MonkeyGameActivity.mFaceTextureRegionMo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterMo/moi.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionMo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterMo/mama.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo3, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterMo/megh.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMo4, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterMo/mohis.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterMo/tala.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWMo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWMo2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterMo/langol.png",0,0);
		
			//Letter-Mo
			MonkeyGameActivity.mBitmapTextureAtlasMo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasMo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWMo2.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutBanana = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithBanana = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutBanana = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutBanana, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithoutReward.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithBanana = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithBanana, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithBanana.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutBanana.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithBanana.load();
			
			
			MonkeyGameActivity.mBitmapTextureAtlasBanana = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionBanana = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBanana, MonkeyGameActivity.MonkeyGameActivityActivity, "banana.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasBanana.load();
		}
		//Bo
		else if(Menu.letterNumber == 6)
		{
			MonkeyGameActivity.mBitmapTextureAtlasBeachBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mBeachBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBeachBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "beachBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasBeachBackGround.load();
			
			//Letter-Bo
			MonkeyGameActivity.mBitmapTextureAtlasBo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasBo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWBo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
							
			MonkeyGameActivity.mFaceTextureRegionBo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterBo/balish.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionBo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterBo/boi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionBo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo3, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterBo/ballon.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionBo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBo4, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterBo/brinjal.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterBo/taka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWA2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWBo2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterBo/megh.png",0,0);
		
		
			//Letter-Bo
			MonkeyGameActivity.mBitmapTextureAtlasBo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasBo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWBo2.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithFish = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutFish = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithFish = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithFish, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithFish.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutFish = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutFish, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithoutFish.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithFish.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutFish.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasFish = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionFish = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasFish, MonkeyGameActivity.MonkeyGameActivityActivity, "fish.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasFish.load();
			
		}
		//Raw
		else if(Menu.letterNumber == 4)
		{
			MonkeyGameActivity.mBitmapTextureAtlasUnderWaterBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mUnderWaterBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasUnderWaterBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "underWaterBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasUnderWaterBackGround.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasBoxSide = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 300, 300,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mBoxSideTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasBoxSide, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "boxSide.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasBoxSide.load();
			
			
			//Letter-Raw
			MonkeyGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
					
			MonkeyGameActivity.mFaceTextureRegionRaw1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterRaw/robi.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionRaw2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterRaw/rocket.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionRaw3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw3, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterRaw/rani.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionRaw4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasRaw4, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterRaw/rui.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterRaw/mama.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWRaw2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWRaw2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterRaw/table.png",0,0);
			
			//Letter-Raw 
			MonkeyGameActivity.mBitmapTextureAtlasRaw1.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw2.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw3.load();
			MonkeyGameActivity.mBitmapTextureAtlasRaw4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWRaw2.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithCup = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutCup = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithCup = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithCup, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithCup.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutCup = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutCup, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithoutCup.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithCup.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutCup.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasCup = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionCup = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasCup, MonkeyGameActivity.MonkeyGameActivityActivity, "cup.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasCup.load();
			
		}
		//Toh
		else if(Menu.letterNumber == 19)
		{
			MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mPlanetBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "planetBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround.load();
			
			
			//Letter-Toh
			MonkeyGameActivity.mBitmapTextureAtlasToh1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasToh4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWToh2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
							
			MonkeyGameActivity.mFaceTextureRegionToh1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterToh/tomtom.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionToh2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterToh/tomato.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionToh3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh3, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterToh/tin.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionToh4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasToh4, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterToh/taka.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterToh/boi.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWToh2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWToh2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterToh/rocket.png",0,0);
						
			//Letter-Toh
			MonkeyGameActivity.mBitmapTextureAtlasToh1.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh2.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh3.load();
			MonkeyGameActivity.mBitmapTextureAtlasToh4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWToh2.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithAlien.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithoutAlien.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien.load();
			
			
			MonkeyGameActivity.mBitmapTextureAtlasAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "alien.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasAlien.load();
		}
		//To
		else if(Menu.letterNumber == 5)
		{
			MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 1600, 868,TextureOptions.BILINEAR_PREMULTIPLYALPHA);
			MonkeyGameActivity.mPlanetBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround, MonkeyGameActivity.MonkeyGameActivityActivity.getAssets(), "planetBackground.png", 0, 0);
			MonkeyGameActivity.mBitmapTextureAtlasPlanetBackGround.load();
			
			
			//Letter-To 
			MonkeyGameActivity.mBitmapTextureAtlasTo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo3 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasTo4 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo1 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mBitmapTextureAtlasWTo2 = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
								
			MonkeyGameActivity.mFaceTextureRegionTo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterTo/keramBoard1.png", 0, 0);
			MonkeyGameActivity.mFaceTextureRegionTo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterTo/mas.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTo3 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo3, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterTo/mula-2.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionTo4 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasTo4, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterTo/mohis-2.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTo1 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo1, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterTo/ma.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionWTo2 = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasWTo2, MonkeyGameActivity.MonkeyGameActivityActivity, "LetterTo/pineapple.png",0,0);			
		
			//Letter-To
			MonkeyGameActivity.mBitmapTextureAtlasTo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo2.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo3.load();
			MonkeyGameActivity.mBitmapTextureAtlasTo4.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo1.load();
			MonkeyGameActivity.mBitmapTextureAtlasWTo2.load();
			
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 208, 682, TextureOptions.BILINEAR_PREMULTIPLYALPHA );
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithAlien.png",0,0);
			MonkeyGameActivity.mFaceTextureRegionMonkeyWithoutAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "monkeyWithoutAlien.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithAlien.load();
			MonkeyGameActivity.mBitmapTextureAtlasMonkeyWithoutAlien.load();
			
			
			MonkeyGameActivity.mBitmapTextureAtlasAlien = new BitmapTextureAtlas(MonkeyGameActivity.MonkeyGameActivityActivity.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			MonkeyGameActivity.mFaceTextureRegionAlien = BitmapTextureAtlasTextureRegionFactory.createFromAsset(MonkeyGameActivity.mBitmapTextureAtlasAlien, MonkeyGameActivity.MonkeyGameActivityActivity, "alien.png",0,0);
			MonkeyGameActivity.mBitmapTextureAtlasAlien.load();
		}
		
	}
}
