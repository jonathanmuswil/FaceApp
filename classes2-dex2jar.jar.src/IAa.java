import android.graphics.Bitmap;
import io.faceapp.ui.misc.k;

public final class iAa
  extends Bza<tka, String>
{
  private final tka a;
  private final boolean b;
  private final Bitmap c;
  private final k d;
  
  public iAa(tka paramtka, boolean paramBoolean, Bitmap paramBitmap, k paramk)
  {
    this.a = paramtka;
    this.b = paramBoolean;
    this.c = paramBitmap;
    this.d = paramk;
  }
  
  public Iza<String> a(boolean paramBoolean)
  {
    return new iAa(b(), paramBoolean, this.c, this.d);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean a(String paramString)
  {
    oXa.b(paramString, "selection");
    return oXa.a(paramString, b().a());
  }
  
  public tka b()
  {
    return this.a;
  }
  
  public final k c()
  {
    return this.d;
  }
  
  public final Bitmap d()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof iAa))
      {
        paramObject = (iAa)paramObject;
        if (oXa.a(b(), ((iAa)paramObject).b()))
        {
          int i;
          if (a() == ((iAa)paramObject).a()) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((iAa)paramObject).c)) && (oXa.a(this.d, ((iAa)paramObject).d))) {
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
      j = ((tka)localObject).hashCode();
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
    localStringBuilder.append("EffectItem(payload=");
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */