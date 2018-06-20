package com.example.rank.newnewnew.Views;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.example.rank.newnewnew.R;

public class LoginView extends View {

    private int larguraMedida, alturaMedida;
    private Paint cimaPaint, baixoPaint;
    final int corCimaPadrao = 0xFFFFFFFF;
    final int corBaixoPadrao = 0xFFB00020;
    private int alturaTopo = 40;

    public LoginView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public LoginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public LoginView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    public void init(Context context, AttributeSet attributeSet, int style) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.LoginDuasCoresView, style, style);

        int cimaCor    = typedArray.getColor(R.styleable.LoginDuasCoresView_cimaCor, corCimaPadrao);
        int baixoCor   = typedArray.getColor(R.styleable.LoginDuasCoresView_baixoCor, corBaixoPadrao);
            alturaTopo = typedArray.getColor(R.styleable.LoginDuasCoresView_alturaSeparaCorPorcentagem, 40);

        typedArray.recycle();

        cimaPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        cimaPaint.setStyle(Paint.Style.FILL);
        cimaPaint.setColor(cimaCor);

        baixoPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        baixoPaint.setStyle(Paint.Style.FILL);
        baixoPaint.setColor(baixoCor);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        alturaMedida  = getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        larguraMedida = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);

        setMeasuredDimension(alturaMedida, larguraMedida);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(0, 0, larguraMedida, alturaMedida * 0.01f * alturaTopo, cimaPaint);
        canvas.drawRect(0, alturaMedida * 0.01f * alturaTopo, larguraMedida, larguraMedida, baixoPaint);
    }




}
