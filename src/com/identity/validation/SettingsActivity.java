package com.identity.validation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SettingsActivity extends BaseActivity {
	private EditText mEdtNO;
	private EditText mEdtWebservice;
	private EditText mEdtIP;
	private EditText mEdtMask;
	private EditText mEdtGateway;
	private Button mSave;
	private Button mBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	}

	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		setChildView(R.layout.settings);
		
		mEdtNO = (EditText)findViewById(R.id.edtNO);
		mEdtWebservice = (EditText)findViewById(R.id.edtWebservice);
		mEdtIP = (EditText)findViewById(R.id.edtIP);
		mEdtMask = (EditText)findViewById(R.id.edtMask);
		mEdtGateway = (EditText)findViewById(R.id.edtGateway);
		mSave = (Button)findViewById(R.id.btnSave);
		mBack = (Button)findViewById(R.id.btnBack);
		mSave.setOnClickListener(this);
		mBack.setOnClickListener(this);
	}

	@Override
	public void clickWidget(View view) {
		// TODO Auto-generated method stub
		if(view.getId() == R.id.btnSave) {
			Log.i("wx", "save");
		}
		if(view.getId() == R.id.btnBack) {
			goToActivity(SettingsActivity.this, MainActivity.class);
		}
	}
}
