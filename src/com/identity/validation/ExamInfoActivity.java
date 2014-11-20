package com.identity.validation;

import android.R.integer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class ExamInfoActivity extends BaseActivity implements OnCheckedChangeListener {
	private Button mBack;
	private Button mSave;
	private EditText mEdtSubject;
	private EditText mEdtStartTime;
	private EditText mEdtEndTime;
	private EditText mEdtForbidTime;
	private RadioGroup mRdoWay;
	private RadioGroup mRdoOnOff;
	private RadioGroup mRdoMode;
	private RadioGroup mRdoPic;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		

	}

	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		setChildView(R.layout.exam_info);
		
		mEdtSubject = (EditText)findViewById(R.id.edtSubject);
		mEdtStartTime = (EditText)findViewById(R.id.edtStartTime);
		mEdtEndTime = (EditText)findViewById(R.id.edtEndTime);
		mEdtForbidTime = (EditText)findViewById(R.id.edtForbidSignTime);
		mRdoWay = (RadioGroup)findViewById(R.id.rdoValidateMode);
		mRdoOnOff = (RadioGroup)findViewById(R.id.rdoInOrOutLine);
		mRdoMode = (RadioGroup)findViewById(R.id.rdoMode);
		mRdoPic = (RadioGroup)findViewById(R.id.rdoPic);	
		mRdoWay.setOnCheckedChangeListener(this);
		mRdoOnOff.setOnCheckedChangeListener(this);
		mRdoMode.setOnCheckedChangeListener(this);
		mRdoPic.setOnCheckedChangeListener(this);
		mBack = (Button)findViewById(R.id.back);
		mBack.setOnClickListener(this);
		mSave = (Button)findViewById(R.id.save);
		mSave.setOnClickListener(this);
	}

	@Override
	public void clickWidget(View view) {
		// TODO Auto-generated method stub
		if(view.getId() == R.id.back); {
			goToActivity(ExamInfoActivity.this, MainActivity.class);
		}  
		if(view.getId() == R.id.save) {
			Log.i("wx", "save");
		}
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		int checkedId = arg0.getCheckedRadioButtonId();
		switch (checkedId) {
		case R.id.validateMode_id:
			Log.i("wx", "仅身份证");
			break;
		case R.id.validateMode_id_fingerprint:
			Log.i("wx", "身份证+指纹");
			break;
		case R.id.inOrOutLine_out:
			Log.i("wx", "离线");
			break;
		case R.id.inOrOutLine_int:
			Log.i("wx", "在线");
			break;
		case R.id.mode_channel:
			Log.i("wx", "通道模式");
			break;
		case R.id.mode_room:
			Log.i("wx", "考场模式");
			break;
		case R.id.pic_display:
			Log.i("wx", "显示照片");
			break;
		case R.id.pic_notDisplay:
			Log.i("wx", "不显示照片");
			break;			
		default:
			break;
		}
	}
}
