package cn.domob.ads.sample;

import cn.domob.android.ads.DomobAdListener;
import cn.domob.android.ads.DomobAdView;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class XMLBanner extends Activity {
	DomobAdView mAdview320x50;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bannerxml);
		mAdview320x50 = (DomobAdView) findViewById(R.id.domobAdXML);
		
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
		
		
	}
}
