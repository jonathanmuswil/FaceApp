import java.util.NoSuchElementException;

public final class VOa$a
{
  public final VOa a(OZ paramOZ)
  {
    oXa.b(paramOZ, "protoGender");
    int i = UOa.a[paramOZ.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if ((i != 3) && (i != 4)) {
          throw new UVa();
        }
        paramOZ = VOa.a;
      }
      else
      {
        paramOZ = VOa.c;
      }
    }
    else {
      paramOZ = VOa.b;
    }
    return paramOZ;
  }
  
  public final VOa a(String paramString)
  {
    oXa.b(paramString, "id");
    for (VOa localVOa : VOa.values()) {
      if (oXa.a(localVOa.getId(), paramString)) {
        return localVOa;
      }
    }
    throw new NoSuchElementException("Array contains no element matching the predicate.");
  }
  
  public final VOa b(String paramString)
  {
    oXa.b(paramString, "id");
    for (VOa localVOa : VOa.values()) {
      if (oXa.a(localVOa.getId(), paramString)) {
        return localVOa;
      }
    }
    paramString = null;
    return paramString;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/VOa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */