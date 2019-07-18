package android.support.v7.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference
  extends ListPreference
{
  private final Context R;
  private final ArrayAdapter S;
  private Spinner T;
  private final AdapterView.OnItemSelectedListener U = new a(this);
  
  public DropDownPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, f.dropdownPreferenceStyle);
  }
  
  public DropDownPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public DropDownPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.R = paramContext;
    this.S = E();
    F();
  }
  
  private void F()
  {
    this.S.clear();
    if (A() != null) {
      for (CharSequence localCharSequence : A()) {
        this.S.add(localCharSequence.toString());
      }
    }
  }
  
  protected ArrayAdapter E()
  {
    return new ArrayAdapter(this.R, 17367049);
  }
  
  protected void l()
  {
    super.l();
    this.S.notifyDataSetChanged();
  }
  
  protected void w()
  {
    this.T.performClick();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/DropDownPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */