import android.animation.TypeEvaluator;

class Pa$a
  implements TypeEvaluator<tc.b[]>
{
  private tc.b[] a;
  
  public tc.b[] a(float paramFloat, tc.b[] paramArrayOfb1, tc.b[] paramArrayOfb2)
  {
    if (tc.a(paramArrayOfb1, paramArrayOfb2))
    {
      tc.b[] arrayOfb = this.a;
      if ((arrayOfb == null) || (!tc.a(arrayOfb, paramArrayOfb1))) {
        this.a = tc.a(paramArrayOfb1);
      }
      for (int i = 0; i < paramArrayOfb1.length; i++) {
        this.a[i].a(paramArrayOfb1[i], paramArrayOfb2[i], paramFloat);
      }
      return this.a;
    }
    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Pa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */