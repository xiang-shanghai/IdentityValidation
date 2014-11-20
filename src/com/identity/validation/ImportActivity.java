package com.identity.validation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class ImportActivity extends BaseActivity implements OnCheckedChangeListener {
	
	private Button mImport;
	private Button mClear;
	private Button mBack;
	private RadioGroup mRdoImportMode;
	private TextView mTxtDisplay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}

	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		setChildView(R.layout.imports);
		
		mImport = (Button)findViewById(R.id.imports);
		mClear = (Button)findViewById(R.id.clear);
		mBack = (Button)findViewById(R.id.btnBack);
		mImport.setOnClickListener(this);
		mClear.setOnClickListener(this);
		mBack.setOnClickListener(this);
		mRdoImportMode = (RadioGroup)findViewById(R.id.RdoImport);
		mRdoImportMode.setOnCheckedChangeListener(this);
		mTxtDisplay = (TextView)findViewById(R.id.stuCount);
		
		String title = String.format(getString(R.string.stu_total_count), 22);
		mTxtDisplay.setText(title);
	}

	@Override
	public void clickWidget(View view) {
		// TODO Auto-generated method stub
		if(view.getId() == R.id.imports) {
			Log.i("wx", "导入");
		}
		if(view.getId() == R.id.clear) {
			Log.i("wx", "清空");
		}
		if(view.getId() == R.id.btnBack) {
			goToActivity(ImportActivity.this, MainActivity.class);
		}
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		int id = arg0.getCheckedRadioButtonId();
		
		if(id == R.id.import_online) {
			Log.i("wx", "在线导入");
		} else if(id == R.id.import_offline) {
			Log.i("wx", "离线导入");
		}
	}
}
