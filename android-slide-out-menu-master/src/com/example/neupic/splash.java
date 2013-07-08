package com.example.neupic;



import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

public class splash extends Activity {

	 protected boolean active = true;
	 protected int splashTime = 1000;
	  
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.splash);
	        
	        Thread splashThread = new Thread(){
	         @Override
	         public void run(){
	          try{
	           int waited = 0;
	           while(active && (waited < splashTime)){
	            sleep(100);
	            if(active){
	             waited += 100;
	            }
	            
	           }
	          } catch(InterruptedException e){
	           
	          } finally{
	           openApp();
	          
	          }
	          
	         }
	        };
	        splashThread.start();
	    }
	    
	    private void openApp(){
	     finish();
	        startActivity(new Intent(this,IntroActivity.class));
	    }
	 
	}