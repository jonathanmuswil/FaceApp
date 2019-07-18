import android.net.Uri;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;

public final class Qda$a
{
  public final vaa a(Uri paramUri, dfa paramdfa, APa paramAPa)
  {
    oXa.b(paramUri, "imageUri");
    oXa.b(paramdfa, "photoInfo");
    oXa.b(paramAPa, "imageSize");
    Object localObject1 = Uma.qa.ha().get();
    Object localObject2 = (String)localObject1;
    oXa.a(localObject2, "it");
    int i;
    if (((CharSequence)localObject2).length() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      localObject1 = null;
    }
    localObject1 = (String)localObject1;
    localObject2 = WOa.e.a(FaceApplication.d.a(), paramUri);
    paramUri = vaa.m();
    paramUri.a(_T.a.a((byte[])localObject2));
    if (localObject1 != null) {
      paramUri.a((String)localObject1);
    }
    paramUri.a(paramdfa.toProtoPhotoInfo(paramAPa));
    paramUri = paramUri.build();
    oXa.a(paramUri, "Proto.UploadRequest.newB…                 .build()");
    return (vaa)paramUri;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Qda$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */