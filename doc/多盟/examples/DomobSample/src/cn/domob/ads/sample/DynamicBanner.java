package cn.domob.ads.sample;

import cn.domob.android.ads.DomobAdListener;
import cn.domob.android.ads.DomobAdView;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

public class DynamicBanner extends Activity {
	RelativeLayout mAdContainer;
	DomobAdView mAdview320x50;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.banner);

		mAdContainer = (RelativeLayout) findViewById(R.id.adcontainer);
		//创建一个320x50的广告View
		mAdview320x50 = new DomobAdView(this, DomobSampleActivity.PUBLISHER_ID, DomobAdView.INLINE_SIZE_320X50);
		mAdview320x50.setKeyword("game");
		mAdview320x50.setUserGender("male");
		mAdview320x50.setUserBirthdayStr("2000-08-08");
		mAdview320x50.setUserPostcode("123456");
		
		//设置广告view的监听器。
		mAdview320x50.setOnAdListener(new DomobAdListener() {
			@Override
			public void onReceivedFreshAd(DomobAdView adview) {
				Log.i("DomobSDKDemo", "onReceivedFreshAd");
			}
			@Override
			public void onFailedToReceiveFreshAd(DomobAdView adview) {
				Log.i("DomobSDKDemo", "onFailedToReceiveFreshAd");
			}
			@Override
			public void onLandingPageOpening() {
				Log.i("DomobSDKDemo", "onLandingPageOpening");
			}
			@Override
			public void onLandingPageClose() {
				Log.i("DomobSDKDemo", "onLandingPageClose");
			}
		});
		//将广告View增加到视图中。
		mAdContainer.addView(mAdview320x50);
	}
}
