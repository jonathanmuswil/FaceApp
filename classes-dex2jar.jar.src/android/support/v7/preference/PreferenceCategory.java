package android.support.v7.preference;

import android.content.Context;
import android.util.AttributeSet;
import rc;

public class PreferenceCategory
  extends PreferenceGroup
{
  public PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, rc.a(paramContext, f.preferenceCategoryStyle, 16842892));
  }
  
  public PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public boolean j()
  {
    return false;
  }
  
  public boolean y()
  {
    boolean bool;
    if (!super.j()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/PreferenceCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */