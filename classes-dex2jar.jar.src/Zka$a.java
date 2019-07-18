import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Zka$a
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
  
  private final Map<String, Oka> a(List<ifa> paramList, Map<String, Pka> paramMap)
  {
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (ifa)localIterator.next();
      localArrayList.add(new WVa(paramList.getId(), Oka.a.a(paramList, paramMap)));
    }
    return DWa.a(localArrayList);
  }
  
  public final Zka a(Pfa paramPfa)
  {
    oXa.b(paramPfa, "data");
    Object localObject = a(paramPfa.getRelated_objects().getUsers());
    Map localMap = a(paramPfa.getRelated_objects().getPolls(), (Map)localObject);
    int i = paramPfa.getCount();
    int j = paramPfa.getTotal_unread_count();
    paramPfa = paramPfa.getResults();
    ArrayList localArrayList = new ArrayList(mWa.a(paramPfa, 10));
    Iterator localIterator = paramPfa.iterator();
    while (localIterator.hasNext())
    {
      paramPfa = (Ofa)localIterator.next();
      if ((paramPfa instanceof Ifa))
      {
        paramPfa = Wka.a.a((Ifa)paramPfa, (Map)localObject, localMap);
      }
      else if ((paramPfa instanceof Gfa))
      {
        paramPfa = Vka.a.a((Gfa)paramPfa, localMap);
      }
      else
      {
        if (!(paramPfa instanceof Kfa)) {
          break label168;
        }
        paramPfa = Xka.a.a((Kfa)paramPfa, localMap);
      }
      localArrayList.add(paramPfa);
      continue;
      label168:
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append('[');
      ((StringBuilder)localObject).append(paramPfa.getClass().getSimpleName());
      ((StringBuilder)localObject).append("] update type not supported yet");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    return new Zka(i, j, localArrayList);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Zka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */