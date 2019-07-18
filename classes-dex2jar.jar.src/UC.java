import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;

public class uc
{
  private static final Bc a;
  private static final nd<String, Typeface> b = new nd(16);
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      a = new yc();
    } else if (i >= 26) {
      a = new xc();
    } else if ((i >= 24) && (wc.a())) {
      a = new wc();
    } else if (Build.VERSION.SDK_INT >= 21) {
      a = new vc();
    } else {
      a = new Bc();
    }
  }
  
  public static Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    paramContext = a.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (paramContext != null)
    {
      paramResources = b(paramResources, paramInt1, paramInt2);
      b.a(paramResources, paramContext);
    }
    return paramContext;
  }
  
  public static Typeface a(Context paramContext, CancellationSignal paramCancellationSignal, Vc.b[] paramArrayOfb, int paramInt)
  {
    return a.a(paramContext, paramCancellationSignal, paramArrayOfb, paramInt);
  }
  
  public static Typeface a(Context paramContext, lc.a parama, Resources paramResources, int paramInt1, int paramInt2, qc.a parama1, Handler paramHandler, boolean paramBoolean)
  {
    if ((parama instanceof lc.d))
    {
      parama = (lc.d)parama;
      boolean bool = false;
      if (paramBoolean ? parama.a() == 0 : parama1 == null) {
        bool = true;
      }
      int i;
      if (paramBoolean) {
        i = parama.c();
      } else {
        i = -1;
      }
      paramContext = Vc.a(paramContext, parama.b(), parama1, paramHandler, bool, i, paramInt2);
    }
    else
    {
      parama = a.a(paramContext, (lc.b)parama, paramResources, paramInt2);
      paramContext = parama;
      if (parama1 != null) {
        if (parama != null)
        {
          parama1.a(parama, paramHandler);
          paramContext = parama;
        }
        else
        {
          parama1.a(-3, paramHandler);
          paramContext = parama;
        }
      }
    }
    if (paramContext != null) {
      b.a(b(paramResources, paramInt1, paramInt2), paramContext);
    }
    return paramContext;
  }
  
  public static Typeface a(Resources paramResources, int paramInt1, int paramInt2)
  {
    return (Typeface)b.b(b(paramResources, paramInt1, paramInt2));
  }
  
  private static String b(Resources paramResources, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramResources.getResourcePackageName(paramInt1));
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("-");
    localStringBuilder.append(paramInt2);
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */