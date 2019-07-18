import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.view.View;
import io.faceapp.m.a;
import io.faceapp.n;
import io.faceapp.ui.misc.d;
import io.faceapp.ui.misc.d.a;
import java.util.HashMap;

public final class sJa
  extends UIa<DJa>
  implements DJa, d
{
  public static final sJa.a ma = new sJa.a(null);
  private final int na = 2131493012;
  private final int oa = 2131689835;
  private final GVa<DJa.a> pa;
  private String qa;
  private XIa.b ra;
  private boolean sa;
  private HashMap ta;
  
  public sJa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.pa = localGVa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.ta;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public CJa Mb()
  {
    String str = this.qa;
    if (str != null) {
      return new CJa(str, this.ra);
    }
    oXa.b("pollId");
    throw null;
  }
  
  public int Xb()
  {
    return this.oa;
  }
  
  public int Zb()
  {
    return this.na;
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.qa = EPa.c(paramBundle, "poll_id");
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        l locall = cb();
        paramBundle = locall;
        if (!(locall instanceof XIa.b)) {
          paramBundle = null;
        }
        this.ra = ((XIa.b)paramBundle);
        return;
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public rJa cc()
  {
    return new rJa(getViewActions());
  }
  
  public void dismiss()
  {
    this.sa = true;
    o localo = Ea();
    if (localo != null) {
      localo.onBackPressed();
    }
  }
  
  public View f(int paramInt)
  {
    if (this.ta == null) {
      this.ta = new HashMap();
    }
    View localView1 = (View)this.ta.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.ta.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public boolean fa()
  {
    if (!this.sa)
    {
      w().a(DJa.a.a.a);
      return true;
    }
    return d.a.a(this);
  }
  
  public void i()
  {
    n localn = getRouter();
    if (localn != null) {
      m.a.a(localn, false, true, 1, null);
    }
  }
  
  public GVa<DJa.a> w()
  {
    return this.pa;
  }
  
  public static final class a
  {
    public final sJa a(String paramString)
    {
      oXa.b(paramString, "pollId");
      sJa localsJa = new sJa();
      Bundle localBundle = new Bundle();
      localBundle.putString("poll_id", paramString);
      localsJa.m(localBundle);
      return localsJa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sJa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */