import java.util.Iterator;
import java.util.List;

final class tMa
  extends pXa
  implements cXa<Integer, cWa>
{
  tMa(yMa paramyMa, List paramList)
  {
    super(1);
  }
  
  public final void a(Integer paramInteger)
  {
    Uma.qa.ma().set(Integer.valueOf(0));
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      paramInteger = (Yka)localIterator.next();
      gPa.c.a(paramInteger.getGroupId());
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */