package io.faceapp.ui.fun.item;

import Eka;
import oXa;

public final class a
{
  private final Eka a;
  private final boolean b;
  
  public a(Eka paramEka, boolean paramBoolean)
  {
    this.a = paramEka;
    this.b = paramBoolean;
  }
  
  public final Eka a()
  {
    return this.a;
  }
  
  public final a a(Eka paramEka, boolean paramBoolean)
  {
    oXa.b(paramEka, "filter");
    return new a(paramEka, paramBoolean);
  }
  
  public final boolean b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(this.a, ((a)paramObject).a))
        {
          int i;
          if (this.b == ((a)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label58;
          }
        }
      }
      return false;
    }
    label58:
    return true;
  }
  
  public int hashCode()
  {
    Eka localEka = this.a;
    int i;
    if (localEka != null) {
      i = localEka.hashCode();
    } else {
      i = 0;
    }
    int j = this.b;
    int k = j;
    if (j != 0) {
      k = 1;
    }
    return i * 31 + k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FilterItem(filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", isSelected=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/fun/item/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */