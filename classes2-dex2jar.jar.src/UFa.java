import io.faceapp.ui.layouts.selector.item.b;
import io.faceapp.ui.layouts.selector.item.m;

final class uFa
  extends pXa
  implements dXa<Object, Object, Boolean>
{
  public static final uFa b = new uFa();
  
  uFa()
  {
    super(2);
  }
  
  public final boolean a(Object paramObject1, Object paramObject2)
  {
    oXa.b(paramObject1, "oldModel");
    oXa.b(paramObject2, "newModel");
    boolean bool1 = oXa.a(paramObject1, b.a);
    boolean bool2 = true;
    if (bool1)
    {
      if (paramObject2 == b.a) {}
    }
    else {
      do
      {
        do
        {
          bool2 = false;
          break label112;
          if (!(paramObject1 instanceof kHa)) {
            break;
          }
        } while ((!(paramObject2 instanceof kHa)) || (((kHa)paramObject1).b() != ((kHa)paramObject2).b()));
        break;
        if (!(paramObject1 instanceof m)) {
          break label115;
        }
      } while ((!(paramObject2 instanceof m)) || (!oXa.a(((m)paramObject1).a(), ((m)paramObject2).a())));
    }
    label112:
    return bool2;
    label115:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */