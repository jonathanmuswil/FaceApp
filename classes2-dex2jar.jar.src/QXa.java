import io.faceapp.ui.misc.k;
import java.util.Set;

public final class qxa
  extends Bza<mka, Set<? extends String>>
{
  private final mka a;
  private final boolean b;
  private final k c;
  
  public qxa(mka parammka, boolean paramBoolean, k paramk)
  {
    this.a = parammka;
    this.b = paramBoolean;
    this.c = paramk;
  }
  
  public Iza<Set<String>> a(boolean paramBoolean)
  {
    return new qxa(b(), paramBoolean, this.c);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean a(Set<String> paramSet)
  {
    oXa.b(paramSet, "selection");
    return paramSet.contains(b().c());
  }
  
  public mka b()
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
      if ((paramObject instanceof qxa))
      {
        paramObject = (qxa)paramObject;
        if (oXa.a(b(), ((qxa)paramObject).b()))
        {
          int i;
          if (a() == ((qxa)paramObject).a()) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.c, ((qxa)paramObject).c))) {
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
      j = ((mka)localObject).hashCode();
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
    localStringBuilder.append("FolderItem(payload=");
    localStringBuilder.append(b());
    localStringBuilder.append(", selected=");
    localStringBuilder.append(a());
    localStringBuilder.append(", proStatus=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */