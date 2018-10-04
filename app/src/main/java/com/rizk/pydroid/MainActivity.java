package com.rizk.pydroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import jep.Jep;

public class MainActivity extends AppCompatActivity {

  // Used to load the 'native-lib' library on application startup.
  static {
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Example of a call to a native method
    TextView tv = (TextView) findViewById(R.id.sample_text);
    tv.setText("Hello, World! This is Pydroid");

    try {
      Jep test = new Jep(false);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * A native method that is implemented by the 'native-lib' native library, which is packaged with
   * this application.
   */
  public native String stringFromJNI();
}
