import android.animation.TypeEvaluator;
import android.support.design.widget.K;

public class ya$a
  implements TypeEvaluator<ya.d>
{
  public static final TypeEvaluator<ya.d> a = new a();
  private final ya.d b = new ya.d(null);
  
  public ya.d a(float paramFloat, ya.d paramd1, ya.d paramd2)
  {
    this.b.a(K.a(paramd1.a, paramd2.a, paramFloat), K.a(paramd1.b, paramd2.b, paramFloat), K.a(paramd1.c, paramd2.c, paramFloat));
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ya$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */