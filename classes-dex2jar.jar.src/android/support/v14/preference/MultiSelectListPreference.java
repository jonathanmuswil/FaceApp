package android.support.v14.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.preference.f;
import android.support.v7.preference.i;
import android.support.v7.preference.internal.AbstractMultiSelectListPreference;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import rc;

public class MultiSelectListPreference
  extends AbstractMultiSelectListPreference
{
  private CharSequence[] M;
  private CharSequence[] N;
  private Set<String> O = new HashSet();
  
  public MultiSelectListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, rc.a(paramContext, f.dialogPreferenceStyle, 16842897));
  }
  
  public MultiSelectListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public MultiSelectListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.MultiSelectListPreference, paramInt1, paramInt2);
    this.M = rc.d(paramContext, i.MultiSelectListPreference_entries, i.MultiSelectListPreference_android_entries);
    this.N = rc.d(paramContext, i.MultiSelectListPreference_entryValues, i.MultiSelectListPreference_android_entryValues);
    paramContext.recycle();
  }
  
  protected Object a(TypedArray paramTypedArray, int paramInt)
  {
    paramTypedArray = paramTypedArray.getTextArray(paramInt);
    HashSet localHashSet = new HashSet();
    int i = paramTypedArray.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      localHashSet.add(paramTypedArray[paramInt].toString());
    }
    return localHashSet;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v14/preference/MultiSelectListPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */