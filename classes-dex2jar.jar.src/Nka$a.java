import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Nka$a
{
  public final Nka a(hfa paramhfa, List<jfa> paramList)
  {
    oXa.b(paramhfa, "data");
    oXa.b(paramList, "users");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      jfa localjfa = (jfa)paramList.next();
      localArrayList.add(new WVa(localjfa.getId(), Pka.a.a(localjfa)));
    }
    return a(this, paramhfa, DWa.a(localArrayList), null, 4, null);
  }
  
  public final Nka a(hfa paramhfa, Map<String, Pka> paramMap, List<Rka> paramList)
  {
    oXa.b(paramhfa, "data");
    oXa.b(paramMap, "userMap");
    String str1 = paramhfa.getId();
    Object localObject1 = paramMap.get(paramhfa.getUser_id());
    if (localObject1 != null)
    {
      Pka localPka = (Pka)localObject1;
      String str2 = paramhfa.getUrl();
      boolean bool = paramhfa.getPublic();
      String str3 = paramhfa.getImage();
      localObject1 = new WVa(Integer.valueOf(paramhfa.getImage_width()), Integer.valueOf(paramhfa.getImage_height()));
      Date localDate = paramhfa.getCreated();
      if (paramList == null)
      {
        localObject2 = paramhfa.getVotes();
        paramList = new ArrayList(mWa.a((Iterable)localObject2, 10));
        localObject3 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (rfa)((Iterator)localObject3).next();
          paramList.add(Rka.a.a((rfa)localObject2, paramMap));
        }
      }
      Object localObject3 = paramhfa.getVotes_counts();
      Object localObject4 = NXa.d(0, 4);
      Object localObject2 = new ArrayList(mWa.a((Iterable)localObject4, 10));
      Iterator localIterator = ((Iterable)localObject4).iterator();
      while (localIterator.hasNext())
      {
        localObject4 = (Integer)((Map)localObject3).get(String.valueOf(((CWa)localIterator).nextInt()));
        if (localObject4 != null) {
          i = ((Integer)localObject4).intValue();
        } else {
          i = 0;
        }
        ((Collection)localObject2).add(Integer.valueOf(i));
      }
      int i = paramhfa.getVotes_total();
      localObject3 = paramhfa.getMy_vote();
      if (localObject3 != null) {
        paramMap = Rka.a.a((rfa)localObject3, paramMap);
      } else {
        paramMap = null;
      }
      return new Nka(str1, localPka, str2, bool, str3, (WVa)localObject1, localDate, paramList, (List)localObject2, i, paramMap, paramhfa.is_bookmarked(), paramhfa.getSuggested_comments());
    }
    throw new IllegalArgumentException("Required value was null.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Nka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */