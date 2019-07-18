import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.bumptech.glide.load.g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zj
{
  private static final ConcurrentMap<String, g> a = new ConcurrentHashMap();
  
  public static g a(Context paramContext)
  {
    String str = paramContext.getPackageName();
    g localg = (g)a.get(str);
    Object localObject = localg;
    if (localg == null)
    {
      localObject = c(paramContext);
      paramContext = (g)a.putIfAbsent(str, localObject);
      if (paramContext != null) {
        localObject = paramContext;
      }
    }
    return (g)localObject;
  }
  
  private static String a(PackageInfo paramPackageInfo)
  {
    if (paramPackageInfo != null) {
      paramPackageInfo = String.valueOf(paramPackageInfo.versionCode);
    } else {
      paramPackageInfo = UUID.randomUUID().toString();
    }
    return paramPackageInfo;
  }
  
  private static PackageInfo b(Context paramContext)
  {
    try
    {
      localObject = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      return (PackageInfo)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Cannot resolve info for");
      ((StringBuilder)localObject).append(paramContext.getPackageName());
      Log.e("AppVersionSignature", ((StringBuilder)localObject).toString(), localNameNotFoundException);
    }
    return null;
  }
  
  private static g c(Context paramContext)
  {
    return new Bj(a(b(paramContext)));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */