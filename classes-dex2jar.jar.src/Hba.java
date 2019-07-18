import android.content.Context;
import java.lang.reflect.Method;

class hba
  implements kba
{
  private final Context a;
  
  public hba(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  private String b()
  {
    try
    {
      String str = (String)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(c(), new Object[0]);
      return str;
    }
    catch (Exception localException)
    {
      Naa.e().a("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }
    return null;
  }
  
  private Object c()
  {
    try
    {
      Object localObject = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[] { Context.class }).invoke(null, new Object[] { this.a });
      return localObject;
    }
    catch (Exception localException)
    {
      Naa.e().a("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
    return null;
  }
  
  private boolean d()
  {
    try
    {
      boolean bool = ((Boolean)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(c(), new Object[0])).booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      Naa.e().a("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }
    return false;
  }
  
  public eba a()
  {
    if (a(this.a)) {
      return new eba(b(), d());
    }
    return null;
  }
  
  boolean a(Context paramContext)
  {
    boolean bool = false;
    try
    {
      int i = ((Integer)Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[] { Context.class }).invoke(null, new Object[] { paramContext })).intValue();
      if (i == 0) {
        bool = true;
      }
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */