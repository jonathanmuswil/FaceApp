import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class mka$a
{
  public final mka a(int paramInt, iZ paramiZ)
  {
    oXa.b(paramiZ, "data");
    String str1 = paramiZ.p();
    oXa.a(str1, "data.title");
    String str2 = paramiZ.o();
    oXa.a(str2, "data.resetTitle");
    Object localObject = paramiZ.l();
    oXa.a(localObject, "data.filtersList");
    ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject, 10));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      gZ localgZ = (gZ)localIterator.next();
      localObject = lka.a;
      oXa.a(localgZ, "it");
      localArrayList.add(((lka.a)localObject).a(localgZ));
    }
    localObject = paramiZ.m();
    oXa.a(localObject, "data.iconUrl");
    paramiZ = paramiZ.n();
    oXa.a(paramiZ, "data.resetIconUrl");
    return new mka(String.valueOf(paramInt), str1, str2, localArrayList, (String)localObject, paramiZ);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */