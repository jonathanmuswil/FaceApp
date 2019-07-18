import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class pMa
  extends pXa
  implements cXa<Zka, cWa>
{
  pMa(yMa paramyMa, boolean paramBoolean)
  {
    super(1);
  }
  
  public final void a(Zka paramZka)
  {
    oXa.b(paramZka, "updatesBatch");
    Object localObject1 = paramZka.a();
    Object localObject2 = new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = localIterator.next();
      if (((Yka)localObject1).a()) {
        ((Collection)localObject2).add(localObject1);
      }
    }
    localObject2 = mWa.c((Collection)localObject2);
    localObject1 = paramZka.a();
    paramZka = new ArrayList();
    localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = localIterator.next();
      if ((((Yka)localObject1).a() ^ true)) {
        paramZka.add(localObject1);
      }
    }
    paramZka = mWa.c(paramZka);
    yMa.a(this.b, new WVa(localObject2, paramZka));
    yMa.a(this.b, (List)localObject2, paramZka, this.c);
    yMa.a(this.b, (List)localObject2);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */