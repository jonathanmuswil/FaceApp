import android.animation.TypeEvaluator;
import android.graphics.Matrix;

public class ma
  implements TypeEvaluator<Matrix>
{
  private final float[] a = new float[9];
  private final float[] b = new float[9];
  private final Matrix c = new Matrix();
  
  public Matrix a(float paramFloat, Matrix paramMatrix1, Matrix paramMatrix2)
  {
    paramMatrix1.getValues(this.a);
    paramMatrix2.getValues(this.b);
    for (int i = 0; i < 9; i++)
    {
      paramMatrix2 = this.b;
      float f1 = paramMatrix2[i];
      paramMatrix1 = this.a;
      float f2 = paramMatrix1[i];
      paramMatrix1[i] += (f1 - f2) * paramFloat;
    }
    this.c.setValues(this.b);
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */