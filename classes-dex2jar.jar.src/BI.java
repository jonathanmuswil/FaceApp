import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import java.util.List;

public class bi
  implements k<Uri, Drawable>
{
  private final Context a;
  
  public bi(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
  }
  
  private int a(Context paramContext, Uri paramUri)
  {
    Object localObject = paramUri.getPathSegments();
    String str1 = paramUri.getAuthority();
    String str2 = (String)((List)localObject).get(0);
    localObject = (String)((List)localObject).get(1);
    int i = paramContext.getResources().getIdentifier((String)localObject, str2, str1);
    int j = i;
    if (i == 0) {
      j = Resources.getSystem().getIdentifier((String)localObject, str2, "android");
    }
    if (j != 0) {
      return j;
    }
    paramContext = new StringBuilder();
    paramContext.append("Failed to find resource id for: ");
    paramContext.append(paramUri);
    throw new IllegalArgumentException(paramContext.toString());
  }
  
  private int a(Uri paramUri)
  {
    List localList = paramUri.getPathSegments();
    try
    {
      int i = Integer.parseInt((String)localList.get(0));
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unrecognized Uri format: ");
      localStringBuilder.append(paramUri);
      throw new IllegalArgumentException(localStringBuilder.toString(), localNumberFormatException);
    }
  }
  
  private Context a(Uri paramUri, String paramString)
  {
    if (paramString.equals(this.a.getPackageName())) {
      return this.a;
    }
    try
    {
      Context localContext = this.a.createPackageContext(paramString, 0);
      return localContext;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      if (paramString.contains(this.a.getPackageName())) {
        return this.a;
      }
      paramString = new StringBuilder();
      paramString.append("Failed to obtain context or unrecognized Uri format for: ");
      paramString.append(paramUri);
      throw new IllegalArgumentException(paramString.toString(), localNameNotFoundException);
    }
  }
  
  private int b(Context paramContext, Uri paramUri)
  {
    List localList = paramUri.getPathSegments();
    if (localList.size() == 2) {
      return a(paramContext, paramUri);
    }
    if (localList.size() == 1) {
      return a(paramUri);
    }
    paramContext = new StringBuilder();
    paramContext.append("Unrecognized Uri format: ");
    paramContext.append(paramUri);
    throw new IllegalArgumentException(paramContext.toString());
  }
  
  public Wf<Drawable> a(Uri paramUri, int paramInt1, int paramInt2, j paramj)
  {
    paramj = a(paramUri, paramUri.getAuthority());
    paramInt1 = b(paramj, paramUri);
    return ai.a(Yh.a(this.a, paramj, paramInt1));
  }
  
  public boolean a(Uri paramUri, j paramj)
  {
    return paramUri.getScheme().equals("android.resource");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */