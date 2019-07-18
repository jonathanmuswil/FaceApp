import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;

public final class qwa
  extends ala<Awa, ywa>
  implements Awa
{
  public static final qwa.a la = new qwa.a(null);
  private final int ma = 2131492982;
  private final int na = 2131492899;
  private final JVa<Awa.a> oa;
  private wwa pa;
  private ViewTreeObserver.OnGlobalLayoutListener qa;
  private boolean ra;
  private HashMap sa;
  
  public qwa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.oa = localGVa;
  }
  
  private final void cc()
  {
    TextView localTextView = (TextView)f(k.menuSendBtnView);
    oXa.a(localTextView, "menuSendBtnView");
    Object localObject = (EditText)f(k.editTextView);
    oXa.a(localObject, "editTextView");
    localObject = ((EditText)localObject).getText();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      localObject = localObject.toString();
      if (localObject != null)
      {
        bool2 = bool1;
        if (zYa.d((CharSequence)localObject).toString().length() > 5) {
          bool2 = true;
        }
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type kotlin.CharSequence");
      }
    }
    localTextView.setEnabled(bool2);
  }
  
  private final String dc()
  {
    EditText localEditText = (EditText)f(k.editTextView);
    oXa.a(localEditText, "editTextView");
    return localEditText.getText().toString();
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.sa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public ywa Mb()
  {
    wwa localwwa = this.pa;
    if (localwwa != null) {
      return new ywa(localwwa);
    }
    oXa.b("mode");
    throw null;
  }
  
  public Integer Wb()
  {
    return Integer.valueOf(this.na);
  }
  
  public void Y()
  {
    View localView = eb();
    if (localView != null) {
      localView.post(new vwa(this));
    }
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public void a(Awa.b paramb)
  {
    oXa.b(paramb, "model");
    Object localObject = (Awa.b.a)paramb;
    paramb = ((Awa.b.a)localObject).a();
    localObject = ((Awa.b.a)localObject).b();
    ((EditText)f(k.editTextView)).setHint(((wwa)localObject).a());
    ((EditText)f(k.editTextView)).setText(paramb);
    cc();
    int i;
    if (((wwa)localObject).d()) {
      i = 2131689896;
    } else {
      i = 2131689897;
    }
    ((TextView)f(k.menuSendBtnView)).setText(i);
    e(((wwa)localObject).c());
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    ((EditText)f(k.editTextView)).addTextChangedListener(new twa(this));
    this.qa = new uwa(this, paramView);
    Object localObject = paramView.getViewTreeObserver();
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.qa;
    if (localOnGlobalLayoutListener != null)
    {
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(localOnGlobalLayoutListener);
      localObject = (TextView)f(k.menuSendBtnView);
      oXa.a(localObject, "menuSendBtnView");
      ((View)localObject).setOnClickListener(new swa(this));
      super.a(paramView, paramBundle);
      return;
    }
    oXa.b("keyboardListener");
    throw null;
  }
  
  protected void bc()
  {
    if (this.ra)
    {
      View localView = eb();
      if (localView != null) {
        UPa.b(localView);
      }
      a(eb(), 500L, new rwa(this));
    }
    else
    {
      super.bc();
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.pa = wwa.g.a(paramBundle.getInt("feedback_mode"));
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        return;
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public View f(int paramInt)
  {
    if (this.sa == null) {
      this.sa = new HashMap();
    }
    View localView1 = (View)this.sa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.sa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public JVa<Awa.a> getViewActions()
  {
    return this.oa;
  }
  
  public Context h()
  {
    return La();
  }
  
  public void sb()
  {
    Object localObject = eb();
    if (localObject != null)
    {
      ViewTreeObserver localViewTreeObserver = ((View)localObject).getViewTreeObserver();
      if (localViewTreeObserver != null)
      {
        localObject = this.qa;
        if (localObject != null)
        {
          localViewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject);
        }
        else
        {
          oXa.b("keyboardListener");
          throw null;
        }
      }
    }
    super.sb();
    Lb();
  }
  
  public void xb()
  {
    getViewActions().a(new Awa.a.b(dc()));
    super.xb();
  }
  
  public static final class a
  {
    public final qwa a(wwa paramwwa)
    {
      oXa.b(paramwwa, "mode");
      qwa localqwa = new qwa();
      Bundle localBundle = new Bundle();
      localBundle.putInt("feedback_mode", paramwwa.getId());
      localqwa.m(localBundle);
      return localqwa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qwa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */