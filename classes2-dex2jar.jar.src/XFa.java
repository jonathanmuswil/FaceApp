import io.faceapp.ui.layouts.selector.item.n;

final class xFa
  extends pXa
  implements dXa<Object, Object, Boolean>
{
  public static final xFa b = new xFa();
  
  xFa()
  {
    super(2);
  }
  
  public final boolean a(Object paramObject1, Object paramObject2)
  {
    oXa.b(paramObject1, "oldModel");
    oXa.b(paramObject2, "newModel");
    boolean bool1 = oXa.a(paramObject1, nHa.a);
    boolean bool2 = true;
    if (bool1)
    {
      if (paramObject2 == nHa.a) {}
    }
    else {
      do
      {
        String str;
        do
        {
          do
          {
            do
            {
              bool2 = false;
              break label181;
              if (!(paramObject1 instanceof jHa)) {
                break;
              }
            } while ((!(paramObject2 instanceof jHa)) || (((jHa)paramObject1).k() != ((jHa)paramObject2).k()));
            break label181;
            if (!(paramObject1 instanceof n)) {
              break;
            }
          } while (!(paramObject2 instanceof n));
          paramObject1 = (n)paramObject1;
          str = ((n)paramObject1).b().b();
          paramObject2 = (n)paramObject2;
        } while ((!oXa.a(str, ((n)paramObject2).b().b())) || (!oXa.a(((n)paramObject1).b().a(), ((n)paramObject2).b().a())));
        break;
        if (!(paramObject1 instanceof sHa)) {
          break label184;
        }
      } while ((!(paramObject2 instanceof sHa)) || (((sHa)paramObject1).b() != ((sHa)paramObject2).b()));
    }
    label181:
    return bool2;
    label184:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */