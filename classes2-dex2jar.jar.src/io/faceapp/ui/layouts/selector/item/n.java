package io.faceapp.ui.layouts.selector.item;

import oXa;
import zka;

public final class n
{
  private final zka a;
  private final boolean b;
  private final boolean c;
  
  public n(zka paramzka, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramzka;
    this.b = paramBoolean1;
    this.c = paramBoolean2;
  }
  
  public final boolean a()
  {
    return this.c;
  }
  
  public final zka b()
  {
    return this.a;
  }
  
  public final boolean c()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof n))
      {
        paramObject = (n)paramObject;
        if (oXa.a(this.a, ((n)paramObject).a))
        {
          int i;
          if (this.b == ((n)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            if (this.c == ((n)paramObject).c) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label80;
            }
          }
        }
      }
      return false;
    }
    label80:
    return true;
  }
  
  public int hashCode()
  {
    zka localzka = this.a;
    int i;
    if (localzka != null) {
      i = localzka.hashCode();
    } else {
      i = 0;
    }
    int j = this.b;
    int k = j;
    int m;
    if (j != 0) {
      m = 1;
    }
    int n = this.c;
    j = n;
    if (n != 0) {
      j = 1;
    }
    return (i * 31 + m) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SectionModel(section=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", isPro=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", demoMode=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */