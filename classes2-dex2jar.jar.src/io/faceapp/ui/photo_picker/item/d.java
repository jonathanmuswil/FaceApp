package io.faceapp.ui.photo_picker.item;

import android.net.Uri;
import oXa;

public final class d
{
  public static final a a = new a(null);
  private final b b;
  private final int c;
  private final int d;
  private final int e;
  private final Integer f;
  private final Uri g;
  private final String h;
  
  public d(b paramb, int paramInt1, int paramInt2, int paramInt3, Integer paramInteger, Uri paramUri, String paramString)
  {
    this.b = paramb;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInteger;
    this.g = paramUri;
    this.h = paramString;
  }
  
  public final String a()
  {
    return this.h;
  }
  
  public final Uri b()
  {
    return this.g;
  }
  
  public final int c()
  {
    return this.d;
  }
  
  public final int d()
  {
    return this.e;
  }
  
  public final Integer e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof d))
      {
        paramObject = (d)paramObject;
        if (oXa.a(this.b, ((d)paramObject).b))
        {
          int i;
          if (this.c == ((d)paramObject).c) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.d == ((d)paramObject).d) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.e == ((d)paramObject).e) {
                i = 1;
              } else {
                i = 0;
              }
              if ((i != 0) && (oXa.a(this.f, ((d)paramObject).f)) && (oXa.a(this.g, ((d)paramObject).g)) && (oXa.a(this.h, ((d)paramObject).h))) {
                break label144;
              }
            }
          }
        }
      }
      return false;
    }
    label144:
    return true;
  }
  
  public final int f()
  {
    return this.c;
  }
  
  public final b g()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    Object localObject = this.b;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Enum)localObject).hashCode();
    } else {
      j = 0;
    }
    int k = this.c;
    int m = this.d;
    int n = this.e;
    localObject = this.f;
    int i1;
    if (localObject != null) {
      i1 = ((Integer)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.g;
    int i2;
    if (localObject != null) {
      i2 = ((Uri)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = this.h;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return (((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotosCollection(type=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", titleRes=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", placeholderBgRes=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", placeholderIconRes=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", smallIconRes=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", imageUri=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", extraInfo=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final d a(Uri paramUri)
    {
      return new d(d.b.b, 2131689817, 2131230826, 2131230970, Integer.valueOf(2131230971), paramUri, null, 64, null);
    }
    
    public final d a(String paramString1, String paramString2)
    {
      d.b localb = d.b.c;
      if (paramString1 != null) {
        paramString1 = Uri.parse(paramString1);
      } else {
        paramString1 = null;
      }
      return new d(localb, 2131689634, 2131230827, 2131230972, Integer.valueOf(2131230973), paramString1, paramString2);
    }
    
    public final d b(Uri paramUri)
    {
      return new d(d.b.a, 2131689818, 2131230828, 2131230974, null, paramUri, null, 64, null);
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("LIBRARY", 0);
      a = localb1;
      b localb2 = new b("CELEBS", 1);
      b = localb2;
      b localb3 = new b("FACEBOOK", 2);
      c = localb3;
      b localb4 = new b("VK", 3);
      d = localb4;
      e = new b[] { localb1, localb2, localb3, localb4 };
    }
    
    private b() {}
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */