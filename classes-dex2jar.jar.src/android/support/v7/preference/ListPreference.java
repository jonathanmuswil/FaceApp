package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import rc;

public class ListPreference
  extends DialogPreference
{
  private CharSequence[] M;
  private CharSequence[] N;
  private String O;
  private String P;
  private boolean Q;
  
  public ListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, rc.a(paramContext, f.dialogPreferenceStyle, 16842897));
  }
  
  public ListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public ListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, i.ListPreference, paramInt1, paramInt2);
    this.M = rc.d(localTypedArray, i.ListPreference_entries, i.ListPreference_android_entries);
    this.N = rc.d(localTypedArray, i.ListPreference_entryValues, i.ListPreference_android_entryValues);
    localTypedArray.recycle();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.Preference, paramInt1, paramInt2);
    this.P = rc.b(paramContext, i.Preference_summary, i.Preference_android_summary);
    paramContext.recycle();
  }
  
  private int E()
  {
    return c(this.O);
  }
  
  public CharSequence[] A()
  {
    return this.M;
  }
  
  public CharSequence B()
  {
    int i = E();
    if (i >= 0)
    {
      localObject = this.M;
      if (localObject != null) {
        return localObject[i];
      }
    }
    Object localObject = null;
    return (CharSequence)localObject;
  }
  
  public CharSequence[] C()
  {
    return this.N;
  }
  
  public String D()
  {
    return this.O;
  }
  
  protected Object a(TypedArray paramTypedArray, int paramInt)
  {
    return paramTypedArray.getString(paramInt);
  }
  
  public int c(String paramString)
  {
    if (paramString != null)
    {
      CharSequence[] arrayOfCharSequence = this.N;
      if (arrayOfCharSequence != null) {
        for (int i = arrayOfCharSequence.length - 1; i >= 0; i--) {
          if (this.N[i].equals(paramString)) {
            return i;
          }
        }
      }
    }
    return -1;
  }
  
  public void d(String paramString)
  {
    boolean bool = TextUtils.equals(this.O, paramString) ^ true;
    if ((bool) || (!this.Q))
    {
      this.O = paramString;
      this.Q = true;
      b(paramString);
      if (bool) {
        l();
      }
    }
  }
  
  public CharSequence g()
  {
    CharSequence localCharSequence = B();
    String str = this.P;
    if (str == null) {
      return super.g();
    }
    Object localObject = localCharSequence;
    if (localCharSequence == null) {
      localObject = "";
    }
    return String.format(str, new Object[] { localObject });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/ListPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */