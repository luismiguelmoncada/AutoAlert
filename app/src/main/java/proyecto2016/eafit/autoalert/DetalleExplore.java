package proyecto2016.eafit.autoalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DetalleExplore extends AppCompatActivity {
    public final static String ID = "ID";
    public String mContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_explore);

        mContact = getIntent().getStringExtra("id");
        Toast.makeText(getApplicationContext(),mContact,Toast.LENGTH_LONG).show();
    }
}
