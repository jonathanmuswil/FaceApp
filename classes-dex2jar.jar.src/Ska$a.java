import android.graphics.PointF;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Ska$a
{
  public final Ska a(List<rZ.b> paramList)
  {
    oXa.b(paramList, "proto");
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(NXa.a(DWa.a(mWa.a(paramList, 10)), 16));
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject1 = (rZ.b)paramList.next();
      int i = ((rZ.b)localObject1).m();
      Object localObject2 = ((rZ.b)localObject1).k();
      oXa.a(localObject2, "it.coords");
      float f = ((mZ)localObject2).l();
      localObject2 = ((rZ.b)localObject1).k();
      oXa.a(localObject2, "it.coords");
      localObject2 = new PointF(f, ((mZ)localObject2).m());
      Uka.a locala = Uka.e;
      localObject1 = ((rZ.b)localObject1).l();
      oXa.a(localObject1, "it.group");
      localLinkedHashMap.put(Integer.valueOf(i), new WVa(localObject2, locala.a((rZ.b.b)localObject1)));
    }
    return new Ska(localLinkedHashMap);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ska$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */