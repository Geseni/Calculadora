package com.example.geseni_pc.calculadora;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;





public class CalculadoraActivity extends ActionBarActivity {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;

//operadores

    private Button bsum; //suma
    private Button bres; //resta
    private Button bmul; //multiplicacion
    private Button bdiv;  //division
    private Button big; //igual
    private Button brz; //raiz

    private Button bmc; //MC
    private Button bmr; //MR
    private Button bms;//MS
    private Button bmm; //M+
    private Button bmn;//M-
    private Button bflec;//←
    private Button bce;//CE
    private Button bc; //C
    private Button bmsns; //±
    private Button bprc; //%
    private Button benx; // 1/x
    private Button bpt; //punto

    private EditText edtvalor;

    double result=0;
    double result1=0;

    boolean flag=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =(Button) findViewById(R.id.b1);
        b2 =(Button) findViewById(R.id.b2);
        b3 =(Button) findViewById(R.id.b3);
        b4 =(Button) findViewById(R.id.b4);
        b5 =(Button) findViewById(R.id.b5);
        b6 =(Button) findViewById(R.id.b6);
        b7 =(Button) findViewById(R.id.b7);
        b8 =(Button) findViewById(R.id.b8);
        b9 =(Button) findViewById(R.id.b9);
        b0 =(Button) findViewById(R.id.b0);


        bsum =(Button) findViewById(R.id.bsum);
        bres =(Button) findViewById(R.id.bres);
        bmul =(Button) findViewById(R.id.bmul);
        bdiv =(Button) findViewById(R.id.bdiv);
        brz =(Button) findViewById(R.id.brz);
        big =(Button) findViewById(R.id.big);


        bmc =(Button) findViewById(R.id.bmc);
        bmr =(Button) findViewById(R.id.bmr);
        bms =(Button) findViewById(R.id.bms);
        bmm =(Button) findViewById(R.id.bmm);
        bmn =(Button) findViewById(R.id.bmn);
        bflec =(Button) findViewById(R.id.bflec);
        bce =(Button) findViewById(R.id.bce);
        bc =(Button) findViewById(R.id.bc);
        bmsns =(Button) findViewById(R.id.bmsns);
        bprc =(Button) findViewById(R.id.bprc);
        benx =(Button) findViewById(R.id.benx);
        bpt =(Button) findViewById(R.id.bpt);

        edtvalor=(EditText) findViewById(R.id.EdtValor);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b1.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b1.getText().toString());
            }

        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b2.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b2.getText().toString());
            }

        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b3.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b3.getText().toString());
            }

        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b4.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b4.getText().toString());
            }

        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b5.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b5.getText().toString());
            }

        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b6.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b6.getText().toString());
            }

        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b7.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b7.getText().toString());
            }

        });




        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b8.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b8.getText().toString());
            }

        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b7.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b7.getText().toString());
            }

        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result1=Integer.parseInt(b9.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b9.getText().toString());
            }

        });

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                result1=Integer.parseInt(b0.getText().toString());
                edtvalor.setText(edtvalor.getText().toString()+b0.getText().toString());
            }

        });


        bsum.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bsum.getText().toString());
            }

        });

        bres.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bres.getText().toString());
            }

        });


        bmul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                result = result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bmul.getText().toString());
            }

        });


        bdiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                result = result + result1;
                edtvalor.setText(edtvalor.getText().toString()+bdiv.getText().toString());
            }

        });


        brz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                result = result + result1;
                edtvalor.setText(edtvalor.getText().toString()+brz.getText().toString());
            }

        });



        bmc.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bmc.getText().toString());
            }

        });


        bmr.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bmr.getText().toString());
            }

        });


        bms.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bms.getText().toString());
            }

        });


        bmm.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bmm.getText().toString());
            }

        });


        bmn.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bmn.getText().toString());
            }

        });


        bflec.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bflec.getText().toString());
            }

        });


        bce.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bce.getText().toString());
            }

        });


        bc.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bc.getText().toString());
            }

        });

        bmsns.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bmsns.getText().toString());
            }

        });

        bprc.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bprc.getText().toString());
            }

        });

        benx.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+benx.getText().toString());
            }

        });

        bpt.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(edtvalor.getText().toString()+bpt.getText().toString());
            }

        });

        big.setOnClickListener(new  View.OnClickListener(){
            public void onClick(View v){
                result=result+result1;
                edtvalor.setText(result+"");
                result1=0;
            }

        });






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
