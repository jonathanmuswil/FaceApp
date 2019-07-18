package android.support.v7.app;

import Pd;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import ke;
import ke.a;

public abstract class a
{
  public abstract ke a(ke.a parama);
  
  public abstract void a(Configuration paramConfiguration);
  
  public abstract void a(CharSequence paramCharSequence);
  
  public abstract boolean a(int paramInt, KeyEvent paramKeyEvent);
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public abstract void b(boolean paramBoolean);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract void d(boolean paramBoolean);
  
  public boolean e()
  {
    return false;
  }
  
  public abstract boolean f();
  
  public abstract int g();
  
  public abstract Context h();
  
  public boolean i()
  {
    return false;
  }
  
  void j() {}
  
  public boolean k()
  {
    return false;
  }
  
  public static class a
    extends ViewGroup.MarginLayoutParams
  {
    public int a = 0;
    
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.a = 8388627;
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.ActionBarLayout);
      this.a = paramContext.getInt(Pd.ActionBarLayout_android_layout_gravity, 0);
      paramContext.recycle();
    }
    
    public a(a parama)
    {
      super();
      this.a = parama.a;
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  public static abstract interface b
  {
    public abstract void onMenuVisibilityChanged(boolean paramBoolean);
  }
  
  @Deprecated
  public static abstract class c
  {
    public abstract CharSequence a();
    
    public abstract View b();
    
    public abstract Drawable c();
    
    public abstract CharSequence d();
    
    public abstract void e();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */