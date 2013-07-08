package com.example.neupic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.example.neupic.R;


public class IntroActivity extends Activity {

	final Context context = this;
	Button Register;
	Button Login;
	
protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		
		
		Register = (Button) findViewById(R.id.Register);
		Login = (Button) findViewById(R.id.Login);
		
		Register.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
		        startActivity(new Intent(context, LayerStack.class));
			}
		});

		Login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
		        startActivity(new Intent(context,LayerStack.class));
			}
		});

		
		
	
		
				
	}		

}
