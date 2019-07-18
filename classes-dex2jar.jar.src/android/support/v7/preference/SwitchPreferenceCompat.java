package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import rc;

public class SwitchPreferenceCompat
  extends TwoStatePreference
{
  private final a L = new a();
  private CharSequence M;
  private CharSequence N;
  
  public SwitchPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, f.switchPreferenceCompatStyle);
  }
  
  public SwitchPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public SwitchPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.SwitchPreferenceCompat, paramInt1, paramInt2);
    b(rc.b(paramContext, i.SwitchPreferenceCompat_summaryOn, i.SwitchPreferenceCompat_android_summaryOn));
    a(rc.b(paramContext, i.SwitchPreferenceCompat_summaryOff, i.SwitchPreferenceCompat_android_summaryOff));
    d(rc.b(paramContext, i.SwitchPreferenceCompat_switchTextOn, i.SwitchPreferenceCompat_android_switchTextOn));
    c(rc.b(paramContext, i.SwitchPreferenceCompat_switchTextOff, i.SwitchPreferenceCompat_android_switchTextOff));
    e(rc.a(paramContext, i.SwitchPreferenceCompat_disableDependentsState, i.SwitchPreferenceCompat_android_disableDependentsState, false));
    paramContext.recycle();
  }
  
  private void c(View paramView)
  {
    boolean bool = paramView instanceof SwitchCompat;
    if (bool) {
      ((SwitchCompat)paramView).setOnCheckedChangeListener(null);
    }
    if ((paramView instanceof Checkable)) {
      ((Checkable)paramView).setChecked(this.I);
    }
    if (bool)
    {
      paramView = (SwitchCompat)paramView;
      paramView.setTextOn(this.M);
      paramView.setTextOff(this.N);
      paramView.setOnCheckedChangeListener(this.L);
    }
  }
  
  private void d(View paramView)
  {
    if (!((AccessibilityManager)a().getSystemService("accessibility")).isEnabled()) {
      return;
    }
    c(paramView.findViewById(g.switchWidget));
    b(paramView.findViewById(16908304));
  }
  
  protected void a(View paramView)
  {
    super.a(paramView);
    d(paramView);
  }
  
  public void c(CharSequence paramCharSequence)
  {
    this.N = paramCharSequence;
    l();
  }
  
  public void d(CharSequence paramCharSequence)
  {
    this.M = paramCharSequence;
    l();
  }
  
  private class a
    implements CompoundButton.OnCheckedChangeListener
  {
    a() {}
    
    public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
    {
      if (!SwitchPreferenceCompat.this.a(Boolean.valueOf(paramBoolean)))
      {
        paramCompoundButton.setChecked(paramBoolean ^ true);
        return;
      }
      SwitchPreferenceCompat.this.d(paramBoolean);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/SwitchPreferenceCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */