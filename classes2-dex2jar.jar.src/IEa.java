import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class iEa
  extends pXa
  implements cXa<List<? extends AEa.c>, cWa>
{
  iEa(AEa paramAEa)
  {
    super(1);
  }
  
  public final void a(List<? extends AEa.c> paramList)
  {
    oXa.b(paramList, "statuses");
    boolean bool1 = paramList instanceof Collection;
    boolean bool2 = false;
    if ((bool1) && (paramList.isEmpty())) {}
    do
    {
      while (!((Iterator)localObject).hasNext())
      {
        i = 1;
        break;
        localObject = paramList.iterator();
      }
    } while (((AEa.c)((Iterator)localObject).next() instanceof AEa.c.c));
    int i = 0;
    Object localObject = Uma.qa.la().get();
    oXa.a(localObject, "AppPreferences.showWatermark.get()");
    boolean bool3 = ((Boolean)localObject).booleanValue();
    bool1 = bool2;
    if (i != 0)
    {
      bool1 = bool2;
      if (bool3) {
        bool1 = true;
      }
    }
    this.b.a(new AEa.e.a(paramList, bool1));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */