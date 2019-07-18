package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import rc;

public class CheckBoxPreference
  extends TwoStatePreference
{
  private final a L = new a();
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, rc.a(paramContext, f.checkBoxPreferenceStyle, 16842895));
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.CheckBoxPreference, paramInt1, paramInt2);
    b(rc.b(paramContext, i.CheckBoxPreference_summaryOn, i.CheckBoxPreference_android_summaryOn));
    a(rc.b(paramContext, i.CheckBoxPreference_summaryOff, i.CheckBoxPreference_android_summaryOff));
    e(rc.a(paramContext, i.CheckBoxPreference_disableDependentsState, i.CheckBoxPreference_android_disableDependentsState, false));
    paramContext.recycle();
  }
  
  private void c(View paramView)
  {
    boolean bool = paramView instanceof CompoundButton;
    if (bool) {
      ((CompoundButton)paramView).setOnCheckedChangeListener(null);
    }
    if ((paramView instanceof Checkable)) {
      ((Checkable)paramView).setChecked(this.I);
    }
    if (bool) {
      ((CompoundButton)paramView).setOnCheckedChangeListener(this.L);
    }
  }
  
  private void d(View paramView)
  {
    if (!((AccessibilityManager)a().getSystemService("accessibility")).isEnabled()) {
      return;
    }
    c(paramView.findViewById(16908289));
    b(paramView.findViewById(16908304));
  }
  
  protected void a(View paramView)
  {
    super.a(paramView);
    d(paramView);
  }
  
  private class a
    implements CompoundButton.OnCheckedChangeListener
  {
    a() {}
    
    public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
    {
      if (!CheckBoxPreference.this.a(Boolean.valueOf(paramBoolean)))
      {
        paramCompoundButton.setChecked(paramBoolean ^ true);
        return;
      }
      CheckBoxPreference.this.d(paramBoolean);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/CheckBoxPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */