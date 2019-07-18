import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class ru
  implements Cloneable
{
  private pu<?, ?> a;
  private Object b;
  private List<Object> c = new ArrayList();
  
  private final byte[] b()
    throws IOException
  {
    byte[] arrayOfByte = new byte[a()];
    a(mu.a(arrayOfByte));
    return arrayOfByte;
  }
  
  private final ru c()
  {
    ru localru = new ru();
    try
    {
      localru.a = this.a;
      if (this.c == null) {
        localru.c = null;
      } else {
        localru.c.addAll(this.c);
      }
      if (this.b != null)
      {
        Object localObject1;
        if ((this.b instanceof tu)) {
          localObject1 = (tu)((tu)this.b).clone();
        }
        int i;
        int j;
        Object localObject2;
        for (;;)
        {
          localru.b = localObject1;
          break label358;
          if ((this.b instanceof byte[]))
          {
            localObject1 = ((byte[])this.b).clone();
          }
          else
          {
            boolean bool = this.b instanceof byte[][];
            i = 0;
            j = 0;
            if (bool)
            {
              localObject1 = (byte[][])this.b;
              localObject2 = new byte[localObject1.length][];
              localru.b = localObject2;
              while (j < localObject1.length)
              {
                localObject2[j] = ((byte[])localObject1[j].clone());
                j++;
              }
            }
            if ((this.b instanceof boolean[]))
            {
              localObject1 = ((boolean[])this.b).clone();
            }
            else if ((this.b instanceof int[]))
            {
              localObject1 = ((int[])this.b).clone();
            }
            else if ((this.b instanceof long[]))
            {
              localObject1 = ((long[])this.b).clone();
            }
            else if ((this.b instanceof float[]))
            {
              localObject1 = ((float[])this.b).clone();
            }
            else
            {
              if (!(this.b instanceof double[])) {
                break;
              }
              localObject1 = ((double[])this.b).clone();
            }
          }
        }
        if ((this.b instanceof tu[]))
        {
          localObject1 = (tu[])this.b;
          localObject2 = new tu[localObject1.length];
          localru.b = localObject2;
          for (j = i; j < localObject1.length; j++) {
            localObject2[j] = ((tu)localObject1[j].clone());
          }
        }
      }
      label358:
      return localru;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  final int a()
  {
    if (this.b == null)
    {
      Iterator localIterator = this.c.iterator();
      if (!localIterator.hasNext()) {
        return 0;
      }
      localIterator.next();
      throw new NoSuchMethodError();
    }
    throw new NoSuchMethodError();
  }
  
  final void a(mu parammu)
    throws IOException
  {
    if (this.b == null)
    {
      parammu = this.c.iterator();
      if (!parammu.hasNext()) {
        return;
      }
      parammu.next();
      throw new NoSuchMethodError();
    }
    throw new NoSuchMethodError();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ru)) {
      return false;
    }
    paramObject = (ru)paramObject;
    Object localObject;
    if ((this.b != null) && (((ru)paramObject).b != null))
    {
      localObject = this.a;
      if (localObject != ((ru)paramObject).a) {
        return false;
      }
      if (!((pu)localObject).a.isArray()) {
        return this.b.equals(((ru)paramObject).b);
      }
      localObject = this.b;
      if ((localObject instanceof byte[])) {
        return Arrays.equals((byte[])localObject, (byte[])((ru)paramObject).b);
      }
      if ((localObject instanceof int[])) {
        return Arrays.equals((int[])localObject, (int[])((ru)paramObject).b);
      }
      if ((localObject instanceof long[])) {
        return Arrays.equals((long[])localObject, (long[])((ru)paramObject).b);
      }
      if ((localObject instanceof float[])) {
        return Arrays.equals((float[])localObject, (float[])((ru)paramObject).b);
      }
      if ((localObject instanceof double[])) {
        return Arrays.equals((double[])localObject, (double[])((ru)paramObject).b);
      }
      if ((localObject instanceof boolean[])) {
        return Arrays.equals((boolean[])localObject, (boolean[])((ru)paramObject).b);
      }
      return Arrays.deepEquals((Object[])localObject, (Object[])((ru)paramObject).b);
    }
    List localList = this.c;
    if (localList != null)
    {
      localObject = ((ru)paramObject).c;
      if (localObject != null) {
        return localList.equals(localObject);
      }
    }
    try
    {
      boolean bool = Arrays.equals(b(), ((ru)paramObject).b());
      return bool;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(b());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ru.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */