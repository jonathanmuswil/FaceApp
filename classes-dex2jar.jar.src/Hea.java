import android.net.Uri;
import java.io.File;

final class hea<T, R>
  implements DRa<T, aRa<? extends R>>
{
  hea(Qda paramQda) {}
  
  public final XQa<Yja> a(Uri paramUri)
  {
    oXa.b(paramUri, "imageUri");
    APa localAPa1 = WOa.a(WOa.e, new WOa.d(paramUri), false, 2, null);
    APa localAPa2 = Qda.a(this.a, localAPa1);
    Object localObject = icb.a("PhotoOpUploader");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("sourceImageInfo [imageSize]: ");
    localStringBuilder.append(localAPa1);
    localStringBuilder.append(" [supportedMaxSize]: ");
    localStringBuilder.append(localAPa2);
    ((icb.a)localObject).a(localStringBuilder.toString(), new Object[0]);
    if (oXa.a(localAPa1, localAPa2))
    {
      paramUri = XQa.a(new Yja(paramUri, localAPa1));
      oXa.a(paramUri, "Single.just(ImageInfo(imageUri, imageSize))");
    }
    else
    {
      localObject = _ra.h.f(String.valueOf(System.currentTimeMillis()));
      paramUri = WOa.e.a(paramUri, (File)localObject, localAPa2, "Upload-SourceImageInfo");
    }
    return paramUri;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */