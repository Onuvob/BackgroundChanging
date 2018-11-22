package info.sonjoy.changebackground;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleBC(View view)
    {
        LinearLayout lay = ( LinearLayout )  findViewById(R.id.colorToggle);

        ColorDrawable viewColor = ( ColorDrawable ) lay.getBackground();

        int colorId = viewColor.getColor();
        //lay.setBackgroundColor((Color.parseColor("#ffffff")));

        if(colorId == Color.parseColor("#ffffff"))
        {
            viewColor.setColor(Color.parseColor("#00FFFF"));
        }
        else if(colorId == Color.parseColor("#00FFFF"))
        {
            viewColor.setColor(Color.parseColor("#0000FF"));
        }
        else
            viewColor.setColor(Color.parseColor("#FFFFFF"));
    }
}
