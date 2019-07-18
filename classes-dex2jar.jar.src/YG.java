import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class yg
{
  private final int a;
  private final int b;
  private final Context c;
  private final int d;
  
  yg(yg.a parama)
  {
    this.c = parama.b;
    if (a(parama.c)) {
      i = parama.i / 2;
    } else {
      i = parama.i;
    }
    this.d = i;
    int i = a(parama.c, parama.g, parama.h);
    float f1 = parama.d.b() * parama.d.a() * 4;
    int j = Math.round(parama.f * f1);
    int k = Math.round(f1 * parama.e);
    int m = i - this.d;
    int n = k + j;
    if (n <= m)
    {
      this.b = k;
      this.a = j;
    }
    else
    {
      float f2 = m;
      float f3 = parama.f;
      f1 = parama.e;
      f3 = f2 / (f3 + f1);
      this.b = Math.round(f1 * f3);
      this.a = Math.round(f3 * parama.f);
    }
    if (Log.isLoggable("MemorySizeCalculator", 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Calculation complete, Calculated memory cache size: ");
      localStringBuilder.append(a(this.b));
      localStringBuilder.append(", pool size: ");
      localStringBuilder.append(a(this.a));
      localStringBuilder.append(", byte array size: ");
      localStringBuilder.append(a(this.d));
      localStringBuilder.append(", memory class limited? ");
      boolean bool;
      if (n > i) {
        bool = true;
      } else {
        bool = false;
      }
      localStringBuilder.append(bool);
      localStringBuilder.append(", max size: ");
      localStringBuilder.append(a(i));
      localStringBuilder.append(", memoryClass: ");
      localStringBuilder.append(parama.c.getMemoryClass());
      localStringBuilder.append(", isLowMemoryDevice: ");
      localStringBuilder.append(a(parama.c));
      Log.d("MemorySizeCalculator", localStringBuilder.toString());
    }
  }
  
  private static int a(ActivityManager paramActivityManager, float paramFloat1, float paramFloat2)
  {
    int i = paramActivityManager.getMemoryClass();
    boolean bool = a(paramActivityManager);
    float f = i * 1024 * 1024;
    if (bool) {
      paramFloat1 = paramFloat2;
    }
    return Math.round(f * paramFloat1);
  }
  
  private String a(int paramInt)
  {
    return Formatter.formatFileSize(this.c, paramInt);
  }
  
  @TargetApi(19)
  static boolean a(ActivityManager paramActivityManager)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramActivityManager.isLowRamDevice();
    }
    return true;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public static final class a
  {
    static final int a;
    final Context b;
    ActivityManager c;
    yg.c d;
    float e = 2.0F;
    float f = a;
    float g = 0.4F;
    float h = 0.33F;
    int i = 4194304;
    
    static
    {
      int j;
      if (Build.VERSION.SDK_INT < 26) {
        j = 4;
      } else {
        j = 1;
      }
      a = j;
    }
    
    public a(Context paramContext)
    {
      this.b = paramContext;
      this.c = ((ActivityManager)paramContext.getSystemService("activity"));
      this.d = new yg.b(paramContext.getResources().getDisplayMetrics());
      if ((Build.VERSION.SDK_INT >= 26) && (yg.a(this.c))) {
        this.f = 0.0F;
      }
    }
    
    public yg a()
    {
      return new yg(this);
    }
  }
  
  private static final class b
    implements yg.c
  {
    private final DisplayMetrics a;
    
    b(DisplayMetrics paramDisplayMetrics)
    {
      this.a = paramDisplayMetrics;
    }
    
    public int a()
    {
      return this.a.heightPixels;
    }
    
    public int b()
    {
      return this.a.widthPixels;
    }
  }
  
  static abstract interface c
  {
    public abstract int a();
    
    public abstract int b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */