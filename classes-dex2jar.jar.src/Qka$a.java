import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Qka$a
{
  private final Map<String, Pka> a(List<jfa> paramList)
  {
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      jfa localjfa = (jfa)paramList.next();
      localArrayList.add(new WVa(localjfa.getId(), Pka.a.a(localjfa)));
    }
    return DWa.a(localArrayList);
  }
  
  private final Map<String, Mka> a(List<gfa> paramList, Map<String, Pka> paramMap)
  {
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (gfa)localIterator.next();
      localArrayList.add(new WVa(paramList.getId(), Mka.a.a(paramList, paramMap)));
    }
    return DWa.a(localArrayList);
  }
  
  public final Qka a(lfa paramlfa)
  {
    oXa.b(paramlfa, "data");
    Map localMap = a(paramlfa.getRelated_objects().getUsers());
    Object localObject = paramlfa.getResults();
    paramlfa = new ArrayList(mWa.a((Iterable)localObject, 10));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (gfa)localIterator.next();
      paramlfa.add(Mka.a.a((gfa)localObject, localMap));
    }
    return new Qka(paramlfa);
  }
  
  public final Qka a(vfa paramvfa)
  {
    oXa.b(paramvfa, "data");
    Map localMap = a(paramvfa.getRelated_objects().getUsers());
    localMap = a(paramvfa.getRelated_objects().getPolls(), localMap);
    Object localObject1 = paramvfa.getResults();
    paramvfa = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof sfa)) {
        paramvfa.add(localObject2);
      }
    }
    localObject1 = new ArrayList(mWa.a(paramvfa, 10));
    Object localObject2 = paramvfa.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      paramvfa = localMap.get(((sfa)((Iterator)localObject2).next()).getData().getPoll_id());
      if (paramvfa != null) {
        ((Collection)localObject1).add((Mka)paramvfa);
      } else {
        throw new IllegalArgumentException("Required value was null.");
      }
    }
    return new Qka((List)localObject1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Qka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */