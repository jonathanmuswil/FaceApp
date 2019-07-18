import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public class nd<K, V>
{
  private final LinkedHashMap<K, V> a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  public nd(int paramInt)
  {
    if (paramInt > 0)
    {
      this.c = paramInt;
      this.a = new LinkedHashMap(0, 0.75F, true);
      return;
    }
    throw new IllegalArgumentException("maxSize <= 0");
  }
  
  private int c(K paramK, V paramV)
  {
    int i = b(paramK, paramV);
    if (i >= 0) {
      return i;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Negative size: ");
    localStringBuilder.append(paramK);
    localStringBuilder.append("=");
    localStringBuilder.append(paramV);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  protected V a(K paramK)
  {
    return null;
  }
  
  public final V a(K paramK, V paramV)
  {
    if ((paramK != null) && (paramV != null)) {
      try
      {
        this.d += 1;
        this.b += c(paramK, paramV);
        Object localObject = this.a.put(paramK, paramV);
        if (localObject != null) {
          this.b -= c(paramK, localObject);
        }
        if (localObject != null) {
          a(false, paramK, localObject, paramV);
        }
        a(this.c);
        return (V)localObject;
      }
      finally {}
    }
    throw new NullPointerException("key == null || value == null");
  }
  
  public void a(int paramInt)
  {
    for (;;)
    {
      try
      {
        if ((this.b >= 0) && ((!this.a.isEmpty()) || (this.b == 0)))
        {
          if ((this.b > paramInt) && (!this.a.isEmpty()))
          {
            localObject1 = (Map.Entry)this.a.entrySet().iterator().next();
            localObject2 = ((Map.Entry)localObject1).getKey();
            localObject1 = ((Map.Entry)localObject1).getValue();
            this.a.remove(localObject2);
            this.b -= c(localObject2, localObject1);
            this.f += 1;
            a(true, localObject2, localObject1, null);
            continue;
          }
          return;
        }
        Object localObject2 = new java/lang/IllegalStateException;
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(getClass().getName());
        ((StringBuilder)localObject1).append(".sizeOf() is reporting inconsistent results!");
        ((IllegalStateException)localObject2).<init>(((StringBuilder)localObject1).toString());
        throw ((Throwable)localObject2);
      }
      finally {}
    }
  }
  
  protected void a(boolean paramBoolean, K paramK, V paramV1, V paramV2) {}
  
  protected int b(K paramK, V paramV)
  {
    return 1;
  }
  
  public final V b(K paramK)
  {
    if (paramK != null) {
      try
      {
        Object localObject1 = this.a.get(paramK);
        if (localObject1 != null)
        {
          this.g += 1;
          return (V)localObject1;
        }
        this.h += 1;
        localObject1 = a(paramK);
        if (localObject1 == null) {
          return null;
        }
        try
        {
          this.e += 1;
          Object localObject2 = this.a.put(paramK, localObject1);
          if (localObject2 != null) {
            this.a.put(paramK, localObject2);
          } else {
            this.b += c(paramK, localObject1);
          }
          if (localObject2 != null)
          {
            a(false, paramK, localObject1, localObject2);
            return (V)localObject2;
          }
          a(this.c);
          return (V)localObject1;
        }
        finally {}
        throw new NullPointerException("key == null");
      }
      finally {}
    }
  }
  
  public final String toString()
  {
    try
    {
      int i = this.g + this.h;
      if (i != 0) {
        i = this.g * 100 / i;
      } else {
        i = 0;
      }
      String str = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */