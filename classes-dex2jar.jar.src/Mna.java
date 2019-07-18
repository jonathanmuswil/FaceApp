import java.util.Iterator;

final class mna
  extends pXa
  implements cXa<_ea, afa>
{
  public static final mna b = new mna();
  
  mna()
  {
    super(1);
  }
  
  public final afa a(_ea param_ea)
  {
    oXa.b(param_ea, "photoInfo");
    Iterator localIterator = param_ea.getImages().iterator();
    if (!localIterator.hasNext())
    {
      param_ea = null;
    }
    else
    {
      param_ea = localIterator.next();
      if (localIterator.hasNext())
      {
        int i = ((afa)param_ea).getWidth();
        _ea local_ea = param_ea;
        do
        {
          Object localObject = localIterator.next();
          int j = ((afa)localObject).getWidth();
          param_ea = local_ea;
          int k = i;
          if (i < j)
          {
            param_ea = (_ea)localObject;
            k = j;
          }
          local_ea = param_ea;
          i = k;
        } while (localIterator.hasNext());
      }
    }
    param_ea = (afa)param_ea;
    if (param_ea != null) {
      return param_ea;
    }
    throw new IllegalStateException("received PhotoInfo without any resolution");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */