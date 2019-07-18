import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class kg
  implements eg
{
  private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
  private final lg b;
  private final Set<Bitmap.Config> c;
  private final long d;
  private final kg.a e;
  private long f;
  private long g;
  private int h;
  private int i;
  private int j;
  private int k;
  
  public kg(long paramLong)
  {
    this(paramLong, g(), f());
  }
  
  kg(long paramLong, lg paramlg, Set<Bitmap.Config> paramSet)
  {
    this.d = paramLong;
    this.f = paramLong;
    this.b = paramlg;
    this.c = paramSet;
    this.e = new kg.b();
  }
  
  private void a(long paramLong)
  {
    try
    {
      while (this.g > paramLong)
      {
        Bitmap localBitmap = this.b.removeLast();
        if (localBitmap == null)
        {
          if (Log.isLoggable("LruBitmapPool", 5))
          {
            Log.w("LruBitmapPool", "Size mismatch, resetting");
            d();
          }
          this.g = 0L;
          return;
        }
        this.e.a(localBitmap);
        this.g -= this.b.b(localBitmap);
        this.k += 1;
        if (Log.isLoggable("LruBitmapPool", 3))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Evicting bitmap=");
          localStringBuilder.append(this.b.c(localBitmap));
          Log.d("LruBitmapPool", localStringBuilder.toString());
        }
        c();
        localBitmap.recycle();
      }
      return;
    }
    finally {}
  }
  
  @TargetApi(26)
  private static void a(Bitmap.Config paramConfig)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return;
    }
    if (paramConfig != Bitmap.Config.HARDWARE) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Cannot create a mutable Bitmap with config: ");
    localStringBuilder.append(paramConfig);
    localStringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  @TargetApi(19)
  private static void b(Bitmap paramBitmap)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramBitmap.setPremultiplied(true);
    }
  }
  
  private static Bitmap c(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    if (paramConfig == null) {
      paramConfig = a;
    }
    return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
  }
  
  private void c()
  {
    if (Log.isLoggable("LruBitmapPool", 2)) {
      d();
    }
  }
  
  private static void c(Bitmap paramBitmap)
  {
    paramBitmap.setHasAlpha(true);
    b(paramBitmap);
  }
  
  private Bitmap d(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    try
    {
      a(paramConfig);
      Object localObject1 = this.b;
      if (paramConfig != null) {
        localObject2 = paramConfig;
      } else {
        localObject2 = a;
      }
      Object localObject2 = ((lg)localObject1).a(paramInt1, paramInt2, (Bitmap.Config)localObject2);
      if (localObject2 == null)
      {
        if (Log.isLoggable("LruBitmapPool", 3))
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("Missing bitmap=");
          ((StringBuilder)localObject1).append(this.b.b(paramInt1, paramInt2, paramConfig));
          Log.d("LruBitmapPool", ((StringBuilder)localObject1).toString());
        }
        this.i += 1;
      }
      else
      {
        this.h += 1;
        this.g -= this.b.b((Bitmap)localObject2);
        this.e.a((Bitmap)localObject2);
        c((Bitmap)localObject2);
      }
      if (Log.isLoggable("LruBitmapPool", 2))
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("Get bitmap=");
        ((StringBuilder)localObject1).append(this.b.b(paramInt1, paramInt2, paramConfig));
        Log.v("LruBitmapPool", ((StringBuilder)localObject1).toString());
      }
      c();
      return (Bitmap)localObject2;
    }
    finally {}
  }
  
  private void d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Hits=");
    localStringBuilder.append(this.h);
    localStringBuilder.append(", misses=");
    localStringBuilder.append(this.i);
    localStringBuilder.append(", puts=");
    localStringBuilder.append(this.j);
    localStringBuilder.append(", evictions=");
    localStringBuilder.append(this.k);
    localStringBuilder.append(", currentSize=");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", maxSize=");
    localStringBuilder.append(this.f);
    localStringBuilder.append("\nStrategy=");
    localStringBuilder.append(this.b);
    Log.v("LruBitmapPool", localStringBuilder.toString());
  }
  
  private void e()
  {
    a(this.f);
  }
  
  @TargetApi(26)
  private static Set<Bitmap.Config> f()
  {
    HashSet localHashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
    if (Build.VERSION.SDK_INT >= 19) {
      localHashSet.add(null);
    }
    if (Build.VERSION.SDK_INT >= 26) {
      localHashSet.remove(Bitmap.Config.HARDWARE);
    }
    return Collections.unmodifiableSet(localHashSet);
  }
  
  private static lg g()
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 19) {
      localObject = new og();
    } else {
      localObject = new cg();
    }
    return (lg)localObject;
  }
  
  public Bitmap a(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap = d(paramInt1, paramInt2, paramConfig);
    if (localBitmap != null)
    {
      localBitmap.eraseColor(0);
      paramConfig = localBitmap;
    }
    else
    {
      paramConfig = c(paramInt1, paramInt2, paramConfig);
    }
    return paramConfig;
  }
  
  public void a()
  {
    if (Log.isLoggable("LruBitmapPool", 3)) {
      Log.d("LruBitmapPool", "clearMemory");
    }
    a(0L);
  }
  
  @SuppressLint({"InlinedApi"})
  public void a(int paramInt)
  {
    if (Log.isLoggable("LruBitmapPool", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("trimMemory, level=");
      localStringBuilder.append(paramInt);
      Log.d("LruBitmapPool", localStringBuilder.toString());
    }
    if (paramInt >= 40) {
      a();
    } else if ((paramInt >= 20) || (paramInt == 15)) {
      a(b() / 2L);
    }
  }
  
  public void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {
      try
      {
        if (!paramBitmap.isRecycled())
        {
          StringBuilder localStringBuilder;
          if ((paramBitmap.isMutable()) && (this.b.b(paramBitmap) <= this.f) && (this.c.contains(paramBitmap.getConfig())))
          {
            int m = this.b.b(paramBitmap);
            this.b.a(paramBitmap);
            this.e.b(paramBitmap);
            this.j += 1;
            this.g += m;
            if (Log.isLoggable("LruBitmapPool", 2))
            {
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append("Put bitmap in pool=");
              localStringBuilder.append(this.b.c(paramBitmap));
              Log.v("LruBitmapPool", localStringBuilder.toString());
            }
            c();
            e();
            return;
          }
          if (Log.isLoggable("LruBitmapPool", 2))
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("Reject bitmap from pool, bitmap: ");
            localStringBuilder.append(this.b.c(paramBitmap));
            localStringBuilder.append(", is mutable: ");
            localStringBuilder.append(paramBitmap.isMutable());
            localStringBuilder.append(", is allowed config: ");
            localStringBuilder.append(this.c.contains(paramBitmap.getConfig()));
            Log.v("LruBitmapPool", localStringBuilder.toString());
          }
          paramBitmap.recycle();
          return;
        }
        paramBitmap = new java/lang/IllegalStateException;
        paramBitmap.<init>("Cannot pool recycled bitmap");
        throw paramBitmap;
      }
      finally
      {
        break label301;
      }
    }
    paramBitmap = new java/lang/NullPointerException;
    paramBitmap.<init>("Bitmap must not be null");
    throw paramBitmap;
    label301:
    throw paramBitmap;
  }
  
  public long b()
  {
    return this.f;
  }
  
  public Bitmap b(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    Bitmap localBitmap1 = d(paramInt1, paramInt2, paramConfig);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 == null) {
      localBitmap2 = c(paramInt1, paramInt2, paramConfig);
    }
    return localBitmap2;
  }
  
  private static abstract interface a
  {
    public abstract void a(Bitmap paramBitmap);
    
    public abstract void b(Bitmap paramBitmap);
  }
  
  private static final class b
    implements kg.a
  {
    public void a(Bitmap paramBitmap) {}
    
    public void b(Bitmap paramBitmap) {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */