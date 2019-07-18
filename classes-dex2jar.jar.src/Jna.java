import android.content.Context;
import com.facebook.b;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class jna
{
  public static final jna a = new jna();
  
  private final XQa<List<ika>> a(b paramb, String paramString)
  {
    paramb = XQa.a(new lna(paramb, paramString)).d(ona.a);
    oXa.a(paramb, "Single\n                .…oList()\n                }");
    paramb = RPa.a(paramb, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramb, "Single\n                .…scribeOn(Schedulers.io())");
    return paramb;
  }
  
  private final XQa<String> b(b paramb)
  {
    paramb = XQa.a(new qna(paramb));
    oXa.a(paramb, "Single\n                .…dWait()\n                }");
    paramb = RPa.a(paramb, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramb, "Single\n                .…scribeOn(Schedulers.io())");
    return paramb;
  }
  
  private final void b(Context paramContext)
  {
    if (paramContext == null) {
      paramContext = FaceApplication.d.a();
    }
    if (_oa.a.a(paramContext)) {
      _oa.a.a();
    }
  }
  
  private final XQa<List<ika>> c(b paramb)
  {
    paramb = d(paramb).a(new rna(paramb));
    oXa.a(paramb, "facebookAvatarsAlbum(acc…ges(accessToken, it.id) }");
    paramb = RPa.a(paramb, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramb, "facebookAvatarsAlbum(acc…scribeOn(Schedulers.io())");
    return paramb;
  }
  
  private final XQa<Yea> d(b paramb)
  {
    paramb = e(paramb).a(sna.a);
    oXa.a(paramb, "facebookPhotoAlbums(acce… avatars\"))\n            }");
    paramb = RPa.a(paramb, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramb, "facebookPhotoAlbums(acce…scribeOn(Schedulers.io())");
    return paramb;
  }
  
  private final XQa<List<Yea>> e(b paramb)
  {
    paramb = XQa.a(new una(paramb));
    oXa.a(paramb, "Single\n                .…dWait()\n                }");
    paramb = RPa.a(paramb, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramb, "Single\n                .…scribeOn(Schedulers.io())");
    return paramb;
  }
  
  public final XQa<jna.a> a(b paramb)
  {
    oXa.b(paramb, "accessToken");
    paramb = yPa.a.a(c(paramb), b(paramb), wna.a).c(xna.a).a(yna.a);
    oXa.a(paramb, "RxUtils.zipSingleError(\n…server request failed\") }");
    paramb = RPa.a(paramb, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramb, "RxUtils.zipSingleError(\n…scribeOn(Schedulers.io())");
    return paramb;
  }
  
  public final jna.a a()
  {
    Object localObject1 = Uma.qa.o().get();
    oXa.a(localObject1, "AppPreferences.facebookPhotos.get()");
    localObject1 = (List)localObject1;
    Object localObject2 = Uma.qa.n().get();
    oXa.a(localObject2, "AppPreferences.facebookAvatarKey.get()");
    localObject2 = (String)localObject2;
    int i;
    if (((CharSequence)localObject2).length() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject1 = null;
    } else {
      localObject1 = new jna.a((List)localObject1, (String)localObject2);
    }
    return (jna.a)localObject1;
  }
  
  public final void a(Context paramContext)
  {
    b localb = b.n();
    if ((localb == null) || (RPa.a(a.a(localb)).a(zna.a, Ana.a) == null))
    {
      b(paramContext);
      icb.a("FacebookRepo").a("Can't reload Facebook avatars: not logged to Facebook", new Object[0]);
      paramContext = cWa.a;
    }
  }
  
  public final void b()
  {
    Uma.qa.o().c();
    Uma.qa.n().c();
  }
  
  public final QQa<jna.a> c()
  {
    QQa localQQa = QQa.a(Uma.qa.o().b(), Uma.qa.n().b(), vna.a).a(20L, TimeUnit.MILLISECONDS);
    oXa.a(localQQa, "Observable.combineLatest…0, TimeUnit.MILLISECONDS)");
    localQQa = RPa.a(localQQa, new Rfa.f[0]).b(EVa.b());
    oXa.a(localQQa, "Observable.combineLatest…scribeOn(Schedulers.io())");
    return localQQa;
  }
  
  public static final class a
  {
    private final List<ika> a;
    private final String b;
    
    public a(List<ika> paramList, String paramString)
    {
      this.a = paramList;
      this.b = paramString;
    }
    
    public final String a()
    {
      return this.b;
    }
    
    public final List<ika> b()
    {
      return this.a;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
        }
        else
        {
          return false;
        }
      }
      return true;
    }
    
    public int hashCode()
    {
      Object localObject = this.a;
      int i = 0;
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      localObject = this.b;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FacebookAvatarsInfo(images=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", curAvatarKey=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */