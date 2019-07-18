import io.faceapp.ui.photo_picker.item.a;

final class vIa
  extends pXa
  implements dXa<Object, Object, Boolean>
{
  public static final vIa b = new vIa();
  
  vIa()
  {
    super(2);
  }
  
  public final boolean a(Object paramObject1, Object paramObject2)
  {
    oXa.b(paramObject1, "oldModel");
    oXa.b(paramObject2, "newModel");
    boolean bool1 = oXa.a(paramObject1, mHa.a);
    boolean bool2 = true;
    if (bool1)
    {
      if (paramObject2 == mHa.a) {}
    }
    else {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      bool2 = false;
                      break label278;
                      if (!oXa.a(paramObject1, KIa.a.c.a)) {
                        break;
                      }
                    } while (paramObject2 != KIa.a.c.a);
                    break label278;
                    if (!oXa.a(paramObject1, KIa.a.b.a)) {
                      break;
                    }
                  } while (paramObject2 != KIa.a.b.a);
                  break label278;
                  if (!oXa.a(paramObject1, KIa.a.a.a)) {
                    break;
                  }
                } while (paramObject2 != KIa.a.a.a);
                break label278;
                if (!oXa.a(paramObject1, a.a)) {
                  break;
                }
              } while (paramObject2 != a.a);
              break label278;
              if (!(paramObject1 instanceof KIa.c.c)) {
                break;
              }
            } while ((!(paramObject2 instanceof KIa.c.c)) || (!oXa.a(((KIa.c.c)paramObject1).a(), ((KIa.c.c)paramObject2).a())));
            break label278;
            if (!(paramObject1 instanceof KIa.c.b)) {
              break;
            }
          } while ((!(paramObject2 instanceof KIa.c.b)) || (!oXa.a(((KIa.c.b)paramObject1).a(), ((KIa.c.b)paramObject2).a())));
          break label278;
          if (!(paramObject1 instanceof rHa)) {
            break;
          }
        } while ((!(paramObject2 instanceof rHa)) || (!oXa.a(((rHa)paramObject1).a(), ((rHa)paramObject2).a())));
        break;
        if (!(paramObject1 instanceof eoa.c)) {
          break label281;
        }
      } while ((!(paramObject2 instanceof eoa.c)) || (!oXa.a(((eoa.c)paramObject1).a().c(), ((eoa.c)paramObject2).a().c())));
    }
    label278:
    return bool2;
    label281:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vIa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */