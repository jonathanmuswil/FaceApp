import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class rba
{
  private static rba a;
  private static Object b = new Object();
  private final SharedPreferences c;
  private volatile boolean d;
  private volatile boolean e;
  private final yba f;
  private boolean g;
  
  private rba(Context paramContext)
  {
    boolean bool1 = false;
    this.g = false;
    if (paramContext != null)
    {
      this.c = paramContext.getSharedPreferences("com.google.firebase.crashlytics.prefs", 0);
      this.f = zba.a(paramContext);
      if (this.c.contains("firebase_crashlytics_collection_enabled")) {
        bool2 = this.c.getBoolean("firebase_crashlytics_collection_enabled", true);
      }
      boolean bool3;
      for (;;)
      {
        bool3 = true;
        break label153;
        try
        {
          Object localObject = paramContext.getPackageManager();
          if (localObject != null)
          {
            localObject = ((PackageManager)localObject).getApplicationInfo(paramContext.getPackageName(), 128);
            if ((localObject != null) && (((ApplicationInfo)localObject).metaData != null) && (((ApplicationInfo)localObject).metaData.containsKey("firebase_crashlytics_collection_enabled"))) {
              bool2 = ((ApplicationInfo)localObject).metaData.getBoolean("firebase_crashlytics_collection_enabled");
            }
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          Naa.e().c("Fabric", "Unable to get PackageManager. Falling through", localNameNotFoundException);
          bool2 = true;
          bool3 = false;
        }
      }
      label153:
      this.e = bool2;
      this.d = bool3;
      boolean bool2 = bool1;
      if (oba.o(paramContext) != null) {
        bool2 = true;
      }
      this.g = bool2;
      return;
    }
    throw new RuntimeException("null context");
  }
  
  public static rba a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null)
      {
        rba localrba = new rba;
        localrba.<init>(paramContext);
        a = localrba;
      }
      paramContext = a;
      return paramContext;
    }
  }
  
  public boolean a()
  {
    if ((this.g) && (this.d)) {
      return this.e;
    }
    yba localyba = this.f;
    if (localyba != null) {
      return localyba.a();
    }
    return true;
  }
  
  public boolean b()
  {
    return this.e;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */