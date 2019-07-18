package android.support.v7.widget;

import Gd;
import Ld;
import Md;
import Pd;
import android.content.Context;
import android.support.v4.view.y;
import android.support.v7.view.menu.l;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import ke;

public class ActionBarContextView
  extends a
{
  private CharSequence i;
  private CharSequence j;
  private View k;
  private View l;
  private LinearLayout m;
  private TextView n;
  private TextView o;
  private int p;
  private int q;
  private boolean r;
  private int s;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.actionModeStyle);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = pb.a(paramContext, paramAttributeSet, Pd.ActionMode, paramInt, 0);
    y.a(this, paramContext.b(Pd.ActionMode_background));
    this.p = paramContext.g(Pd.ActionMode_titleTextStyle, 0);
    this.q = paramContext.g(Pd.ActionMode_subtitleTextStyle, 0);
    this.e = paramContext.f(Pd.ActionMode_height, 0);
    this.s = paramContext.g(Pd.ActionMode_closeItemLayout, Md.abc_action_mode_close_item_material);
    paramContext.a();
  }
  
  private void e()
  {
    if (this.m == null)
    {
      LayoutInflater.from(getContext()).inflate(Md.abc_action_bar_title_item, this);
      this.m = ((LinearLayout)getChildAt(getChildCount() - 1));
      this.n = ((TextView)this.m.findViewById(Ld.action_bar_title));
      this.o = ((TextView)this.m.findViewById(Ld.action_bar_subtitle));
      if (this.p != 0) {
        this.n.setTextAppearance(getContext(), this.p);
      }
      if (this.q != 0) {
        this.o.setTextAppearance(getContext(), this.q);
      }
    }
    this.n.setText(this.i);
    this.o.setText(this.j);
    boolean bool1 = TextUtils.isEmpty(this.i);
    boolean bool2 = TextUtils.isEmpty(this.j) ^ true;
    Object localObject = this.o;
    int i1 = 0;
    if (bool2) {
      i2 = 0;
    } else {
      i2 = 8;
    }
    ((TextView)localObject).setVisibility(i2);
    localObject = this.m;
    int i2 = i1;
    if (!(bool1 ^ true)) {
      if (bool2) {
        i2 = i1;
      } else {
        i2 = 8;
      }
    }
    ((LinearLayout)localObject).setVisibility(i2);
    if (this.m.getParent() == null) {
      addView(this.m);
    }
  }
  
  public void a()
  {
    if (this.k == null) {
      c();
    }
  }
  
  public void a(ke paramke)
  {
    Object localObject = this.k;
    if (localObject == null)
    {
      this.k = LayoutInflater.from(getContext()).inflate(this.s, this, false);
      addView(this.k);
    }
    else if (((View)localObject).getParent() == null)
    {
      addView(this.k);
    }
    this.k.findViewById(Ld.action_mode_close_button).setOnClickListener(new c(this, paramke));
    paramke = (l)paramke.c();
    localObject = this.d;
    if (localObject != null) {
      ((g)localObject).c();
    }
    this.d = new g(getContext());
    this.d.c(true);
    localObject = new ViewGroup.LayoutParams(-2, -1);
    paramke.a(this.d, this.b);
    this.c = ((ActionMenuView)this.d.b(this));
    y.a(this.c, null);
    addView(this.c, (ViewGroup.LayoutParams)localObject);
  }
  
  public boolean b()
  {
    return this.r;
  }
  
  public void c()
  {
    removeAllViews();
    this.l = null;
    this.c = null;
  }
  
  public boolean d()
  {
    g localg = this.d;
    if (localg != null) {
      return localg.i();
    }
    return false;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle()
  {
    return this.j;
  }
  
  public CharSequence getTitle()
  {
    return this.i;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    g localg = this.d;
    if (localg != null)
    {
      localg.e();
      this.d.f();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramAccessibilityEvent.setSource(this);
      paramAccessibilityEvent.setClassName(ActionBarContextView.class.getName());
      paramAccessibilityEvent.setPackageName(getContext().getPackageName());
      paramAccessibilityEvent.setContentDescription(this.i);
    }
    else
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = Fb.a(this);
    int i1;
    if (paramBoolean) {
      i1 = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i1 = getPaddingLeft();
    }
    int i2 = getPaddingTop();
    int i3 = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    Object localObject = this.k;
    if ((localObject != null) && (((View)localObject).getVisibility() != 8))
    {
      localObject = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
      if (paramBoolean) {
        paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
      } else {
        paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
      }
      if (paramBoolean) {
        paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
      } else {
        paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
      }
      paramInt2 = a.a(i1, paramInt2, paramBoolean);
      paramInt2 = a.a(paramInt2 + a(this.k, paramInt2, i2, i3, paramBoolean), paramInt4, paramBoolean);
    }
    else
    {
      paramInt2 = i1;
    }
    localObject = this.m;
    paramInt4 = paramInt2;
    if (localObject != null)
    {
      paramInt4 = paramInt2;
      if (this.l == null)
      {
        paramInt4 = paramInt2;
        if (((LinearLayout)localObject).getVisibility() != 8) {
          paramInt4 = paramInt2 + a(this.m, paramInt2, i2, i3, paramBoolean);
        }
      }
    }
    localObject = this.l;
    if (localObject != null) {
      a((View)localObject, paramInt4, i2, i3, paramBoolean);
    }
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    }
    localObject = this.c;
    if (localObject != null) {
      a((View)localObject, paramInt1, i2, i3, paramBoolean ^ true);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = 1073741824;
    if (i1 == 1073741824)
    {
      if (View.MeasureSpec.getMode(paramInt2) != 0)
      {
        int i3 = View.MeasureSpec.getSize(paramInt1);
        i1 = this.e;
        if (i1 <= 0) {
          i1 = View.MeasureSpec.getSize(paramInt2);
        }
        int i4 = getPaddingTop() + getPaddingBottom();
        paramInt1 = i3 - getPaddingLeft() - getPaddingRight();
        int i5 = i1 - i4;
        int i6 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        localObject = this.k;
        int i7 = 0;
        paramInt2 = paramInt1;
        if (localObject != null)
        {
          paramInt1 = a((View)localObject, paramInt1, i6, 0);
          localObject = (ViewGroup.MarginLayoutParams)this.k.getLayoutParams();
          paramInt2 = paramInt1 - (((ViewGroup.MarginLayoutParams)localObject).leftMargin + ((ViewGroup.MarginLayoutParams)localObject).rightMargin);
        }
        localObject = this.c;
        paramInt1 = paramInt2;
        if (localObject != null)
        {
          paramInt1 = paramInt2;
          if (((ViewGroup)localObject).getParent() == this) {
            paramInt1 = a(this.c, paramInt2, i6, 0);
          }
        }
        localObject = this.m;
        paramInt2 = paramInt1;
        int i8;
        if (localObject != null)
        {
          paramInt2 = paramInt1;
          if (this.l == null) {
            if (this.r)
            {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              this.m.measure(paramInt2, i6);
              i8 = this.m.getMeasuredWidth();
              if (i8 <= paramInt1) {
                i6 = 1;
              } else {
                i6 = 0;
              }
              paramInt2 = paramInt1;
              if (i6 != 0) {
                paramInt2 = paramInt1 - i8;
              }
              localObject = this.m;
              if (i6 != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              }
              ((LinearLayout)localObject).setVisibility(paramInt1);
            }
            else
            {
              paramInt2 = a((View)localObject, paramInt1, i6, 0);
            }
          }
        }
        localObject = this.l;
        if (localObject != null)
        {
          localObject = ((View)localObject).getLayoutParams();
          if (((ViewGroup.LayoutParams)localObject).width != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          }
          i8 = ((ViewGroup.LayoutParams)localObject).width;
          i6 = paramInt2;
          if (i8 >= 0) {
            i6 = Math.min(i8, paramInt2);
          }
          if (((ViewGroup.LayoutParams)localObject).height != -2) {
            paramInt2 = i2;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          }
          i8 = ((ViewGroup.LayoutParams)localObject).height;
          i2 = i5;
          if (i8 >= 0) {
            i2 = Math.min(i8, i5);
          }
          this.l.measure(View.MeasureSpec.makeMeasureSpec(i6, paramInt1), View.MeasureSpec.makeMeasureSpec(i2, paramInt2));
        }
        if (this.e <= 0)
        {
          i2 = getChildCount();
          i1 = 0;
          paramInt1 = i7;
          while (paramInt1 < i2)
          {
            i6 = getChildAt(paramInt1).getMeasuredHeight() + i4;
            paramInt2 = i1;
            if (i6 > i1) {
              paramInt2 = i6;
            }
            paramInt1++;
            i1 = paramInt2;
          }
          setMeasuredDimension(i3, i1);
        }
        else
        {
          setMeasuredDimension(i3, i1);
        }
        return;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(ActionBarContextView.class.getSimpleName());
      ((StringBuilder)localObject).append(" can only be used ");
      ((StringBuilder)localObject).append("with android:layout_height=\"wrap_content\"");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(ActionBarContextView.class.getSimpleName());
    ((StringBuilder)localObject).append(" can only be used ");
    ((StringBuilder)localObject).append("with android:layout_width=\"match_parent\" (or fill_parent)");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void setContentHeight(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = this.l;
    if (localObject != null) {
      removeView((View)localObject);
    }
    this.l = paramView;
    if (paramView != null)
    {
      localObject = this.m;
      if (localObject != null)
      {
        removeView((View)localObject);
        this.m = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.j = paramCharSequence;
    e();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
    e();
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != this.r) {
      requestLayout();
    }
    this.r = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */