import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import java.util.HashMap;

public final class dJa
  extends UIa<qJa>
  implements qJa
{
  public static final dJa.a ma = new dJa.a(null);
  private final int na = 2131493003;
  private final GVa<qJa.a> oa;
  private final GVa<qJa.b> pa;
  private pJa qa;
  private HashMap ra;
  
  public dJa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.oa = localGVa;
    localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.pa = localGVa;
  }
  
  public GVa<qJa.a> A()
  {
    return this.oa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.ra;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public oJa Mb()
  {
    pJa localpJa = this.qa;
    if (localpJa != null) {
      return new oJa(localpJa);
    }
    oXa.b("feedType");
    throw null;
  }
  
  public int Zb()
  {
    return this.na;
  }
  
  public void a(String paramString, Rka paramRka)
  {
    oXa.b(paramString, "pollId");
    oXa.b(paramRka, "newVote");
    A().a(new qJa.a.c(paramString, paramRka));
  }
  
  public void b(String paramString)
  {
    oXa.b(paramString, "pollId");
    A().a(new qJa.a.b(paramString));
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.qa = pJa.d.a(paramBundle.getInt("feed_type"));
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        return;
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public cJa cc()
  {
    GVa localGVa1 = getViewActions();
    GVa localGVa2 = A();
    GVa localGVa3 = v();
    pJa localpJa = this.qa;
    if (localpJa != null) {
      return new cJa(localGVa1, localGVa2, localGVa3, localpJa);
    }
    oXa.b("feedType");
    throw null;
  }
  
  public View f(int paramInt)
  {
    if (this.ra == null) {
      this.ra = new HashMap();
    }
    View localView1 = (View)this.ra.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.ra.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public void o()
  {
    getViewActions().a(XIa.c.d.a);
  }
  
  public GVa<qJa.b> v()
  {
    return this.pa;
  }
  
  public static final class a
  {
    public final dJa a(pJa parampJa)
    {
      oXa.b(parampJa, "feedType");
      dJa localdJa = new dJa();
      Bundle localBundle = new Bundle();
      localBundle.putInt("feed_type", parampJa.a());
      localdJa.m(localBundle);
      return localdJa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dJa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */