import io.faceapp.ui.misc.k;

public final class nza
  extends Bza<kka, String>
{
  private final kka a;
  private final boolean b;
  private final k c;
  
  public nza(kka paramkka, boolean paramBoolean, k paramk)
  {
    this.a = paramkka;
    this.b = paramBoolean;
    this.c = paramk;
  }
  
  public Iza<String> a(boolean paramBoolean)
  {
    return new nza(b(), paramBoolean, this.c);
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
  
  public kka b()
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
      if ((paramObject instanceof nza))
      {
        paramObject = (nza)paramObject;
        if (oXa.a(b(), ((nza)paramObject).b()))
        {
          int i;
          if (a() == ((nza)paramObject).a()) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((nza)paramObject).c))) {
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
      j = ((kka)localObject).hashCode();
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */