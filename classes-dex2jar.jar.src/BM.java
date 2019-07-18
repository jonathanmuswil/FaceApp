import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

class bm
  implements xm
{
  private final Context a;
  private final String b;
  
  public bm(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
  }
  
  public String a()
  {
    Object localObject1 = this.a.getPackageManager();
    localObject3 = null;
    try
    {
      Bundle localBundle = ((PackageManager)localObject1).getApplicationInfo(this.b, 128).metaData;
      localObject1 = localObject3;
      if (localBundle != null) {
        localObject1 = localBundle.getString("io.fabric.unity.crashlytics.version");
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
    return (String)localObject1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */