import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class xka$a
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */