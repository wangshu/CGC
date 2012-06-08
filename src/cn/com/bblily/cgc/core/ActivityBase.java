package cn.com.bblily.cgc.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;

public abstract class ActivityBase extends Activity {
 
	 @Override
	public  boolean onCreateOptionsMenu(Menu menu) {
			menu.add(Menu.NONE, Menu.FIRST, Menu.NONE, "关于");
			menu.add(Menu.NONE, Menu.FIRST + 1, Menu.NONE, "退出");
			menu.add(Menu.NONE, Menu.FIRST + 1, Menu.NONE, "设置");
			return true;
		}

		@Override
		public  boolean onOptionsItemSelected(MenuItem item) {
			super.onOptionsItemSelected(item);

			switch (item.getItemId()) {
			case Menu.FIRST:
				new AlertDialog.Builder(this).setTitle("当前Sample版本")
				                             .setMessage("0.0.2")
						                     .setPositiveButton("确定", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int which) {
							}
						}).show();
				break;
			case Menu.FIRST + 1:
				finish();
				android.os.Process.killProcess(android.os.Process.myPid());
				break;
			case Menu.FIRST + 2:
				finish();
				android.os.Process.killProcess(android.os.Process.myPid());
				break;
			default:
				
				break;
			}

			return true;
		}
}
