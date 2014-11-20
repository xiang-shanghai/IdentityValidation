package com.identity.validation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StuValidateActivity extends BaseActivity {
	private TextView mTxtName;
	private TextView mTxtTicketNO;
	private TextView mTxtIDNO;
	private TextView mTxtPlan;
	private TextView mTxtSeat;
	private TextView mTxtTime;
	private TextView mTxtResult;
	private TextView mTxtTitle;
	private Button mBack;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public void initWidget() {
		// TODO Auto-generated method stub
		setChildView(R.layout.stu_validate);
		
		mTxtName = (TextView)findViewById(R.id.txtStuName);
		mTxtTicketNO = (TextView)findViewById(R.id.txtStuTicketNO);
		mTxtIDNO = (TextView)findViewById(R.id.txtStuIdNO);
		mTxtPlan = (TextView)findViewById(R.id.txtStuExamPlan);
		mTxtSeat = (TextView)findViewById(R.id.txtStuSeat);
		mTxtTime = (TextView)findViewById(R.id.txtStuTime);
		mTxtResult = (TextView)findViewById(R.id.txtStuResult);
		mTxtTitle = (TextView)findViewById(R.id.stu_validation_title);
		mBack = (Button)findViewById(R.id.back);
		mBack.setOnClickListener(this);
		
		String title = String.format(getString(R.string.stu_validation_title), 205, "…Ì∑›÷§");
		mTxtTitle.setText(title);
		
	}

	@Override
	public void clickWidget(View view) {
		// TODO Auto-generated method stub
		if(view.getId() == R.id.back) {
			goToActivity(StuValidateActivity.this, MainActivity.class);
		}
	}
}
