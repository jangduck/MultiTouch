
package com.example.multitouch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

//Commit1 ''''기본설계완료
//Commit2 ''''기능1 추가
//Commit3 ''''기능2 추가
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class MultiTouchView extends View {
        final int SiZE = 60;
        final int MAX_POINTS = 5;
        float[] x= new float[MAX_POINTS];
        float[] y= new float[MAX_POINTS];
        boolean[] touching = new boolean[MAX_POINTS];
        Paint nPaint;


        public MultiTouchView(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }
        public boolean onTouchEvent(MotionEvent event) {

            return true;
        }
    }
}