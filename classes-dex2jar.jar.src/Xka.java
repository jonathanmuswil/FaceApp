import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class xka
{
  public static final xka.a a = new xka.a(null);
  private final List<PointF> b;
  private final List<taa> c;
  
  public xka(List<? extends PointF> paramList, List<taa> paramList1)
  {
    this.b = paramList;
    this.c = paramList1;
  }
  
  public final List<PointF> a()
  {
    return this.b;
  }
  
  public final List<taa> b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof xka))
      {
        paramObject = (xka)paramObject;
        if ((oXa.a(this.b, ((xka)paramObject).b)) && (oXa.a(this.c, ((xka)paramObject).c))) {}
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
    List localList = this.b;
    int i = 0;
    int j;
    if (localList != null) {
      j = localList.hashCode();
    } else {
      j = 0;
    }
    localList = this.c;
    if (localList != null) {
      i = localList.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FacePoints(points=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", triangles=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final xka a(xZ paramxZ)
    {
      oXa.b(paramxZ, "proto");
      Object localObject = paramxZ.k();
      oXa.a(localObject, "proto.pointsList");
      ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject, 10));
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (mZ)localIterator.next();
        oXa.a(localObject, "it");
        localArrayList.add(new PointF(((mZ)localObject).l(), ((mZ)localObject).m()));
      }
      paramxZ = paramxZ.l();
      oXa.a(paramxZ, "proto.trianglesList");
      return new xka(localArrayList, paramxZ);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */