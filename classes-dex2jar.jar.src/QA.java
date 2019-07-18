import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.internal.c;
import android.support.design.internal.d;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.y;
import android.support.v4.widget.C;
import android.support.v7.widget.l;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

public class qa
  extends l
{
  private final sa c;
  private int d;
  private PorterDuff.Mode e;
  private ColorStateList f;
  private Drawable g;
  private int h;
  private int i;
  private int j;
  
  public qa(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, W.materialButtonStyle);
  }
  
  public qa(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = c.a(paramContext, paramAttributeSet, fa.MaterialButton, paramInt, ea.Widget_MaterialComponents_Button, new int[0]);
    this.d = paramContext.getDimensionPixelSize(fa.MaterialButton_iconPadding, 0);
    this.e = d.a(paramContext.getInt(fa.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
    this.f = Da.a(getContext(), paramContext, fa.MaterialButton_iconTint);
    this.g = Da.b(getContext(), paramContext, fa.MaterialButton_icon);
    this.j = paramContext.getInteger(fa.MaterialButton_iconGravity, 1);
    this.h = paramContext.getDimensionPixelSize(fa.MaterialButton_iconSize, 0);
    this.c = new sa(this);
    this.c.a(paramContext);
    paramContext.recycle();
    setCompoundDrawablePadding(this.d);
    c();
  }
  
  private boolean a()
  {
    int k = y.l(this);
    boolean bool = true;
    if (k != 1) {
      bool = false;
    }
    return bool;
  }
  
  private boolean b()
  {
    sa localsa = this.c;
    boolean bool;
    if ((localsa != null) && (!localsa.g())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void c()
  {
    Object localObject = this.g;
    if (localObject != null)
    {
      this.g = ((Drawable)localObject).mutate();
      a.a(this.g, this.f);
      localObject = this.e;
      if (localObject != null) {
        a.a(this.g, (PorterDuff.Mode)localObject);
      }
      int k = this.h;
      if (k == 0) {
        k = this.g.getIntrinsicWidth();
      }
      int m = this.h;
      if (m == 0) {
        m = this.g.getIntrinsicHeight();
      }
      localObject = this.g;
      int n = this.i;
      ((Drawable)localObject).setBounds(n, 0, k + n, m);
    }
    C.a(this, this.g, null, null, null);
  }
  
  public ColorStateList getBackgroundTintList()
  {
    return getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getBackgroundTintMode()
  {
    return getSupportBackgroundTintMode();
  }
  
  public int getCornerRadius()
  {
    int k;
    if (b()) {
      k = this.c.a();
    } else {
      k = 0;
    }
    return k;
  }
  
  public Drawable getIcon()
  {
    return this.g;
  }
  
  public int getIconGravity()
  {
    return this.j;
  }
  
  public int getIconPadding()
  {
    return this.d;
  }
  
  public int getIconSize()
  {
    return this.h;
  }
  
  public ColorStateList getIconTint()
  {
    return this.f;
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return this.e;
  }
  
  public ColorStateList getRippleColor()
  {
    ColorStateList localColorStateList;
    if (b()) {
      localColorStateList = this.c.b();
    } else {
      localColorStateList = null;
    }
    return localColorStateList;
  }
  
  public ColorStateList getStrokeColor()
  {
    ColorStateList localColorStateList;
    if (b()) {
      localColorStateList = this.c.c();
    } else {
      localColorStateList = null;
    }
    return localColorStateList;
  }
  
  public int getStrokeWidth()
  {
    int k;
    if (b()) {
      k = this.c.d();
    } else {
      k = 0;
    }
    return k;
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (b()) {
      return this.c.e();
    }
    return super.getSupportBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (b()) {
      return this.c.f();
    }
    return super.getSupportBackgroundTintMode();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((Build.VERSION.SDK_INT < 21) && (b())) {
      this.c.a(paramCanvas);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (Build.VERSION.SDK_INT == 21)
    {
      sa localsa = this.c;
      if (localsa != null) {
        localsa.a(paramInt4 - paramInt2, paramInt3 - paramInt1);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((this.g != null) && (this.j == 2))
    {
      int k = (int)getPaint().measureText(getText().toString());
      paramInt2 = this.h;
      paramInt1 = paramInt2;
      if (paramInt2 == 0) {
        paramInt1 = this.g.getIntrinsicWidth();
      }
      paramInt2 = (getMeasuredWidth() - k - y.o(this) - paramInt1 - this.d - y.p(this)) / 2;
      paramInt1 = paramInt2;
      if (a()) {
        paramInt1 = -paramInt2;
      }
      if (this.i != paramInt1)
      {
        this.i = paramInt1;
        c();
      }
    }
  }
  
  public void setBackground(Drawable paramDrawable)
  {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    if (b()) {
      this.c.a(paramInt);
    } else {
      super.setBackgroundColor(paramInt);
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    if (b())
    {
      if (paramDrawable != getBackground())
      {
        Log.i("MaterialButton", "Setting a custom background is not supported.");
        this.c.h();
        super.setBackgroundDrawable(paramDrawable);
      }
      else
      {
        getBackground().setState(paramDrawable.getState());
      }
    }
    else {
      super.setBackgroundDrawable(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = Vd.b(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setBackgroundDrawable(localDrawable);
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    setSupportBackgroundTintList(paramColorStateList);
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    setSupportBackgroundTintMode(paramMode);
  }
  
  public void setCornerRadius(int paramInt)
  {
    if (b()) {
      this.c.b(paramInt);
    }
  }
  
  public void setCornerRadiusResource(int paramInt)
  {
    if (b()) {
      setCornerRadius(getResources().getDimensionPixelSize(paramInt));
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    if (this.g != paramDrawable)
    {
      this.g = paramDrawable;
      c();
    }
  }
  
  public void setIconGravity(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void setIconPadding(int paramInt)
  {
    if (this.d != paramInt)
    {
      this.d = paramInt;
      setCompoundDrawablePadding(paramInt);
    }
  }
  
  public void setIconResource(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = Vd.b(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setIcon(localDrawable);
  }
  
  public void setIconSize(int paramInt)
  {
    if (paramInt >= 0)
    {
      if (this.h != paramInt)
      {
        this.h = paramInt;
        c();
      }
      return;
    }
    throw new IllegalArgumentException("iconSize cannot be less than 0");
  }
  
  public void setIconTint(ColorStateList paramColorStateList)
  {
    if (this.f != paramColorStateList)
    {
      this.f = paramColorStateList;
      c();
    }
  }
  
  public void setIconTintMode(PorterDuff.Mode paramMode)
  {
    if (this.e != paramMode)
    {
      this.e = paramMode;
      c();
    }
  }
  
  public void setIconTintResource(int paramInt)
  {
    setIconTint(Vd.a(getContext(), paramInt));
  }
  
  void setInternalBackground(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setRippleColor(ColorStateList paramColorStateList)
  {
    if (b()) {
      this.c.a(paramColorStateList);
    }
  }
  
  public void setRippleColorResource(int paramInt)
  {
    if (b()) {
      setRippleColor(Vd.a(getContext(), paramInt));
    }
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList)
  {
    if (b()) {
      this.c.b(paramColorStateList);
    }
  }
  
  public void setStrokeColorResource(int paramInt)
  {
    if (b()) {
      setStrokeColor(Vd.a(getContext(), paramInt));
    }
  }
  
  public void setStrokeWidth(int paramInt)
  {
    if (b()) {
      this.c.c(paramInt);
    }
  }
  
  public void setStrokeWidthResource(int paramInt)
  {
    if (b()) {
      setStrokeWidth(getResources().getDimensionPixelSize(paramInt));
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (b()) {
      this.c.c(paramColorStateList);
    } else if (this.c != null) {
      super.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (b()) {
      this.c.a(paramMode);
    } else if (this.c != null) {
      super.setSupportBackgroundTintMode(paramMode);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */