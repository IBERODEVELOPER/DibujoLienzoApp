package informatico.to.lienzoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //habilitamos para que se pueda visualizar el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //Indicamos donde esta la imagen para el action bar
        getSupportActionBar().setIcon(R.drawable.ic_action_name);
        //Instanciamos el layout con el id de la vista
        RelativeLayout layout1=(RelativeLayout)findViewById(R.id.layout1);
        //objeto de la clase lienzo
        Lienzo fondo =new Lienzo(this);
        //agregamos el fondo al layout
        layout1.addView(fondo); }
    //clase lienzo
    class  Lienzo extends View {
        //Constructor de la clase
        public Lienzo(Context context){ super(context); }
        /*DIbujando*/
        protected void onDraw(Canvas canvas){
            //Canvas lo indicamos los tres colores
            canvas.drawRGB(255,255,255);
            //indicamos el ancho y el largo la cual seria para pintar
            int ancho=canvas.getWidth();
            int largo=canvas.getHeight();
            //Instanciamos a paint para poder pintar
            Paint paint=new Paint();
            //RECTANGULO SUPERIOR
            //Indicamos el Color y lo convertimos
            paint.setColor(Color.parseColor("#231F20"));
            //Indicamos que pinte un rectangulo izquierda,arriba,ancho,abajo,indicamos el color
            canvas.drawRect(0,0,ancho,100,paint);
            // RECTANGULO INFERIOR
            //Indicamos el Color y lo convertimos
            paint.setColor(Color.parseColor("#322F30"));
            //Indicamos que pinte un rectangulo izquierda,arriba,ancho,abajo,indicamos el color
            canvas.drawRect(0,1440,ancho,1540,paint);
            //CIRCULO
            //Agregamos el color al circulo
            paint.setColor(Color.parseColor("#5A1616"));
            //Pintamos x,y radio del circulo,lo indicamos que lo dibuje paint
            canvas.drawCircle(ancho/2,(largo/2)-260,120,paint);
            //Dibujo con Shadeintsnaciamos a SweepGradient
            //Realizamos un arreglo de colores
            int[] colors = {Color.RED, Color.BLUE,Color.GREEN,Color.YELLOW,Color.BLACK};
            //indicamos a shader cx,cy,lista de colores,posicion
            Shader shader = new SweepGradient(ancho/2, (largo/2)+260,colors, null);
            //indicamos que paint guarde a shade
            paint.setShader(shader);
            //Pintamos x,y radio del circulo,lo indicamos que lo dibuje paint
            canvas.drawCircle(ancho/2, (largo/2)+260, 120, paint);
            //Realizamos un arreglo de colores
            colors = new int[]{Color.WHITE, Color.WHITE};
            //indicamos a shader cx,cy,lista de colores,posicio
            shader = new SweepGradient(ancho/2, (largo/2)+260,colors, null);
            //indicamos que paint guarde a shade
            paint.setShader(shader);
            //Pintamos x,y radio del circulo,lo indicamos que lo dibuje paint
            canvas.drawCircle(ancho/2, (largo/2)+260, 90, paint);
            //Realizamos un arreglo de colores
            colors= new int[]{Color.WHITE,Color.BLACK,Color.YELLOW,Color.GREEN,Color.RED,Color.MAGENTA};
            //indicamos a shader cx,cy,lista de colores,posicio
            shader = new SweepGradient(ancho/2, largo/2,colors, null);
            //indicamos que paint guarde a shade
            paint.setShader(shader);
            //Pintamos x,y radio del circulo,lo indicamos que lo dibuje paint
            canvas.drawCircle(ancho/2, largo/2, 120, paint);}}}