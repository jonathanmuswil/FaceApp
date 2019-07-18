import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.content.FileProvider;
import java.io.File;

public final class nsa
{
  private static final jRa a = new jRa();
  public static final nsa b = new nsa();
  
  private final Intent a(Context paramContext, File paramFile, String paramString)
  {
    Intent localIntent = new Intent();
    try
    {
      paramContext = FileProvider.a(paramContext, "io.faceapp.fileprovider", paramFile);
      oXa.a(paramContext, "FileProvider.getUriForFi…fileprovider\", imageFile)");
    }
    catch (Exception paramContext)
    {
      paramContext = Uri.fromFile(paramFile);
      oXa.a(paramContext, "Uri.fromFile(imageFile)");
    }
    localIntent.setAction("android.intent.action.SEND");
    localIntent.setType("image/*");
    localIntent.putExtra("android.intent.extra.STREAM", paramContext);
    localIntent.addFlags(1);
    if (paramString != null) {
      localIntent.setPackage(paramString);
    }
    return localIntent;
  }
  
  private final Intent a(Context paramContext, nsa.b paramb)
  {
    asa.d.e("other", paramb.l());
    paramContext = a(this, paramContext, paramb.m(), null, 4, null);
    paramContext.putExtra("android.intent.extra.TEXT", "#FaceApp");
    return paramContext;
  }
  
  private final Intent a(Context paramContext, nsa.b paramb, String paramString)
  {
    asa.d.e("facebook", paramb.l());
    return a(paramContext, paramb.m(), paramString);
  }
  
  private final Intent a(Context paramContext, nsa.b paramb, nsa.a parama)
  {
    int i = psa.b[parama.ordinal()];
    boolean bool = true;
    Object localObject = null;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4)
          {
            paramb = a(paramContext, paramb);
            break label126;
          }
          throw new UVa();
        }
        parama = parama.a();
        if (parama != null)
        {
          paramb = b.c(paramContext, paramb, parama);
          break label126;
        }
      }
      else
      {
        parama = parama.a();
        if (parama != null)
        {
          paramb = b.a(paramContext, paramb, parama);
          break label126;
        }
      }
    }
    else
    {
      parama = parama.a();
      if (parama != null)
      {
        paramb = b.b(paramContext, paramb, parama);
        break label126;
      }
    }
    paramb = null;
    label126:
    parama = (nsa.a)localObject;
    if (paramb != null)
    {
      if (paramb.getPackage() != null) {
        bool = true ^ b.a(paramContext, paramb);
      }
      if (bool) {
        parama = Intent.createChooser(paramb, paramContext.getText(2131689901));
      } else {
        parama = paramb;
      }
    }
    return parama;
  }
  
  private final void a(Context paramContext, int paramInt1, int paramInt2)
  {
    new AlertDialog.Builder(paramContext).setTitle(paramInt1).setMessage(paramInt2).create().show();
  }
  
  private final boolean a(Context paramContext, Intent paramIntent)
  {
    boolean bool;
    if (paramIntent.resolveActivity(paramContext.getPackageManager()) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private final boolean a(Context paramContext, String paramString)
  {
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 0);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private final Intent b(Context paramContext, nsa.b paramb, String paramString)
  {
    asa.d.e("instagram", paramb.l());
    return a(paramContext, paramb.m(), paramString);
  }
  
  private final Intent c(Context paramContext, nsa.b paramb, String paramString)
  {
    asa.d.e("twitter", paramb.l());
    paramContext = a(paramContext, paramb.m(), paramString);
    paramContext.putExtra("android.intent.extra.TEXT", "#FaceApp");
    return paramContext;
  }
  
  public final XQa<WVa<nsa.a, nsa.c>> a(Context paramContext, nsa.a parama, nsa.b paramb, boolean paramBoolean)
  {
    oXa.b(paramContext, "context");
    oXa.b(parama, "shareType");
    oXa.b(paramb, "image");
    paramContext = XQa.a(new tsa(paramBoolean, paramb, parama, paramContext));
    oXa.a(paramContext, "Single.create { subscrib…)\n            }\n        }");
    return paramContext;
  }
  
  public final XQa<WVa<nsa.a, nsa.c>> a(Context paramContext, nsa.a parama, boolean paramBoolean, XQa<nsa.b> paramXQa)
  {
    oXa.b(paramContext, "context");
    oXa.b(parama, "shareType");
    oXa.b(paramXQa, "imageObs");
    if (!a(paramContext, parama))
    {
      paramContext = XQa.a(new WVa(parama, nsa.c.a));
      oXa.a(paramContext, "Single.just(Pair(shareType, APP_NOT_INSTALLED))");
    }
    else
    {
      paramContext = paramXQa.a(new ssa(paramContext, parama, paramBoolean));
      oXa.a(paramContext, "imageObs.flatMap {\n     …markNeeded)\n            }");
    }
    return paramContext;
  }
  
  public final void a(zPa paramzPa)
  {
    oXa.b(paramzPa, "info");
    Wja localWja = paramzPa.b().h();
    if (localWja != null)
    {
      paramzPa = paramzPa.a();
      a.b(new hha(new efa(localWja.e(), localWja.f(), paramzPa)).f().a(new qsa(localWja, paramzPa), new rsa(localWja, paramzPa)));
    }
  }
  
  public final boolean a(Context paramContext, nsa.a parama)
  {
    oXa.b(paramContext, "context");
    oXa.b(parama, "shareType");
    parama = parama.a();
    boolean bool;
    if (parama != null) {
      bool = b.a(paramContext, parama);
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void b(Context paramContext, nsa.a parama)
  {
    oXa.b(paramContext, "context");
    oXa.b(parama, "shareType");
    int i = psa.a[parama.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {}
        }
        else {
          a(paramContext, 2131689881, 2131689880);
        }
      }
      else {
        a(paramContext, 2131689877, 2131689876);
      }
    }
    else {
      a(paramContext, 2131689879, 2131689878);
    }
  }
  
  public static enum a
  {
    public static final nsa.a.a f = new nsa.a.a(null);
    private final int g;
    private final String h;
    
    static
    {
      a locala1 = new a("INSTAGRAM", 0, 0, "com.instagram.android");
      a = locala1;
      a locala2 = new a("FACEBOOK", 1, 1, "com.facebook.katana");
      b = locala2;
      a locala3 = new a("TWITTER", 2, 2, "com.twitter.android");
      c = locala3;
      a locala4 = new a("COMMON", 3, 3, null);
      d = locala4;
      e = new a[] { locala1, locala2, locala3, locala4 };
    }
    
    private a(int paramInt, String paramString)
    {
      this.g = paramInt;
      this.h = paramString;
    }
    
    public final String a()
    {
      return this.h;
    }
    
    public static final class a {}
  }
  
  public static final class b
    implements Parcelable
  {
    public static final Parcelable.Creator<b> CREATOR = new osa();
    public static final nsa.b.a a = new nsa.b.a(null);
    private final File b;
    private final String c;
    
    public b(Parcel paramParcel)
    {
      this(localFile, paramParcel);
    }
    
    public b(File paramFile, String paramString)
    {
      this.b = paramFile;
      this.c = paramString;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject) {
        if ((paramObject instanceof b))
        {
          paramObject = (b)paramObject;
          if ((oXa.a(this.b, ((b)paramObject).b)) && (oXa.a(this.c, ((b)paramObject).c))) {}
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
      Object localObject = this.b;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((File)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.c;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      return j * 31 + i;
    }
    
    public final String l()
    {
      return this.c;
    }
    
    public final File m()
    {
      return this.b;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SharedImage(file=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", analyticsTag=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      oXa.b(paramParcel, "dest");
      paramParcel.writeString(this.b.getAbsolutePath());
      paramParcel.writeString(this.c);
    }
    
    public static final class a {}
  }
  
  public static enum c
  {
    static
    {
      c localc1 = new c("APP_NOT_INSTALLED", 0);
      a = localc1;
      c localc2 = new c("STARTED", 1);
      b = localc2;
      c localc3 = new c("ERROR_ADDING_WATERMARK", 2);
      c = localc3;
      c localc4 = new c("ERROR_PREPARING_INTENT", 3);
      d = localc4;
      e = new c[] { localc1, localc2, localc3, localc4 };
    }
    
    private c() {}
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */