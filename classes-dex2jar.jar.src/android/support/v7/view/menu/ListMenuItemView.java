package android.support.v7.view.menu;

import Gd;
import Ld;
import Md;
import Pd;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.y;
import android.support.v7.widget.pb;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView
  extends LinearLayout
  implements w.a, AbsListView.SelectionBoundsAdjuster
{
  private p a;
  private ImageView b;
  private RadioButton c;
  private TextView d;
  private CheckBox e;
  private TextView f;
  private ImageView g;
  private ImageView h;
  private LinearLayout i;
  private Drawable j;
  private int k;
  private Context l;
  private boolean m;
  private Drawable n;
  private boolean o;
  private int p;
  private LayoutInflater q;
  private boolean r;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.listMenuViewStyle);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    paramAttributeSet = pb.a(getContext(), paramAttributeSet, Pd.MenuView, paramInt, 0);
    this.j = paramAttributeSet.b(Pd.MenuView_android_itemBackground);
    this.k = paramAttributeSet.g(Pd.MenuView_android_itemTextAppearance, -1);
    this.m = paramAttributeSet.a(Pd.MenuView_preserveIconSpacing, false);
    this.l = paramContext;
    this.n = paramAttributeSet.b(Pd.MenuView_subMenuArrow);
    paramContext = paramContext.getTheme();
    paramInt = Gd.dropDownListViewStyle;
    paramContext = paramContext.obtainStyledAttributes(null, new int[] { 16843049 }, paramInt, 0);
    this.o = paramContext.hasValue(0);
    paramAttributeSet.a();
    paramContext.recycle();
  }
  
  private void a()
  {
    this.e = ((CheckBox)getInflater().inflate(Md.abc_list_menu_item_checkbox, this, false));
    a(this.e);
  }
  
  private void a(View paramView)
  {
    a(paramView, -1);
  }
  
  private void a(View paramView, int paramInt)
  {
    LinearLayout localLinearLayout = this.i;
    if (localLinearLayout != null) {
      localLinearLayout.addView(paramView, paramInt);
    } else {
      addView(paramView, paramInt);
    }
  }
  
  private void b()
  {
    this.b = ((ImageView)getInflater().inflate(Md.abc_list_menu_item_icon, this, false));
    a(this.b, 0);
  }
  
  private void c()
  {
    this.c = ((RadioButton)getInflater().inflate(Md.abc_list_menu_item_radio, this, false));
    a(this.c);
  }
  
  private LayoutInflater getInflater()
  {
    if (this.q == null) {
      this.q = LayoutInflater.from(getContext());
    }
    return this.q;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean)
  {
    ImageView localImageView = this.g;
    if (localImageView != null)
    {
      int i1;
      if (paramBoolean) {
        i1 = 0;
      } else {
        i1 = 8;
      }
      localImageView.setVisibility(i1);
    }
  }
  
  public void a(p paramp, int paramInt)
  {
    this.a = paramp;
    this.p = paramInt;
    if (paramp.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    }
    setVisibility(paramInt);
    setTitle(paramp.a(this));
    setCheckable(paramp.isCheckable());
    a(paramp.m(), paramp.d());
    setIcon(paramp.getIcon());
    setEnabled(paramp.isEnabled());
    setSubMenuArrowVisible(paramp.hasSubMenu());
    setContentDescription(paramp.getContentDescription());
  }
  
  public void a(boolean paramBoolean, char paramChar)
  {
    if ((paramBoolean) && (this.a.m())) {
      paramChar = '\000';
    } else {
      paramChar = '\b';
    }
    if (paramChar == 0) {
      this.f.setText(this.a.e());
    }
    if (this.f.getVisibility() != paramChar) {
      this.f.setVisibility(paramChar);
    }
  }
  
  public void adjustListItemSelectionBounds(Rect paramRect)
  {
    Object localObject = this.h;
    if ((localObject != null) && (((ImageView)localObject).getVisibility() == 0))
    {
      localObject = (LinearLayout.LayoutParams)this.h.getLayoutParams();
      paramRect.top += this.h.getHeight() + ((LinearLayout.LayoutParams)localObject).topMargin + ((LinearLayout.LayoutParams)localObject).bottomMargin;
    }
  }
  
  public boolean ea()
  {
    return false;
  }
  
  public p getItemData()
  {
    return this.a;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    y.a(this, this.j);
    this.d = ((TextView)findViewById(Ld.title));
    int i1 = this.k;
    if (i1 != -1) {
      this.d.setTextAppearance(this.l, i1);
    }
    this.f = ((TextView)findViewById(Ld.shortcut));
    this.g = ((ImageView)findViewById(Ld.submenuarrow));
    ImageView localImageView = this.g;
    if (localImageView != null) {
      localImageView.setImageDrawable(this.n);
    }
    this.h = ((ImageView)findViewById(Ld.group_divider));
    this.i = ((LinearLayout)findViewById(Ld.content));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.b != null) && (this.m))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0)) {
        localLayoutParams1.width = localLayoutParams.height;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.c == null) && (this.e == null)) {
      return;
    }
    Object localObject1;
    Object localObject2;
    if (this.a.i())
    {
      if (this.c == null) {
        c();
      }
      localObject1 = this.c;
      localObject2 = this.e;
    }
    else
    {
      if (this.e == null) {
        a();
      }
      localObject1 = this.e;
      localObject2 = this.c;
    }
    if (paramBoolean)
    {
      ((CompoundButton)localObject1).setChecked(this.a.isChecked());
      if (((CompoundButton)localObject1).getVisibility() != 0) {
        ((CompoundButton)localObject1).setVisibility(0);
      }
      if ((localObject2 != null) && (((CompoundButton)localObject2).getVisibility() != 8)) {
        ((CompoundButton)localObject2).setVisibility(8);
      }
    }
    else
    {
      localObject1 = this.e;
      if (localObject1 != null) {
        ((CheckBox)localObject1).setVisibility(8);
      }
      localObject1 = this.c;
      if (localObject1 != null) {
        ((RadioButton)localObject1).setVisibility(8);
      }
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object localObject;
    if (this.a.i())
    {
      if (this.c == null) {
        c();
      }
      localObject = this.c;
    }
    else
    {
      if (this.e == null) {
        a();
      }
      localObject = this.e;
    }
    ((CompoundButton)localObject).setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.r = paramBoolean;
    this.m = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    ImageView localImageView = this.h;
    if (localImageView != null)
    {
      int i1;
      if ((!this.o) && (paramBoolean)) {
        i1 = 0;
      } else {
        i1 = 8;
      }
      localImageView.setVisibility(i1);
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i1;
    if ((!this.a.l()) && (!this.r)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    if ((i1 == 0) && (!this.m)) {
      return;
    }
    if ((this.b == null) && (paramDrawable == null) && (!this.m)) {
      return;
    }
    if (this.b == null) {
      b();
    }
    if ((paramDrawable == null) && (!this.m))
    {
      this.b.setVisibility(8);
    }
    else
    {
      ImageView localImageView = this.b;
      if (i1 == 0) {
        paramDrawable = null;
      }
      localImageView.setImageDrawable(paramDrawable);
      if (this.b.getVisibility() != 0) {
        this.b.setVisibility(0);
      }
    }
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.d.setText(paramCharSequence);
      if (this.d.getVisibility() != 0) {
        this.d.setVisibility(0);
      }
    }
    else if (this.d.getVisibility() != 8)
    {
      this.d.setVisibility(8);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */