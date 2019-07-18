import android.support.v4.view.J;
import android.support.v4.view.K;
import android.support.v4.view.L;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class re
{
  final ArrayList<J> a = new ArrayList();
  private long b = -1L;
  private Interpolator c;
  K d;
  private boolean e;
  private final L f = new qe(this);
  
  public re a(long paramLong)
  {
    if (!this.e) {
      this.b = paramLong;
    }
    return this;
  }
  
  public re a(J paramJ)
  {
    if (!this.e) {
      this.a.add(paramJ);
    }
    return this;
  }
  
  public re a(J paramJ1, J paramJ2)
  {
    this.a.add(paramJ1);
    paramJ2.b(paramJ1.b());
    this.a.add(paramJ2);
    return this;
  }
  
  public re a(K paramK)
  {
    if (!this.e) {
      this.d = paramK;
    }
    return this;
  }
  
  public re a(Interpolator paramInterpolator)
  {
    if (!this.e) {
      this.c = paramInterpolator;
    }
    return this;
  }
  
  public void a()
  {
    if (!this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      ((J)localIterator.next()).a();
    }
    this.e = false;
  }
  
  void b()
  {
    this.e = false;
  }
  
  public void c()
  {
    if (this.e) {
      return;
    }
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      J localJ = (J)localIterator.next();
      long l = this.b;
      if (l >= 0L) {
        localJ.a(l);
      }
      Interpolator localInterpolator = this.c;
      if (localInterpolator != null) {
        localJ.a(localInterpolator);
      }
      if (this.d != null) {
        localJ.a(this.f);
      }
      localJ.c();
    }
    this.e = true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/re.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */