import java.lang.reflect.Array;

final class nc
{
  public static int a(int paramInt)
  {
    if (paramInt <= 4) {
      paramInt = 8;
    } else {
      paramInt *= 2;
    }
    return paramInt;
  }
  
  public static int[] a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = paramArrayOfInt;
    if (paramInt1 + 1 > paramArrayOfInt.length)
    {
      arrayOfInt = new int[a(paramInt1)];
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramInt1);
    }
    arrayOfInt[paramInt1] = paramInt2;
    return arrayOfInt;
  }
  
  public static <T> T[] a(T[] paramArrayOfT, int paramInt, T paramT)
  {
    Object localObject = paramArrayOfT;
    if (paramInt + 1 > paramArrayOfT.length)
    {
      localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), a(paramInt));
      System.arraycopy(paramArrayOfT, 0, localObject, 0, paramInt);
    }
    localObject[paramInt] = paramT;
    return (T[])localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */