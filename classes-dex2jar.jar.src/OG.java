import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class og
  implements lg
{
  private static final Bitmap.Config[] a;
  private static final Bitmap.Config[] b = a;
  private static final Bitmap.Config[] c = { Bitmap.Config.RGB_565 };
  private static final Bitmap.Config[] d = { Bitmap.Config.ARGB_4444 };
  private static final Bitmap.Config[] e = { Bitmap.Config.ALPHA_8 };
  private final og.b f = new og.b();
  private final hg<og.a, Bitmap> g = new hg();
  private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> h = new HashMap();
  
  static
  {
    Bitmap.Config[] arrayOfConfig1 = new Bitmap.Config[2];
    arrayOfConfig1[0] = Bitmap.Config.ARGB_8888;
    arrayOfConfig1[1] = null;
    Bitmap.Config[] arrayOfConfig2 = arrayOfConfig1;
    if (Build.VERSION.SDK_INT >= 26)
    {
      arrayOfConfig2 = (Bitmap.Config[])Arrays.copyOf(arrayOfConfig1, arrayOfConfig1.length + 1);
      arrayOfConfig2[(arrayOfConfig2.length - 1)] = Bitmap.Config.RGBA_F16;
    }
    a = arrayOfConfig2;
  }
  
  static String a(int paramInt, Bitmap.Config paramConfig)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[");
    localStringBuilder.append(paramInt);
    localStringBuilder.append("](");
    localStringBuilder.append(paramConfig);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  private void a(Integer paramInteger, Bitmap paramBitmap)
  {
    Object localObject = b(paramBitmap.getConfig());
    Integer localInteger = (Integer)((NavigableMap)localObject).get(paramInteger);
    if (localInteger != null)
    {
      if (localInteger.intValue() == 1) {
        ((NavigableMap)localObject).remove(paramInteger);
      } else {
        ((NavigableMap)localObject).put(paramInteger, Integer.valueOf(localInteger.intValue() - 1));
      }
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Tried to decrement empty size, size: ");
    ((StringBuilder)localObject).append(paramInteger);
    ((StringBuilder)localObject).append(", removed: ");
    ((StringBuilder)localObject).append(c(paramBitmap));
    ((StringBuilder)localObject).append(", this: ");
    ((StringBuilder)localObject).append(this);
    throw new NullPointerException(((StringBuilder)localObject).toString());
  }
  
  private static Bitmap.Config[] a(Bitmap.Config paramConfig)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (Bitmap.Config.RGBA_F16.equals(paramConfig))) {
      return b;
    }
    int i = ng.a[paramConfig.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return new Bitmap.Config[] { paramConfig };
          }
          return e;
        }
        return d;
      }
      return c;
    }
    return a;
  }
  
  private NavigableMap<Integer, Integer> b(Bitmap.Config paramConfig)
  {
    NavigableMap localNavigableMap = (NavigableMap)this.h.get(paramConfig);
    Object localObject = localNavigableMap;
    if (localNavigableMap == null)
    {
      localObject = new TreeMap();
      this.h.put(paramConfig, localObject);
    }
    return (NavigableMap<Integer, Integer>)localObject;
  }
  
  private og.a b(int paramInt, Bitmap.Config paramConfig)
  {
    og.a locala1 = this.f.a(paramInt, paramConfig);
    Bitmap.Config[] arrayOfConfig = a(paramConfig);
    int i = arrayOfConfig.length;
    og.a locala2;
    for (int j = 0;; j++)
    {
      locala2 = locala1;
      if (j >= i) {
        break;
      }
      Bitmap.Config localConfig = arrayOfConfig[j];
      Integer localInteger = (Integer)b(localConfig).ceilingKey(Integer.valueOf(paramInt));
      if ((localInteger != null) && (localInteger.intValue() <= paramInt * 8))
      {
        if (localInteger.intValue() == paramInt) {
          if (localConfig == null)
          {
            locala2 = locala1;
            if (paramConfig == null) {
              break;
            }
          }
          else
          {
            locala2 = locala1;
            if (localConfig.equals(paramConfig)) {
              break;
            }
          }
        }
        this.f.a(locala1);
        locala2 = this.f.a(localInteger.intValue(), localConfig);
        break;
      }
    }
    return locala2;
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    og.a locala = b(Pj.a(paramInt1, paramInt2, paramConfig), paramConfig);
    Bitmap localBitmap = (Bitmap)this.g.a(locala);
    if (localBitmap != null)
    {
      a(Integer.valueOf(locala.b), localBitmap);
      localBitmap.reconfigure(paramInt1, paramInt2, paramConfig);
    }
    return localBitmap;
  }
  
  public void a(Bitmap paramBitmap)
  {
    int i = Pj.a(paramBitmap);
    og.a locala = this.f.a(i, paramBitmap.getConfig());
    this.g.a(locala, paramBitmap);
    NavigableMap localNavigableMap = b(paramBitmap.getConfig());
    paramBitmap = (Integer)localNavigableMap.get(Integer.valueOf(locala.b));
    int j = locala.b;
    i = 1;
    if (paramBitmap != null) {
      i = 1 + paramBitmap.intValue();
    }
    localNavigableMap.put(Integer.valueOf(j), Integer.valueOf(i));
  }
  
  public int b(Bitmap paramBitmap)
  {
    return Pj.a(paramBitmap);
  }
  
  public String b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return a(Pj.a(paramInt1, paramInt2, paramConfig), paramConfig);
  }
  
  public String c(Bitmap paramBitmap)
  {
    return a(Pj.a(paramBitmap), paramBitmap.getConfig());
  }
  
  public Bitmap removeLast()
  {
    Bitmap localBitmap = (Bitmap)this.g.a();
    if (localBitmap != null) {
      a(Integer.valueOf(Pj.a(localBitmap)), localBitmap);
    }
    return localBitmap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("SizeConfigStrategy{groupedMap=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", sortedSizes=(");
    Iterator localIterator = this.h.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append(localEntry.getKey());
      localStringBuilder.append('[');
      localStringBuilder.append(localEntry.getValue());
      localStringBuilder.append("], ");
    }
    if (!this.h.isEmpty()) {
      localStringBuilder.replace(localStringBuilder.length() - 2, localStringBuilder.length(), "");
    }
    localStringBuilder.append(")}");
    return localStringBuilder.toString();
  }
  
  static final class a
    implements mg
  {
    private final og.b a;
    int b;
    private Bitmap.Config c;
    
    public a(og.b paramb)
    {
      this.a = paramb;
    }
    
    public void a()
    {
      this.a.a(this);
    }
    
    public void a(int paramInt, Bitmap.Config paramConfig)
    {
      this.b = paramInt;
      this.c = paramConfig;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (a)paramObject;
        bool3 = bool2;
        if (this.b == ((a)paramObject).b)
        {
          bool3 = bool2;
          if (Pj.b(this.c, ((a)paramObject).c)) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public int hashCode()
    {
      int i = this.b;
      Bitmap.Config localConfig = this.c;
      int j;
      if (localConfig != null) {
        j = localConfig.hashCode();
      } else {
        j = 0;
      }
      return i * 31 + j;
    }
    
    public String toString()
    {
      return og.a(this.b, this.c);
    }
  }
  
  static class b
    extends dg<og.a>
  {
    protected og.a a()
    {
      return new og.a(this);
    }
    
    public og.a a(int paramInt, Bitmap.Config paramConfig)
    {
      og.a locala = (og.a)b();
      locala.a(paramInt, paramConfig);
      return locala;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/og.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */