import android.graphics.Bitmap;
import io.faceapp.ui.misc.k;

public final class vAa
  extends Bza<Gka, String>
{
  private final Gka a;
  private final boolean b;
  private final Bitmap c;
  private final k d;
  
  public vAa(Gka paramGka, boolean paramBoolean, Bitmap paramBitmap, k paramk)
  {
    this.a = paramGka;
    this.b = paramBoolean;
    this.c = paramBitmap;
    this.d = paramk;
  }
  
  public Iza<String> a(boolean paramBoolean)
  {
    return new vAa(b(), paramBoolean, this.c, this.d);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean a(String paramString)
  {
    oXa.b(paramString, "selection");
    return oXa.a(paramString, b().b());
  }
  
  public Gka b()
  {
    return this.a;
  }
  
  public final k c()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof vAa))
      {
        paramObject = (vAa)paramObject;
        if (oXa.a(b(), ((vAa)paramObject).b()))
        {
          int i;
          if (a() == ((vAa)paramObject).a()) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((vAa)paramObject).c)) && (oXa.a(this.d, ((vAa)paramObject).d))) {
            break label86;
          }
        }
      }
      return false;
    }
    label86:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = b();
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Gka)localObject).hashCode();
    } else {
      j = 0;
    }
    int k = a();
    int n = k;
    if (k != 0) {
      n = 1;
    }
    localObject = this.c;
    int m;
    if (localObject != null) {
      m = localObject.hashCode();
    } else {
      m = 0;
    }
    localObject = this.d;
    if (localObject != null) {
      i = ((Enum)localObject).hashCode();
    }
    return ((j * 31 + n) * 31 + m) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CatalogItem(payload=");
    localStringBuilder.append(b());
    localStringBuilder.append(", selected=");
    localStringBuilder.append(a());
    localStringBuilder.append(", thumbnail=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", proStatus=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */