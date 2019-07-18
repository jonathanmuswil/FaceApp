import java.util.HashMap;
import java.util.Map;

class om
  implements vm
{
  private final int a;
  
  public om(int paramInt)
  {
    this.a = paramInt;
  }
  
  private static boolean a(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1;
    if (paramInt2 + i > paramArrayOfStackTraceElement.length) {
      return false;
    }
    for (int j = 0; j < i; j++) {
      if (!paramArrayOfStackTraceElement[(paramInt1 + j)].equals(paramArrayOfStackTraceElement[(paramInt2 + j)])) {
        return false;
      }
    }
    return true;
  }
  
  private static StackTraceElement[] a(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[paramArrayOfStackTraceElement.length];
    int i = 0;
    int j = 0;
    int i1;
    for (int k = 1; i < paramArrayOfStackTraceElement.length; k = i1)
    {
      StackTraceElement localStackTraceElement = paramArrayOfStackTraceElement[i];
      Integer localInteger = (Integer)localHashMap.get(localStackTraceElement);
      if ((localInteger != null) && (a(paramArrayOfStackTraceElement, localInteger.intValue(), i)))
      {
        int m = i - localInteger.intValue();
        int n = j;
        i1 = k;
        if (k < paramInt)
        {
          System.arraycopy(paramArrayOfStackTraceElement, i, arrayOfStackTraceElement, j, m);
          n = j + m;
          i1 = k + 1;
        }
        k = m - 1 + i;
        j = n;
      }
      else
      {
        arrayOfStackTraceElement[j] = paramArrayOfStackTraceElement[i];
        j++;
        k = i;
        i1 = 1;
      }
      localHashMap.put(localStackTraceElement, Integer.valueOf(i));
      i = k + 1;
    }
    paramArrayOfStackTraceElement = new StackTraceElement[j];
    System.arraycopy(arrayOfStackTraceElement, 0, paramArrayOfStackTraceElement, 0, paramArrayOfStackTraceElement.length);
    return paramArrayOfStackTraceElement;
  }
  
  public StackTraceElement[] a(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    StackTraceElement[] arrayOfStackTraceElement = a(paramArrayOfStackTraceElement, this.a);
    if (arrayOfStackTraceElement.length < paramArrayOfStackTraceElement.length) {
      return arrayOfStackTraceElement;
    }
    return paramArrayOfStackTraceElement;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/om.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */