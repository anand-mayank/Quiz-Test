package proj.proj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText uname,upass;
	Button b1,b2;
	TextView t1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		uname=(EditText)findViewById(R.id.editText1);
		upass=(EditText)findViewById(R.id.editText2);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		t1=(TextView)findViewById(R.id.textView1);
		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences sp=getSharedPreferences("Mydata", Context.MODE_PRIVATE);
				String name=sp.getString("Username","");
				String password=sp.getString("Password","");
				if(uname.getText().toString().equals(name) && upass.getText().toString().equals(password))
				{
                    Toast.makeText(MainActivity.this,"UserName and Password is correct",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,Login.class);
                    startActivity(intent);
                   
                } 
				else {
                    Toast.makeText(MainActivity.this,"UserName and Password is not correct",Toast.LENGTH_SHORT).show();
                    
                    }
                }
			
			
			
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent obj=new Intent(MainActivity.this,Signup.class);
				startActivity(obj);
				Toast.makeText(getApplicationContext(), ""+"Sign up here!",Toast.LENGTH_LONG).show();
			
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
