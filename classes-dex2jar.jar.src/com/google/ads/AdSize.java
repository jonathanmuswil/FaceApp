package com.google.ads;

import android.content.Context;
import com.google.android.gms.ads.e;

@Deprecated
public final class AdSize
{
  public static final int AUTO_HEIGHT = -2;
  public static final AdSize BANNER;
  public static final int FULL_WIDTH = -1;
  public static final AdSize IAB_BANNER = new AdSize(468, 60, "as");
  public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "as");
  public static final AdSize IAB_MRECT;
  public static final AdSize IAB_WIDE_SKYSCRAPER = new AdSize(160, 600, "as");
  public static final int LANDSCAPE_AD_HEIGHT = 32;
  public static final int LARGE_AD_HEIGHT = 90;
  public static final int PORTRAIT_AD_HEIGHT = 50;
  public static final AdSize SMART_BANNER = new AdSize(-1, -2, "mb");
  private final e a;
  
  static
  {
    BANNER = new AdSize(320, 50, "mb");
    IAB_MRECT = new AdSize(300, 250, "as");
  }
  
  public AdSize(int paramInt1, int paramInt2)
  {
    this(new e(paramInt1, paramInt2));
  }
  
  private AdSize(int paramInt1, int paramInt2, String paramString)
  {
    this(new e(paramInt1, paramInt2));
  }
  
  public AdSize(e parame)
  {
    this.a = parame;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AdSize)) {
      return false;
    }
    paramObject = (AdSize)paramObject;
    return this.a.equals(((AdSize)paramObject).a);
  }
  
  public final AdSize findBestSize(AdSize... paramVarArgs)
  {
    Object localObject1 = null;
    if (paramVarArgs == null) {
      return null;
    }
    float f1 = 0.0F;
    int i = getWidth();
    int j = getHeight();
    int k = paramVarArgs.length;
    int m = 0;
    while (m < k)
    {
      AdSize localAdSize = paramVarArgs[m];
      int n = localAdSize.getWidth();
      int i1 = localAdSize.getHeight();
      Object localObject2 = localObject1;
      float f2 = f1;
      if (isSizeAppropriate(n, i1))
      {
        f2 = n * i1 / (i * j);
        float f3 = f2;
        if (f2 > 1.0F) {
          f3 = 1.0F / f2;
        }
        localObject2 = localObject1;
        f2 = f1;
        if (f3 > f1)
        {
          localObject2 = localAdSize;
          f2 = f3;
        }
      }
      m++;
      localObject1 = localObject2;
      f1 = f2;
    }
    return (AdSize)localObject1;
  }
  
  public final int getHeight()
  {
    return this.a.a();
  }
  
  public final int getHeightInPixels(Context paramContext)
  {
    return this.a.a(paramContext);
  }
  
  public final int getWidth()
  {
    return this.a.b();
  }
  
  public final int getWidthInPixels(Context paramContext)
  {
    return this.a.b(paramContext);
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final boolean isAutoHeight()
  {
    return this.a.c();
  }
  
  public final boolean isCustomAdSize()
  {
    return false;
  }
  
  public final boolean isFullWidth()
  {
    return this.a.e();
  }
  
  public final boolean isSizeAppropriate(int paramInt1, int paramInt2)
  {
    int i = getWidth();
    int j = getHeight();
    float f1 = paramInt1;
    float f2 = i;
    if ((f1 <= f2 * 1.25F) && (f1 >= f2 * 0.8F))
    {
      f1 = paramInt2;
      f2 = j;
      if ((f1 <= 1.25F * f2) && (f1 >= f2 * 0.8F)) {
        return true;
      }
    }
    return false;
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/ads/AdSize.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */