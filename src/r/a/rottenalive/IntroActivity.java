package r.a.rottenalive;

import android.hardware.Camera;
import android.graphics.*;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;



public class IntroActivity extends Activity {
	
	private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;

	private Uri fileUri;
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intro);
		
		  // create Intent to take a picture and return control to the calling application
	    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

	   // fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE); // create a file to save the image
	   // intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri); // set the image file name

	    // start the image capture Intent
	    startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
	    
	    
	    
Button button1 = (Button)findViewById(R.id.button_1);
		
		button1.setOnClickListener(new View.OnClickListener() {
		
		

		@Override
		public void onClick(View view){
			// TODO Auto-generated method stub
			//Intent MenuIntent = new Intent(FullscreenActivity.this, IntroActivity.class);
		 //  	startActivity(MenuIntent);
			
		//	public static Camera open (int cameraId){
				//Camera.Parameters getParameters();
		//		return null;
				
		//	}
			
			
			
		}
		
		
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intro, menu);
		return true;
		
		
		
	}
	
	
	
	

	
	
	

}
