package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.y;
import android.util.DisplayMetrics;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

class c
  extends ImageView
{
  private Animation.AnimationListener a;
  int b;
  
  c(Context paramContext, int paramInt)
  {
    super(paramContext);
    float f = getContext().getResources().getDisplayMetrics().density;
    int i = (int)(1.75F * f);
    int j = (int)(0.0F * f);
    this.b = ((int)(3.5F * f));
    if (a())
    {
      paramContext = new ShapeDrawable(new OvalShape());
      y.b(this, f * 4.0F);
    }
    else
    {
      paramContext = new ShapeDrawable(new a(this.b));
      setLayerType(1, paramContext.getPaint());
      paramContext.getPaint().setShadowLayer(this.b, j, i, 503316480);
      j = this.b;
      setPadding(j, j, j, j);
    }
    paramContext.getPaint().setColor(paramInt);
    y.a(this, paramContext);
  }
  
  private boolean a()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a(Animation.AnimationListener paramAnimationListener)
  {
    this.a = paramAnimationListener;
  }
  
  public void onAnimationEnd()
  {
    super.onAnimationEnd();
    Animation.AnimationListener localAnimationListener = this.a;
    if (localAnimationListener != null) {
      localAnimationListener.onAnimationEnd(getAnimation());
    }
  }
  
  public void onAnimationStart()
  {
    super.onAnimationStart();
    Animation.AnimationListener localAnimationListener = this.a;
    if (localAnimationListener != null) {
      localAnimationListener.onAnimationStart(getAnimation());
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!a()) {
      setMeasuredDimension(getMeasuredWidth() + this.b * 2, getMeasuredHeight() + this.b * 2);
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    if ((getBackground() instanceof ShapeDrawable)) {
      ((ShapeDrawable)getBackground()).getPaint().setColor(paramInt);
    }
  }
  
  private class a
    extends OvalShape
  {
    private RadialGradient a;
    private Paint b = new Paint();
    
    a(int paramInt)
    {
      c.this.b = paramInt;
      a((int)rect().width());
    }
    
    private void a(int paramInt)
    {
      float f1 = paramInt / 2;
      float f2 = c.this.b;
      Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
      this.a = new RadialGradient(f1, f1, f2, new int[] { 1023410176, 0 }, null, localTileMode);
      this.b.setShader(this.a);
    }
    
    public void draw(Canvas paramCanvas, Paint paramPaint)
    {
      int i = c.this.getWidth();
      int j = c.this.getHeight();
      i /= 2;
      float f1 = i;
      float f2 = j / 2;
      paramCanvas.drawCircle(f1, f2, f1, this.b);
      paramCanvas.drawCircle(f1, f2, i - c.this.b, paramPaint);
    }
    
    protected void onResize(float paramFloat1, float paramFloat2)
    {
      super.onResize(paramFloat1, paramFloat2);
      a((int)paramFloat1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */