import java.util.ConcurrentModificationException;
import java.util.Map;

public class ud<K, V>
{
  static Object[] a;
  static int b;
  static Object[] c;
  static int d;
  int[] e;
  Object[] f;
  int g;
  
  public ud()
  {
    this.e = jd.a;
    this.f = jd.c;
    this.g = 0;
  }
  
  public ud(int paramInt)
  {
    if (paramInt == 0)
    {
      this.e = jd.a;
      this.f = jd.c;
    }
    else
    {
      e(paramInt);
    }
    this.g = 0;
  }
  
  public ud(ud<K, V> paramud)
  {
    this();
    if (paramud != null) {
      a(paramud);
    }
  }
  
  private static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = jd.a(paramArrayOfInt, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfInt)
    {
      throw new ConcurrentModificationException();
    }
  }
  
  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (d < 10)
        {
          paramArrayOfObject[0] = c;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          c = paramArrayOfObject;
          d += 1;
        }
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (b < 10)
        {
          paramArrayOfObject[0] = a;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          a = paramArrayOfObject;
          b += 1;
        }
      }
      finally {}
    }
  }
  
  private void e(int paramInt)
  {
    if (paramInt == 8) {
      try
      {
        if (c != null)
        {
          Object[] arrayOfObject1 = c;
          this.f = arrayOfObject1;
          c = (Object[])arrayOfObject1[0];
          this.e = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          d -= 1;
          return;
        }
      }
      finally {}
    }
    if (paramInt == 4) {
      try
      {
        if (a != null)
        {
          Object[] arrayOfObject2 = a;
          this.f = arrayOfObject2;
          a = (Object[])arrayOfObject2[0];
          this.e = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          b -= 1;
          return;
        }
      }
      finally {}
    }
    this.e = new int[paramInt];
    this.f = new Object[paramInt << 1];
  }
  
  int a()
  {
    int i = this.g;
    if (i == 0) {
      return -1;
    }
    int j = a(this.e, i, 0);
    if (j < 0) {
      return j;
    }
    if (this.f[(j << 1)] == null) {
      return j;
    }
    for (int k = j + 1; (k < i) && (this.e[k] == 0); k++) {
      if (this.f[(k << 1)] == null) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (this.e[j] == 0))
    {
      if (this.f[(j << 1)] == null) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  public int a(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = a();
    } else {
      i = a(paramObject, paramObject.hashCode());
    }
    return i;
  }
  
  int a(Object paramObject, int paramInt)
  {
    int i = this.g;
    if (i == 0) {
      return -1;
    }
    int j = a(this.e, i, paramInt);
    if (j < 0) {
      return j;
    }
    if (paramObject.equals(this.f[(j << 1)])) {
      return j;
    }
    for (int k = j + 1; (k < i) && (this.e[k] == paramInt); k++) {
      if (paramObject.equals(this.f[(k << 1)])) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (this.e[j] == paramInt))
    {
      if (paramObject.equals(this.f[(j << 1)])) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  public V a(int paramInt, V paramV)
  {
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = this.f;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramV;
    return (V)localObject;
  }
  
  public void a(int paramInt)
  {
    int i = this.g;
    int[] arrayOfInt = this.e;
    if (arrayOfInt.length < paramInt)
    {
      Object[] arrayOfObject = this.f;
      e(paramInt);
      if (this.g > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.e, 0, i);
        System.arraycopy(arrayOfObject, 0, this.f, 0, i << 1);
      }
      a(arrayOfInt, arrayOfObject, i);
    }
    if (this.g == i) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public void a(ud<? extends K, ? extends V> paramud)
  {
    int i = paramud.g;
    a(this.g + i);
    int j = this.g;
    int k = 0;
    if (j == 0)
    {
      if (i > 0)
      {
        System.arraycopy(paramud.e, 0, this.e, 0, i);
        System.arraycopy(paramud.f, 0, this.f, 0, i << 1);
        this.g = i;
      }
    }
    else {
      while (k < i)
      {
        put(paramud.b(k), paramud.d(k));
        k++;
      }
    }
  }
  
  int b(Object paramObject)
  {
    int i = this.g * 2;
    Object[] arrayOfObject = this.f;
    if (paramObject == null) {
      for (j = 1; j < i; j += 2) {
        if (arrayOfObject[j] == null) {
          return j >> 1;
        }
      }
    }
    for (int j = 1; j < i; j += 2) {
      if (paramObject.equals(arrayOfObject[j])) {
        return j >> 1;
      }
    }
    return -1;
  }
  
  public K b(int paramInt)
  {
    return (K)this.f[(paramInt << 1)];
  }
  
  public V c(int paramInt)
  {
    Object localObject = this.f;
    int i = paramInt << 1;
    V ? = localObject[(i + 1)];
    int j = this.g;
    int k;
    if (j <= 1)
    {
      a(this.e, (Object[])localObject, j);
      this.e = jd.a;
      this.f = jd.c;
      k = 0;
    }
    else
    {
      int m = j - 1;
      localObject = this.e;
      int n = localObject.length;
      k = 8;
      if ((n > 8) && (j < localObject.length / 3))
      {
        if (j > 8) {
          k = j + (j >> 1);
        }
        int[] arrayOfInt1 = this.e;
        localObject = this.f;
        e(k);
        if (j == this.g)
        {
          if (paramInt > 0)
          {
            System.arraycopy(arrayOfInt1, 0, this.e, 0, paramInt);
            System.arraycopy(localObject, 0, this.f, 0, i);
          }
          k = m;
          if (paramInt < m)
          {
            k = paramInt + 1;
            int[] arrayOfInt2 = this.e;
            n = m - paramInt;
            System.arraycopy(arrayOfInt1, k, arrayOfInt2, paramInt, n);
            System.arraycopy(localObject, k << 1, this.f, i, n << 1);
            k = m;
          }
        }
        else
        {
          throw new ConcurrentModificationException();
        }
      }
      else
      {
        if (paramInt < m)
        {
          localObject = this.e;
          k = paramInt + 1;
          n = m - paramInt;
          System.arraycopy(localObject, k, localObject, paramInt, n);
          localObject = this.f;
          System.arraycopy(localObject, k << 1, localObject, i, n << 1);
        }
        localObject = this.f;
        paramInt = m << 1;
        localObject[paramInt] = null;
        localObject[(paramInt + 1)] = null;
        k = m;
      }
    }
    if (j == this.g)
    {
      this.g = k;
      return ?;
    }
    throw new ConcurrentModificationException();
  }
  
  public void clear()
  {
    int i = this.g;
    if (i > 0)
    {
      int[] arrayOfInt = this.e;
      Object[] arrayOfObject = this.f;
      this.e = jd.a;
      this.f = jd.c;
      this.g = 0;
      a(arrayOfInt, arrayOfObject, i);
    }
    if (this.g <= 0) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(Object paramObject)
  {
    boolean bool;
    if (a(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(Object paramObject)
  {
    boolean bool;
    if (b(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public V d(int paramInt)
  {
    return (V)this.f[((paramInt << 1) + 1)];
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    Object localObject1;
    int i;
    Object localObject2;
    Object localObject3;
    boolean bool;
    if ((paramObject instanceof ud))
    {
      localObject1 = (ud)paramObject;
      if (size() != ((ud)localObject1).size()) {
        return false;
      }
      i = 0;
      try
      {
        while (i < this.g)
        {
          localObject2 = b(i);
          localObject3 = d(i);
          paramObject = ((ud)localObject1).get(localObject2);
          if (localObject3 == null)
          {
            if ((paramObject != null) || (!((ud)localObject1).containsKey(localObject2))) {
              return false;
            }
          }
          else
          {
            bool = localObject3.equals(paramObject);
            if (!bool) {
              return false;
            }
          }
          i++;
        }
        return true;
      }
      catch (NullPointerException|ClassCastException paramObject)
      {
        return false;
      }
    }
    if ((paramObject instanceof Map))
    {
      localObject2 = (Map)paramObject;
      if (size() != ((Map)localObject2).size()) {
        return false;
      }
      i = 0;
    }
    try
    {
      while (i < this.g)
      {
        paramObject = b(i);
        localObject3 = d(i);
        localObject1 = ((Map)localObject2).get(paramObject);
        if (localObject3 == null)
        {
          if ((localObject1 != null) || (!((Map)localObject2).containsKey(paramObject))) {
            return false;
          }
        }
        else
        {
          bool = localObject3.equals(localObject1);
          if (!bool) {
            return false;
          }
        }
        i++;
      }
      return true;
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public V get(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      paramObject = this.f[((i << 1) + 1)];
    } else {
      paramObject = null;
    }
    return (V)paramObject;
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = this.e;
    Object[] arrayOfObject = this.f;
    int i = this.g;
    int j = 0;
    int k = 0;
    for (int m = 1; j < i; m += 2)
    {
      Object localObject = arrayOfObject[m];
      int n = arrayOfInt[j];
      int i1;
      if (localObject == null) {
        i1 = 0;
      } else {
        i1 = localObject.hashCode();
      }
      k += (i1 ^ n);
      j++;
    }
    return k;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (this.g <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public V put(K paramK, V paramV)
  {
    int i = this.g;
    int k;
    if (paramK == null)
    {
      j = a();
      k = 0;
    }
    else
    {
      k = paramK.hashCode();
      j = a(paramK, k);
    }
    Object localObject;
    if (j >= 0)
    {
      j = (j << 1) + 1;
      localObject = this.f;
      paramK = localObject[j];
      localObject[j] = paramV;
      return paramK;
    }
    int m = j;
    if (i >= this.e.length)
    {
      j = 4;
      if (i >= 8) {
        j = (i >> 1) + i;
      } else if (i >= 4) {
        j = 8;
      }
      int[] arrayOfInt1 = this.e;
      localObject = this.f;
      e(j);
      if (i == this.g)
      {
        int[] arrayOfInt2 = this.e;
        if (arrayOfInt2.length > 0)
        {
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
          System.arraycopy(localObject, 0, this.f, 0, localObject.length);
        }
        a(arrayOfInt1, (Object[])localObject, i);
      }
      else
      {
        throw new ConcurrentModificationException();
      }
    }
    if (m < i)
    {
      localObject = this.e;
      j = m + 1;
      System.arraycopy(localObject, m, localObject, j, i - m);
      localObject = this.f;
      System.arraycopy(localObject, m << 1, localObject, j << 1, this.g - m << 1);
    }
    int j = this.g;
    if (i == j)
    {
      localObject = this.e;
      if (m < localObject.length)
      {
        localObject[m] = k;
        localObject = this.f;
        k = m << 1;
        localObject[k] = paramK;
        localObject[(k + 1)] = paramV;
        this.g = (j + 1);
        return null;
      }
    }
    throw new ConcurrentModificationException();
  }
  
  public V remove(Object paramObject)
  {
    int i = a(paramObject);
    if (i >= 0) {
      return (V)c(i);
    }
    return null;
  }
  
  public int size()
  {
    return this.g;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.g * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < this.g; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = b(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
      localStringBuilder.append('=');
      localObject = d(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */