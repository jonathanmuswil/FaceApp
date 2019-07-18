import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

class Xd$e
  implements TimeInterpolator
{
  private int[] a;
  private int b;
  private int c;
  
  Xd$e(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
  {
    a(paramAnimationDrawable, paramBoolean);
  }
  
  int a()
  {
    return this.c;
  }
  
  int a(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
  {
    int i = paramAnimationDrawable.getNumberOfFrames();
    this.b = i;
    int[] arrayOfInt = this.a;
    if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
      this.a = new int[i];
    }
    arrayOfInt = this.a;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      if (paramBoolean) {
        m = i - j - 1;
      } else {
        m = j;
      }
      int m = paramAnimationDrawable.getDuration(m);
      arrayOfInt[j] = m;
      k += m;
      j++;
    }
    this.c = k;
    return k;
  }
  
  public float getInterpolation(float paramFloat)
  {
    int i = (int)(paramFloat * this.c + 0.5F);
    int j = this.b;
    int[] arrayOfInt = this.a;
    for (int k = 0; (k < j) && (i >= arrayOfInt[k]); k++) {
      i -= arrayOfInt[k];
    }
    if (k < j) {
      paramFloat = i / this.c;
    } else {
      paramFloat = 0.0F;
    }
    return k / j + paramFloat;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Xd$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */