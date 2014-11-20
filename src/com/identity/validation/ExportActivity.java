package com.identity.validation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class ExportActivity extends BaseActivity implements OnCheckedChangeListener {
	private Button mExport;
	private Button mBack;
	private RadioGroup mRdoExportMode;
	private TextView mTxtDisplay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	}

	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		setChildView(R.layout.exports);
		
		mExport = (Button)findViewById(R.id.btnExport);
		mBack = (Button)findViewById(R.id.btnBack);
		mExport.setOnClickListener(this);
		mBack.setOnClickListener(this);
		mRdoExportMode = (RadioGroup)findViewById(R.id.RdoExport);
		mRdoExportMode.setOnCheckedChangeListener(this);
		mTxtDisplay = (TextView)findViewById(R.id.stuPassCount);
		
		String title = String.format(getString(R.string.stu_pass_count), 52);
		mTxtDisplay.setText(title);		
	}

	@Override
	public void clickWidget(View view) {
		// TODO Auto-generated method stub
		if(view.getId() == R.id.btnExport) {
			Log.i("wx", "导出");
		}
		if(view.getId() == R.id.btnBack) {
			goToActivity(ExportActivity.this, MainActivity.class);
		}
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		int id = arg0.getCheckedRadioButtonId();
		
		if(id == R.id.export_online) {
			Log.i("wx", "在线导出");
		} else if(id == R.id.export_offline) {
			Log.i("wx", "离线导出");
		}
	}
}
