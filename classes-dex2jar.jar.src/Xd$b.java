import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

class Xd$b
  extends ae.a
{
  md<Long> K;
  vd<Integer> L;
  
  Xd$b(b paramb, Xd paramXd, Resources paramResources)
  {
    super(paramb, paramXd, paramResources);
    if (paramb != null)
    {
      this.K = paramb.K;
      this.L = paramb.L;
    }
    else
    {
      this.K = new md();
      this.L = new vd();
    }
  }
  
  private static long f(int paramInt1, int paramInt2)
  {
    long l = paramInt1;
    return paramInt2 | l << 32;
  }
  
  int a(int paramInt1, int paramInt2, Drawable paramDrawable, boolean paramBoolean)
  {
    int i = super.a(paramDrawable);
    long l1 = f(paramInt1, paramInt2);
    long l2;
    if (paramBoolean) {
      l2 = 8589934592L;
    } else {
      l2 = 0L;
    }
    paramDrawable = this.K;
    long l3 = i;
    paramDrawable.a(l1, Long.valueOf(l3 | l2));
    if (paramBoolean)
    {
      l1 = f(paramInt2, paramInt1);
      this.K.a(l1, Long.valueOf(0x100000000 | l3 | l2));
    }
    return i;
  }
  
  int a(int[] paramArrayOfInt, Drawable paramDrawable, int paramInt)
  {
    int i = super.a(paramArrayOfInt, paramDrawable);
    this.L.c(i, Integer.valueOf(paramInt));
    return i;
  }
  
  int b(int[] paramArrayOfInt)
  {
    int i = super.a(paramArrayOfInt);
    if (i >= 0) {
      return i;
    }
    return super.a(StateSet.WILD_CARD);
  }
  
  int c(int paramInt1, int paramInt2)
  {
    long l = f(paramInt1, paramInt2);
    return (int)((Long)this.K.b(l, Long.valueOf(-1L))).longValue();
  }
  
  int d(int paramInt)
  {
    int i = 0;
    if (paramInt < 0) {
      paramInt = i;
    } else {
      paramInt = ((Integer)this.L.b(paramInt, Integer.valueOf(0))).intValue();
    }
    return paramInt;
  }
  
  boolean d(int paramInt1, int paramInt2)
  {
    long l = f(paramInt1, paramInt2);
    boolean bool;
    if ((((Long)this.K.b(l, Long.valueOf(-1L))).longValue() & 0x100000000) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  boolean e(int paramInt1, int paramInt2)
  {
    long l = f(paramInt1, paramInt2);
    boolean bool;
    if ((((Long)this.K.b(l, Long.valueOf(-1L))).longValue() & 0x200000000) != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  void m()
  {
    this.K = this.K.clone();
    this.L = this.L.clone();
  }
  
  public Drawable newDrawable()
  {
    return new Xd(this, null);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return new Xd(this, paramResources);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Xd$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */