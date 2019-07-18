package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

class e
  extends d
{
  private static Method h;
  
  e(Drawable paramDrawable)
  {
    super(paramDrawable);
    d();
  }
  
  e(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
    d();
  }
  
  private void d()
  {
    if (h == null) {
      try
      {
        h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
      }
      catch (Exception localException)
      {
        Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", localException);
      }
    }
  }
  
  protected boolean b()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i == 21)
    {
      Drawable localDrawable = this.g;
      if ((!(localDrawable instanceof GradientDrawable)) && (!(localDrawable instanceof DrawableContainer)) && (!(localDrawable instanceof InsetDrawable)))
      {
        bool2 = bool1;
        if (!(localDrawable instanceof RippleDrawable)) {}
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  d.a c()
  {
    return new a(this.e, null);
  }
  
  public Rect getDirtyBounds()
  {
    return this.g.getDirtyBounds();
  }
  
  public void getOutline(Outline paramOutline)
  {
    this.g.getOutline(paramOutline);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    this.g.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.g.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    if (super.setState(paramArrayOfInt))
    {
      invalidateSelf();
      return true;
    }
    return false;
  }
  
  public void setTint(int paramInt)
  {
    if (b()) {
      super.setTint(paramInt);
    } else {
      this.g.setTint(paramInt);
    }
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    if (b()) {
      super.setTintList(paramColorStateList);
    } else {
      this.g.setTintList(paramColorStateList);
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    if (b()) {
      super.setTintMode(paramMode);
    } else {
      this.g.setTintMode(paramMode);
    }
  }
  
  private static class a
    extends d.a
  {
    a(d.a parama, Resources paramResources)
    {
      super(paramResources);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new e(this, paramResources);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/graphics/drawable/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */