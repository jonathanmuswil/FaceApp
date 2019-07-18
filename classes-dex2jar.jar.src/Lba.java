import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

public class lba
{
  protected String a()
  {
    return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
  }
  
  protected String a(Context paramContext)
  {
    return new Aba().a(paramContext);
  }
  
  protected String b(Context paramContext)
  {
    Xaa localXaa = null;
    Object localObject1 = null;
    Context localContext = null;
    Object localObject2 = localXaa;
    try
    {
      Object localObject3 = paramContext.getPackageName();
      localObject2 = localXaa;
      localObject3 = paramContext.getPackageManager().getApplicationInfo((String)localObject3, 128).metaData;
      paramContext = (Context)localObject1;
      if (localObject3 == null) {
        return paramContext;
      }
      localObject2 = localXaa;
      paramContext = ((Bundle)localObject3).getString("io.fabric.ApiKey");
      try
      {
        if ("@string/twitter_consumer_secret".equals(paramContext)) {
          Naa.e().d("Fabric", "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
        } else {
          localContext = paramContext;
        }
        paramContext = localContext;
        if (localContext != null) {
          return paramContext;
        }
        localObject2 = localContext;
        Naa.e().d("Fabric", "Falling back to Crashlytics key lookup from Manifest");
        localObject2 = localContext;
        paramContext = ((Bundle)localObject3).getString("com.crashlytics.ApiKey");
      }
      catch (Exception localException1) {}
      localXaa = Naa.e();
    }
    catch (Exception localException2)
    {
      paramContext = (Context)localObject2;
    }
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Caught non-fatal exception while retrieving apiKey: ");
    ((StringBuilder)localObject2).append(localException2);
    localXaa.d("Fabric", ((StringBuilder)localObject2).toString());
    return paramContext;
  }
  
  protected String c(Context paramContext)
  {
    int i = oba.a(paramContext, "io.fabric.ApiKey", "string");
    int j = i;
    if (i == 0)
    {
      Naa.e().d("Fabric", "Falling back to Crashlytics key lookup from Strings");
      j = oba.a(paramContext, "com.crashlytics.ApiKey", "string");
    }
    if (j != 0) {
      paramContext = paramContext.getResources().getString(j);
    } else {
      paramContext = null;
    }
    return paramContext;
  }
  
  public String d(Context paramContext)
  {
    Object localObject1 = b(paramContext);
    Object localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      localObject2 = c(paramContext);
    }
    localObject1 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject1 = a(paramContext);
    }
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      e(paramContext);
    }
    return (String)localObject1;
  }
  
  protected void e(Context paramContext)
  {
    if ((!Naa.g()) && (!oba.j(paramContext)))
    {
      Naa.e().b("Fabric", a());
      return;
    }
    throw new IllegalArgumentException(a());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */