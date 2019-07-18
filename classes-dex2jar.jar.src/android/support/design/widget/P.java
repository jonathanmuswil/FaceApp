package android.support.design.widget;

import W;
import aa;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.y;
import android.support.v7.app.B;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import ca;
import ea;

public class p
  extends B
{
  private BottomSheetBehavior<FrameLayout> c;
  boolean d = true;
  private boolean e = true;
  private boolean f;
  private BottomSheetBehavior.a g = new o(this);
  
  public p(Context paramContext, int paramInt)
  {
    super(paramContext, b(paramContext, paramInt));
    a(1);
  }
  
  private View a(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    FrameLayout localFrameLayout = (FrameLayout)View.inflate(getContext(), ca.design_bottom_sheet_dialog, null);
    CoordinatorLayout localCoordinatorLayout = (CoordinatorLayout)localFrameLayout.findViewById(aa.coordinator);
    View localView = paramView;
    if (paramInt != 0)
    {
      localView = paramView;
      if (paramView == null) {
        localView = getLayoutInflater().inflate(paramInt, localCoordinatorLayout, false);
      }
    }
    paramView = (FrameLayout)localCoordinatorLayout.findViewById(aa.design_bottom_sheet);
    this.c = BottomSheetBehavior.b(paramView);
    this.c.a(this.g);
    this.c.b(this.d);
    if (paramLayoutParams == null) {
      paramView.addView(localView);
    } else {
      paramView.addView(localView, paramLayoutParams);
    }
    localCoordinatorLayout.findViewById(aa.touch_outside).setOnClickListener(new l(this));
    y.a(paramView, new m(this));
    paramView.setOnTouchListener(new n(this));
    return localFrameLayout;
  }
  
  private static int b(Context paramContext, int paramInt)
  {
    int i = paramInt;
    if (paramInt == 0)
    {
      TypedValue localTypedValue = new TypedValue();
      if (paramContext.getTheme().resolveAttribute(W.bottomSheetDialogTheme, localTypedValue, true)) {
        i = localTypedValue.resourceId;
      } else {
        i = ea.Theme_Design_Light_BottomSheetDialog;
      }
    }
    return i;
  }
  
  boolean b()
  {
    if (!this.f)
    {
      TypedArray localTypedArray = getContext().obtainStyledAttributes(new int[] { 16843611 });
      this.e = localTypedArray.getBoolean(0, true);
      localTypedArray.recycle();
      this.f = true;
    }
    return this.e;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getWindow();
    if (paramBundle != null)
    {
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramBundle.clearFlags(67108864);
        paramBundle.addFlags(Integer.MIN_VALUE);
      }
      paramBundle.setLayout(-1, -1);
    }
  }
  
  protected void onStart()
  {
    super.onStart();
    BottomSheetBehavior localBottomSheetBehavior = this.c;
    if ((localBottomSheetBehavior != null) && (localBottomSheetBehavior.b() == 5)) {
      this.c.c(4);
    }
  }
  
  public void setCancelable(boolean paramBoolean)
  {
    super.setCancelable(paramBoolean);
    if (this.d != paramBoolean)
    {
      this.d = paramBoolean;
      BottomSheetBehavior localBottomSheetBehavior = this.c;
      if (localBottomSheetBehavior != null) {
        localBottomSheetBehavior.b(paramBoolean);
      }
    }
  }
  
  public void setCanceledOnTouchOutside(boolean paramBoolean)
  {
    super.setCanceledOnTouchOutside(paramBoolean);
    if ((paramBoolean) && (!this.d)) {
      this.d = true;
    }
    this.e = paramBoolean;
    this.f = true;
  }
  
  public void setContentView(int paramInt)
  {
    super.setContentView(a(paramInt, null, null));
  }
  
  public void setContentView(View paramView)
  {
    super.setContentView(a(0, paramView, null));
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setContentView(a(0, paramView, paramLayoutParams));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */