import com.facebook.b;
import io.faceapp.ui.components.q.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class owa
  extends gla<pwa>
{
  private final String i;
  private kRa j;
  private final q.a k;
  
  public owa(q.a parama)
  {
    this.k = parama;
    this.i = "Facebook";
  }
  
  private final void a(_ja param_ja)
  {
    param_ja = Kra.b.a(param_ja).a(gRa.a()).b(new cwa(this)).a(new dwa(this));
    oXa.a(param_ja, "AccountManager.serverAut…bLoginDisposable = null }");
    ewa localewa = new ewa(this);
    a(param_ja, new fwa(this), localewa);
  }
  
  private final void a(Throwable paramThrowable)
  {
    Throwable localThrowable = paramThrowable;
    if (!(paramThrowable instanceof gta)) {
      localThrowable = null;
    }
    if ((gta)localThrowable != null)
    {
      paramThrowable = (pwa)c();
      if (paramThrowable != null) {
        paramThrowable.H();
      }
    }
  }
  
  private final void a(List<Uja> paramList)
  {
    pwa localpwa = (pwa)c();
    if (localpwa != null)
    {
      if (paramList.isEmpty()) {
        paramList = pwa.c.b.a;
      } else {
        paramList = new pwa.c.a(paramList);
      }
      localpwa.a(paramList);
    }
  }
  
  private final void a(pwa.b paramb)
  {
    if (oXa.a(paramb, pwa.b.b.a))
    {
      g();
    }
    else if (oXa.a(paramb, pwa.b.a.a))
    {
      g();
    }
    else if (oXa.a(paramb, pwa.b.d.a))
    {
      a(true);
    }
    else
    {
      if (!(paramb instanceof pwa.b.c)) {
        break label74;
      }
      this.k.a(((pwa.b.c)paramb).a());
    }
    return;
    label74:
    throw new UVa();
  }
  
  private final void a(boolean paramBoolean)
  {
    Object localObject = b.n();
    if (localObject == null)
    {
      localObject = (pwa)c();
      if (localObject != null) {
        ((jta)localObject).a(pwa.c.d.a);
      }
      return;
    }
    localObject = jna.a.a((b)localObject).b(new gwa(this, paramBoolean)).d(hwa.a);
    oXa.a(localObject, "FacebookRepository.refre…ImageDescFacebook(it) } }");
    iwa localiwa = new iwa(this);
    b((XQa)localObject, new kwa(this, paramBoolean), localiwa);
  }
  
  private final void f()
  {
    pwa localpwa = (pwa)c();
    if (localpwa != null) {
      localpwa.a(pwa.c.d.a);
    }
    localpwa = (pwa)c();
    if (localpwa != null) {
      localpwa.E();
    }
  }
  
  private final void g()
  {
    if (this.j != null) {
      return;
    }
    Object localObject = (pwa)c();
    if (localObject != null)
    {
      XQa localXQa = ((pwa)localObject).m().a(gRa.a()).a(new lwa(this));
      oXa.a(localXQa, "it.facebookCredsObservab…bLoginDisposable = null }");
      localObject = new mwa(this);
      localObject = a(localXQa, new nwa(this), (cXa)localObject);
    }
    else
    {
      localObject = null;
    }
    this.j = ((kRa)localObject);
  }
  
  public void a(pwa parampwa)
  {
    oXa.b(parampwa, "view");
    super.b(parampwa);
    gla.a(this, parampwa.getViewActions(), null, null, new bwa(this), 3, null);
    parampwa = jna.a.a();
    if (parampwa != null) {
      parampwa = parampwa.b();
    } else {
      parampwa = null;
    }
    if (parampwa != null)
    {
      ArrayList localArrayList = new ArrayList(mWa.a(parampwa, 10));
      Iterator localIterator = parampwa.iterator();
      while (localIterator.hasNext()) {
        localArrayList.add(new Uja((ika)localIterator.next()));
      }
      a(localArrayList);
    }
    boolean bool;
    if (parampwa == null) {
      bool = true;
    } else {
      bool = false;
    }
    a(bool);
  }
  
  public String b()
  {
    return this.i;
  }
  
  public void b(pwa parampwa)
  {
    oXa.b(parampwa, "view");
    kRa localkRa = this.j;
    if (localkRa != null) {
      localkRa.i();
    }
    this.j = null;
    super.a(parampwa);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/owa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */