import io.faceapp.ui.misc.c.a;
import java.util.List;

public final class sFa$c$b
  extends sFa.c
{
  private final List<Eda> d;
  private final Eda e;
  private final KDa f;
  private final c.a g;
  
  public sFa$c$b(List<Eda> paramList, Eda paramEda, KDa paramKDa, c.a parama)
  {
    super(paramList, paramEda, paramKDa, null);
    this.d = paramList;
    this.e = paramEda;
    this.f = paramKDa;
    this.g = parama;
  }
  
  public final c.a d()
  {
    return this.g;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof b))
      {
        paramObject = (b)paramObject;
        if ((oXa.a(this.d, ((b)paramObject).d)) && (oXa.a(this.e, ((b)paramObject).e)) && (oXa.a(this.f, ((b)paramObject).f)) && (oXa.a(this.g, ((b)paramObject).g))) {}
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
    Object localObject = this.d;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = this.e;
    int k;
    if (localObject != null) {
      k = ((Eda)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.f;
    int m;
    if (localObject != null) {
      m = localObject.hashCode();
    } else {
      m = 0;
    }
    localObject = this.g;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return ((j * 31 + k) * 31 + m) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Error(p=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", sp=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", t=");
    localStringBuilder.append(this.f);
    localStringBuilder.append(", errorModel=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sFa$c$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */