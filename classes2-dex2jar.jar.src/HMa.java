final class hMa
  extends pXa
  implements dXa<Object, Object, Boolean>
{
  public static final hMa b = new hMa();
  
  hMa()
  {
    super(2);
  }
  
  public final boolean a(Object paramObject1, Object paramObject2)
  {
    oXa.b(paramObject1, "oldModel");
    oXa.b(paramObject2, "newModel");
    boolean bool1 = oXa.a(paramObject1, nHa.a);
    boolean bool2 = true;
    if (bool1) {
      bool2 = oXa.a(paramObject2, nHa.a);
    } else if ((paramObject1 instanceof iHa)) {
      bool2 = paramObject2 instanceof iHa;
    } else if ((paramObject1 instanceof jHa))
    {
      if (((paramObject2 instanceof jHa)) && (((jHa)paramObject1).k() == ((jHa)paramObject2).k())) {}
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
                bool2 = false;
                break label260;
                if (!(paramObject1 instanceof pHa)) {
                  break;
                }
              } while ((!(paramObject2 instanceof pHa)) || (paramObject1.hashCode() != paramObject2.hashCode()));
              break label260;
              if (!(paramObject1 instanceof rHa)) {
                break;
              }
            } while ((!(paramObject2 instanceof rHa)) || (!oXa.a(((rHa)paramObject1).a(), ((rHa)paramObject2).a())));
            break label260;
            if (!(paramObject1 instanceof Wka)) {
              break;
            }
          } while ((!(paramObject2 instanceof Wka)) || (((Wka)paramObject1).getId() != ((Wka)paramObject2).getId()));
          break label260;
          if (!(paramObject1 instanceof Vka)) {
            break;
          }
        } while ((!(paramObject2 instanceof Vka)) || (((Vka)paramObject1).getId() != ((Vka)paramObject2).getId()));
        break;
        if (!(paramObject1 instanceof Xka)) {
          break label263;
        }
      } while ((!(paramObject2 instanceof Xka)) || (((Xka)paramObject1).getId() != ((Xka)paramObject2).getId()));
    }
    label260:
    return bool2;
    label263:
    paramObject2 = new StringBuilder();
    ((StringBuilder)paramObject2).append("Unsupported model type: ");
    ((StringBuilder)paramObject2).append(paramObject1.getClass().getSimpleName());
    throw new IllegalArgumentException(((StringBuilder)paramObject2).toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */