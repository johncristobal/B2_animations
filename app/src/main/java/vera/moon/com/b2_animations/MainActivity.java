package vera.moon.com.b2_animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView imagen,imagen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = (ImageView)findViewById(R.id.imageView);
        imagen2 = (ImageView)findViewById(R.id.imageView2);

        //Coloca la imagen desde el inicio a la izquierda -1000 para que no se vea
        //imagen.setTranslationX(-1000f);



    }

    //WHEN CLICK  on the image
    public void fade(View v){

        //animate methos to animate images

        //Here example with alpha para desaparecer con 0 y en 2 segundos
        //imagen.animate().alpha(0f).setDuration(2000);

        //Show soon2 with the same animatons
        //imagen2.animate().alpha(1).setDuration(2000);

        //Here example with translationYBy to move a image to the left or bottom or up
        //imagen.animate().translationXBy(1000f).setDuration(2000);

        //Here example with rotaion to ratate image
        //imagen.animate().rotation(180f).setDuration(2000);
        imagen.animate().rotation(1800f).setDuration(2000); //A kind of cicly

        //Here example make zoom with scale X and Y
        imagen.animate().scaleX(0.f).scaleY(0.5f).setDuration(2000);

        //Ypu can set differten animatiosn at the same time
        //imagen.anomate()rotaion()
            //.translationXBy()
            //....etc.
    }
}
