package com.identity.validation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TeacherSignInActivity extends BaseActivity {
	
	private TextView mTxtName;
	private TextView mTxtID;
	private TextView mTxtSubject;
	private TextView mTxtStartTime;
	private TextView mTxtEndTime;
	private TextView mTxtForbidTime;
	private TextView mTxtResult;
	private Button mBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		setChildView(R.layout.teacher_sign_in);
		
		mTxtName = (TextView)findViewById(R.id.txtTeacherName);
		mTxtID = (TextView)findViewById(R.id.txtTeacherNO);
		mTxtSubject = (TextView)findViewById(R.id.txtExamProject);
		mTxtStartTime = (TextView)findViewById(R.id.edtStartTime);
		mTxtEndTime = (TextView)findViewById(R.id.edtEndTime);
		mTxtForbidTime = (TextView)findViewById(R.id.edtForbidSignTime);
		mTxtResult = (TextView)findViewById(R.id.txtTeacherResult);
		mBack = (Button)findViewById(R.id.back);
		mBack.setOnClickListener(this);
	}

	@Override
	public void clickWidget(View view) {
		// TODO Auto-generated method stub
		if(view.getId() == R.id.back); {
			goToActivity(TeacherSignInActivity.this, MainActivity.class);;
		}
	}
}
