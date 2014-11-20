package com.identity.validation;

import java.sql.Date;
import java.text.SimpleDateFormat;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 所有Activity的基类
 * @author wangxiang
 *
 */
public abstract class BaseActivity extends Activity implements OnClickListener {

	private TextView mTime;
	private Thread mTimeThread;
	private Handler mHandler;
	private boolean mIsExit = false;
	
	public abstract void initWidget();
	public abstract void clickWidget(View view);
	
	private Runnable mUpdateTimeRunnable = new Runnable() {
		@SuppressLint("SimpleDateFormat")
		@Override
		public void run() {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date now = new Date(System.currentTimeMillis());
			String time = format.format(now);
			mTime.setText(time);
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.base);
		
		initWidget();
		
		mTime = (TextView)findViewById(R.id.time);
		mHandler = new Handler();
		
	}

	@Override
	protected void onResume() {
		if(getRequestedOrientation() != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		}
		super.onResume();
		
		mIsExit = false;
		mTimeThread = new Thread() {
			public void run() {
				while(!mIsExit) {
					mHandler.post(mUpdateTimeRunnable);
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
		};
		mTimeThread.start();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		mIsExit = true;
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
	}

	public void setChildView(int layoutId) {
		RelativeLayout childLayout = (RelativeLayout)findViewById(R.id.child_layout);
		LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(layoutId, null);
		childLayout.addView(view);
	}
	
	public void goToActivity(Context from, Class<?> to) {
		Intent intent = new Intent(from, to);
		startActivity(intent);
	}

	@Override
	public void onClick(View view) {
		clickWidget(view);
	}
}
