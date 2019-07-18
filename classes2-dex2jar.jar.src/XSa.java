import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

final class xsa<V>
  implements Callable<aRa<? extends T>>
{
  xsa(Rja paramRja) {}
  
  public final XQa<NOa<vsa.a>> call()
  {
    Object localObject1 = FaceApplication.d.b().a(this.a.c());
    if (((List)localObject1).isEmpty())
    {
      icb.a("PhotoCache").a("Cache MISS (no DB records)", new Object[0]);
      return XQa.a(NOa.a.a());
    }
    Object localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      if (oXa.a(((vsa.a)localObject3).a(), "n/a")) {
        break label95;
      }
    }
    Object localObject3 = null;
    label95:
    localObject3 = (vsa.a)localObject3;
    if (localObject3 != null)
    {
      icb.a("PhotoCache").a("Cache HIT: n/a", new Object[0]);
      return XQa.a(new NOa(localObject3));
    }
    localObject2 = vsa.a(vsa.a, new WOa.d(this.a.c()));
    if (localObject2 != null)
    {
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = ((Iterator)localObject1).next();
        if (oXa.a(((vsa.a)localObject3).a(), localObject2)) {
          break label199;
        }
      }
      localObject3 = null;
      label199:
      localObject3 = (vsa.a)localObject3;
      if (localObject3 != null) {
        localObject3 = new NOa(localObject3);
      } else {
        localObject3 = NOa.a.a();
      }
      icb.a locala = icb.a("PhotoCache");
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Cache ");
      if (((NOa)localObject3).a()) {
        localObject1 = "MISS";
      } else {
        localObject1 = "HIT";
      }
      ((StringBuilder)localObject2).append((String)localObject1);
      locala.a(((StringBuilder)localObject2).toString(), new Object[0]);
      return XQa.a(localObject3);
    }
    return XQa.a(NOa.a.a());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */