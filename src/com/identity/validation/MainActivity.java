package com.identity.validation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void initWidget() {
		setChildView(R.layout.main);
		
		Button btnStuValidate = (Button)findViewById(R.id.btn_stu_valiadate);
		Button btnTeacherSignIn = (Button)findViewById(R.id.btn_teacher_sign_in);
		Button btnExamInfo = (Button)findViewById(R.id.btn_exam_info);
		Button btnImport = (Button)findViewById(R.id.btn_import);
		Button btnExport = (Button)findViewById(R.id.btn_export);
		Button btnSettings = (Button)findViewById(R.id.btn_settings);
		btnStuValidate.setOnClickListener(this);
		btnTeacherSignIn.setOnClickListener(this);
		btnExamInfo.setOnClickListener(this);
		btnImport.setOnClickListener(this);
		btnExport.setOnClickListener(this);
		btnSettings.setOnClickListener(this);
	}

	@Override
	public void clickWidget(View view) {
		int id = view.getId();
		Class<?> to = null;
		
		switch (id) {
		case R.id.btn_stu_valiadate:
			to = StuValidateActivity.class;
			break;
		case R.id.btn_teacher_sign_in:
			to = TeacherSignInActivity.class;
			break;
		case R.id.btn_exam_info:
			to = ExamInfoActivity.class;
			break;
		case R.id.btn_import:
			to = ImportActivity.class;
			break;
		case R.id.btn_export:
			to = ExportActivity.class;
			break;
		case R.id.btn_settings:
			to = SettingsActivity.class;
			break;			
		default:
			break;
		}
		
		goToActivity(MainActivity.this, to);
	}
	
}
