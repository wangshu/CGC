package cn.domob.ads.sample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DomobSampleActivity extends Activity {
	public static final String PUBLISHER_ID = "56OJyM1ouMGoaSnvCK";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button bannerCodeBtn = (Button) findViewById(R.id.bannercode);
		Button bannerXMLBtn = (Button) findViewById(R.id.bannerxml);

		bannerCodeBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(DomobSampleActivity.this, DynamicBanner.class));
			}
		});

		bannerXMLBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(DomobSampleActivity.this, XMLBanner.class));
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(Menu.NONE, Menu.FIRST, Menu.NONE, "关于");
		menu.add(Menu.NONE, Menu.FIRST + 1, Menu.NONE, "退出");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);

		switch (item.getItemId()) {
		case Menu.FIRST:
			new AlertDialog.Builder(this).setTitle("当前Sample版本").setMessage("3.0.2")
					.setPositiveButton("确定", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
						}
					}).show();
			break;
		case Menu.FIRST + 1:
			finish();
			android.os.Process.killProcess(android.os.Process.myPid());
			break;
		default:
			break;
		}

		return true;
	}
}