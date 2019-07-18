package android.support.design.internal;

import Gd;
import Y;
import Z;
import aa;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.d;
import android.support.v4.view.y;
import android.support.v4.widget.C;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.w.a;
import android.support.v7.widget.pa;
import android.support.v7.widget.pa.a;
import android.support.v7.widget.xb;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import ca;
import qc;

public class NavigationMenuItemView
  extends a
  implements w.a
{
  private static final int[] v = { 16842912 };
  private FrameLayout A;
  private p B;
  private ColorStateList C;
  private boolean D;
  private Drawable E;
  private final d F = new b(this);
  private final int w;
  private boolean x;
  boolean y;
  private final CheckedTextView z;
  
  public NavigationMenuItemView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(0);
    LayoutInflater.from(paramContext).inflate(ca.design_navigation_menu_item, this, true);
    this.w = paramContext.getResources().getDimensionPixelSize(Y.design_navigation_icon_size);
    this.z = ((CheckedTextView)findViewById(aa.design_menu_item_text));
    this.z.setDuplicateParentStateEnabled(true);
    y.a(this.z, this.F);
  }
  
  private void a()
  {
    Object localObject;
    if (c())
    {
      this.z.setVisibility(8);
      localObject = this.A;
      if (localObject != null)
      {
        localObject = (pa.a)((FrameLayout)localObject).getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).width = -1;
        this.A.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
    else
    {
      this.z.setVisibility(0);
      localObject = this.A;
      if (localObject != null)
      {
        localObject = (pa.a)((FrameLayout)localObject).getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).width = -2;
        this.A.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
  }
  
  private StateListDrawable b()
  {
    TypedValue localTypedValue = new TypedValue();
    if (getContext().getTheme().resolveAttribute(Gd.colorControlHighlight, localTypedValue, true))
    {
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(v, new ColorDrawable(localTypedValue.data));
      localStateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
      return localStateListDrawable;
    }
    return null;
  }
  
  private boolean c()
  {
    boolean bool;
    if ((this.B.getTitle() == null) && (this.B.getIcon() == null) && (this.B.getActionView() != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void setActionView(View paramView)
  {
    if (paramView != null)
    {
      if (this.A == null) {
        this.A = ((FrameLayout)((ViewStub)findViewById(aa.design_menu_item_action_area_stub)).inflate());
      }
      this.A.removeAllViews();
      this.A.addView(paramView);
    }
  }
  
  public void a(p paramp, int paramInt)
  {
    this.B = paramp;
    if (paramp.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    setVisibility(paramInt);
    if (getBackground() == null) {
      y.a(this, b());
    }
    setCheckable(paramp.isCheckable());
    setChecked(paramp.isChecked());
    setEnabled(paramp.isEnabled());
    setTitle(paramp.getTitle());
    setIcon(paramp.getIcon());
    setActionView(paramp.getActionView());
    setContentDescription(paramp.getContentDescription());
    xb.a(this, paramp.getTooltipText());
    a();
  }
  
  public boolean ea()
  {
    return false;
  }
  
  public p getItemData()
  {
    return this.B;
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    p localp = this.B;
    if ((localp != null) && (localp.isCheckable()) && (this.B.isChecked())) {
      ViewGroup.mergeDrawableStates(arrayOfInt, v);
    }
    return arrayOfInt;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
    if (this.y != paramBoolean)
    {
      this.y = paramBoolean;
      this.F.a(this.z, 2048);
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    refreshDrawableState();
    this.z.setChecked(paramBoolean);
  }
  
  public void setHorizontalPadding(int paramInt)
  {
    setPadding(paramInt, 0, paramInt, 0);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i;
    if (paramDrawable != null)
    {
      Object localObject = paramDrawable;
      if (this.D)
      {
        localObject = paramDrawable.getConstantState();
        if (localObject != null) {
          paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
        }
        localObject = android.support.v4.graphics.drawable.a.i(paramDrawable).mutate();
        android.support.v4.graphics.drawable.a.a((Drawable)localObject, this.C);
      }
      i = this.w;
      ((Drawable)localObject).setBounds(0, 0, i, i);
      paramDrawable = (Drawable)localObject;
    }
    else if (this.x)
    {
      if (this.E == null)
      {
        this.E = qc.a(getResources(), Z.navigation_empty_icon, getContext().getTheme());
        paramDrawable = this.E;
        if (paramDrawable != null)
        {
          i = this.w;
          paramDrawable.setBounds(0, 0, i, i);
        }
      }
      paramDrawable = this.E;
    }
    C.a(this.z, paramDrawable, null, null, null);
  }
  
  public void setIconPadding(int paramInt)
  {
    this.z.setCompoundDrawablePadding(paramInt);
  }
  
  void setIconTintList(ColorStateList paramColorStateList)
  {
    this.C = paramColorStateList;
    boolean bool;
    if (this.C != null) {
      bool = true;
    } else {
      bool = false;
    }
    this.D = bool;
    paramColorStateList = this.B;
    if (paramColorStateList != null) {
      setIcon(paramColorStateList.getIcon());
    }
  }
  
  public void setNeedsEmptyIcon(boolean paramBoolean)
  {
    this.x = paramBoolean;
  }
  
  public void setTextAppearance(int paramInt)
  {
    C.d(this.z, paramInt);
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.z.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.z.setText(paramCharSequence);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/internal/NavigationMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */