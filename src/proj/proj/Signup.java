package proj.proj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends Activity {
	EditText uname,upass,e3,e4,e5;
	TextView t1;
	Button b1,b2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);
		uname=(EditText)findViewById(R.id.editText1);
		upass=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText3);
		e4=(EditText)findViewById(R.id.editText4);
		e5=(EditText)findViewById(R.id.editText5);
		t1=(TextView)findViewById(R.id.textView1);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
	}
	public void SAVE(View v)
	{
		SharedPreferences sp=getSharedPreferences("Mydata", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor=sp.edit();
		editor.putString("Name", uname.getText().toString());
		editor.putString("Password", upass.getText().toString());
		editor.putString("Username", e3.getText().toString());
		editor.putString("Password", e4.getText().toString());
		editor.putString("Branch", e5.getText().toString());
		editor.commit();
		Toast.makeText(getApplicationContext(),"Data is SAVED",Toast.LENGTH_LONG).show();
		
	}
	public void SUBMIT(View v)
	{
		Intent i=new Intent(Signup.this,MainActivity.class);
		startActivity(i);
				}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
