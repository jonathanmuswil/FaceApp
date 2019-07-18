package android.support.v7.preference;

import android.content.Context;
import android.util.AttributeSet;
import rc;

public final class PreferenceScreen
  extends PreferenceGroup
{
  private boolean P = true;
  
  public PreferenceScreen(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, rc.a(paramContext, f.preferenceScreenStyle, 16842891));
  }
  
  protected void w()
  {
    if ((d() == null) && (c() == null) && (A() != 0))
    {
      f().b();
      throw null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/PreferenceScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */