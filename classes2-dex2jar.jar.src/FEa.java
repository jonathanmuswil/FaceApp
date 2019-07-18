import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class fEa
  extends _Da<AEa>
{
  public static final fEa.a m = new fEa.a(null);
  private final String n = "ModeCollage";
  private final List<fEa.b> o;
  private String p;
  private ArrayList<Eda> q;
  private final FVa<Integer> r;
  private final FVa<List<fEa.b>> s;
  private final List<AEa.a> t;
  private final GVa<AEa.a> u;
  
  public fEa(Eda paramEda)
  {
    super(paramEda);
    Object localObject = NXa.d(0, 4);
    paramEda = new ArrayList(mWa.a((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ((CWa)localObject).nextInt();
      paramEda.add(new fEa.b());
    }
    this.o = paramEda;
    paramEda = FVa.f(Integer.valueOf(4));
    oXa.a(paramEda, "BehaviorSubject.createDefault(MAX_PARTS_COUNT)");
    this.r = paramEda;
    paramEda = FVa.t();
    oXa.a(paramEda, "BehaviorSubject.create()");
    this.s = paramEda;
    this.t = new ArrayList();
    paramEda = GVa.t();
    oXa.a(paramEda, "PublishSubject.create()");
    this.u = paramEda;
  }
  
  private final void a(int paramInt)
  {
    Eda localEda = ((fEa.b)this.o.get(paramInt)).c();
    Object localObject = (AEa)c();
    if (localObject != null)
    {
      JVa localJVa = ((aEa)localObject).c();
      if (localJVa != null)
      {
        localObject = new KDa.a(paramInt);
        ArrayList localArrayList = this.q;
        if (localArrayList != null)
        {
          localJVa.a(new JDa((KDa)localObject, localArrayList, localEda, true));
        }
        else
        {
          oXa.b("photoOps");
          throw null;
        }
      }
    }
  }
  
  private final void a(int paramInt, Eda paramEda, String paramString)
  {
    Object localObject1 = this.o;
    Object localObject2 = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Eda localEda = ((fEa.b)((Iterator)localObject1).next()).c();
      if (localEda != null) {
        ((Collection)localObject2).add(localEda);
      }
    }
    localObject1 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if (oXa.a((Eda)localObject2, paramEda)) {
        break label113;
      }
    }
    localObject2 = null;
    label113:
    localObject2 = (Eda)localObject2;
    if (localObject2 != null) {
      paramEda = (Eda)localObject2;
    }
    a(this, paramInt, paramEda, paramString, 0.0F, 8, null);
  }
  
  private final void a(int paramInt, Eda paramEda, String paramString, float paramFloat)
  {
    fEa.b localb = (fEa.b)this.o.get(paramInt);
    Object localObject = localb.d();
    if (localObject != null) {
      ((kRa)localObject).i();
    }
    localObject = this.q;
    if (localObject != null)
    {
      if (!((ArrayList)localObject).contains(paramEda))
      {
        localObject = this.q;
        if (localObject != null)
        {
          ((ArrayList)localObject).add(paramEda);
        }
        else
        {
          oXa.b("photoOps");
          throw null;
        }
      }
      localb.a(paramEda);
      localb.a(paramString);
      paramString = paramEda.c(paramString);
      paramString = QQa.b(paramString.d().e(nEa.a), paramString.f().d(oEa.a).h()).b(new pEa(localb, paramFloat));
      oXa.a(paramString, "Observable.merge(\n      …loading(startProgress)) }");
      localObject = new qEa(paramFloat, localb);
      localb.a(gla.b(this, paramString, new rEa(this, localb, paramEda), null, (cXa)localObject, 2, null));
      return;
    }
    oXa.b("photoOps");
    throw null;
  }
  
  private final void a(int paramInt, Qda paramQda)
  {
    Object localObject = new uEa(this, paramInt);
    fEa.b localb = (fEa.b)this.o.get(paramInt);
    kRa localkRa = localb.d();
    if (localkRa != null) {
      localkRa.i();
    }
    localb.a(paramQda);
    paramQda = paramQda.a(true).b(new vEa(localb));
    oXa.a(paramQda, "uploader.observePhotoOpB…ding(INITIAL_PROGRESS)) }");
    localObject = new wEa(this, localb, (uEa)localObject);
    localb.a(gla.b(this, paramQda, new xEa(this, localb), null, (cXa)localObject, 2, null));
  }
  
  private final void a(int paramInt, Rja paramRja)
  {
    a(paramInt, new Qda(paramRja));
  }
  
  private final void a(AEa.d paramd)
  {
    if (oXa.a(paramd, AEa.d.b.a))
    {
      paramd = this.r;
      Integer localInteger = (Integer)paramd.u();
      int i = 2;
      if ((localInteger != null) && (localInteger.intValue() == 2)) {
        i = 4;
      }
      paramd.a(Integer.valueOf(i));
    }
    else
    {
      if (!(paramd instanceof AEa.d.a)) {
        break label72;
      }
      a(((AEa.d.a)paramd).a());
    }
    return;
    label72:
    throw new UVa();
  }
  
  private final void b(AEa.a parama)
  {
    int i = parama.a();
    int j = -1;
    int k = 1;
    if (i != -1)
    {
      i = parama.a();
    }
    else
    {
      Object localObject = ((List)RPa.a(this.s)).iterator();
      int i1 = 0;
      int i2;
      for (i = 0;; i++)
      {
        i2 = j;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        if (oXa.a((AEa.c)((fEa.b)((Iterator)localObject).next()).e().u(), AEa.c.b.a))
        {
          i2 = i;
          break;
        }
      }
      localObject = Integer.valueOf(i2);
      i = i1;
      if (((Integer)localObject).intValue() >= 0) {
        i = 1;
      }
      if (i == 0) {
        localObject = null;
      }
      i = k;
      if (localObject != null) {
        i = ((Integer)localObject).intValue();
      }
    }
    if ((parama instanceof AEa.a.b))
    {
      parama = (AEa.a.b)parama;
      a(i, parama.c(), parama.b());
    }
    else if ((parama instanceof AEa.a.a))
    {
      a(i, ((AEa.a.a)parama).b());
    }
  }
  
  private final XQa<Bitmap> m()
  {
    Object localObject1 = (List)RPa.a(this.s);
    boolean bool = localObject1 instanceof Collection;
    int i = 1;
    int j;
    if ((bool) && (((Collection)localObject1).isEmpty()))
    {
      j = i;
    }
    else
    {
      localObject2 = ((Iterable)localObject1).iterator();
      do
      {
        j = i;
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
      } while ((((fEa.b)((Iterator)localObject2).next()).e().u() instanceof AEa.c.c));
      j = 0;
    }
    if (j == 0)
    {
      localObject2 = XQa.a(new IllegalStateException("Collage sharing called on non-filled state"));
      oXa.a(localObject2, "Single.error(IllegalStat…ed on non-filled state\"))");
      return (XQa<Bitmap>)localObject2;
    }
    Object localObject2 = new ArrayList(mWa.a((Iterable)localObject1, 10));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = ((fEa.b)localIterator.next()).e().u();
      if (localObject1 != null) {
        ((Collection)localObject2).add((AEa.c.c)localObject1);
      } else {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.modes.collage.ModeCollageView.PartStatus.Ready");
      }
    }
    localObject1 = new ArrayList(mWa.a((Iterable)localObject2, 10));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((Collection)localObject1).add(((AEa.c.c)((Iterator)localObject2).next()).a());
    }
    localObject2 = XQa.a(new yEa((List)localObject1)).b(EVa.b());
    oXa.a(localObject2, "Single.defer {\n         …scribeOn(Schedulers.io())");
    return (XQa<Bitmap>)localObject2;
  }
  
  private final XQa<File> n()
  {
    XQa localXQa = m().d(zEa.a);
    oXa.a(localXQa, "renderImageToBitmap().ma…        pictureFile\n    }");
    return localXQa;
  }
  
  public XQa<nsa.b> a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    paramContext = n().d(gEa.a);
    oXa.a(paramContext, "renderImageToFile().map …redImage(it, \"STYLIST\") }");
    return paramContext;
  }
  
  public final void a(AEa.a parama)
  {
    oXa.b(parama, "request");
    if (!d()) {
      this.t.add(parama);
    } else {
      this.u.a(parama);
    }
  }
  
  public void a(AEa paramAEa)
  {
    oXa.b(paramAEa, "view");
    Iterator localIterator = this.o.iterator();
    while (localIterator.hasNext())
    {
      fEa.b localb = (fEa.b)localIterator.next();
      if ((localb.e().u() instanceof AEa.c.a)) {
        localb.a();
      }
    }
    super.a(paramAEa);
  }
  
  public String b()
  {
    return this.n;
  }
  
  public void b(AEa paramAEa)
  {
    oXa.b(paramAEa, "view");
    gla.b(this, this.r, null, null, new hEa(this, paramAEa), 3, null);
    if (oXa.a((AEa.c)((fEa.b)this.o.get(0)).e().u(), AEa.c.b.a))
    {
      localObject = this.q;
      if (localObject != null)
      {
        localObject = ((ArrayList)localObject).get(0);
        oXa.a(localObject, "photoOps[0]");
        Eda localEda = (Eda)localObject;
        localObject = this.p;
        if (localObject != null)
        {
          a(this, 0, localEda, (String)localObject, 0.0F, 8, null);
        }
        else
        {
          oXa.b("originFilterId");
          throw null;
        }
      }
      else
      {
        oXa.b("photoOps");
        throw null;
      }
    }
    Object localObject = QQa.d(this.s.e(mEa.a));
    oXa.a(localObject, "Observable.switchOnNext(…PartStatus } }\n        })");
    gla.b(this, (QQa)localObject, null, null, new iEa(paramAEa), 3, null);
    localObject = this.u.c(new ArrayList(this.t));
    oXa.a(localObject, "addToCollageRequests.sta…List(pendingAddRequests))");
    gla.b(this, (QQa)localObject, null, null, new jEa(this), 3, null);
    this.t.clear();
    gla.a(this, paramAEa.getViewActions(), null, null, new kEa(this), 3, null);
  }
  
  public List<zPa> i()
  {
    Object localObject1 = (Iterable)RPa.a(this.s);
    ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject1, 10));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (fEa.b)((Iterator)localObject1).next();
      Eda localEda = ((fEa.b)localObject2).c();
      if (localEda != null)
      {
        localObject2 = ((fEa.b)localObject2).b();
        if (localObject2 != null) {
          localArrayList.add(new zPa(localEda, (String)localObject2));
        } else {
          throw new IllegalArgumentException("Required value was null.");
        }
      }
      else
      {
        throw new IllegalArgumentException("Required value was null.");
      }
    }
    return mWa.j(localArrayList);
  }
  
  public boolean j()
  {
    Object localObject = (Iterable)RPa.a(this.s);
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
      } while ((((fEa.b)((Iterator)localObject).next()).e().u() instanceof AEa.c.c));
      bool1 = false;
    }
    return bool1;
  }
  
  public void k()
  {
    super.k();
    this.p = g().a().d();
    this.q = mWa.a(new Eda[] { h() });
  }
  
  public final Boolean l()
  {
    Object localObject = (Integer)this.r.u();
    if (localObject != null)
    {
      boolean bool;
      if ((localObject != null) && (((Integer)localObject).intValue() == 4)) {
        bool = true;
      } else {
        bool = false;
      }
      localObject = Boolean.valueOf(bool);
    }
    else
    {
      localObject = null;
    }
    return (Boolean)localObject;
  }
  
  public static final class a {}
  
  private static final class b
  {
    private FVa<AEa.c> a;
    private Eda b;
    private Qda c;
    private String d;
    private kRa e;
    
    public b()
    {
      FVa localFVa = FVa.f(AEa.c.b.a);
      oXa.a(localFVa, "BehaviorSubject.createDefault(Empty)");
      this.a = localFVa;
    }
    
    public final void a()
    {
      this.a.a(AEa.c.b.a);
      this.b = null;
      this.c = null;
      this.d = null;
      kRa localkRa = this.e;
      if (localkRa != null) {
        localkRa.i();
      }
      this.e = null;
    }
    
    public final void a(Eda paramEda)
    {
      this.b = paramEda;
    }
    
    public final void a(Qda paramQda)
    {
      this.c = paramQda;
    }
    
    public final void a(String paramString)
    {
      this.d = paramString;
    }
    
    public final void a(kRa paramkRa)
    {
      this.e = paramkRa;
    }
    
    public final String b()
    {
      return this.d;
    }
    
    public final Eda c()
    {
      return this.b;
    }
    
    public final kRa d()
    {
      return this.e;
    }
    
    public final FVa<AEa.c> e()
    {
      return this.a;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */