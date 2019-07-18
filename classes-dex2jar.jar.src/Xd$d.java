import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build.VERSION;

class Xd$d
  extends Xd.f
{
  private final ObjectAnimator a;
  private final boolean b;
  
  Xd$d(AnimationDrawable paramAnimationDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(null);
    int i = paramAnimationDrawable.getNumberOfFrames();
    int j;
    if (paramBoolean1) {
      j = i - 1;
    } else {
      j = 0;
    }
    if (paramBoolean1) {
      i = 0;
    } else {
      i--;
    }
    Xd.e locale = new Xd.e(paramAnimationDrawable, paramBoolean1);
    paramAnimationDrawable = ObjectAnimator.ofInt(paramAnimationDrawable, "currentIndex", new int[] { j, i });
    if (Build.VERSION.SDK_INT >= 18) {
      paramAnimationDrawable.setAutoCancel(true);
    }
    paramAnimationDrawable.setDuration(locale.a());
    paramAnimationDrawable.setInterpolator(locale);
    this.b = paramBoolean2;
    this.a = paramAnimationDrawable;
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public void b()
  {
    this.a.reverse();
  }
  
  public void c()
  {
    this.a.start();
  }
  
  public void d()
  {
    this.a.cancel();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Xd$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */