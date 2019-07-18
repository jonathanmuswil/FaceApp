import android.util.Log;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.SessionManager;
import com.google.firebase.perf.internal.a;
import com.google.firebase.perf.internal.e;
import com.google.firebase.perf.internal.f;
import com.google.firebase.perf.internal.h;
import com.google.firebase.perf.internal.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class vv
  extends f
  implements e
{
  private final List<x> a;
  private final GaugeManager b;
  private h c;
  private final jw.a d = jw.B();
  private boolean e;
  private boolean f;
  private final WeakReference<e> g = new WeakReference(this);
  
  private vv(h paramh)
  {
    this(paramh, a.a(), GaugeManager.zzbe());
  }
  
  private vv(h paramh, a parama, GaugeManager paramGaugeManager)
  {
    super(parama);
    this.c = paramh;
    this.b = paramGaugeManager;
    this.a = new ArrayList();
    zzao();
  }
  
  public static vv a(h paramh)
  {
    return new vv(paramh);
  }
  
  public final vv a(long paramLong)
  {
    this.d.a(paramLong);
    return this;
  }
  
  public final vv a(String paramString)
  {
    if (paramString != null)
    {
      paramString = Mv.a(paramString);
      this.d.a(Mv.a(paramString, 2000));
    }
    return this;
  }
  
  public final void a(x paramx)
  {
    if ((this.d.h()) && (!this.d.j())) {
      this.a.add(paramx);
    }
  }
  
  public final vv b(int paramInt)
  {
    this.d.a(paramInt);
    return this;
  }
  
  public final vv b(long paramLong)
  {
    x localx = SessionManager.zzcl().zzcm();
    SessionManager.zzcl().zzc(this.g);
    this.d.c(paramLong);
    this.a.add(localx);
    if (localx.o()) {
      this.b.zzbg();
    }
    return this;
  }
  
  public final vv b(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.toUpperCase();
      int i = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 2012838315: 
        if (paramString.equals("DELETE")) {
          i = 3;
        }
        break;
      case 1669334218: 
        if (paramString.equals("CONNECT")) {
          i = 8;
        }
        break;
      case 80083237: 
        if (paramString.equals("TRACE")) {
          i = 7;
        }
        break;
      case 75900968: 
        if (paramString.equals("PATCH")) {
          i = 5;
        }
        break;
      case 2461856: 
        if (paramString.equals("POST")) {
          i = 2;
        }
        break;
      case 2213344: 
        if (paramString.equals("HEAD")) {
          i = 4;
        }
        break;
      case 79599: 
        if (paramString.equals("PUT")) {
          i = 1;
        }
        break;
      case 70454: 
        if (paramString.equals("GET")) {
          i = 0;
        }
        break;
      case -531492226: 
        if (paramString.equals("OPTIONS")) {
          i = 6;
        }
        break;
      }
      switch (i)
      {
      default: 
        paramString = jw.c.a;
        break;
      case 8: 
        paramString = jw.c.j;
        break;
      case 7: 
        paramString = jw.c.i;
        break;
      case 6: 
        paramString = jw.c.h;
        break;
      case 5: 
        paramString = jw.c.g;
        break;
      case 4: 
        paramString = jw.c.f;
        break;
      case 3: 
        paramString = jw.c.e;
        break;
      case 2: 
        paramString = jw.c.d;
        break;
      case 1: 
        paramString = jw.c.c;
        break;
      case 0: 
        paramString = jw.c.b;
      }
      this.d.a(paramString);
    }
    return this;
  }
  
  public final vv c(long paramLong)
  {
    this.d.d(paramLong);
    return this;
  }
  
  public final vv c(String paramString)
  {
    if (paramString == null)
    {
      this.d.k();
      return this;
    }
    int i = paramString.length();
    int j = 0;
    int k;
    if (i > 128)
    {
      k = j;
    }
    else
    {
      for (i = 0; i < paramString.length(); i++)
      {
        int m = paramString.charAt(i);
        k = j;
        if (m <= 31) {
          break label83;
        }
        if (m > 127)
        {
          k = j;
          break label83;
        }
      }
      k = 1;
    }
    label83:
    if (k != 0)
    {
      this.d.b(paramString);
    }
    else
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "The content type of the response is not a valid content-type:".concat(paramString);
      } else {
        paramString = new String("The content type of the response is not a valid content-type:");
      }
      Log.i("FirebasePerformance", paramString);
    }
    return this;
  }
  
  public final vv d(long paramLong)
  {
    this.d.e(paramLong);
    return this;
  }
  
  public final vv e(long paramLong)
  {
    this.d.f(paramLong);
    if (SessionManager.zzcl().zzcm().o()) {
      this.b.zzbg();
    }
    return this;
  }
  
  public final vv f(long paramLong)
  {
    this.d.b(paramLong);
    return this;
  }
  
  public final boolean l()
  {
    return this.d.g();
  }
  
  public final long m()
  {
    return this.d.i();
  }
  
  public final vv n()
  {
    this.d.a(jw.d.b);
    return this;
  }
  
  public final jw o()
  {
    SessionManager.zzcl().zzd(this.g);
    zzap();
    Object localObject = x.a(this.a);
    if (localObject != null) {
      this.d.a(Arrays.asList((Object[])localObject));
    }
    jw localjw = (jw)this.d.O();
    if (!this.e)
    {
      localObject = this.c;
      if (localObject != null) {
        ((h)localObject).a(localjw, zzal());
      }
      this.e = true;
    }
    else if (this.f)
    {
      Log.i("FirebasePerformance", "This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
    }
    return localjw;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */