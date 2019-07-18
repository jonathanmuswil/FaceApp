import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class eoa
{
  private static final Zma.a.a a;
  private static ContentResolver b;
  private static jRa c;
  private static final FVa<List<eoa.d>> d;
  private static final FVa<eoa.a> e;
  private static final FVa<eoa.a> f;
  private static final GVa<Object> g;
  private static final GVa<Object> h;
  private static final HashMap<String, Zma.a.a> i = new HashMap(DWa.a(ZVa.a("empty_faces_cache_key", a)));
  public static final eoa j = new eoa();
  
  static
  {
    a = new Zma.a.a(0L, null, 3, null);
    Object localObject = FVa.t();
    oXa.a(localObject, "BehaviorSubject.create<List<RecentPhotoInner>>()");
    d = (FVa)localObject;
    localObject = FVa.t();
    oXa.a(localObject, "BehaviorSubject.create<PhotoBatch>()");
    e = (FVa)localObject;
    localObject = FVa.t();
    oXa.a(localObject, "BehaviorSubject.create<PhotoBatch>()");
    f = (FVa)localObject;
    localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create<Any>()");
    g = (GVa)localObject;
    localObject = GVa.t();
    oXa.a(localObject, "PublishSubject.create<Any>()");
    h = (GVa)localObject;
  }
  
  private final QQa<eoa.a> a(List<eoa.d> paramList, int paramInt)
  {
    Object localObject = woa.b;
    localObject = xoa.b;
    paramList = QQa.a(new Boa(paramList, paramInt)).b(EVa.b());
    oXa.a(paramList, "Observable.create<PhotoB…scribeOn(Schedulers.io())");
    return paramList;
  }
  
  private final Zma.a.a a(eoa.c paramc)
  {
    return a(paramc.a().c());
  }
  
  private final Zma.a.a a(String paramString)
  {
    synchronized (i)
    {
      paramString = (Zma.a.a)i.get(paramString);
      return paramString;
    }
  }
  
  private final Boolean a(Zma.a.b paramb)
  {
    if (paramb == Zma.a.b.a)
    {
      paramb = null;
    }
    else
    {
      boolean bool;
      if (paramb == Zma.a.b.c) {
        bool = true;
      } else {
        bool = false;
      }
      paramb = Boolean.valueOf(bool);
    }
    return paramb;
  }
  
  private final void a(eoa.c paramc, Zma.a.a parama)
  {
    a(paramc.a().c(), parama);
  }
  
  private final void a(String paramString, Zma.a.a parama)
  {
    synchronized (i)
    {
      i.put(paramString, parama);
      paramString = cWa.a;
      return;
    }
  }
  
  private final void a(Map<String, Zma.a.a> paramMap)
  {
    synchronized (i)
    {
      i.remove("empty_faces_cache_key");
      i.putAll(paramMap);
      paramMap = cWa.a;
      return;
    }
  }
  
  private final QQa<eoa.a> f()
  {
    QQa localQQa = QQa.a(jna.a.c().e(foa.a).e(goa.a), i().e(hoa.a).e(ioa.a), joa.a).a(EVa.a()).e(koa.a).e().a(loa.a);
    oXa.a(localQQa, "Observable.combineLatest…photos.count()} items\") }");
    return localQQa;
  }
  
  private final QQa<List<eoa.d>> g()
  {
    QQa localQQa = QQa.a(h.e(new Object()), Bna.e.a().e(moa.a).e(noa.a), jna.a.c().e(ooa.a).e(poa.a), i().e(qoa.a).e(roa.a), soa.a).a(EVa.a()).e(uoa.a).e().a(voa.a);
    oXa.a(localQQa, "Observable.combineLatest…: ${it.count()} items\") }");
    return localQQa;
  }
  
  private final boolean h()
  {
    boolean bool;
    if (a("empty_faces_cache_key") == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private final QQa<List<hka>> i()
  {
    QQa localQQa = zia.l.d().h(Doa.a);
    oXa.a(localQQa, "BillingRepository.observ…emoImagesInfo()\n        }");
    return localQQa;
  }
  
  private final void j()
  {
    g.a(new Object());
  }
  
  public final QQa<eoa.a> a()
  {
    QQa localQQa = d.e(Coa.a).e(new eoa.a(mWa.a(), false)).b(EVa.b());
    oXa.a(localQQa, "allRecentPhotosSubject\n …scribeOn(Schedulers.io())");
    return localQQa;
  }
  
  public final void a(Rja paramRja)
  {
    oXa.b(paramRja, "image");
    if ((paramRja instanceof Wja)) {
      return;
    }
    if (a(paramRja.c()) != null)
    {
      long l1 = System.currentTimeMillis();
      long l2 = 'Ϩ';
      j.a(paramRja.c(), new Zma.a.a(l1 * l2, Zma.a.b.c));
      j.j();
      h.a(new Object());
    }
  }
  
  public final void a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    paramContext = paramContext.getApplicationContext();
    oXa.a(paramContext, "context.applicationContext");
    paramContext = paramContext.getContentResolver();
    oXa.a(paramContext, "context.applicationContext.contentResolver");
    b = paramContext;
  }
  
  public final void a(Uri paramUri)
  {
    oXa.b(paramUri, "uri");
    paramUri = paramUri.toString();
    oXa.a(paramUri, "uri.toString()");
    a(paramUri, new Zma.a.a(System.currentTimeMillis() * 'Ϩ', Zma.a.b.d));
    j();
  }
  
  public final QQa<eoa.a> b()
  {
    QQa localQQa = f.e().b(EVa.b());
    oXa.a(localQQa, "allPermissionFreePhotosS…scribeOn(Schedulers.io())");
    return localQQa;
  }
  
  public final QQa<eoa.a> c()
  {
    QQa localQQa = e.e().b(EVa.b());
    oXa.a(localQQa, "allFacesPhotosSubject\n  …scribeOn(Schedulers.io())");
    return localQQa;
  }
  
  public final void d()
  {
    c = new jRa();
    Object localObject;
    if (h()) {
      localObject = xQa.e();
    } else {
      localObject = XQa.a(Joa.a).c(Koa.a).b(EVa.b()).d().d();
    }
    jRa localjRa = c;
    if (localjRa != null)
    {
      localjRa.b(((xQa)localObject).a(g()).c(Eoa.a));
      localjRa = c;
      if (localjRa != null)
      {
        localjRa.b(((xQa)localObject).a(f()).c(Foa.a));
        localObject = c;
        if (localObject != null)
        {
          ((jRa)localObject).b(d.h(Goa.a).b(EVa.b()).c(Hoa.a));
          localObject = c;
          if (localObject != null)
          {
            ((jRa)localObject).b(g.e(5L, TimeUnit.SECONDS).a(EVa.b()).c(Ioa.a));
            return;
          }
          oXa.b("disposable");
          throw null;
        }
        oXa.b("disposable");
        throw null;
      }
      oXa.b("disposable");
      throw null;
    }
    oXa.b("disposable");
    throw null;
  }
  
  public final void e()
  {
    jRa localjRa = c;
    if (localjRa != null)
    {
      localjRa.i();
      return;
    }
    oXa.b("disposable");
    throw null;
  }
  
  public static final class a
  {
    private final List<eoa.c> a;
    private final boolean b;
    
    public a(List<eoa.c> paramList, boolean paramBoolean)
    {
      this.a = paramList;
      this.b = paramBoolean;
    }
    
    public final boolean a()
    {
      return this.b;
    }
    
    public final List<eoa.c> b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a))
          {
            int i;
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label58;
            }
          }
        }
        return false;
      }
      label58:
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
      int j = this.b;
      int k = j;
      if (j != 0) {
        k = 1;
      }
      return i * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("PhotoBatch(photos=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", hasMore=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("GALLERY", 0);
      a = localb1;
      b localb2 = new b("FACEBOOK", 1);
      b = localb2;
      b localb3 = new b("DEMO", 2);
      c = localb3;
      d = new b[] { localb1, localb2, localb3 };
    }
    
    private b() {}
  }
  
  public static final class c
  {
    private final Rja a;
    private final eoa.b b;
    
    public c(Rja paramRja, eoa.b paramb)
    {
      this.a = paramRja;
      this.b = paramb;
    }
    
    public final Rja a()
    {
      return this.a;
    }
    
    public final eoa.b b()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof c))
        {
          paramObject = (c)paramObject;
          if ((oXa.a(this.a, ((c)paramObject).a)) && (oXa.a(this.b, ((c)paramObject).b))) {}
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
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((Enum)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RecentPhoto(imageDesc=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", source=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
  
  private static final class d
  {
    private final eoa.c a;
    private long b;
    private Boolean c;
    
    public d(eoa.c paramc, long paramLong, Boolean paramBoolean)
    {
      this.a = paramc;
      this.b = paramLong;
      this.c = paramBoolean;
    }
    
    public final long a()
    {
      return this.b;
    }
    
    public final void a(long paramLong)
    {
      this.b = paramLong;
    }
    
    public final void a(Boolean paramBoolean)
    {
      this.c = paramBoolean;
    }
    
    public final eoa.c b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof d))
        {
          paramObject = (d)paramObject;
          if (oXa.a(this.a, ((d)paramObject).a))
          {
            int i;
            if (this.b == ((d)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if ((i != 0) && (oXa.a(this.c, ((d)paramObject).c))) {
              break label73;
            }
          }
        }
        return false;
      }
      label73:
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((eoa.c)localObject).hashCode();
      } else {
        j = 0;
      }
      long l = this.b;
      int k = (int)(l ^ l >>> 32);
      localObject = this.c;
      if (localObject != null) {
        i = ((Boolean)localObject).hashCode();
      }
      return (j * 31 + k) * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("RecentPhotoInner(photo=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", lastUsedDate=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", faceDetected=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */