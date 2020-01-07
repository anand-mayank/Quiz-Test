package proj.proj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;

public class Login extends Activity {
	Button b1,b2,b3,b4,b5;
	TextView t1,t2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		b5=(Button)findViewById(R.id.button5);
		t1=(TextView)findViewById(R.id.textView1);
		t2=(TextView)findViewById(R.id.textView2);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(Login.this,Maths.class);
				startActivity(ii);
				Toast.makeText(getApplicationContext(), ""+"Go with Maths",Toast.LENGTH_LONG).show();
					
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(Login.this,Python.class);
				startActivity(ii);
				Toast.makeText(getApplicationContext(), ""+"Go with ADE",Toast.LENGTH_LONG).show();
				
			}
		});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(Login.this,Java.class);
				startActivity(ii);
				Toast.makeText(getApplicationContext(), ""+"Go with DSC",Toast.LENGTH_LONG).show();
				
			}
		});
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(Login.this,MainActivity.class);
				startActivity(ii);
				Toast.makeText(getApplicationContext(), ""+"Successfully Logged Out",Toast.LENGTH_LONG).show();
				
			}
		});
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent ii=new Intent(Login.this,Java.class);
			BufferType j;
			t2.setText("");
			
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
