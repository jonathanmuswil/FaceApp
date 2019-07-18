package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import rc;

public abstract class DialogPreference
  extends Preference
{
  private CharSequence G;
  private CharSequence H;
  private Drawable I;
  private CharSequence J;
  private CharSequence K;
  private int L;
  
  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, rc.a(paramContext, f.dialogPreferenceStyle, 16842897));
  }
  
  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.DialogPreference, paramInt1, paramInt2);
    this.G = rc.b(paramContext, i.DialogPreference_dialogTitle, i.DialogPreference_android_dialogTitle);
    if (this.G == null) {
      this.G = h();
    }
    this.H = rc.b(paramContext, i.DialogPreference_dialogMessage, i.DialogPreference_android_dialogMessage);
    this.I = rc.a(paramContext, i.DialogPreference_dialogIcon, i.DialogPreference_android_dialogIcon);
    this.J = rc.b(paramContext, i.DialogPreference_positiveButtonText, i.DialogPreference_android_positiveButtonText);
    this.K = rc.b(paramContext, i.DialogPreference_negativeButtonText, i.DialogPreference_android_negativeButtonText);
    this.L = rc.b(paramContext, i.DialogPreference_dialogLayout, i.DialogPreference_android_dialogLayout, 0);
    paramContext.recycle();
  }
  
  protected void w()
  {
    f().a(this);
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/DialogPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */