import android.content.Context;
import android.graphics.Bitmap;
import io.faceapp.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class lGa
  extends _Da<FGa>
{
  public static final lGa.a m = new lGa.a(null);
  private final String n = "StylistOld";
  private final List<lGa.b> o;
  private Cka p;
  private String q;
  private final ArrayList<lGa.c> r;
  
  public lGa(Eda paramEda)
  {
    super(paramEda);
    Object localObject = NXa.d(0, 4);
    paramEda = new ArrayList(mWa.a((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ((CWa)localObject).nextInt();
      paramEda.add(new lGa.b());
    }
    this.o = paramEda;
    this.r = new ArrayList();
  }
  
  private final XQa<File> a(Bitmap paramBitmap, File paramFile)
  {
    paramBitmap = XQa.a(new EGa(paramBitmap, paramFile));
    oXa.a(paramBitmap, "Single.defer {\n        I…  Single.just(file)\n    }");
    return paramBitmap;
  }
  
  private final void a(int paramInt)
  {
    Object localObject = (FGa)c();
    if (localObject != null)
    {
      m localm = ((sla)localObject).getRouter();
      if (localm != null)
      {
        localObject = ((lGa.b)this.o.get(paramInt)).b();
        Cka localCka = this.p;
        if (localCka != null)
        {
          gla.b(this, localm.a(localCka, (List)localObject).ba(), null, new BGa(this, paramInt), 1, null);
        }
        else
        {
          oXa.b("stylistFolder");
          throw null;
        }
      }
    }
  }
  
  private final void a(int paramInt, KFa.a parama)
  {
    if (oXa.a(parama, KFa.a.b.a)) {
      return;
    }
    lGa.b localb = (lGa.b)this.o.get(paramInt);
    Object localObject = localb.c();
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    if (!oXa.a(parama, KFa.a.b.a))
    {
      if ((parama instanceof KFa.a.a))
      {
        parama = (KFa.a.a)parama;
        localb.a(parama.a());
        parama = h().b(parama.a());
        localb.d().a(new FGa.b.a(0.1F));
        localObject = QQa.b(parama.d().e(tGa.a), parama.f().d(uGa.a).h()).b(new vGa(localb));
        oXa.a(localObject, "Observable.merge(\n      …ding(INITIAL_PROGRESS)) }");
        parama = new wGa(localb);
        localb.a(gla.b(this, (QQa)localObject, new xGa(this, localb), null, parama, 2, null));
        return;
      }
      throw new UVa();
    }
    throw new IllegalArgumentException("Impossible case since cut off it on start");
  }
  
  private final void a(FGa.c paramc)
  {
    if (oXa.a(paramc, FGa.c.a.a))
    {
      m();
    }
    else
    {
      if (!(paramc instanceof FGa.c.b)) {
        break label36;
      }
      a(((FGa.c.b)paramc).a());
    }
    return;
    label36:
    throw new UVa();
  }
  
  private final void b(List<? extends FGa.b> paramList)
  {
    boolean bool1 = paramList instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (paramList.isEmpty())) {}
    do
    {
      while (!((Iterator)localObject1).hasNext())
      {
        i = 1;
        break;
        localObject1 = paramList.iterator();
      }
    } while (((FGa.b)((Iterator)localObject1).next() instanceof FGa.b.c));
    int i = 0;
    Object localObject2 = null;
    if (i != 0)
    {
      Object localObject3 = this.o;
      localObject1 = new ArrayList(mWa.a((Iterable)localObject3, 10));
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((Collection)localObject1).add(((lGa.b)((Iterator)localObject3).next()).b());
      }
      localObject1 = new lGa.c((List)localObject1);
    }
    else
    {
      localObject1 = null;
    }
    boolean bool3 = mWa.a(this.r, localObject1);
    bool1 = bool2;
    if (localObject1 != null)
    {
      bool1 = bool2;
      if (oXa.a(localObject1, (lGa.c)mWa.h(this.r))) {
        bool1 = true;
      }
    }
    Object localObject1 = localObject2;
    if (bool3) {
      localObject1 = Boolean.valueOf(bool1);
    }
    if (i != 0) {
      paramList = new FGa.d.a(paramList, (Boolean)localObject1);
    } else {
      paramList = new FGa.d.b(paramList);
    }
    localObject1 = (FGa)c();
    if (localObject1 != null) {
      ((jta)localObject1).a(paramList);
    }
  }
  
  private final void l()
  {
    Object localObject = this.o;
    ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add((FGa.b)RPa.a(((lGa.b)((Iterator)localObject).next()).d()));
    }
    b(localArrayList);
  }
  
  private final void m()
  {
    XQa localXQa = n().a(new pGa(this)).b(EVa.b());
    oXa.a(localXQa, "renderImageToBitmap()\n  …       .subscribeOn(io())");
    qGa localqGa = new qGa(this);
    b(localXQa, new rGa(this), localqGa);
  }
  
  private final XQa<Bitmap> n()
  {
    Object localObject1 = this.o;
    boolean bool = localObject1 instanceof Collection;
    int i = 1;
    int j;
    if ((bool) && (((Collection)localObject1).isEmpty()))
    {
      j = i;
    }
    else
    {
      localObject1 = ((Iterable)localObject1).iterator();
      do
      {
        j = i;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
      } while ((((lGa.b)((Iterator)localObject1).next()).d().u() instanceof FGa.b.c));
      j = 0;
    }
    if (j == 0)
    {
      localObject1 = XQa.a(new IllegalStateException("Stylist sharing called on non-filled state"));
      oXa.a(localObject1, "Single.error(IllegalStat…ed on non-filled state\"))");
      return (XQa<Bitmap>)localObject1;
    }
    Object localObject2 = this.o;
    localObject1 = new ArrayList(mWa.a((Iterable)localObject2, 10));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = ((lGa.b)((Iterator)localObject2).next()).d().u();
      if (localObject3 != null) {
        ((Collection)localObject1).add((FGa.b.c)localObject3);
      } else {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.stylist.viewer_old.StylistOldView.PartStatus.Ready");
      }
    }
    localObject2 = new ArrayList(mWa.a((Iterable)localObject1, 10));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((Collection)localObject2).add(((FGa.b.c)((Iterator)localObject1).next()).a());
    }
    localObject1 = XQa.a(new CGa((List)localObject2)).b(EVa.b());
    oXa.a(localObject1, "Single.defer {\n         …      }.subscribeOn(io())");
    return (XQa<Bitmap>)localObject1;
  }
  
  private final XQa<File> o()
  {
    XQa localXQa = n().d(DGa.a);
    oXa.a(localXQa, "renderImageToBitmap().ma…        pictureFile\n    }");
    return localXQa;
  }
  
  public XQa<nsa.b> a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    paramContext = o().d(sGa.a);
    oXa.a(paramContext, "renderImageToFile().map …redImage(it, \"STYLIST\") }");
    return paramContext;
  }
  
  public void a(FGa paramFGa)
  {
    oXa.b(paramFGa, "view");
    Iterator localIterator = this.o.iterator();
    while (localIterator.hasNext())
    {
      lGa.b localb = (lGa.b)localIterator.next();
      if ((localb.d().u() instanceof FGa.b.a)) {
        localb.a();
      }
    }
    super.a(paramFGa);
  }
  
  public final void a(List<? extends List<String>> paramList)
  {
    oXa.b(paramList, "filterIds");
    this.r.add(new lGa.c(paramList));
    l();
  }
  
  public String b()
  {
    return this.n;
  }
  
  public void b(FGa paramFGa)
  {
    oXa.b(paramFGa, "view");
    l();
    paramFGa.a(f().p());
    if (oXa.a((FGa.b)((lGa.b)this.o.get(0)).d().u(), FGa.b.b.a))
    {
      localObject1 = this.q;
      if (localObject1 != null)
      {
        a(0, new KFa.a.a(mWa.a(localObject1)));
      }
      else
      {
        oXa.b("originFilterId");
        throw null;
      }
    }
    Object localObject2 = this.o;
    Object localObject1 = new ArrayList(mWa.a((Iterable)localObject2, 10));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(((lGa.b)((Iterator)localObject2).next()).d());
    }
    localObject1 = QQa.a((Iterable)localObject1, yGa.a);
    oXa.a(localObject1, "Observable\n             …ap { it as PartStatus } }");
    gla.b(this, (QQa)localObject1, null, null, new zGa(this), 3, null);
    gla.a(this, paramFGa.getViewActions(), null, null, new AGa(this), 3, null);
  }
  
  public List<zPa> i()
  {
    Object localObject = this.o;
    ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject, 10));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = ((lGa.b)localIterator.next()).b();
      Eda localEda = h();
      if (((List)localObject).isEmpty())
      {
        localObject = this.q;
        if (localObject == null)
        {
          oXa.b("originFilterId");
          throw null;
        }
      }
      else
      {
        localObject = mWa.a((Iterable)localObject, null, null, null, 0, null, null, 63, null);
      }
      localArrayList.add(new zPa(localEda, (String)localObject));
    }
    return localArrayList;
  }
  
  public boolean j()
  {
    Object localObject = this.o;
    boolean bool1 = localObject instanceof Collection;
    boolean bool2 = true;
    if ((bool1) && (((Collection)localObject).isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      do
      {
        bool1 = bool2;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while ((((lGa.b)((Iterator)localObject).next()).d().u() instanceof FGa.b.c));
      bool1 = false;
    }
    return bool1;
  }
  
  public void k()
  {
    super.k();
    this.p = g().i();
    this.q = g().i().d();
  }
  
  public static final class a {}
  
  private static final class b
  {
    private FVa<FGa.b> a;
    private List<String> b;
    private kRa c;
    
    public b()
    {
      FVa localFVa = FVa.f(FGa.b.b.a);
      oXa.a(localFVa, "BehaviorSubject.createDefault(Empty)");
      this.a = localFVa;
      this.b = mWa.a();
    }
    
    public final void a()
    {
      this.a.a(FGa.b.b.a);
      this.b = mWa.a();
      kRa localkRa = this.c;
      if (localkRa != null) {
        localkRa.i();
      }
      this.c = null;
    }
    
    public final void a(List<String> paramList)
    {
      oXa.b(paramList, "<set-?>");
      this.b = paramList;
    }
    
    public final void a(kRa paramkRa)
    {
      this.c = paramkRa;
    }
    
    public final List<String> b()
    {
      return this.b;
    }
    
    public final kRa c()
    {
      return this.c;
    }
    
    public final FVa<FGa.b> d()
    {
      return this.a;
    }
  }
  
  private static final class c
  {
    private final List<List<String>> a;
    
    public c(List<? extends List<String>> paramList)
    {
      this.a = paramList;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if (oXa.a(this.a, ((c)paramObject).a)) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      List localList = this.a;
      int i;
      if (localList != null) {
        i = localList.hashCode();
      } else {
        i = 0;
      }
      return i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("PollInfo(filterIds=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */