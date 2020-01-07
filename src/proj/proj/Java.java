package proj.proj;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Java extends Activity implements OnClickListener {
	CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9;
	TextView tv,e1,e2,e3;
	Button b1;
	int j=0;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.java);
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);
		c4=(CheckBox)findViewById(R.id.checkBox4);
		c5=(CheckBox)findViewById(R.id.checkBox5);
		c6=(CheckBox)findViewById(R.id.checkBox6);
		c7=(CheckBox)findViewById(R.id.checkBox7);
		c8=(CheckBox)findViewById(R.id.checkBox8);
		c9=(CheckBox)findViewById(R.id.checkBox9);
		b1=(Button)findViewById(R.id.button1);
		tv=(TextView)findViewById(R.id.textView1);
		c1.setOnClickListener(this);
		c2.setOnClickListener(this);
		c3.setOnClickListener(this);
		c4.setOnClickListener(this);
		c5.setOnClickListener(this);
		c6.setOnClickListener(this);
		c7.setOnClickListener(this);
		c8.setOnClickListener(this);
		c9.setOnClickListener(this);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(Java.this,Login.class);
				startActivity(ii);
				Toast.makeText(getApplicationContext(), ""+"Data submitted",Toast.LENGTH_LONG).show();
			}
		});	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View selectedcheckbox) {
		// TODO Auto-generated method stubs
		switch(selectedcheckbox.getId())
		{
			case R.id.checkBox1:
				tv.setText("Wrong");
				tv.setTextColor(Color.RED);
				c2.setChecked(false);
				c3.setChecked(false);
				break;
				
			case  R.id.checkBox2:
				tv.setText("Correct Answer");
				tv.setTextColor(Color.GREEN);
				c1.setChecked(false);
				c3.setChecked(false);
				j++;
				break;
				
			case R.id.checkBox3:
				tv.setText("Wrong");
				tv.setTextColor(Color.RED);
				c1.setChecked(false);
				c2.setChecked(false);
				
				break;
		}
		switch(selectedcheckbox.getId())
		{
			case R.id.checkBox4:
				tv.setText("Correct Answer");
				tv.setTextColor(Color.GREEN);
				c5.setChecked(false);
				c6.setChecked(false);
				j++;
				break;
			case  R.id.checkBox5:
				tv.setText("Wrong");
				tv.setTextColor(Color.RED);
				c4.setChecked(false);
				c6.setChecked(false);
				
				break;
				
			case R.id.checkBox6:
				tv.setText("Wrong");
				tv.setTextColor(Color.RED);
				c4.setChecked(false);
				c5.setChecked(false);
				
				break;
		}
		switch(selectedcheckbox.getId())
		{
			case R.id.checkBox7:
				tv.setText("Wrong");
				tv.setTextColor(Color.RED);
				c8.setChecked(false);
				c9.setChecked(false);
				
				break;
				
			case  R.id.checkBox8:
				tv.setText("Wrong");
				tv.setTextColor(Color.RED);
				c7.setChecked(false);
				c9.setChecked(false);
				
				break;
				
			case R.id.checkBox9:
				tv.setText("Correct Answer");
				tv.setTextColor(Color.GREEN);
				c7.setChecked(false);
				c8.setChecked(false);
				j++;
				break;
		}
	}
}