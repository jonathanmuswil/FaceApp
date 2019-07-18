package io.faceapp.ui.layouts.selector.item;

import Ika;
import io.faceapp.ui.misc.k;
import oXa;

public final class e
{
  private final Ika a;
  private final k b;
  
  public e(Ika paramIka, k paramk)
  {
    this.a = paramIka;
    this.b = paramk;
  }
  
  public final Ika a()
  {
    return this.a;
  }
  
  public final k b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        if ((oXa.a(this.a, ((e)paramObject).a)) && (oXa.a(this.b, ((e)paramObject).b))) {}
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
      j = ((Ika)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = ((Enum)localObject).hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FilterModel(filter=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", proStatus=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */