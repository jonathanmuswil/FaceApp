import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class foa<T, R>
  implements DRa<T, R>
{
  public static final foa a = new foa();
  
  public final List<Uja> a(jna.a parama)
  {
    oXa.b(parama, "facebookInfo");
    Object localObject = parama.b();
    parama = new ArrayList(mWa.a((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      parama.add(new Uja((ika)((Iterator)localObject).next()));
    }
    return parama;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/foa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */