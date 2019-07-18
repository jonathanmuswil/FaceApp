package android.support.v7.widget;

import Gd;
import Pd;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.support.v4.view.J;
import android.support.v4.view.K;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class a
  extends ViewGroup
{
  protected final a a = new a();
  protected final Context b;
  protected ActionMenuView c;
  protected g d;
  protected int e;
  protected J f;
  private boolean g;
  private boolean h;
  
  a(Context paramContext)
  {
    this(paramContext, null);
  }
  
  a(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(Gd.actionBarPopupTheme, paramAttributeSet, true))
    {
      paramInt = paramAttributeSet.resourceId;
      if (paramInt != 0)
      {
        this.b = new ContextThemeWrapper(paramContext, paramInt);
        return;
      }
    }
    this.b = paramContext;
  }
  
  protected static int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt1 -= paramInt2;
    } else {
      paramInt1 += paramInt2;
    }
    return paramInt1;
  }
  
  protected int a(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, Integer.MIN_VALUE), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() - paramInt3);
  }
  
  protected int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 += (paramInt3 - j) / 2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
    paramInt1 = i;
    if (paramBoolean) {
      paramInt1 = -i;
    }
    return paramInt1;
  }
  
  public J a(int paramInt, long paramLong)
  {
    J localJ = this.f;
    if (localJ != null) {
      localJ.a();
    }
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        setAlpha(0.0F);
      }
      localJ = y.a(this);
      localJ.a(1.0F);
      localJ.a(paramLong);
      locala = this.a;
      locala.a(localJ, paramInt);
      localJ.a(locala);
      return localJ;
    }
    localJ = y.a(this);
    localJ.a(0.0F);
    localJ.a(paramLong);
    a locala = this.a;
    locala.a(localJ, paramInt);
    localJ.a(locala);
    return localJ;
  }
  
  public int getAnimatedVisibility()
  {
    if (this.f != null) {
      return this.a.b;
    }
    return getVisibility();
  }
  
  public int getContentHeight()
  {
    return this.e;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Object localObject = getContext().obtainStyledAttributes(null, Pd.ActionBar, Gd.actionBarStyle, 0);
    setContentHeight(((TypedArray)localObject).getLayoutDimension(Pd.ActionBar_height, 0));
    ((TypedArray)localObject).recycle();
    localObject = this.d;
    if (localObject != null) {
      ((g)localObject).a(paramConfiguration);
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9) {
      this.h = false;
    }
    if (!this.h)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        this.h = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      this.h = false;
    }
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      this.g = false;
    }
    if (!this.g)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        this.g = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      this.g = false;
    }
    return true;
  }
  
  public abstract void setContentHeight(int paramInt);
  
  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
    {
      J localJ = this.f;
      if (localJ != null) {
        localJ.a();
      }
      super.setVisibility(paramInt);
    }
  }
  
  protected class a
    implements K
  {
    private boolean a = false;
    int b;
    
    protected a() {}
    
    public a a(J paramJ, int paramInt)
    {
      a.this.f = paramJ;
      this.b = paramInt;
      return this;
    }
    
    public void a(View paramView)
    {
      this.a = true;
    }
    
    public void b(View paramView)
    {
      if (this.a) {
        return;
      }
      paramView = a.this;
      paramView.f = null;
      a.b(paramView, this.b);
    }
    
    public void c(View paramView)
    {
      a.a(a.this, 0);
      this.a = false;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */