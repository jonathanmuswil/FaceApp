package android.support.v7.view.menu;

import Pd;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView.a;
import android.support.v7.widget.I;
import android.support.v7.widget.la;
import android.support.v7.widget.xb;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ActionMenuItemView
  extends I
  implements w.a, View.OnClickListener, ActionMenuView.a
{
  p d;
  private CharSequence e;
  private Drawable f;
  l.b g;
  private la h;
  b i;
  private boolean j;
  private boolean k;
  private int l;
  private int m;
  private int n;
  
  public ActionMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.j = ia();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Pd.ActionMenuItemView, paramInt, 0);
    this.l = paramContext.getDimensionPixelSize(Pd.ActionMenuItemView_android_minWidth, 0);
    paramContext.recycle();
    this.n = ((int)(localResources.getDisplayMetrics().density * 32.0F + 0.5F));
    setOnClickListener(this);
    this.m = -1;
    setSaveEnabled(false);
  }
  
  private boolean ia()
  {
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    int i1 = localConfiguration.screenWidthDp;
    int i2 = localConfiguration.screenHeightDp;
    boolean bool;
    if ((i1 < 480) && ((i1 < 640) || (i2 < 480)) && (localConfiguration.orientation != 2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void ja()
  {
    boolean bool = TextUtils.isEmpty(this.e);
    int i1 = 1;
    int i2 = i1;
    if (this.f != null)
    {
      if (this.d.n())
      {
        i2 = i1;
        if (this.j) {
          break label52;
        }
        if (this.k)
        {
          i2 = i1;
          break label52;
        }
      }
      i2 = 0;
    }
    label52:
    i2 = (bool ^ true) & i2;
    Object localObject1 = null;
    if (i2 != 0) {
      localObject2 = this.e;
    } else {
      localObject2 = null;
    }
    setText((CharSequence)localObject2);
    Object localObject2 = this.d.getContentDescription();
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      if (i2 != 0) {
        localObject2 = null;
      } else {
        localObject2 = this.d.getTitle();
      }
      setContentDescription((CharSequence)localObject2);
    }
    else
    {
      setContentDescription((CharSequence)localObject2);
    }
    localObject2 = this.d.getTooltipText();
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      if (i2 != 0) {
        localObject2 = localObject1;
      } else {
        localObject2 = this.d.getTitle();
      }
      xb.a(this, (CharSequence)localObject2);
    }
    else
    {
      xb.a(this, (CharSequence)localObject2);
    }
  }
  
  public void a(p paramp, int paramInt)
  {
    this.d = paramp;
    setIcon(paramp.getIcon());
    setTitle(paramp.a(this));
    setId(paramp.getItemId());
    if (paramp.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    setVisibility(paramInt);
    setEnabled(paramp.isEnabled());
    if ((paramp.hasSubMenu()) && (this.h == null)) {
      this.h = new a();
    }
  }
  
  public boolean ea()
  {
    return true;
  }
  
  public boolean fa()
  {
    return ha();
  }
  
  public boolean ga()
  {
    boolean bool;
    if ((ha()) && (this.d.getIcon() == null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public p getItemData()
  {
    return this.d;
  }
  
  public boolean ha()
  {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public void onClick(View paramView)
  {
    paramView = this.g;
    if (paramView != null) {
      paramView.a(this.d);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.j = ia();
    ja();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = ha();
    if (bool)
    {
      i1 = this.m;
      if (i1 >= 0) {
        super.setPadding(i1, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = getMeasuredWidth();
    if (i1 == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, this.l);
    } else {
      paramInt1 = this.l;
    }
    if ((i1 != 1073741824) && (this.l > 0) && (i2 < paramInt1)) {
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
    }
    if ((!bool) && (this.f != null)) {
      super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.d.hasSubMenu())
    {
      la localla = this.h;
      if ((localla != null) && (localla.onTouch(this, paramMotionEvent))) {
        return true;
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    if (this.k != paramBoolean)
    {
      this.k = paramBoolean;
      p localp = this.d;
      if (localp != null) {
        localp.b();
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.f = paramDrawable;
    if (paramDrawable != null)
    {
      int i1 = paramDrawable.getIntrinsicWidth();
      int i2 = paramDrawable.getIntrinsicHeight();
      int i3 = this.n;
      int i4 = i1;
      int i5 = i2;
      float f1;
      if (i1 > i3)
      {
        f1 = i3 / i1;
        i5 = (int)(i2 * f1);
        i4 = i3;
      }
      i2 = this.n;
      i1 = i4;
      i3 = i5;
      if (i5 > i2)
      {
        f1 = i2 / i5;
        i1 = (int)(i4 * f1);
        i3 = i2;
      }
      paramDrawable.setBounds(0, 0, i1, i3);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    ja();
  }
  
  public void setItemInvoker(l.b paramb)
  {
    this.g = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb)
  {
    this.i = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    ja();
  }
  
  private class a
    extends la
  {
    public a()
    {
      super();
    }
    
    public z h()
    {
      ActionMenuItemView.b localb = ActionMenuItemView.this.i;
      if (localb != null) {
        return localb.a();
      }
      return null;
    }
    
    protected boolean i()
    {
      ActionMenuItemView localActionMenuItemView = ActionMenuItemView.this;
      Object localObject = localActionMenuItemView.g;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (localObject != null)
      {
        bool2 = bool1;
        if (((l.b)localObject).a(localActionMenuItemView.d))
        {
          localObject = h();
          bool2 = bool1;
          if (localObject != null)
          {
            bool2 = bool1;
            if (((z)localObject).L()) {
              bool2 = true;
            }
          }
        }
      }
      return bool2;
    }
  }
  
  public static abstract class b
  {
    public abstract z a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */