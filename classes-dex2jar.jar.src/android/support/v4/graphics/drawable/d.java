package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class d
  extends Drawable
  implements Drawable.Callback, c, b
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  private int b;
  private PorterDuff.Mode c;
  private boolean d;
  a e;
  private boolean f;
  Drawable g;
  
  d(Drawable paramDrawable)
  {
    this.e = c();
    a(paramDrawable);
  }
  
  d(a parama, Resources paramResources)
  {
    this.e = parama;
    a(paramResources);
  }
  
  private void a(Resources paramResources)
  {
    Object localObject = this.e;
    if (localObject != null)
    {
      localObject = ((a)localObject).b;
      if (localObject != null) {
        a(((Drawable.ConstantState)localObject).newDrawable(paramResources));
      }
    }
  }
  
  private boolean a(int[] paramArrayOfInt)
  {
    if (!b()) {
      return false;
    }
    Object localObject = this.e;
    ColorStateList localColorStateList = ((a)localObject).c;
    localObject = ((a)localObject).d;
    if ((localColorStateList != null) && (localObject != null))
    {
      int i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
      if ((!this.d) || (i != this.b) || (localObject != this.c))
      {
        setColorFilter(i, (PorterDuff.Mode)localObject);
        this.b = i;
        this.c = ((PorterDuff.Mode)localObject);
        this.d = true;
        return true;
      }
    }
    else
    {
      this.d = false;
      clearColorFilter();
    }
    return false;
  }
  
  public final Drawable a()
  {
    return this.g;
  }
  
  public final void a(Drawable paramDrawable)
  {
    Object localObject = this.g;
    if (localObject != null) {
      ((Drawable)localObject).setCallback(null);
    }
    this.g = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      setVisible(paramDrawable.isVisible(), true);
      setState(paramDrawable.getState());
      setLevel(paramDrawable.getLevel());
      setBounds(paramDrawable.getBounds());
      localObject = this.e;
      if (localObject != null) {
        ((a)localObject).b = paramDrawable.getConstantState();
      }
    }
    invalidateSelf();
  }
  
  protected boolean b()
  {
    return true;
  }
  
  a c()
  {
    return new b(this.e, null);
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.g.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    a locala = this.e;
    int j;
    if (locala != null) {
      j = locala.getChangingConfigurations();
    } else {
      j = 0;
    }
    return i | j | this.g.getChangingConfigurations();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    a locala = this.e;
    if ((locala != null) && (locala.a()))
    {
      this.e.a = getChangingConfigurations();
      return this.e;
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    return this.g.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.g.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.g.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return this.g.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.g.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.g.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.g.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return this.g.getState();
  }
  
  public Region getTransparentRegion()
  {
    return this.g.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    return this.g.isAutoMirrored();
  }
  
  public boolean isStateful()
  {
    if (b())
    {
      localObject = this.e;
      if (localObject != null)
      {
        localObject = ((a)localObject).c;
        break label26;
      }
    }
    Object localObject = null;
    label26:
    boolean bool;
    if (((localObject != null) && (((ColorStateList)localObject).isStateful())) || (this.g.isStateful())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void jumpToCurrentState()
  {
    this.g.jumpToCurrentState();
  }
  
  public Drawable mutate()
  {
    if ((!this.f) && (super.mutate() == this))
    {
      this.e = c();
      Object localObject = this.g;
      if (localObject != null) {
        ((Drawable)localObject).mutate();
      }
      a locala = this.e;
      if (locala != null)
      {
        localObject = this.g;
        if (localObject != null) {
          localObject = ((Drawable)localObject).getConstantState();
        } else {
          localObject = null;
        }
        locala.b = ((Drawable.ConstantState)localObject);
      }
      this.f = true;
    }
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = this.g;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    return this.g.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.g.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    this.g.setAutoMirrored(paramBoolean);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.g.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.g.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.g.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.g.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.g.setState(paramArrayOfInt);
    if ((!a(paramArrayOfInt)) && (!bool)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.e.c = paramColorStateList;
    a(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.e.d = paramMode;
    a(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!super.setVisible(paramBoolean1, paramBoolean2)) && (!this.g.setVisible(paramBoolean1, paramBoolean2))) {
      paramBoolean1 = false;
    } else {
      paramBoolean1 = true;
    }
    return paramBoolean1;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
  
  protected static abstract class a
    extends Drawable.ConstantState
  {
    int a;
    Drawable.ConstantState b;
    ColorStateList c = null;
    PorterDuff.Mode d = d.a;
    
    a(a parama, Resources paramResources)
    {
      if (parama != null)
      {
        this.a = parama.a;
        this.b = parama.b;
        this.c = parama.c;
        this.d = parama.d;
      }
    }
    
    boolean a()
    {
      boolean bool;
      if (this.b != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int getChangingConfigurations()
    {
      int i = this.a;
      Drawable.ConstantState localConstantState = this.b;
      int j;
      if (localConstantState != null) {
        j = localConstantState.getChangingConfigurations();
      } else {
        j = 0;
      }
      return i | j;
    }
    
    public Drawable newDrawable()
    {
      return newDrawable(null);
    }
    
    public abstract Drawable newDrawable(Resources paramResources);
  }
  
  private static class b
    extends d.a
  {
    b(d.a parama, Resources paramResources)
    {
      super(paramResources);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new d(this, paramResources);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/graphics/drawable/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */