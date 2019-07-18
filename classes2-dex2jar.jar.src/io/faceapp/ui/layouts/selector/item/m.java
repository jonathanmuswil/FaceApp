package io.faceapp.ui.layouts.selector.item;

import Eda;
import KDa;
import oXa;

public final class m
{
  private final Eda a;
  private final boolean b;
  private final KDa c;
  
  public m(Eda paramEda, boolean paramBoolean, KDa paramKDa)
  {
    this.a = paramEda;
    this.b = paramBoolean;
    this.c = paramKDa;
  }
  
  public final Eda a()
  {
    return this.a;
  }
  
  public final boolean b()
  {
    return this.b;
  }
  
  public final KDa c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof m))
      {
        paramObject = (m)paramObject;
        if (oXa.a(this.a, ((m)paramObject).a))
        {
          int i;
          if (this.b == ((m)paramObject).b) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((m)paramObject).c))) {
            break label72;
          }
        }
      }
      return false;
    }
    label72:
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((Eda)localObject).hashCode();
    } else {
      j = 0;
    }
    int k = this.b;
    int m = k;
    if (k != 0) {
      m = 1;
    }
    localObject = this.c;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return (j * 31 + m) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotoModel(photoOp=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", selected=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", target=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */