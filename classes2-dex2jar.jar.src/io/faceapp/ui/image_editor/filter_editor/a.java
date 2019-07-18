package io.faceapp.ui.image_editor.filter_editor;

import Bza;
import Iza;
import io.faceapp.ui.misc.k;
import lka;
import oXa;

public final class a
  extends Bza<lka, String>
{
  private final lka a;
  private final boolean b;
  private final k c;
  
  public a(lka paramlka, boolean paramBoolean, k paramk)
  {
    this.a = paramlka;
    this.b = paramBoolean;
    this.c = paramk;
  }
  
  public Iza<String> a(boolean paramBoolean)
  {
    return new a(b(), paramBoolean, this.c);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean a(String paramString)
  {
    oXa.b(paramString, "selection");
    return oXa.a(paramString, b().m());
  }
  
  public lka b()
  {
    return this.a;
  }
  
  public final k c()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if (oXa.a(b(), ((a)paramObject).b()))
        {
          int i;
          if (a() == ((a)paramObject).a()) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((a)paramObject).c))) {
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
    Object localObject = b();
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((lka)localObject).hashCode();
    } else {
      j = 0;
    }
    int k = a();
    int m = k;
    if (k != 0) {
      m = 1;
    }
    localObject = this.c;
    if (localObject != null) {
      i = ((Enum)localObject).hashCode();
    }
    return (j * 31 + m) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CatalogItem(payload=");
    localStringBuilder.append(b());
    localStringBuilder.append(", selected=");
    localStringBuilder.append(a());
    localStringBuilder.append(", proStatus=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */