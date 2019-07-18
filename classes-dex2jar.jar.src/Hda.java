import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.j;
import java.util.HashMap;
import java.util.Iterator;

public final class hda
{
  private static final HashMap<hda.a.a, f> a = new HashMap();
  private static kRa b;
  public static final hda c = new hda();
  
  private final f a(Context paramContext, hda.a.a parama, e parame, cXa<? super f, cWa> paramcXa)
  {
    paramContext = new f(paramContext);
    paramContext.setAdSize(parame);
    paramContext.setAdUnitId(parama.a());
    paramContext.setAdListener(new oda(parama, (String)mWa.g(zYa.a(parama.a(), new String[] { "/" }, false, 0, 6, null)), paramcXa, paramContext));
    paramContext.a(d().a());
    return paramContext;
  }
  
  private final void a(int paramInt)
  {
    String str;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3) {
            str = "unknown error";
          } else {
            str = "no fill";
          }
        }
        else {
          str = "network error";
        }
      }
      else {
        str = "invalid request";
      }
    }
    else {
      str = "internal error";
    }
    icb.a locala = icb.a("AdMob");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Error: ");
    localStringBuilder.append(str);
    locala.a(localStringBuilder.toString(), new Object[0]);
  }
  
  private final void a(WVa<Boolean, Boolean> paramWVa)
  {
    dpa.b.a(Math.max(1, paramWVa.hashCode()));
  }
  
  private final f b(Context paramContext)
  {
    int i = paramContext.getResources().getDimensionPixelSize(2131165552);
    e locale = new e(-1, (int)KOa.b.d(paramContext, i));
    return a(paramContext, hda.a.a.a.c, locale, nda.b);
  }
  
  private final d.a d()
  {
    return new d.a();
  }
  
  public final f a(Context paramContext, hda.a.a parama)
  {
    oXa.b(paramContext, "context");
    oXa.b(parama, "banner");
    f localf = (f)a.get(parama);
    if (localf != null)
    {
      oXa.a(localf, "it");
      return localf;
    }
    if (oXa.a(parama, hda.a.a.a.c)) {
      return b(paramContext);
    }
    throw new UVa();
  }
  
  public final void a()
  {
    Object localObject = b;
    if (localObject != null)
    {
      ((kRa)localObject).i();
      localObject = a.values();
      oXa.a(localObject, "bannerAdViews.values");
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((f)((Iterator)localObject).next()).a();
      }
      a.clear();
      return;
    }
    oXa.b("preloadDisposable");
    throw null;
  }
  
  public final void a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    j.a(paramContext.getApplicationContext(), "ca-app-pub-5085682576994925~7017155256");
    paramContext = zia.l.d().a(ida.a).h().c(jda.a).d(kda.a).a(lda.a).a(gRa.a()).a(new mda(paramContext));
    oXa.a(paramContext, "BillingRepository.observ…annerSaveImage(context) }");
    b = paramContext;
  }
  
  public final void b()
  {
    Object localObject = a.values();
    oXa.a(localObject, "bannerAdViews.values");
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((f)((Iterator)localObject).next()).b();
    }
  }
  
  public final void c()
  {
    Object localObject = a.values();
    oXa.a(localObject, "bannerAdViews.values");
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((f)((Iterator)localObject).next()).c();
    }
  }
  
  public static abstract class a
  {
    private final String a;
    
    private a(String paramString)
    {
      this.a = paramString;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public static abstract class a
      extends hda.a
    {
      private final String b;
      
      private a(String paramString)
      {
        super(null);
        this.b = paramString;
      }
      
      public static final class a
        extends hda.a.a
      {
        public static final a c = new a();
        
        private a()
        {
          super(null);
        }
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */