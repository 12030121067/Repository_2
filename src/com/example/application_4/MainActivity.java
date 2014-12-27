package com.example.application_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	private Button Click;
	private EditText Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newactivity);
        
        Click = (Button) findViewById(R.id.newbutton4);
        Text =(EditText) findViewById(R.id.text4);
        
        OnClickListener listener = new OnClickListener() {
        	public void onClick(View v){
        		Toast.makeText(getApplicationContext(), Text.getText(), Toast.LENGTH_LONG).show();
        		
        		
        	}
        };
        Click.setOnClickListener(listener);
    }
    
}
