package io.palaima.debugdrawer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import iQa;

public class ScrimInsetsFrameLayout
  extends FrameLayout
{
  private Drawable a;
  private Rect b;
  private Rect c = new Rect();
  private a d;
  private boolean e = true;
  
  public ScrimInsetsFrameLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null, 0);
  }
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, iQa.DebugDrawerScrimInsetsView, paramInt, 0);
    if (paramContext == null) {
      return;
    }
    this.a = paramContext.getDrawable(iQa.DebugDrawerScrimInsetsView_dd_siv_insetForeground);
    paramContext.recycle();
    setWillNotDraw(true);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    if ((this.b != null) && (this.a != null))
    {
      int k = paramCanvas.save();
      paramCanvas.translate(getScrollX(), getScrollY());
      this.c.set(0, 0, i, this.b.top);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      this.c.set(0, j - this.b.bottom, i, j);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      Rect localRect1 = this.c;
      Rect localRect2 = this.b;
      localRect1.set(0, localRect2.top, localRect2.left, j - localRect2.bottom);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      localRect2 = this.c;
      localRect1 = this.b;
      localRect2.set(i - localRect1.right, localRect1.top, i, j - localRect1.bottom);
      this.a.setBounds(this.c);
      this.a.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
    }
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    this.b = new Rect(paramRect);
    boolean bool;
    if (this.a == null) {
      bool = true;
    } else {
      bool = false;
    }
    setWillNotDraw(bool);
    y.E(this);
    a locala = this.d;
    if (locala != null) {
      locala.a(paramRect);
    }
    return true;
  }
  
  public Drawable getInsetForeground()
  {
    return this.a;
  }
  
  public boolean isEnabled()
  {
    return this.e;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Drawable localDrawable = this.a;
    if (localDrawable != null) {
      localDrawable.setCallback(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Drawable localDrawable = this.a;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.e = paramBoolean;
    invalidate();
  }
  
  public void setInsetForeground(int paramInt)
  {
    this.a = new ColorDrawable(paramInt);
  }
  
  public void setInsetForeground(Drawable paramDrawable)
  {
    this.a = paramDrawable;
  }
  
  public void setOnInsetsCallback(a parama)
  {
    this.d = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a(Rect paramRect);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/palaima/debugdrawer/view/ScrimInsetsFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */