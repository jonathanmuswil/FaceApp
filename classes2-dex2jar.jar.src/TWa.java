import android.text.Editable;
import android.text.TextWatcher;

public final class twa
  implements TextWatcher
{
  public void afterTextChanged(Editable paramEditable)
  {
    qwa.a(this.a);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/twa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */