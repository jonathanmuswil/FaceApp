import android.net.Uri;

final class fea<T1, T2, R>
  implements wRa<Uri, dfa, Qda.b>
{
  fea(Yja paramYja) {}
  
  public final Qda.b a(Uri paramUri, dfa paramdfa)
  {
    oXa.b(paramUri, "imageUriForUpload");
    oXa.b(paramdfa, "photoInfo");
    Object localObject = Qda.a.a(paramUri, paramdfa, this.a.a()).b();
    oXa.a(localObject, "protoUploadRequest.toByteArray()");
    localObject = new xia((byte[])localObject);
    Yja localYja = this.a;
    oXa.a(localYja, "imageInfo");
    return new Qda.b(localYja, paramUri, paramdfa, (xia)localObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */