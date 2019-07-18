import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class aoa<T, R>
  implements DRa<T, R>
{
  public static final aoa a = new aoa();
  
  public final WVa<Mka, Rka> a(qfa paramqfa)
  {
    oXa.b(paramqfa, "it");
    Object localObject1 = paramqfa.getRelated_objects().getUsers();
    Object localObject2 = new ArrayList(mWa.a((Iterable)localObject1, 10));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      jfa localjfa = (jfa)((Iterator)localObject1).next();
      ((Collection)localObject2).add(new WVa(localjfa.getId(), Pka.a.a(localjfa)));
    }
    localObject2 = DWa.a((Iterable)localObject2);
    return new WVa(Mka.a.a(paramqfa.getPoll(), (Map)localObject2), Rka.a.a(paramqfa.getVote(), (Map)localObject2));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/aoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */