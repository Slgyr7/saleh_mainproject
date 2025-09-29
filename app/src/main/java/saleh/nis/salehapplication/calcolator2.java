package saleh.nis.salehapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calcolator2 extends AppCompatActivity {
private TextView etNum1;
private TextView tvop;
private TextView etnum2;
private TextView btnmult;
private TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calcolator2);
        etNum1=findViewById(R.id.etNum1);
        tvop=findViewById(R.id.tvop)  ;
        etnum2=findViewById(R.id.etnum2);
        btnmult=findViewById(R.id.btnmult);
        tvresult=findViewById(R.id.tvresult);

    }
    public void onClickmult(View v2)
    {
        String s1 =etNum1.getText().toString();
        int num1=Integer.parseInt(s1);
        String s2 =etnum2.getText().toString();
        int num2=Integer.parseInt(s2);
        int res= num1*num2;
        tvresult.setText(res+"");
    }
    public void onClickplus(View v3)
    {
        String s3 =etNum1.getText().toString();
        int num1=Integer.parseInt(s3);
        String s4 =etnum2.getText().toString();
        int num2=Integer.parseInt(s4);
        int res= num1+num2;
        tvresult.setText(res+"");
    }
    }
