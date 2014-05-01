package hello.com.vierco.pruebas;

import com.qozix.tileview.TileView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Hola extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hola);
        
        Button botonuno =(Button) findViewById(R.id.button1); 
        
        TileView tileView = new TileView(this);
        tileView.setSize(3000,5000);
        tileView.addDetailLevel(1.0f, "assets/images/mona.jpg");
		
		botonuno.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View view){ 
				// a ejecutar al plusar el boton
			}
	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hola, menu);
        return true;
    }
    
}
