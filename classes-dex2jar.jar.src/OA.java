import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class oa
{
  private long a = 0L;
  private long b = 300L;
  private TimeInterpolator c = null;
  private int d = 0;
  private int e = 1;
  
  public oa(long paramLong1, long paramLong2)
  {
    this.a = paramLong1;
    this.b = paramLong2;
  }
  
  public oa(long paramLong1, long paramLong2, TimeInterpolator paramTimeInterpolator)
  {
    this.a = paramLong1;
    this.b = paramLong2;
    this.c = paramTimeInterpolator;
  }
  
  static oa a(ValueAnimator paramValueAnimator)
  {
    oa localoa = new oa(paramValueAnimator.getStartDelay(), paramValueAnimator.getDuration(), b(paramValueAnimator));
    localoa.d = paramValueAnimator.getRepeatCount();
    localoa.e = paramValueAnimator.getRepeatMode();
    return localoa;
  }
  
  private static TimeInterpolator b(ValueAnimator paramValueAnimator)
  {
    TimeInterpolator localTimeInterpolator = paramValueAnimator.getInterpolator();
    if ((!(localTimeInterpolator instanceof AccelerateDecelerateInterpolator)) && (localTimeInterpolator != null))
    {
      if ((localTimeInterpolator instanceof AccelerateInterpolator)) {
        return ga.c;
      }
      paramValueAnimator = localTimeInterpolator;
      if ((localTimeInterpolator instanceof DecelerateInterpolator)) {
        paramValueAnimator = ga.d;
      }
      return paramValueAnimator;
    }
    return ga.b;
  }
  
  public long a()
  {
    return this.a;
  }
  
  public void a(Animator paramAnimator)
  {
    paramAnimator.setStartDelay(a());
    paramAnimator.setDuration(b());
    paramAnimator.setInterpolator(c());
    if ((paramAnimator instanceof ValueAnimator))
    {
      paramAnimator = (ValueAnimator)paramAnimator;
      paramAnimator.setRepeatCount(d());
      paramAnimator.setRepeatMode(e());
    }
  }
  
  public long b()
  {
    return this.b;
  }
  
  public TimeInterpolator c()
  {
    TimeInterpolator localTimeInterpolator = this.c;
    if (localTimeInterpolator == null) {
      localTimeInterpolator = ga.b;
    }
    return localTimeInterpolator;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (oa.class == paramObject.getClass()))
    {
      paramObject = (oa)paramObject;
      if (a() != ((oa)paramObject).a()) {
        return false;
      }
      if (b() != ((oa)paramObject).b()) {
        return false;
      }
      if (d() != ((oa)paramObject).d()) {
        return false;
      }
      if (e() != ((oa)paramObject).e()) {
        return false;
      }
      return c().getClass().equals(((oa)paramObject).c().getClass());
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((((int)(a() ^ a() >>> 32) * 31 + (int)(b() ^ b() >>> 32)) * 31 + c().getClass().hashCode()) * 31 + d()) * 31 + e();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('\n');
    localStringBuilder.append(oa.class.getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" delay: ");
    localStringBuilder.append(a());
    localStringBuilder.append(" duration: ");
    localStringBuilder.append(b());
    localStringBuilder.append(" interpolator: ");
    localStringBuilder.append(c().getClass());
    localStringBuilder.append(" repeatCount: ");
    localStringBuilder.append(d());
    localStringBuilder.append(" repeatMode: ");
    localStringBuilder.append(e());
    localStringBuilder.append("}\n");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */